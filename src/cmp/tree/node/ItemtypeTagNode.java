package cmp.tree.node;

import cmp.tree.node.invisible.HideableTreeNode;
import com.intellij.openapi.module.Module;
import com.intellij.psi.xml.XmlTag;
import data.RuntimeDataService;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Paweł Łabuda
 */
public class ItemtypeTagNode extends DefaultMutableTreeNode implements HideableTreeNode
{
   private XmlTag itemtypeXmlTag;

   private boolean isVisible = true;

   public ItemtypeTagNode(XmlTag itemtypeXmlTag)
   {
      super(itemtypeXmlTag, true);
      this.itemtypeXmlTag = itemtypeXmlTag;
   }

   @Override
   public String toString()
   {
      return itemtypeXmlTag.getAttributeValue("code");
   }

   public XmlTag getItemtypeXmlTag()
   {
      return itemtypeXmlTag;
   }

   public Module getModule()
   {
      return ((ModuleNode)getParent()).getModule();
   }

   @Override
   public boolean isVisible()
   {
      String enteredSearchText = RuntimeDataService.getInstance().getEnteredSearchText();
      if(!enteredSearchText.isEmpty())
      {
         return isVisible && toString().contains(enteredSearchText);
      }
      else
      {
         return isVisible;
      }
   }

   @Override
   public void setVisible(boolean isVisible)
   {
      this.isVisible = isVisible;
   }
}
