package cmp.tree.listener;

import cmp.attr.HybrisAttributesPanel;
import cmp.tree.node.ItemtypeTagNode;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Paweł Łabuda
 */
public class TreeNodeSelectionListener extends MouseAdapter
{
   private HybrisAttributesPanel hybrisAttributesPanel;

   public TreeNodeSelectionListener(HybrisAttributesPanel hybrisAttributesPanel)
   {
      this.hybrisAttributesPanel = hybrisAttributesPanel;
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      if(e.getClickCount() == 2 && e.getSource() instanceof ItemtypeTagNode)
      {
         ItemtypeTagNode clickedNode = (ItemtypeTagNode) e.getSource();
         hybrisAttributesPanel.setVisible(true);
         hybrisAttributesPanel.reloadAttributesPanel(clickedNode.getItemtypeXmlTag());
      }
   }
}
