package cmp.tree;

import cmp.tree.node.SelectedModulesNode;
import com.intellij.ui.treeStructure.Tree;

import javax.swing.tree.TreePath;

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

   public SelectedModulesNode getRootNode()
   {
      return (SelectedModulesNode) treeModel.getRoot();
   }

   public TreePath getRootPath()
   {
      return new TreePath(getRootNode().getPath());
   }

}
