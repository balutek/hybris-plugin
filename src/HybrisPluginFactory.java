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
      toolWindow.getComponent().add(new HybrisExplorer(project));
   }

}
