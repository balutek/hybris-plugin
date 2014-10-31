package cmp.tree;

import cmp.tree.node.ModuleNode;
import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.module.Module;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorerTreeModel extends DefaultTreeModel
{
   public HybrisExplorerTreeModel(SelectedModulesNode root)
   {
      super(root);
   }

   public void addModuleNode(Module module)
   {
      if(module != null)
      {
         ModuleNode newModuleNode = new ModuleNode(module);
         getSelectedModulesNode().add(newModuleNode);
      }
   }

   public void removeModuleNode(Module module)
   {
      if(module != null)
      {
         SelectedModulesNode selectedModulesNode = getSelectedModulesNode();
         DefaultMutableTreeNode currentChild = (ModuleNode) selectedModulesNode.getFirstChild();
         while(currentChild != null)
         {
            ModuleNode currentModuleNode = (ModuleNode) currentChild;
            if(currentModuleNode.getModule().equals(module))
            {
               selectedModulesNode.remove(currentModuleNode);
               break;
            }
            currentChild = currentChild.getNextSibling();
         }
      }
   }

   private SelectedModulesNode getSelectedModulesNode()
   {
      return (SelectedModulesNode) getRoot();
   }
}
