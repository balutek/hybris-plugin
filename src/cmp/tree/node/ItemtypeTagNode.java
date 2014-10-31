package cmp.tree.node;

import com.intellij.psi.xml.XmlTag;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Paweł Łabuda
 */
public class ItemtypeTagNode extends DefaultMutableTreeNode
{
   private XmlTag itemtypeXmlTag;

   public ItemtypeTagNode(XmlTag itemtypeXmlTag)
   {
      this.itemtypeXmlTag = itemtypeXmlTag;
   }

   @Override
   public String toString()
   {
      return itemtypeXmlTag.getAttributeValue("code");
   }
}
