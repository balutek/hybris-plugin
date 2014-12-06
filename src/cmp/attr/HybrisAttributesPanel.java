package cmp.attr;

import cmp.attr.list.AttributesTable;
import cmp.attr.list.AttributesTableModel;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.components.JBScrollPane;

/**
 * @author Paweł Łabuda
 */
public class HybrisAttributesPanel extends SimpleToolWindowPanel
{
   private JBScrollPane attributesTableScrollPane;

   private AttributesTable attributesTable;

   public HybrisAttributesPanel()
   {
      super(true);

      initContent();

      setContent(attributesTableScrollPane);
   }

   private void initContent()
   {
      attributesTable = new AttributesTable(new AttributesTableModel());
      attributesTableScrollPane = new JBScrollPane(attributesTable);
   }

   public void reloadAttributesPanel(XmlTag selectedItemtypeTag)
   {
      attributesTable.getAttributesTableModel().reloadSelectedItemtypeTag(selectedItemtypeTag);
   }

}
