package cmp.tree.node.invisible;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.Enumeration;

/**
 * @author Paweł Łabuda
 */
public class HideableChildrenTreeNode extends DefaultMutableTreeNode
{
   @Override
   public TreeNode getChildAt(int index)
   {
      int visibleIndex = -1;
      Enumeration<TreeNode> nodeChildren = children.elements();
      while (nodeChildren.hasMoreElements())
      {
         TreeNode child = nodeChildren.nextElement();
         if(child instanceof HideableTreeNode)
         {
            HideableTreeNode invisibleTreeNode = (HideableTreeNode) child;
            if (invisibleTreeNode.isVisible())
            {
               ++visibleIndex;
            }
         }
         else
         {
            ++visibleIndex;
         }
         if (index == visibleIndex)
         {
            return child;
         }
      }

      throw new ArrayIndexOutOfBoundsException("index unmatched");
   }

   @Override
   public int getChildCount()
   {
      int amountOfVisibleNodes = 0;
      if(children != null)
      {
         Enumeration<TreeNode> nodeChildren = children.elements();
         while (nodeChildren.hasMoreElements())
         {
            TreeNode child = nodeChildren.nextElement();
            if(child instanceof HideableTreeNode)
            {
               HideableTreeNode invisibleTreeNode = (HideableTreeNode) child;
               if (invisibleTreeNode.isVisible())
               {
                  ++amountOfVisibleNodes;
               }
            }
            else
            {
               ++amountOfVisibleNodes;
            }
         }
      }
      return amountOfVisibleNodes;
   }

}
