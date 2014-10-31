package callback;

import cmp.tree.HybrisExplorerTreeModel;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import data.RuntimeDataService;

/**
 * @author Paweł Łabuda
 */
public class ModulesSelectionCallbackCheckbox implements AnCheckboxActionCallback<Void>
{
   private Project project;

   private HybrisExplorerTreeModel treeModel;

   private SelectedModulesNode root;

   public ModulesSelectionCallbackCheckbox(Project project, HybrisExplorerTreeModel treeModel)
   {
      this.treeModel = treeModel;
      this.project = project;

      this.root = (SelectedModulesNode) treeModel.getRoot();
   }

   @Override
   public Void execute()
   {
      RuntimeDataService runtimeDataService = RuntimeDataService.getInstance(project);
      Module recentlyAddedModule = runtimeDataService.getRecentlyAddedModule();
      Module recentlyRemovedModule = runtimeDataService.getRecentlyRemovedModule();

      if(recentlyAddedModule != null)
      {
         treeModel.addModuleNode(recentlyAddedModule);
         runtimeDataService.setRecentlyAddedModule(null);
      }

      if(recentlyRemovedModule != null)
      {
         treeModel.removeModuleNode(recentlyRemovedModule);
         runtimeDataService.setRecentlyRemovedModule(null);
      }
      return null;
   }
}
