package listener;

import com.intellij.openapi.project.Project;
import com.intellij.ui.ClickListener;
import com.intellij.ui.PopupMenuListenerAdapter;
import data.RuntimeDataService;
import org.jetbrains.annotations.NotNull;

import javax.swing.event.PopupMenuEvent;
import java.awt.event.MouseEvent;

/**
 * @author Paweł Łabuda
 */
public class ModulesSelectionListener extends PopupMenuListenerAdapter
{
   private Project project;

   public ModulesSelectionListener(Project project)
   {
      this.project = project;
   }

   @Override
   public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
   {
      RuntimeDataService.getInstance(project).reloadSelectedModulesItemsTagsMap();
   }
}
