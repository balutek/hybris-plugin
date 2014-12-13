package cmp.tree.listener;

import cmp.attr.HybrisAttributesPanel;
import cmp.tree.HybrisExplorerTree;
import cmp.tree.node.ItemtypeTagNode;
import data.RuntimeDataService;

import javax.swing.tree.TreePath;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Paweł Łabuda
 */
public class TreeNodeSelectionListener extends MouseAdapter
{
   private HybrisExplorerTree hybrisExplorerTree;

   private HybrisAttributesPanel hybrisAttributesPanel;

   public TreeNodeSelectionListener(HybrisExplorerTree hybrisExplorerTree, HybrisAttributesPanel hybrisAttributesPanel)
   {
      this.hybrisAttributesPanel = hybrisAttributesPanel;
      this.hybrisExplorerTree = hybrisExplorerTree;
   }

   @Override
   public void mouseClicked(MouseEvent event)
   {
      if(event.getClickCount() == 2)
      {
         TreePath selectedNodePath = hybrisExplorerTree.getClosestPathForLocation(event.getX(), event.getY());

         if(selectedNodePath != null)
         {
            Object selectedNode = selectedNodePath.getLastPathComponent();
            if (selectedNode instanceof ItemtypeTagNode)
            {
               RuntimeDataService.getInstance().setSelectedItemtypeTagNode((ItemtypeTagNode) selectedNode);
               hybrisAttributesPanel.showAttributesPanel();
            }
         }
      }
   }
}
