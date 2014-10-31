package cmp.tree.node;

import com.intellij.openapi.module.Module;
import com.intellij.psi.xml.XmlTag;
import data.RuntimeDataService;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class ModuleNode extends DefaultMutableTreeNode
{
   private Module module;

   public ModuleNode(Module module)
   {
      this.module = module;

      initialize();
   }

   private void initialize()
   {
      List<XmlTag> moduleItems = RuntimeDataService.getInstance(module.getProject()).getModuleItemsTags(module);

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
