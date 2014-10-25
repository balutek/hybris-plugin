package items.action;

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
   private Project project;

   private ActionToolbar actionToolbar;

   public CheckboxListPopupAction(Project project)
   {
      super(IconUtil.getEditIcon());
      this.project = project;
   }

   @Override
   public void actionPerformed(AnActionEvent e)
   {

   }

   @Override
   public JComponent createCustomComponent(Presentation presentation)
   {
      DefaultActionGroup actionGroup = new DefaultActionGroup();
      Module[] modules = ModuleManager.getInstance(project).getModules();
      final boolean[] isModuleSelectedArray = createIsModuleSelectedArray(modules.length);

      for (int i = 0; i < modules.length; ++i)
      {
         Module module = modules[i];
         final int currentModuleIndex = i;
         CheckboxAction selectModuleAction = new CheckboxAction(module.getName())
         {
            @Override
            public boolean isSelected(AnActionEvent e)
            {
               return isModuleSelectedArray[currentModuleIndex];
            }

            @Override
            public void setSelected(AnActionEvent e, boolean state)
            {
               isModuleSelectedArray[currentModuleIndex] = state;
            }
         };
         actionGroup.add(selectModuleAction);
      }

      final ActionPopupMenu checkboxListPopupMenu =
              ActionManager.getInstance().createActionPopupMenu(ActionPlaces.EDITOR_POPUP, actionGroup);

      final DefaultActionGroup buttonActionGroup = new DefaultActionGroup();

      buttonActionGroup.add(new AnAction(IconUtil.getAddClassIcon())
      {
         @Override
         public void actionPerformed(AnActionEvent e)
         {
            checkboxListPopupMenu.getComponent().show(actionToolbar.getComponent(), 0, 0);
         }
      });

      actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, buttonActionGroup, true);

      JPanel checkboxListPopupMenuWrapper = new JPanel();
      checkboxListPopupMenuWrapper.setLayout(new BorderLayout());
      checkboxListPopupMenuWrapper.add(checkboxListPopupMenu.getComponent(), BorderLayout.CENTER);
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

}
