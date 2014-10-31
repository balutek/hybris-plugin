package cmp.tree.node;

import com.intellij.openapi.module.Module;

import javax.swing.tree.DefaultMutableTreeNode;
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
   public String toString()
   {
      return "Wybrane moduły :)";
   }
}
