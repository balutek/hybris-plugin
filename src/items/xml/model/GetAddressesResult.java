// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:GetAddressesResultElemType interface.
 * @author Paweł Łabuda
 */
public interface GetAddressesResult extends DomElement {

	/**
	 * Returns the value of the BillingAdress child.
	 * @return the value of the BillingAdress child.
	 */
	@NotNull
	@Required
	MobileAppAddress getBillingAdress();


	/**
	 * Returns the value of the ShippingAdresses child.
	 * @return the value of the ShippingAdresses child.
	 */
	@NotNull
	@Required
	MobileAppAddress getShippingAdresses();


	/**
	 * Returns the value of the AddressList child.
	 * @return the value of the AddressList child.
	 */
	@NotNull
	@Required
	AddressList getAddressList();


}
