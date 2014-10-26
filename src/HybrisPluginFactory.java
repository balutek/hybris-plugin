import com.intellij.lang.StdLanguages;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.xml.XmlFile;
import cmp.HybrisExplorer;
import listener.GoToLineListener;

import javax.swing.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisPluginFactory implements ToolWindowFactory
{
   @Override
   public void createToolWindowContent(final Project project, ToolWindow toolWindow)
   {

      XmlFile opocoreItems = (XmlFile)FilenameIndex
              .getFilesByName(project, "opocore-items.xml", GlobalSearchScope.allScope(project))[0]
              .getViewProvider()
              .getPsi(StdLanguages.XML);

      int lineInEditor = opocoreItems.getRootTag().getSubTags()[4].getTextOffset();

      JLabel someLabel = new JLabel("Some stupid text.");
      someLabel.addMouseListener(new GoToLineListener(project, opocoreItems.getVirtualFile(), false, lineInEditor));
      toolWindow.getComponent().add(new HybrisExplorer(project));
   }

}
