package data;

import com.intellij.lang.StdLanguages;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.XmlElementVisitor;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class RuntimeDataService
{
   private static final String XML_TAG_NAME_ITEMTYPE = "itemtype";

   private static RuntimeDataService instance = null;

   private ConfigurationService configurationService;

   private Project project;

   private HashMap<Module, List<XmlTag>> selectedModulesItemsTagsMap = new LinkedHashMap<Module, List<XmlTag>>();

   private Module recentlyAddedModule = null;

   private Module recentlyRemovedModule = null;

   public static RuntimeDataService getInstance(Project project)
   {
      if(instance == null)
      {
         RuntimeDataService runtimeDataService = ServiceManager.getService(project, RuntimeDataService.class);
         runtimeDataService.setConfigurationService(ConfigurationService.getInstance(project));
         runtimeDataService.setProject(project);
         runtimeDataService.initialize();
         return runtimeDataService;
      }
      else
      {
         return instance;
      }
   }

   private void initialize()
   {
      HashMap<String, Boolean> modulesSelectionMap = ConfigurationService.getInstance(project).getModulesSelectionMap();
      Module[] modules = ModuleManager.getInstance(project).getModules();
      for (Module module : modules)
      {
         Boolean isModuleSelected = modulesSelectionMap.get(module.getName());
         if(isModuleSelected != null && isModuleSelected)
         {
            List<XmlTag> moduleItems = findModuleItems(module);
            selectedModulesItemsTagsMap.put(module, moduleItems);
         }
      }
   }

   private void setConfigurationService(ConfigurationService configurationService)
   {
      this.configurationService = configurationService;
   }

   public boolean isModuleSelected(Module module)
   {
      return configurationService.isModuleSelected(module.getName());
   }

   public void selectModule(Module module)
   {
      configurationService.selectModule(module.getName());
      recentlyAddedModule = module;

      List<XmlTag> moduleItems = findModuleItems(module);
      selectedModulesItemsTagsMap.put(module, moduleItems);
   }

   public void deselectModule(Module module)
   {
      configurationService.deselectModule(module.getName());
      recentlyRemovedModule = module;

      selectedModulesItemsTagsMap.remove(module);
   }

   public List<Module> getSelectedModules()
   {
      return new ArrayList<Module>(selectedModulesItemsTagsMap.keySet());
   }

   public List<XmlTag> findModuleItems(Module module)
   {
      String moduleItemsXmlFileName = module.getName() + "-items.xml";
      Project project = module.getProject();
      GlobalSearchScope searchScope = GlobalSearchScope.allScope(project);
      PsiFile[] itemsXmlPsiFiles = FilenameIndex.getFilesByName(project, moduleItemsXmlFileName, searchScope);

      if (itemsXmlPsiFiles.length == 0)
      {
         return new ArrayList<XmlTag>();
      }

      XmlFile itemsXml = (XmlFile) itemsXmlPsiFiles[0].getViewProvider().getPsi(StdLanguages.XML);

      final List<XmlTag> itemsXmlTags = new ArrayList<XmlTag>();

      new XmlElementVisitor()
      {
         @Override
         public void visitXmlTag(XmlTag tag)
         {
            if(XML_TAG_NAME_ITEMTYPE.equals(tag.getName()))
            {
               itemsXmlTags.add(tag);
            }
            else
            {
               XmlTag[] subtags = tag.getSubTags();
               for (XmlTag subtag : subtags)
               {
                  visitXmlTag(subtag);
               }
            }
         }
      }.visitXmlTag(itemsXml.getRootTag());

      return itemsXmlTags;
   }

   public List<XmlTag> getModuleItemsTags(Module module)
   {
      return selectedModulesItemsTagsMap.get(module);
   }

   public HashMap<Module, List<XmlTag>> getSelectedModulesItemsTagsMap()
   {
      return selectedModulesItemsTagsMap;
   }

   public void setProject(Project project)
   {
      this.project = project;
   }

   public Module getRecentlyAddedModule()
   {
      return recentlyAddedModule;
   }

   public Module getRecentlyRemovedModule()
   {
      return recentlyRemovedModule;
   }

   public void setRecentlyAddedModule(Module recentlyAddedModule)
   {
      this.recentlyAddedModule = recentlyAddedModule;
   }

   public void setRecentlyRemovedModule(Module recentlyRemovedModule)
   {
      this.recentlyRemovedModule = recentlyRemovedModule;
   }
}
