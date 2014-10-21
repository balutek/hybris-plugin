package hybrisplugin.items.service;

import com.intellij.lang.StdLanguages;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsService
{

   public static XmlTag getItemsSubTag(Project project, Module module, String subTagName)
   {
      String moduleItemsFileName = module.getName() + "-hybrisplugin.items.xml";
      System.out.println(moduleItemsFileName);
      PsiFile[] moduleItemsFiles =
              FilenameIndex.getFilesByName(project, moduleItemsFileName, GlobalSearchScope.moduleScope(module));
      if(moduleItemsFiles.length > 0)
      {
         XmlFile xmlFile = (XmlFile)moduleItemsFiles[0].getViewProvider().getPsi(StdLanguages.XML);
         XmlTag[] subTags = xmlFile.getRootTag().getSubTags();
         for (XmlTag subTag : subTags)
         {
            if(subTag.getName().equals(subTagName))
            {
               return subTag;
            }
         }
      }
      return null;
   }
}
