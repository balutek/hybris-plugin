package cmp.attr;

import cmp.attr.list.AttributesTable;
import cmp.attr.list.AttributesTableModel;
import cmp.tree.node.ItemtypeTagNode;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.util.IconUtil;
import data.RuntimeDataService;

/**
 * @author Paweł Łabuda
 */
public class HybrisAttributesPanel extends SimpleToolWindowPanel
{
   private ActionToolbar buttonActionToolbar;

   private JBScrollPane attributesTableScrollPane;

   private AttributesTable attributesTable;

   public HybrisAttributesPanel()
   {
      super(true);

      initButtons();
      initContent();

      setToolbar(buttonActionToolbar.getComponent());
      setContent(attributesTableScrollPane);

      setVisible(false);
   }

   private void initButtons()
   {
      DefaultActionGroup group = new DefaultActionGroup();
      group.add(new AnAction(IconUtil.getRemoveIcon())
      {
         @Override
         public void actionPerformed(AnActionEvent e)
         {
            HybrisAttributesPanel.this.setVisible(false);
         }
      }, Constraints.LAST);

      buttonActionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.EDITOR_TOOLBAR, group, true);
   }

   private void initContent()
   {
      attributesTable = new AttributesTable(new AttributesTableModel());
      attributesTableScrollPane = new JBScrollPane(attributesTable);
   }

   public void showAttributesPanel()
   {
      ItemtypeTagNode selectedItemtypeTagNode = RuntimeDataService.getInstance().getSelectedItemtypeTagNode();
      attributesTable.getAttributesTableModel()
              .reloadSelectedItemtypeTag(selectedItemtypeTagNode.getItemtypeXmlTag());
      setVisible(true);
   }

}
