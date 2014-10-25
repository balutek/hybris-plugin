package items.action.checkbox;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import items.data.ConfigurationService;

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
      return ConfigurationService.getInstance(project).isModuleSelected(module);
   }

   @Override
   public void setSelected(boolean state)
   {
      if(state)
      {
         ConfigurationService.getInstance(project).selectModule(module);
      }
      else
      {
         ConfigurationService.getInstance(project).deselectModule(module);
      }
   }

   @Override
   public String getName()
   {
      return module.getName();
   }
}
