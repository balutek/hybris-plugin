package callback;

import cmp.tree.HybrisExplorerTree;
import cmp.tree.HybrisExplorerTreeModel;
import data.RuntimeDataService;

import javax.swing.tree.TreePath;
import java.awt.event.KeyEvent;
import java.util.Enumeration;

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

      this.text = "";
   }

   @Override
   public Boolean execute(String text, KeyEvent keyEvent, boolean isClearEvent)
   {
      if(isClearEvent)
      {
         RuntimeDataService.getInstance().setEnteredSearchText("");
         reloadTreeAndKeepItsExpandState();
         return true;
      }
      else if(!keyEvent.isActionKey())
      {
         this.text = text;
         RuntimeDataService.getInstance().setEnteredSearchText(this.text);
         reloadTreeAndKeepItsExpandState();
         return true;
      }
      else
      {
         return false;
      }
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
