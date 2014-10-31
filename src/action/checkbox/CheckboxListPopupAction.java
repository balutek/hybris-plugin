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

   }

   @Override
   public JComponent createCustomComponent(Presentation presentation)
   {

      AnAction buttonAction = new AnAction(buttonIcon)
      {
         @Override
         public void actionPerformed(AnActionEvent e)
         {
            showCheckboxListPopup(actionButton, actionButton.getWidth(), actionButton.getHeight());
         }
      };
      actionButton = new ActionButton(buttonAction, presentation, ActionPlaces.EDITOR_TOOLBAR, new Dimension(20, 20));
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

      checkboxListPopupMenu.getComponent().show(component, 0, y);
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
