package cmp.tree;

import cmp.tree.node.ItemtypeTagNode;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

      if(value instanceof ItemtypeTagNode && tree instanceof HybrisExplorerTree)
      {
         HybrisExplorerTree explorerTree = (HybrisExplorerTree) tree;
         HybrisExplorerTreeModel explorerTreeModel = (HybrisExplorerTreeModel)explorerTree.getModel();

         ItemtypeTagNode node = (ItemtypeTagNode) value;

         Pattern pattern = Pattern.compile(explorerTreeModel.getSearchText());
         Matcher matcher = pattern.matcher(node.toString());
         parentsComponent.setVisible(matcher.matches());
      }

      return parentsComponent;
   }
}
