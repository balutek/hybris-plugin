package data;

import com.intellij.openapi.components.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

/**
 * Configuration service methods can't be called by interface components
 *
 * Try to operate only on simple values like booleans, integers, strings etc.
 *
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
   public HashMap<String, Boolean> modulesSelectionMap = new HashMap<String, Boolean>();

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

   public boolean isModuleSelected(String moduleName)
   {
      Boolean moduleSelected = modulesSelectionMap.get(moduleName);
      return moduleSelected != null && moduleSelected;
   }

   public void selectModule(String moduleName)
   {
      modulesSelectionMap.put(moduleName, true);
   }

   public void deselectModule(String moduleName)
   {
      modulesSelectionMap.remove(moduleName);
   }
}
