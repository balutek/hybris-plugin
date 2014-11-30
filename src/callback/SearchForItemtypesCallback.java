package callback;

import cmp.tree.HybrisExplorerTree;
import cmp.tree.HybrisExplorerTreeModel;
import data.RuntimeDataService;

import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

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
      TreePath rootPath = tree.getRootPath();
      ArrayList<TreePath> expandedNodes = new ArrayList<TreePath>();
      collectExpandedNodes(expandedNodes, rootPath);
      treeModel.reload();
      expandNodes(expandedNodes);

   }

   private void collectExpandedNodes(List<TreePath> expandedNodes, TreePath nodePath)
   {
      Enumeration<TreePath> selectedPaths = tree.getExpandedDescendants(nodePath);
      while (selectedPaths.hasMoreElements())
      {
         TreePath expandedDescendant = selectedPaths.nextElement();
         expandedNodes.add(expandedDescendant);
         collectExpandedNodes(expandedNodes, expandedDescendant);
      }
   }

   private void expandNodes(List<TreePath> nodes)
   {
      Iterator<TreePath> nodesIterator = nodes.iterator();
      while(nodesIterator.hasNext())
      {
         tree.expandPath(nodesIterator.next());
      }
   }

}
