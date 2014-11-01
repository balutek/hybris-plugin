package cmp.tree.node;

import com.intellij.openapi.module.Module;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class SelectedModulesNode extends DefaultMutableTreeNode
{
   private List<Module> selectedModules;

   public SelectedModulesNode(List<Module> selectedModules)
   {
      this.selectedModules = selectedModules;

      initialize();
   }

   private void initialize()
   {
      for (Module selectedModule : selectedModules)
      {
         add(new ModuleNode(selectedModule));
      }
   }

   @Override
   public void insert(MutableTreeNode newChild, int childIndex)
   {
      super.insert(newChild, childIndex);
      if (newChild instanceof ModuleNode)
      {
         Module addedModule = ((ModuleNode)newChild).getModule();
         selectedModules.add(childIndex, addedModule);
      }
   }

   @Override
   public String toString()
   {
      return "Wybrane moduły :)";
   }
}
