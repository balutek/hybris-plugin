package cmp;

import action.SearchFieldAction;
import action.checkbox.CheckboxElement;
import action.checkbox.CheckboxListPopupAction;
import action.checkbox.ModuleCheckbox;
import callback.ModulesSelectionCallback;
import callback.SearchForItemtypesCallback;
import cmp.attr.HybrisAttributesPanel;
import cmp.tree.HybrisExplorerTree;
import cmp.tree.HybrisExplorerTreeCellRenderer;
import cmp.tree.HybrisExplorerTreeModel;
import cmp.tree.listener.NavigateToLineListener;
import cmp.tree.listener.TreeNodeSelectionListener;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.util.IconUtil;
import data.RuntimeDataService;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   private JBPanel explorer;

   private ActionToolbar actionToolbar;

   private JBScrollPane itemtypesScrollPane;

   private HybrisAttributesPanel attributesPanel;

   private HybrisExplorerTree tree;

   private HybrisExplorerTreeModel treeModel;

   private SelectedModulesNode root;

   public HybrisExplorer(Project project)
   {
      super(true);

      // ugly way to initialize runtime data service
      RuntimeDataService.initialize(project);

      initialize();

      setToolbar(createToolbarPanel());
      setContent(explorer);
   }

   private void initialize()
   {
      initExplorerTree();
      initContent();
      initModuleChooser();
   }

   private void initContent()
   {
      Border emptyBorder = BorderFactory.createEmptyBorder();

      explorer = new JBPanel(new BorderLayout());
      explorer.setBorder(emptyBorder);

      itemtypesScrollPane = new JBScrollPane(tree);
      itemtypesScrollPane.setBorder(emptyBorder);

      attributesPanel = new HybrisAttributesPanel();
      attributesPanel.setBorder(emptyBorder);
      tree.addMouseListener(new TreeNodeSelectionListener(attributesPanel));

      explorer.add(itemtypesScrollPane, BorderLayout.CENTER);
      explorer.add(attributesPanel, BorderLayout.SOUTH);
   }

   private void initExplorerTree()
   {
      List<Module> selectedModules = RuntimeDataService.getInstance().getSelectedModules();
      root = new SelectedModulesNode(selectedModules);
      treeModel = new HybrisExplorerTreeModel(root);
      tree = new HybrisExplorerTree(treeModel);
      tree.addMouseListener(new NavigateToLineListener(tree));
      tree.setCellRenderer(new HybrisExplorerTreeCellRenderer());
      tree.setRootVisible(false);
   }

   private void initModuleChooser()
   {
      final DefaultActionGroup actionGroup = new DefaultActionGroup();

      CheckboxListPopupAction listPopupAction =
              new CheckboxListPopupAction(createModuleCheckboxes(), IconUtil.getAddFolderIcon());
      listPopupAction.setAfterCheckboxSelectedCallback(new ModulesSelectionCallback(treeModel));

      SearchFieldAction searchFieldAction = new SearchFieldAction(new SearchForItemtypesCallback(tree, treeModel));

      actionGroup.add(listPopupAction);
      actionGroup.add(searchFieldAction);

      actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, actionGroup, true);
   }


   private JComponent createToolbarPanel()
   {
      return actionToolbar.getComponent();
   }

   private CheckboxElement[] createModuleCheckboxes()
   {
      Project project = RuntimeDataService.getInstance().getProject();
      Module[] modules = ModuleManager.getInstance(project).getModules();
      CheckboxElement[] checkboxElements = new CheckboxElement[modules.length];
      for (int i = 0; i < modules.length; ++i)
      {
         checkboxElements[i] = new ModuleCheckbox(modules[i]);
      }
      return checkboxElements;
   }


}
