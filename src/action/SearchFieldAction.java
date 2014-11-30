package action;

import callback.SearchForCallback;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.ui.DocumentAdapter;
import com.intellij.ui.SearchTextField;

import javax.swing.*;
import javax.swing.event.DocumentEvent;

/**
 * @author Paweł Łabuda
 */
public class SearchFieldAction<T> extends AnAction implements CustomComponentAction
{
   private SearchTextField searchTextField;

   private SearchForCallback searchForCallback;

   public SearchFieldAction(SearchForCallback searchForCallback)
   {
      this.searchForCallback = searchForCallback;

      initListeners();
   }

   private void initListeners()
   {
      searchTextField = new SearchTextField(true)
      {
         @Override
         protected void onFieldCleared()
         {
            searchForCallback.setClearEvent(true);
            searchForCallback.execute();
         }
      };
      searchTextField.getTextEditor().getDocument().addDocumentListener(new DocumentAdapter()
      {
         @Override
         protected void textChanged(DocumentEvent e)
         {
            searchForCallback.setText(searchTextField.getText());
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
