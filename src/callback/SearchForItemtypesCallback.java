package callback;

import cmp.tree.HybrisExplorerTree;
import cmp.tree.HybrisExplorerTreeModel;
import data.RuntimeDataService;

import javax.swing.tree.TreePath;
import java.util.Enumeration;

/**
 * @author Paweł Łabuda
 */
public class SearchForItemtypesCallback extends SearchForCallback<Void>
{
   private HybrisExplorerTree tree;

   private HybrisExplorerTreeModel treeModel;

   public SearchForItemtypesCallback(HybrisExplorerTree tree, HybrisExplorerTreeModel treeModel)
   {
      this.tree = tree;
      this.treeModel = treeModel;
   }

   @Override
   public Void execute()
   {
      if(isClearEvent)
      {
         RuntimeDataService.getInstance().setEnteredSearchText("");
         reloadTreeAndKeepItsExpandState();
      }
      else
      {
         RuntimeDataService.getInstance().setEnteredSearchText(this.text);
         reloadTreeAndKeepItsExpandState();
      }
      return null;
   }

   private void reloadTreeAndKeepItsExpandState()
   {
      TreePath rootPath = tree.getPathForRow(0);
      Enumeration<TreePath> selectedPaths = tree.getExpandedDescendants(rootPath);
      treeModel.reload();
      while (selectedPaths.hasMoreElements())
      {
         TreePath expandedModule = selectedPaths.nextElement();
         tree.expandPath(expandedModule);
      }
   }

}
