// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:BuyerElemType interface.
 * @author Paweł Łabuda
 */
public interface Buyer extends DomElement {

	/**
	 * Returns the value of the ClientNumber child.
	 * @return the value of the ClientNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getClientNumber();


	/**
	 * Returns the value of the ContactInfo child.
	 * @return the value of the ContactInfo child.
	 */
	@NotNull
	@Required
	ContactInfo getContactInfo();


	/**
	 * Returns the value of the AddressInfo child.
	 * @return the value of the AddressInfo child.
	 */
	@NotNull
	@Required
	AddressInfo getAddressInfo();


}
