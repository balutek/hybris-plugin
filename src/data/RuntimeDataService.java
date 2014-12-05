package data;

import com.intellij.lang.StdLanguages;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import org.jetbrains.annotations.NotNull;
import util.PluginXmlUtil;

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

   // Todo : delete all places where reference to project is passed, use this service field instead
   private Project project;

   private HashMap<Module, List<XmlTag>> selectedModulesItemsTagsMap = new LinkedHashMap<Module, List<XmlTag>>();

   private Module recentlyAddedModule = null;

   private Module recentlyRemovedModule = null;

   private String enteredSearchText = "";

   public static void initialize(Project project)
   {
      RuntimeDataService runtimeDataService = ServiceManager.getService(project, RuntimeDataService.class);
      RuntimeDataService.instance = runtimeDataService;
      runtimeDataService.setConfigurationService(ConfigurationService.getInstance(project));
      runtimeDataService.setProject(project);
      runtimeDataService.loadPreviouslySelectedModules();
   }

   @NotNull
   public static RuntimeDataService getInstance()
   {
      return instance;
   }

   private void loadPreviouslySelectedModules()
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

      return PluginXmlUtil.findTagsByName(itemsXml.getRootTag(), XML_TAG_NAME_ITEMTYPE);
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

   public Project getProject()
   {
      return project;
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

   public String getEnteredSearchText()
   {
      return enteredSearchText;
   }

   public void setEnteredSearchText(String enteredSearchText)
   {
      this.enteredSearchText = enteredSearchText;
   }
}
