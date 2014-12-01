package cmp.tree.listener;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Paweł Łabuda
 */
public class TreeNodeSelectionListener extends MouseAdapter
{
   private JPanel panel;

   public TreeNodeSelectionListener(JPanel panel)
   {
      this.panel = panel;
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      if(e.getClickCount() == 2)
      {
         panel.setVisible(true);
      }
   }
}
