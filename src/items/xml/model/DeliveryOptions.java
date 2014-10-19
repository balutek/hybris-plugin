// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:DeliveryOptionsElemType interface.
 * @author Paweł Łabuda
 */
public interface DeliveryOptions extends DomElement {

	/**
	 * Returns the list of DeliveryOptionItem children.
	 * @return the list of DeliveryOptionItem children.
	 */
	@NotNull
	List<DeliveryOptionItem> getDeliveryOptionItems();
	/**
	 * Adds new child to the list of DeliveryOptionItem children.
	 * @return created child
	 */
	DeliveryOptionItem addDeliveryOptionItem();


}
