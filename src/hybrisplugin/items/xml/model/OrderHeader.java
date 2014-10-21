// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:OrderHeaderElemType interface.
 * @author Paweł Łabuda
 */
public interface OrderHeader extends DomElement {

	/**
	 * Returns the value of the Supplier child.
	 * @return the value of the Supplier child.
	 */
	@NotNull
	@Required
	Supplier getSupplier();


	/**
	 * Returns the value of the OrderDate child.
	 * @return the value of the OrderDate child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderDate();


	/**
	 * Returns the value of the OrderReference child.
	 * @return the value of the OrderReference child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderReference();


	/**
	 * Returns the value of the Buyer child.
	 * @return the value of the Buyer child.
	 */
	@NotNull
	@Required
	Buyer getBuyer();


	/**
	 * Returns the value of the ShipDate child.
	 * @return the value of the ShipDate child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getShipDate();


	/**
	 * Returns the value of the ShipTo child.
	 * @return the value of the ShipTo child.
	 */
	@NotNull
	@Required
	ShipTo getShipTo();


	/**
	 * Returns the value of the CurrencyCode child.
	 * @return the value of the CurrencyCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCurrencyCode();


	/**
	 * Returns the value of the LanguageCode child.
	 * @return the value of the LanguageCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getLanguageCode();


	/**
	 * Returns the value of the DispatchCode child.
	 * @return the value of the DispatchCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getDispatchCode();


	/**
	 * Returns the value of the PaymentCode child.
	 * @return the value of the PaymentCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPaymentCode();


	/**
	 * Returns the value of the Comment child.
	 * @return the value of the Comment child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComment();


}
