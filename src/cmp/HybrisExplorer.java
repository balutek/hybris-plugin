package cmp;

import callback.ModulesSelectionCallback;
import cmp.tree.HybrisItemsTreeModel;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.IconUtil;
import action.checkbox.CheckboxElement;
import action.checkbox.CheckboxListPopupAction;
import action.checkbox.ModuleCheckbox;
import data.RuntimeDataService;
import listener.ModulesSelectionListener;
import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
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

   private JPanel createContent()
   {
      JPanel itemTreesWrapper = new JPanel(new VerticalLayout());

      List<Module> modules = RuntimeDataService.getInstance(project).getSelectedModules();
      for (Module module : modules)
      {
         List<XmlTag> moduleItemsXml = RuntimeDataService.getInstance(project).getModuleItemsTags(module);
         HybrisItemsTreeModel moduleTreeModel = new HybrisItemsTreeModel(project, module.getName(), moduleItemsXml);
         Tree tree = new Tree(moduleTreeModel);
         itemTreesWrapper.add(tree);
      }

      return itemTreesWrapper;
   }

   private JPanel createToolbarPanel()
   {
      final DefaultActionGroup actionGroup = new DefaultActionGroup();

      CheckboxListPopupAction listPopupAction =
              new CheckboxListPopupAction(createModuleCheckboxes(), IconUtil.getAddFolderIcon());
      ModulesSelectionCallback modulesSelectionCallback = new ModulesSelectionCallback(project)
      {
         @Override
         public Void execute()
         {
            super.execute();
            HybrisExplorer.this.setContent(createContent());
            return null;
         }
      };
      listPopupAction.setAfterCheckboxSelectedCallback(modulesSelectionCallback);

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
