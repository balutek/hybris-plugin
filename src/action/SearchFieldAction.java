package action;

import callback.SearchForCallback;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.ui.SearchTextField;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.KeyAdapter;
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

      searchTextField = new SearchTextField(true)
      {
         @Override
         protected void onFieldCleared()
         {
            searchForCallback.setClearEvent(true);
            searchForCallback.execute();
         }
      };
      searchTextField.addKeyboardListener(new KeyAdapter()
      {
         @Override
         public void keyTyped(KeyEvent e)
         {
            searchForCallback.setText(searchTextField.getText());
            searchForCallback.setKeyEvent(e);
            searchForCallback.setClearEvent(false);
            searchForCallback.execute();
         }
      });
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
