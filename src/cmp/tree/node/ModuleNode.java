package cmp.tree.node;

import cmp.tree.node.invisible.HideableChildrenTreeNode;
import com.intellij.openapi.module.Module;
import com.intellij.psi.xml.XmlTag;
import data.RuntimeDataService;

import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class ModuleNode extends HideableChildrenTreeNode
{
   private Module module;

   public ModuleNode(Module module)
   {
      this.module = module;

      initialize();
   }

   private void initialize()
   {
      List<XmlTag> moduleItems = RuntimeDataService.getInstance().getModuleItemsTags(module);

      for (XmlTag moduleItem : moduleItems)
      {
         add(new ItemtypeTagNode(moduleItem));
      }
   }

   @Override
   public String toString()
   {
      return module.getName();
   }

   public Module getModule()
   {
      return module;
   }
}
