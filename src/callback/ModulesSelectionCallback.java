package callback;

import cmp.tree.node.SelectedModulesNode;

/**
 * @author Paweł Łabuda
 */
public class ModulesSelectionCallback implements AnActionCallback<Void>
{
   private SelectedModulesNode root;

   public ModulesSelectionCallback(SelectedModulesNode root)
   {
      this.root = root;
   }

   @Override
   public Void execute()
   {

      return null;
   }
}
