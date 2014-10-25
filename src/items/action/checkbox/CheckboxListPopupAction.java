package items.action.checkbox;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.actionSystem.ex.CheckboxAction;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.openapi.actionSystem.impl.ActionButton;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.ui.AnActionButton;
import com.intellij.util.IconUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class CheckboxListPopupAction extends AnAction implements CustomComponentAction
{
   private ActionToolbar actionToolbar;

   private CheckboxElement[] checkboxElements;

   public CheckboxListPopupAction(CheckboxElement[] checkboxElements, Icon icon)
   {
      super(icon);
      this.checkboxElements = checkboxElements;
   }

   @Override
   public void actionPerformed(AnActionEvent e)
   {

   }

   @Override
   public JComponent createCustomComponent(Presentation presentation)
   {

      final DefaultActionGroup buttonActionGroup = new DefaultActionGroup();

      buttonActionGroup.add(new AnAction(IconUtil.getAddClassIcon())
      {
         @Override
         public void actionPerformed(AnActionEvent e)
         {
            JComponent actionToolbarComponent = actionToolbar.getComponent();
            showCheckboxListPopup(actionToolbarComponent, actionToolbarComponent.getWidth(),
                    actionToolbarComponent.getHeight());
         }
      });

      actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, buttonActionGroup,
              true);

      JPanel checkboxListPopupMenuWrapper = new JPanel();
      checkboxListPopupMenuWrapper.setLayout(new BorderLayout());
      checkboxListPopupMenuWrapper.add(actionToolbar.getComponent(), BorderLayout.CENTER);
      return checkboxListPopupMenuWrapper;
   }

   private boolean[] createIsModuleSelectedArray(int numberOfModules)
   {
      boolean[] isModuleSelected = new boolean[numberOfModules];
      for (int i = 0; i < numberOfModules; ++i)
      {
         isModuleSelected[i] = false;
      }
      return isModuleSelected;
   }

   private void showCheckboxListPopup(Component component, int x, int y)
   {
      DefaultActionGroup actionGroup = new DefaultActionGroup();

      for (int i = 0; i < checkboxElements.length; ++i)
      {
         final CheckboxElement checkboxElement = checkboxElements[i];
         final int currentModuleIndex = i;
         CheckboxAction selectModuleAction = new CheckboxAction(checkboxElement.getName())
         {
            @Override
            public boolean isSelected(AnActionEvent e)
            {
               return checkboxElement.isSelected();
            }

            @Override
            public void setSelected(AnActionEvent e, boolean state)
            {
               checkboxElement.setSelected(state);
            }
         };
         actionGroup.add(selectModuleAction);
      }

      final ActionPopupMenu checkboxListPopupMenu =
              ActionManager.getInstance().createActionPopupMenu(ActionPlaces.EDITOR_POPUP, actionGroup);

      checkboxListPopupMenu.getComponent().show(component, x, y);
   }

}
