package cmp;

import action.checkbox.CheckboxElement;
import action.checkbox.CheckboxListPopupAction;
import action.checkbox.ModuleCheckbox;
import callback.ModulesSelectionCallbackCheckbox;
import cmp.tree.HybrisExplorerTree;
import cmp.tree.HybrisExplorerTreeModel;
import cmp.tree.listener.NavigateToLineListener;
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
import java.awt.event.MouseListener;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   private Project project;

   private ActionToolbar actionToolbar;

   private HybrisExplorerTree tree;

   private HybrisExplorerTreeModel treeModel;

   private SelectedModulesNode root;

   public HybrisExplorer(Project project)
   {
      super(true);

      this.project = project;

      initialize();

      setToolbar(createToolbarPanel());
      setContent(createContent());
   }

   private void initialize()
   {
      List<Module> selectedModules = RuntimeDataService.getInstance(project).getSelectedModules();
      root = new SelectedModulesNode(selectedModules);
      treeModel = new HybrisExplorerTreeModel(root);
      tree = new HybrisExplorerTree(project, treeModel);
      tree.setEditable(true);
      tree.addMouseListener(new NavigateToLineListener(tree));

      final DefaultActionGroup actionGroup = new DefaultActionGroup();
      CheckboxListPopupAction listPopupAction =
              new CheckboxListPopupAction(createModuleCheckboxes(), IconUtil.getAddFolderIcon());
      listPopupAction.setAfterCheckboxSelectedCallback(new ModulesSelectionCallbackCheckbox(project, treeModel));
      actionGroup.add(listPopupAction);
      actionToolbar =
              ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, actionGroup, true);
   }

   private JComponent createContent()
   {
      JBScrollPane scrollPaneWithTree = new JBScrollPane(tree);
      scrollPaneWithTree.setBorder(BorderFactory.createEmptyBorder());
      return scrollPaneWithTree;
   }

   private JComponent createToolbarPanel()
   {
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
