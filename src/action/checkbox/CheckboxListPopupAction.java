package action.checkbox;

import callback.AnCheckboxActionCallback;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.actionSystem.ex.CheckboxAction;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.openapi.actionSystem.impl.ActionButton;

import javax.swing.*;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class CheckboxListPopupAction extends AnAction implements CustomComponentAction
{
   private JComponent actionButton;

   private CheckboxElement[] checkboxElements;

   private Icon buttonIcon;

   private AnCheckboxActionCallback<Void> afterCheckboxSelectedCallback;

   public CheckboxListPopupAction(CheckboxElement[] checkboxElements, Icon icon)
   {
      super(icon);
      this.checkboxElements = checkboxElements;
      this.buttonIcon = icon;
   }

   @Override
   public void actionPerformed(AnActionEvent e)
   {
      showCheckboxListPopup(actionButton, 0, actionButton.getHeight());
   }

   @Override
   public JComponent createCustomComponent(Presentation presentation)
   {
      actionButton = new ActionButton(this, presentation, ActionPlaces.EDITOR_TOOLBAR, ActionToolbar.DEFAULT_MINIMUM_BUTTON_SIZE);
      return actionButton;
   }

   private void showCheckboxListPopup(Component component, int x, int y)
   {
      DefaultActionGroup actionGroup = new DefaultActionGroup();

      for (int i = 0; i < checkboxElements.length; ++i)
      {
         final CheckboxElement checkboxElement = checkboxElements[i];
         CheckboxAction selectElementAction = new CheckboxAction(checkboxElement.getName())
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
               if (afterCheckboxSelectedCallback != null)
               {
                  afterCheckboxSelectedCallback.execute();
               }
            }
         };
         actionGroup.add(selectElementAction);
      }

      final ActionPopupMenu checkboxListPopupMenu =
              ActionManager.getInstance().createActionPopupMenu(ActionPlaces.EDITOR_POPUP, actionGroup);

      checkboxListPopupMenu.getComponent().show(component, x, y);
   }

   public AnCheckboxActionCallback<Void> getAfterCheckboxSelectedCallback()
   {
      return afterCheckboxSelectedCallback;
   }

   public void setAfterCheckboxSelectedCallback(AnCheckboxActionCallback<Void> afterCheckboxSelectedCallback)
   {
      this.afterCheckboxSelectedCallback = afterCheckboxSelectedCallback;
   }

}
