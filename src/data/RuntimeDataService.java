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
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class RuntimeDataService
{
   private static final String XML_TAG_NAME_ITEMTYPE = "itemtype";

   private Project project;

   private HashMap<Module, List<XmlTag>> selectedModulesItemsTagsMap = new HashMap<Module, List<XmlTag>>();

   public static RuntimeDataService getInstance(Project project)
   {
      RuntimeDataService runtimeDataService = ServiceManager.getService(project, RuntimeDataService.class);
      runtimeDataService.setProject(project);
      return runtimeDataService;
   }


   public void reloadSelectedModulesItemsTagsMap()
   {
      HashMap<String, Boolean> modulesSelectionMap = ConfigurationService.getInstance(project).getModulesSelectionMap();
      Module[] modules = ModuleManager.getInstance(project).getModules();
      for (Module module : modules)
      {
         if(modulesSelectionMap.get(module.getName()))
         {
            List<XmlTag> moduleItems = findModuleItems(module);
            selectedModulesItemsTagsMap.put(module, moduleItems);
         }
      }
   }

   public List<XmlTag> findModuleItems(Module module)
   {
      String moduleItemsXmlFileName = module.getName() + ".xml";
      Project project = module.getProject();
      GlobalSearchScope searchScope = GlobalSearchScope.moduleScope(module);
      PsiFile[] itemsXmlPsiFiles = FilenameIndex.getFilesByName(project, moduleItemsXmlFileName, searchScope);

      if (itemsXmlPsiFiles.length == 0)
      {
         return new ArrayList<XmlTag>();
      }

      XmlFile itemsXml = (XmlFile) itemsXmlPsiFiles[0].getViewProvider().getPsi(StdLanguages.XML);

      final List<XmlTag> itemsXmlTags = new ArrayList<XmlTag>();

      itemsXml.accept(new XmlElementVisitor()
      {
         @Override
         public void visitXmlTag(XmlTag tag)
         {
            if(XML_TAG_NAME_ITEMTYPE.equals(tag.getName()))
            {
               itemsXmlTags.add(tag);
            }
         }
      });

      return itemsXmlTags;
   }

   public HashMap<Module, List<XmlTag>> getSelectedModulesItemsTagsMap()
   {
      return selectedModulesItemsTagsMap;
   }

   public void setProject(Project project)
   {
      this.project = project;
   }
}
