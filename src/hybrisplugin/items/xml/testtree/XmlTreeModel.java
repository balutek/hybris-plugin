package hybrisplugin.items.xml.testtree;

import com.intellij.openapi.project.Project;
import com.intellij.psi.XmlElementFactory;
import com.intellij.psi.xml.XmlTag;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.util.HashMap;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class XmlTreeModel implements TreeModel
{
   private Project project;

   private HashMap<XmlTag, List<XmlTag>> treeStructureData;

   private XmlTag root;

   public XmlTreeModel(Project project, HashMap<XmlTag, List<XmlTag>> treeStructureData)
   {
      this.project = project;
      this.treeStructureData = treeStructureData;

      this.root = createRoot();
   }

   public XmlTag createRoot()
   {
      XmlTag root = XmlElementFactory.getInstance(project).createTagFromText("Rut kurwa");
      for (XmlTag xmlTag : treeStructureData.keySet())
      {
         root.addSubTag(xmlTag, false);
      }
      return root;
   }

   @Override
   public Object getRoot()
   {
      return root;
   }

   @Override
   public Object getChild(Object parent, int index)
   {
      XmlTag parentXml = toXmlTag(parent);
      if(!"itemtype".equals(parentXml.getName()))
      {
         return parentXml.getSubTags()[index];
      }
      return null;
   }

   @Override
   public int getChildCount(Object parent)
   {
      XmlTag parentXml = toXmlTag(parent);
      if(!"itemtype".equals(parentXml.getName()))
      {
         return parentXml.getSubTags().length;
      }
      return 0;
   }

   @Override
   public boolean isLeaf(Object node)
   {
      XmlTag nodeXml = toXmlTag(node);
      return "itemtype".equals(nodeXml.getName()) || nodeXml.getSubTags().length == 0;
   }

   @Override
   public void valueForPathChanged(TreePath path, Object newValue)
   {
   }

   @Override
   public int getIndexOfChild(Object parent, Object child)
   {
      XmlTag parentXml = toXmlTag(parent);
      XmlTag childXml = toXmlTag(child);
      if(!"itemtype".equals(parentXml.getName()))
      {
         XmlTag[] parentsSubTags = parentXml.getSubTags();
         for (int i = 0; i < parentsSubTags.length; i++)
         {
            XmlTag parentsSubTag = parentsSubTags[i];
            if(parentsSubTag.equals(childXml))
            {
               return i;
            }
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
