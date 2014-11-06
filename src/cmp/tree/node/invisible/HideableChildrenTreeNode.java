package cmp.tree.node.invisible;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.Enumeration;

/**
 * @author Paweł Łabuda
 */
public class HideableChildrenTreeNode extends DefaultMutableTreeNode
{
   protected boolean isVisible = true;

   public HideableChildrenTreeNode(Object userObject)
   {
      this(userObject, true);
   }

   public HideableChildrenTreeNode(Object userObject, boolean allowsChildren)
   {
      super(userObject, allowsChildren);
   }

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
      Enumeration<TreeNode> nodeChildren = children.elements();
      while (nodeChildren.hasMoreElements())
      {
         TreeNode child = nodeChildren.nextElement();
         if(child instanceof HideableChildrenTreeNode)
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
      return amountOfVisibleNodes;
   }

   public boolean isVisible()
   {
      return isVisible;
   }

   public void setVisible(boolean isVisible)
   {
      this.isVisible = isVisible;
   }
}
