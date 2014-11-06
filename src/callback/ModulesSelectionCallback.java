package callback;

import cmp.tree.HybrisExplorerTreeModel;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.module.Module;
import data.RuntimeDataService;

/**
 * @author Paweł Łabuda
 */
public class ModulesSelectionCallback implements AnActionCallback<Void>
{
   private HybrisExplorerTreeModel treeModel;

   private SelectedModulesNode root;

   public ModulesSelectionCallback(HybrisExplorerTreeModel treeModel)
   {
      this.treeModel = treeModel;

      this.root = (SelectedModulesNode) treeModel.getRoot();
   }

   @Override
   public Void execute()
   {
      RuntimeDataService runtimeDataService = RuntimeDataService.getInstance();
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
