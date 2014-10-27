package action.checkbox;

/**
 * @author Paweł Łabuda
 */
public interface CheckboxElement
{
   boolean isSelected();

   void setSelected(boolean state);

   String getName();
}
