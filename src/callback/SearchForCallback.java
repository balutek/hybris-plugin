package callback;

import java.awt.event.KeyEvent;

/**
 * @author Paweł Łabuda
 */
public abstract class SearchForCallback implements AnActionCallback<Boolean>
{
   protected String text;

   protected KeyEvent keyEvent;

   private boolean isClearEvent = false;

   @Override
   public Boolean execute()
   {
      return execute(text, keyEvent, isClearEvent);
   }

   public abstract Boolean execute(String text, KeyEvent keyEvent, boolean isClearEvent);

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

   public boolean isClearEvent()
   {
      return isClearEvent;
   }

   public void setClearEvent(boolean isClearEvent)
   {
      this.isClearEvent = isClearEvent;
   }
}
