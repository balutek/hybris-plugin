// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:PriceItemElemType interface.
 * @author Paweł Łabuda
 */
public interface PriceItem extends DomElement {

	/**
	 * Returns the value of the MinOrderQuantity child.
	 * @return the value of the MinOrderQuantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getMinOrderQuantity();


	/**
	 * Returns the value of the Unit child.
	 * @return the value of the Unit child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnit();


	/**
	 * Returns the value of the Price child.
	 * @return the value of the Price child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPrice();


	/**
	 * Returns the value of the Currency child.
	 * @return the value of the Currency child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCurrency();


	/**
	 * Returns the value of the PriceFactor child.
	 * @return the value of the PriceFactor child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPriceFactor();


}
