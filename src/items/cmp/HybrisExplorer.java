package items.cmp;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.util.IconUtil;
import items.action.SearchFieldAction;

import javax.swing.*;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   public HybrisExplorer()
   {
      super(true);

      setToolbar(createToolbarPanel());
   }

   private JPanel createToolbarPanel()
   {
      final DefaultActionGroup actionGroup = new DefaultActionGroup();
      actionGroup.add(new AnAction(IconUtil.getAddIcon())
      {
         @Override
         public void actionPerformed(AnActionEvent e)
         {

         }
      });
      actionGroup.add(new SearchFieldAction());

      final ActionToolbar actionToolbar =
              ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, actionGroup, true);
      final JPanel buttonPanel = new JPanel(new BorderLayout());
      buttonPanel.add(actionToolbar.getComponent(), BorderLayout.CENTER);
      return buttonPanel;
   }




}
