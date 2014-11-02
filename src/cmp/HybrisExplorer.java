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
import com.intellij.util.IconUtil;
import data.RuntimeDataService;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
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
      tree.addMouseListener(new NavigateToLineListener(tree));
      tree.setCellRenderer(new DefaultTreeCellRenderer());

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
      Border emptyBorder = BorderFactory.createEmptyBorder();

      JPanel explorer = new JPanel(new GridLayout(2,1));
      explorer.setBorder(emptyBorder);

      JBScrollPane scrollPaneWithTree = new JBScrollPane(tree);
      scrollPaneWithTree.setBorder(emptyBorder);

      JBScrollPane scrollPaneWithAttributes = new JBScrollPane();
      scrollPaneWithAttributes.setBorder(emptyBorder);
//      scrollPaneWithAttributes.h

      explorer.add(scrollPaneWithTree);
//      explorer.add(scrollPaneWithAttributes);
      return explorer;
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
