package cmp.attr.table;

import cmp.attr.table.column.AttributeBooleanTableColumn;
import cmp.attr.table.column.AttributeNameTableColumn;
import com.intellij.ui.table.JBTable;

import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 * @author Paweł Łabuda
 */
public class AttributesTable extends JBTable
{
   public AttributesTable(TableModel model)
   {
      super(model);

      TableColumnModel tableColumnModel = getColumnModel();
      tableColumnModel.addColumn(new AttributeNameTableColumn(0));
      tableColumnModel.addColumn(new AttributeBooleanTableColumn(1));
      tableColumnModel.addColumn(new AttributeBooleanTableColumn(2));
      tableColumnModel.addColumn(new AttributeBooleanTableColumn(3));
      tableColumnModel.addColumn(new AttributeBooleanTableColumn(4));
   }

   public AttributesTableModel getAttributesTableModel()
   {
      return (AttributesTableModel) getModel();
   }

   @Override
   public boolean getAutoCreateColumnsFromModel()
   {
      return false;
   }
}
