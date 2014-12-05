package util;

import com.intellij.psi.XmlElementVisitor;
import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class PluginXmlUtil
{

   public static List<XmlTag> findTagsByName(XmlTag root, final String tagName)
   {
      final List<XmlTag> itemsXmlTags = new ArrayList<XmlTag>();

      new XmlElementVisitor()
      {
         @Override
         public void visitXmlTag(XmlTag tag)
         {
            if(tagName.equals(tag.getName()))
            {
               itemsXmlTags.add(tag);
            }
            else
            {
               XmlTag[] subtags = tag.getSubTags();
               for (XmlTag subtag : subtags)
               {
                  visitXmlTag(subtag);
               }
            }
         }
      }.visitXmlTag(root);

      return itemsXmlTags;
   }

}
