package cmp.tree;

import com.intellij.openapi.project.Project;
import com.intellij.ui.treeStructure.Tree;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorerTree extends Tree
{
   private Project project;

   private HybrisExplorerTreeModel treeModel;

   public HybrisExplorerTree(Project project, HybrisExplorerTreeModel treeModel)
   {
      super(treeModel);

      this.project = project;
      this.treeModel = treeModel;
   }

   public Project getProject()
   {
      return project;
   }
}
