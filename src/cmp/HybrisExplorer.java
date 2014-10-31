package cmp;

import callback.ModulesSelectionCallback;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.actionSystem.ex.CheckboxAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.IconUtil;
import action.checkbox.CheckboxElement;
import action.checkbox.CheckboxListPopupAction;
import action.checkbox.ModuleCheckbox;
import data.RuntimeDataService;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.awt.BorderLayout;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   private Project project;

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

      listPopupAction.setAfterCheckboxSelectedCallback(new ModulesSelectionCallback(root));

      actionGroup.add(listPopupAction);

      final ActionToolbar actionToolbar =
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
