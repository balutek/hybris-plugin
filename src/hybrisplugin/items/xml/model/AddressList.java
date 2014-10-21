// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:AddressListElemType interface.
 * @author Paweł Łabuda
 */
public interface AddressList extends DomElement {

	/**
	 * Returns the list of AddressItem children.
	 * @return the list of AddressItem children.
	 */
	@NotNull
	List<MobileAppAddress> getAddressItems();
	/**
	 * Adds new child to the list of AddressItem children.
	 * @return created child
	 */
	MobileAppAddress addAddressItem();


}
