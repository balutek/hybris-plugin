package callback;

import cmp.tree.node.SelectedModulesNode;
import com.intellij.openapi.project.Project;
import data.RuntimeDataService;

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
