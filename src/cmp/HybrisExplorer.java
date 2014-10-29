package cmp;

import callback.ModulesSelectionCallback;
import cmp.tree.HybrisItemsTreeModel;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.IconUtil;
import action.checkbox.CheckboxElement;
import action.checkbox.CheckboxListPopupAction;
import action.checkbox.ModuleCheckbox;
import data.RuntimeDataService;
import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
import java.awt.BorderLayout;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorer extends SimpleToolWindowPanel
{
   private Project project;

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
      SelectedModulesNode selectedModulesNode = new SelectedModulesNode(selectedModules);

      DefaultTreeModel itemsModel = new DefaultTreeModel(selectedModulesNode);

      Tree tree = new Tree(itemsModel);

      return tree;
   }

   private JPanel createToolbarPanel()
   {
      final DefaultActionGroup actionGroup = new DefaultActionGroup();

      CheckboxListPopupAction listPopupAction =
              new CheckboxListPopupAction(createModuleCheckboxes(), IconUtil.getAddFolderIcon());
//      ModulesSelectionCallback modulesSelectionCallback = new ModulesSelectionCallback(project)
//      {
//         @Override
//         public Void execute()
//         {
//            super.execute();
//            HybrisExplorer.this.setContent(createContent());
//            return null;
//         }
//      };
//      listPopupAction.setAfterCheckboxSelectedCallback(modulesSelectionCallback);

      actionGroup.add(listPopupAction);

      final ActionToolbar actionToolbar =
              ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, actionGroup, true);

      final JPanel buttonPanel = new JPanel(new BorderLayout());
      buttonPanel.add(actionToolbar.getComponent(), BorderLayout.CENTER);
      return buttonPanel;
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
