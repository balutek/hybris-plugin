package cmp.tree;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisExplorerTreeCellRenderer extends DefaultTreeCellRenderer
{
   @Override
   public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
                                                 boolean leaf, int row, boolean hasFocus)
   {
      Component parentsComponent =
              super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

      // Correct it if you want to change a tree row look

      return parentsComponent;
   }
}
