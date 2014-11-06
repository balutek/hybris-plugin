package action.checkbox;

import com.intellij.openapi.module.Module;
import data.RuntimeDataService;

/**
 * @author Paweł Łabuda
 */
public class ModuleCheckbox implements CheckboxElement
{
   private final Module module;

   public ModuleCheckbox(Module module)
   {
      this.module = module;
   }

   @Override
   public boolean isSelected()
   {
      return RuntimeDataService.getInstance().isModuleSelected(module);
   }

   @Override
   public void setSelected(boolean state)
   {
      if(state)
      {
         RuntimeDataService.getInstance().selectModule(module);
      }
      else
      {
         RuntimeDataService.getInstance().deselectModule(module);
      }
   }

   @Override
   public String getName()
   {
      return module.getName();
   }
}
