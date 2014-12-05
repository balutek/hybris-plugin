package cmp.attr.list;

import com.intellij.ui.table.JBTable;

import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 * @author Paweł Łabuda
 */
public class AttributesTable extends JBTable
{
   public AttributesTable(TableModel model)
   {
      super(model);
   }

   @Override
   public void setDefaultRenderer(Class<?> columnClass, TableCellRenderer renderer)
   {
      super.setDefaultRenderer(columnClass, renderer);
   }
}
