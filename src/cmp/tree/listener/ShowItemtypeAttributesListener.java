package cmp.tree.listener;

import com.intellij.ui.components.JBScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Paweł Łabuda
 */
public class ShowItemtypeAttributesListener extends MouseAdapter
{
   private JBScrollPane attributesPanel;

   public ShowItemtypeAttributesListener(JBScrollPane attributesPanel)
   {
      this.attributesPanel = attributesPanel;
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      attributesPanel.setVisible(e.getClickCount() == 2 && !attributesPanel.isVisible());
   }
}
