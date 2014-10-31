package callback;

import cmp.tree.node.SelectedModulesNode;

/**
 * @author Paweł Łabuda
 */
public class ModulesSelectionCallbackCheckbox implements AnCheckboxActionCallback<Void>
{
   private SelectedModulesNode root;

   public ModulesSelectionCallbackCheckbox(SelectedModulesNode root)
   {
      this.root = root;
   }

   @Override
   public Void execute()
   {

      return null;
   }
}
