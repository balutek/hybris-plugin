package callback;

/**
 * @author Paweł Łabuda
 */
public abstract class SearchForCallback<RETURN> implements AnActionCallback<RETURN>
{
   protected String text;

   protected boolean isClearEvent = false;

   protected Object object;

   public String getText()
   {
      return text;
   }

   public void setText(String text)
   {
      this.text = text;
   }

   public boolean isClearEvent()
   {
      return isClearEvent;
   }

   public void setClearEvent(boolean isClearEvent)
   {
      this.isClearEvent = isClearEvent;
   }

   public Object getObject()
   {
      return object;
   }

   public void setObject(Object object)
   {
      this.object = object;
   }
}
