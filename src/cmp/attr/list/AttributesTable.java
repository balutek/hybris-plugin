package cmp.attr.list;

import com.intellij.ui.table.JBTable;

import javax.swing.table.TableModel;

/**
 * @author Paweł Łabuda
 */
public class AttributesTable extends JBTable
{
   public AttributesTable(TableModel model)
   {
      super(model);

      setC
   }

   public AttributesTableModel getAttributesTableModel()
   {
      return (AttributesTableModel) getModel();
   }

}
