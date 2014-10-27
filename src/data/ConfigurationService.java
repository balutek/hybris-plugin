package data;

import com.intellij.openapi.components.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

/**
 * @author Paweł Łabuda
 */

@State(
        name = "HybrisPluginProjectState",
        storages = {
            @Storage(
                    id="hybrisPluginProjectState",
                    file = StoragePathMacros.PROJECT_CONFIG_DIR + "/hybrisPluginProjectState.xml",
                    scheme = StorageScheme.DIRECTORY_BASED
            )
        })
public class ConfigurationService implements PersistentStateComponent<ConfigurationService>
{
   private HashMap<String, Boolean> modulesSelectionMap = new HashMap<String, Boolean>();

   @NotNull
   public static ConfigurationService getInstance(Project project)
   {
      return ServiceManager.getService(project, ConfigurationService.class);
   }

   @Nullable
   @Override
   public ConfigurationService getState()
   {
      return this;
   }

   @Override
   public void loadState(ConfigurationService state)
   {
      XmlSerializerUtil.copyBean(state, this);
   }

   public HashMap<String, Boolean> getModulesSelectionMap()
   {
      return modulesSelectionMap;
   }

   public boolean isModuleSelected(Module module)
   {
      Boolean moduleSelected = modulesSelectionMap.get(module.getName());
      return moduleSelected != null && moduleSelected;
   }

   public void selectModule(Module module)
   {
      modulesSelectionMap.put(module.getName(), true);
   }

   public void deselectModule(Module module)
   {
      modulesSelectionMap.remove(module.getName());
   }
}
