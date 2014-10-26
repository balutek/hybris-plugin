package callback;

import com.intellij.openapi.project.Project;
import data.RuntimeDataService;

/**
 * @author Paweł Łabuda
 */
public class ModulesSelectionCallback implements AnActionCallback<Void>
{
   private Project project;

   public ModulesSelectionCallback(Project project)
   {
      this.project = project;
   }

   @Override
   public Void execute()
   {
      RuntimeDataService.getInstance(project).reloadSelectedModulesItemsTagsMap();
      return null;
   }
}
