package items;

import com.intellij.lang.StdLanguages;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;

import javax.swing.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsFactory implements ToolWindowFactory
{
   @Override
   public void createToolWindowContent(Project project, ToolWindow toolWindow)
   {
      PsiFile[] opocoreItems =
              FilenameIndex.getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project));
      if(opocoreItems.length < 1)
      {
         toolWindow.getComponent().add(new JLabel("No items were found."));
      }
      else
      {
         FileViewProvider fileViewProvider = opocoreItems[0].getViewProvider();
         XmlFile xmlFile = (XmlFile)fileViewProvider.getPsi(StdLanguages.XML);
         JList list = new JList();
         addChildren(list, xmlFile.getRootTag(), 2);
         toolWindow.getComponent().add(list);
      }
   }

   private void addChildren(JList list, XmlTag rootTag, int theDeepestTreeLevel)
   {
      if(rootTag != null)
      {
         addChildrenRecursively(list, rootTag, theDeepestTreeLevel, 0);
      }
      else
      {
         list.add(new JLabel("Root tag isn't properly defined."));
      }
   }

   private void addChildrenRecursively(JList list, XmlTag xmlTag, int theDeepestTreeLevel, int currentTreeLevel)
   {
      list.add(new JLabel(xmlTag.getName()));
      if (currentTreeLevel < theDeepestTreeLevel)
      {
         XmlTag[] subTags = xmlTag.getSubTags();
         for (XmlTag subTag : subTags)
         {
            addChildrenRecursively(list, subTag, theDeepestTreeLevel, currentTreeLevel+1);
         }
      }
   }
}
