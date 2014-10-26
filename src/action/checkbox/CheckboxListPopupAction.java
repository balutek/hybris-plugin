package action.checkbox;

import listener.ModulesSelectionListener;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.actionSystem.ex.CheckboxAction;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;

import javax.swing.*;
import javax.swing.event.PopupMenuListener;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class CheckboxListPopupAction extends AnAction implements CustomComponentAction
{
   private ActionToolbar actionToolbar;

   private CheckboxElement[] checkboxElements;

   private Icon buttonIcon;

   private PopupMenuListener popupMenuListener;

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

      final DefaultActionGroup buttonActionGroup = new DefaultActionGroup();

      buttonActionGroup.add(new AnAction(buttonIcon)
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
            }
         };
         actionGroup.add(selectElementAction);
      }

      final ActionPopupMenu checkboxListPopupMenu =
              ActionManager.getInstance().createActionPopupMenu(ActionPlaces.EDITOR_POPUP, actionGroup);

      if(popupMenuListener != null)
      {
         checkboxListPopupMenu.getComponent().addPopupMenuListener(popupMenuListener);
      }

      checkboxListPopupMenu.getComponent().show(component, 0, y);
   }

   public PopupMenuListener getPopupMenuListener()
   {
      return popupMenuListener;
   }

   public void setPopupMenuListener(PopupMenuListener popupMenuListener)
   {
      this.popupMenuListener = popupMenuListener;
   }

}
