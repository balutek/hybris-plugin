package cmp.attr.table;

import com.intellij.psi.xml.XmlTag;
import util.PluginXmlUtil;

import javax.swing.table.AbstractTableModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author Paweł Łabuda
 */
public class AttributesTableModel extends AbstractTableModel
{
   public static final String ATTRIBUTE_XML_ELEMENT_NAME = "attribute";

   public static final String ATTRIBUTE_XML_ELEMENT_QUALIFIER_ATTRIBUTE_NAME = "qualifier";

   public static final String ATTRIBUTE_XML_ELEMENT_READ_ATTRIBUTE_NAME = "read";

   public static final String ATTRIBUTE_XML_ELEMENT_WRITE_ATTRIBUTE_NAME = "write";

   public static final String ATTRIBUTE_XML_ELEMENT_SEARCH_ATTRIBUTE_NAME = "search";

   public static final String ATTRIBUTE_XML_ELEMENT_OPTIONAL_ATTRIBUTE_NAME = "optional";

   public static final String MODIFIERS_XML_ELEMENT_NAME = "modifiers";

   private XmlTag selectedItemtypeTag;

   private List<XmlTag> attributes;

   private HashMap<XmlTag, Object[]> attributesPropertiesMap;

   @Override
   public int getRowCount()
   {
      return attributes != null ? attributes.size() : 0;
   }

   @Override
   public int getColumnCount()
   {
      // statically set as 5 because I want to display attribute name and read, write, search and required property
      return 5;
   }

   @Override
   public Object getValueAt(int rowIndex, int columnIndex)
   {
      return attributesPropertiesMap.get(attributes.get(rowIndex))[columnIndex];
   }

   public XmlTag getSelectedItemtypeTag()
   {
      return selectedItemtypeTag;
   }

   public void reloadSelectedItemtypeTag(XmlTag selectedItemtypeTag)
   {
      this.selectedItemtypeTag = selectedItemtypeTag;

      attributes = PluginXmlUtil.findTagsByName(this.selectedItemtypeTag, ATTRIBUTE_XML_ELEMENT_NAME);
      reloadAttributesPropertiesMap();
   }

   private void reloadAttributesPropertiesMap()
   {
      attributesPropertiesMap = new HashMap<XmlTag, Object[]>();

      Iterator<XmlTag> attributesIterator = attributes.iterator();
      while (attributesIterator.hasNext())
      {
         XmlTag attributeXmlTag = attributesIterator.next();

         Object[] attributeProperties = new Object[5];
         attributeProperties[0] = attributeXmlTag.getAttribute(ATTRIBUTE_XML_ELEMENT_QUALIFIER_ATTRIBUTE_NAME).getValue();

         List<XmlTag> attributeModifiersXmlTags = PluginXmlUtil.findTagsByName(attributeXmlTag, MODIFIERS_XML_ELEMENT_NAME);

         if(attributeModifiersXmlTags.size() > 0)
         {
            XmlTag attributeModifiersXmlTag = attributeModifiersXmlTags.get(0);
            Boolean read = Boolean.valueOf(
                    attributeModifiersXmlTag.getAttributeValue(ATTRIBUTE_XML_ELEMENT_READ_ATTRIBUTE_NAME));
            Boolean write = Boolean.valueOf(
                    attributeModifiersXmlTag.getAttributeValue(ATTRIBUTE_XML_ELEMENT_WRITE_ATTRIBUTE_NAME));
            Boolean search = Boolean.valueOf(
                    attributeModifiersXmlTag.getAttributeValue(ATTRIBUTE_XML_ELEMENT_SEARCH_ATTRIBUTE_NAME));
            Boolean required = !Boolean.valueOf(
                    attributeModifiersXmlTag.getAttributeValue(ATTRIBUTE_XML_ELEMENT_OPTIONAL_ATTRIBUTE_NAME));
            attributeProperties[1] = read;
            attributeProperties[2] = write;
            attributeProperties[3] = search;
            attributeProperties[4] = required;
         }
         else
         {
            attributeProperties[1] = true; // read
            attributeProperties[2] = true; // write
            attributeProperties[3] = true; // search
            attributeProperties[4] = false; // required
         }
         attributesPropertiesMap.put(attributeXmlTag, attributeProperties);
      }
   }

}
