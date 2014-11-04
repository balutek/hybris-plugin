package callback;

import java.awt.event.KeyEvent;

/**
 * @author Paweł Łabuda
 */
public abstract class SearchForCallback implements AnActionCallback<Boolean>
{
   private String text;

   private KeyEvent keyEvent;

   @Override
   public Boolean execute()
   {
      return execute(text, keyEvent);
   }

   public abstract Boolean execute(String text, KeyEvent keyEvent);

   public String getText()
   {
      return text;
   }

   public void setText(String text)
   {
      this.text = text;
   }

   public KeyEvent getKeyEvent()
   {
      return keyEvent;
   }

   public void setKeyEvent(KeyEvent keyEvent)
   {
      this.keyEvent = keyEvent;
   }
}
