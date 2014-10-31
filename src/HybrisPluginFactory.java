import cmp.HybrisExplorer;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

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
