// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:PriceDataElemType interface.
 * @author Paweł Łabuda
 */
public interface PriceData extends DomElement {

	/**
	 * Returns the list of PriceItem children.
	 * @return the list of PriceItem children.
	 */
	@NotNull
	List<PriceItem> getPriceItems();
	/**
	 * Adds new child to the list of PriceItem children.
	 * @return created child
	 */
	PriceItem addPriceItem();


}
