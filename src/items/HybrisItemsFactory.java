package items;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiSearchHelper;
import com.intellij.ui.components.JBList;

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
         StringBuilder opocoreItemsNames = new StringBuilder();
         for (PsiFile opocoreItem : opocoreItems)
         {
            FileViewProvider fileViewProvider = opocoreItem.getViewProvider();

         }
      }
   }
}
