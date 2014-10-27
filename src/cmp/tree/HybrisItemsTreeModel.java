package cmp.tree;

import com.intellij.openapi.project.Project;
import com.intellij.psi.XmlElementFactory;
import com.intellij.psi.xml.XmlTag;
import org.jetbrains.annotations.NonNls;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class HybrisItemsTreeModel implements TreeModel
{
   private final List<XmlTag> moduleItemsTags;

   private Project project;

   private String rootName;

   private XmlTag root;

   public HybrisItemsTreeModel(
           @NonNls Project project,
           @NonNls String rootName,
           @NonNls List<XmlTag> moduleItemsTags)
   {
      this.moduleItemsTags = moduleItemsTags;
      this.project = project;
      this.rootName = rootName;

      this.root = createRoot();
   }

   private XmlTag createRoot()
   {
      return XmlElementFactory.getInstance(project).createTagFromText(rootName);
   }

   @Override
   public Object getRoot()
   {
      return root;
   }

   @Override
   public Object getChild(Object parent, int index)
   {
      return moduleItemsTags.get(index);
   }

   @Override
   public int getChildCount(Object parent)
   {
      XmlTag parentXmlTag = (XmlTag) parent;
      if(parentXmlTag.getName().equals(rootName))
      {
         return moduleItemsTags.size();
      }
      return 0;
   }

   @Override
   public boolean isLeaf(Object node)
   {
      XmlTag nodeXml = (XmlTag) node;
      return !nodeXml.getName().equals(rootName) || moduleItemsTags.size() == 0;
   }

   @Override
   public void valueForPathChanged(TreePath path, Object newValue)
   {

   }

   @Override
   public int getIndexOfChild(Object parent, Object child)
   {
      XmlTag parentXml = (XmlTag) parent;
      XmlTag childXml = (XmlTag) child;

      if(parentXml.getName().equals(rootName))
      {
         for (int i = 0; i < moduleItemsTags.size(); ++i)
         {
            if(moduleItemsTags.get(i).equals(childXml))
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
}
