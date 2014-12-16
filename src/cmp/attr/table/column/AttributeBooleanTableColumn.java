package cmp.attr.table.column;

import com.intellij.ui.components.JBCheckBox;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class AttributeBooleanTableColumn extends TableColumn
{
   public AttributeBooleanTableColumn(int modelIndex)
   {
      super(modelIndex);
      setCellRenderer(new BooleanCellRenderer());
   }

   class BooleanCellRenderer implements TableCellRenderer
   {
      @Override
      public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                                                     int row, int column)
      {
         return new JBCheckBox(null, Boolean.valueOf(value.toString()));
      }
   }
}
