package hybrisplugin.items.xml.tree;

import com.intellij.psi.xml.XmlTag;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * @author Paweł Łabuda
 */
public class XmlTreeModel implements TreeModel
{
   private XmlTag root;

   public XmlTreeModel(XmlTag root)
   {
      this.root = root;
   }

   @Override
   public Object getRoot()
   {
      return root;
   }

   @Override
   public Object getChild(Object parent, int index)
   {
      return toXmlTag(parent).getSubTags()[index];
   }

   @Override
   public int getChildCount(Object parent)
   {
      return toXmlTag(parent).getSubTags().length;
   }

   @Override
   public boolean isLeaf(Object node)
   {
      return toXmlTag(node).getSubTags().length == 0;
   }

   @Override
   public void valueForPathChanged(TreePath path, Object newValue)
   {
   }

   @Override
   public int getIndexOfChild(Object parent, Object child)
   {
      XmlTag xmlParent = (XmlTag) parent;
      XmlTag xmlChild = (XmlTag) child;
      XmlTag[] xmlChildren = xmlParent.getSubTags();
      for(int i=0; i < xmlChildren.length; ++i)
      {
         if (xmlChildren[i].equals(xmlChild))
         {
            return i;
         }
      }
      return -1;
   }

   @Override
   public void addTreeModelListener(TreeModelListener l)
   {

   }

   @Override
   public void removeTreeModelListener(TreeModelListener l)
   {

   }

   private XmlTag toXmlTag(Object node)
   {
      return (XmlTag) node;
   }
}
