package items.cmp;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.util.IconUtil;
import items.action.CheckboxListPopupAction;
import items.action.SearchFieldAction;

import javax.swing.*;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   private Project project;

   public HybrisExplorer(Project project)
   {
      super(true);

      this.project = project;

      setToolbar(createToolbarPanel());
   }

   private JPanel createToolbarPanel()
   {
      final DefaultActionGroup actionGroup = new DefaultActionGroup();

      actionGroup.add(new CheckboxListPopupAction(project));
//      actionGroup.add(new SearchFieldAction());

      final ActionToolbar actionToolbar =
              ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, actionGroup, true);
      final JPanel buttonPanel = new JPanel(new BorderLayout());
      buttonPanel.add(actionToolbar.getComponent(), BorderLayout.CENTER);
      return buttonPanel;
   }




}
