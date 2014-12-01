package cmp.attr;

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.ui.SimpleToolWindowPanel;

import javax.swing.*;

/**
 * @author Paweł Łabuda
 */
public class HybrisAttributesPanel extends SimpleToolWindowPanel
{
   public HybrisAttributesPanel()
   {
      super(true);

//      setToo
      setContent(new JLabel("Jestem content z owego panelu :)"));
   }

   private void initActionToolbar()
   {
      DefaultActionGroup actionGroup = new DefaultActionGroup();

//      ActionButton hidePanelAction = new ActionButton()
   }

}
