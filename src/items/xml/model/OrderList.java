// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:OrderListElemType interface.
 * @author Paweł Łabuda
 */
public interface OrderList extends DomElement {

	/**
	 * Returns the list of OrderItem children.
	 * @return the list of OrderItem children.
	 */
	@NotNull
	List<Item> getOrderItems();
	/**
	 * Adds new child to the list of OrderItem children.
	 * @return created child
	 */
	Item addOrderItem();


}
