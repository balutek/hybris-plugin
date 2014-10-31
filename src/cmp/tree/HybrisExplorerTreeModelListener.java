package cmp.tree;

import com.intellij.ui.treeStructure.Tree;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorerTreeModelListener implements TreeModelListener
{
   private Tree tree;

   public HybrisExplorerTreeModelListener(Tree tree)
   {
      this.tree = tree;
   }

   @Override
   public void treeNodesChanged(TreeModelEvent e)
   {

   }

   @Override
   public void treeNodesInserted(TreeModelEvent e)
   {
      tree.addNotify();
   }

   @Override
   public void treeNodesRemoved(TreeModelEvent e)
   {
      tree.removeNotify();
   }

   @Override
   public void treeStructureChanged(TreeModelEvent e)
   {

   }


}
