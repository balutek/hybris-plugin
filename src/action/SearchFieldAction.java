package action;

import callback.SearchForCallback;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.ui.SearchTextField;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @author Paweł Łabuda
 */
public class SearchFieldAction<T> extends AnAction implements CustomComponentAction
{
   private SearchTextField searchTextField;

   private SearchForCallback searchForCallback;

   public SearchFieldAction(@NotNull final SearchForCallback searchForCallback)
   {
      this.searchForCallback = searchForCallback;

      searchTextField = new SearchTextField(true){
         @Override
         protected boolean preprocessEventForTextField(KeyEvent e)
         {
//            searchForCallback.setText(e.g);
            searchForCallback.setKeyEvent(e);
            searchForCallback.setClearEvent(false);
            if(searchForCallback.execute())
            {
               e.consume();
               return true;
            }
            else
            {
               return false;
            }
         }



         @Override
         protected void onFieldCleared()
         {
//            searchForCallback.setText(getText());
            searchForCallback.setClearEvent(true);
            searchForCallback.execute();
         }
      };
   }

   @Override
   public void actionPerformed(AnActionEvent e)
   {

   }

   @Override
   public JComponent createCustomComponent(Presentation presentation)
   {
      return searchTextField;
   }
}
