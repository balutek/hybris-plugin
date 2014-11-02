package cmp.tree.node;

import com.intellij.openapi.module.Module;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class SelectedModulesNode extends DefaultMutableTreeNode
{
   private List<Module> selectedModules = new ArrayList<Module>();

   public SelectedModulesNode(List<Module> initialList)
   {
      initialize(initialList);
   }

   private void initialize(List<Module> initialList)
   {
      for (Module module : initialList)
      {
         add(new ModuleNode(module));
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
