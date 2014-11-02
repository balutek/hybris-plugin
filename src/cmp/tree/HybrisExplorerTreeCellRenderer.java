package cmp.tree;

import javax.swing.*;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorerTreeCellRenderer implements TreeCellRenderer
{
   @Override
   public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
                                                 boolean leaf, int row, boolean hasFocus)
   {
      return new JLabel(value.toString());
   }
}
