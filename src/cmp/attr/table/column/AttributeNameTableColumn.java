package cmp.attr.table.column;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class AttributeNameTableColumn extends TableColumn
{
   public AttributeNameTableColumn(int modelIndex)
   {
      super(modelIndex);
      setCellRenderer(new CellRenderer());
   }

   class CellRenderer implements TableCellRenderer
   {
      @Override
      public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                                                     int row, int column)
      {
         return new JLabel(String.valueOf(value));
      }
   }

}
