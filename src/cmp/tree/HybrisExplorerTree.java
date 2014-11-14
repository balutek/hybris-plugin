package cmp.tree;

import com.intellij.ui.treeStructure.Tree;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorerTree extends Tree
{
   private HybrisExplorerTreeModel treeModel;

   public HybrisExplorerTree(HybrisExplorerTreeModel treeModel)
   {
      super(treeModel);

      this.treeModel = treeModel;
   }



}
