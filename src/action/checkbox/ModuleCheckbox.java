package action.checkbox;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import data.RuntimeDataService;

/**
 * @author Paweł Łabuda
 */
public class ModuleCheckbox implements CheckboxElement
{
   private final Module module;

   private final Project project;

   public ModuleCheckbox(Module module)
   {
      this.module = module;
      this.project = module.getProject();
   }

   @Override
   public boolean isSelected()
   {
      return RuntimeDataService.getInstance(project).isModuleSelected(module);
   }

   @Override
   public void setSelected(boolean state)
   {
      if(state)
      {
         RuntimeDataService.getInstance(project).selectModule(module);
      }
      else
      {
         RuntimeDataService.getInstance(project).deselectModule(module);
      }
   }

   @Override
   public String getName()
   {
      return module.getName();
   }
}
