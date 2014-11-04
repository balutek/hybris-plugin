package callback;

import cmp.tree.HybrisExplorerTreeModel;

import java.awt.event.KeyEvent;

/**
 * @author Paweł Łabuda
 */
public class SearchForItemtypesCallback extends SearchForCallback
{
   private HybrisExplorerTreeModel treeModel;

   public SearchForItemtypesCallback(HybrisExplorerTreeModel treeModel)
   {
      this.treeModel = treeModel;
   }

   @Override
   public Boolean execute(String text, KeyEvent keyEvent)
   {
      if(keyEvent.getKeyCode() == KeyEvent.VK_ENTER && text != null && !text.isEmpty())
      {
         treeModel.setSearchText(text);
         treeModel.reload();
         return true;
      }
      else
      {
         return false;
      }
   }
}
