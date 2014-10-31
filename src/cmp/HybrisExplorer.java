package cmp;

import action.checkbox.CheckboxElement;
import action.checkbox.CheckboxListPopupAction;
import action.checkbox.ModuleCheckbox;
import callback.ModulesSelectionCallbackCheckbox;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.IconUtil;
import data.RuntimeDataService;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   private Project project;

   private ActionToolbar actionToolbar;

   private Tree tree;

   private TreeModel treeModel;

   private SelectedModulesNode root;

   public HybrisExplorer(Project project)
   {
      super(true);

      this.project = project;

      setToolbar(createToolbarPanel());
      setContent(createContent());
   }

   private JComponent createContent()
   {
      List<Module> selectedModules = RuntimeDataService.getInstance(project).getSelectedModules();
      root = new SelectedModulesNode(selectedModules);

      treeModel = new DefaultTreeModel(root);

      tree = new Tree(treeModel);
      tree.setEditable(true);

      return new JBScrollPane(tree);
   }

   private JComponent createToolbarPanel()
   {
      final DefaultActionGroup actionGroup = new DefaultActionGroup();

      CheckboxListPopupAction listPopupAction =
              new CheckboxListPopupAction(createModuleCheckboxes(), IconUtil.getAddFolderIcon());

      listPopupAction.setAfterCheckboxSelectedCallback(new ModulesSelectionCallbackCheckbox(root));

      actionGroup.add(listPopupAction);

      actionToolbar =
              ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, actionGroup, true);

      return actionToolbar.getComponent();
   }

   private CheckboxElement[] createModuleCheckboxes()
   {
      Module[] modules = ModuleManager.getInstance(project).getModules();
      CheckboxElement[] checkboxElements = new CheckboxElement[modules.length];
      for (int i = 0; i < modules.length; ++i)
      {
         checkboxElements[i] = new ModuleCheckbox(modules[i]);
      }
      return checkboxElements;
   }


}
