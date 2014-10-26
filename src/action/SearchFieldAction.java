package action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.actionSystem.ex.CustomComponentAction;
import com.intellij.ui.SearchTextField;

import javax.swing.*;

/**
 * @author Paweł Łabuda
 */
public class SearchFieldAction extends AnAction implements CustomComponentAction
{
   private SearchTextField searchTextField;

   public SearchFieldAction()
   {
      searchTextField = new SearchTextField(true);
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
