package callback;

import cmp.tree.HybrisExplorerTree;
import cmp.tree.HybrisExplorerTreeModel;
import data.RuntimeDataService;

import java.awt.event.KeyEvent;

/**
 * @author Paweł Łabuda
 */
public class SearchForItemtypesCallback extends SearchForCallback
{
   private HybrisExplorerTree tree;

   private HybrisExplorerTreeModel treeModel;

   public SearchForItemtypesCallback(HybrisExplorerTree tree, HybrisExplorerTreeModel treeModel)
   {
      this.tree = tree;
      this.treeModel = treeModel;
   }

   @Override
   public Boolean execute(String text, KeyEvent keyEvent)
   {
      if(keyEvent.getKeyCode() == KeyEvent.VK_ENTER)
      {
         RuntimeDataService.getInstance().setEnteredSearchText(text);

//         TreePath[] selectedPaths = tree.getExpandedDescendants(treeModel.getSelectedModulesNode());
         treeModel.reload();
//         for (TreePath selectedPath : selectedPaths)
//         {
//            Object selectedNode = selectedPath.getLastPathComponent();
//            if(selectedNode instanceof ModuleNode)
//            {
//               treeModel.nodeChanged((TreeNode) selectedNode);
//            }
//         }
         return true;
      }
      else
      {
         return false;
      }
   }
}
