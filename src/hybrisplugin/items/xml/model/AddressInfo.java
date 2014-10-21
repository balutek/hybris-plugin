// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:AddressInfoType interface.
 * @author Paweł Łabuda
 */
public interface AddressInfo extends DomElement {

	/**
	 * Returns the value of the Name child.
	 * @return the value of the Name child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getName();


	/**
	 * Returns the value of the Address1 child.
	 * @return the value of the Address1 child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAddress1();


	/**
	 * Returns the value of the Address2 child.
	 * @return the value of the Address2 child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAddress2();


	/**
	 * Returns the value of the CountryCode child.
	 * @return the value of the CountryCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCountryCode();


	/**
	 * Returns the value of the PostalCode child.
	 * @return the value of the PostalCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPostalCode();


	/**
	 * Returns the value of the City child.
	 * @return the value of the City child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCity();


	/**
	 * Returns the value of the State child.
	 * @return the value of the State child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getState();


	/**
	 * Returns the value of the URL child.
	 * @return the value of the URL child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getURL();


	/**
	 * Returns the value of the Mail child.
	 * @return the value of the Mail child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getMail();


	/**
	 * Returns the value of the Phone child.
	 * @return the value of the Phone child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPhone();


	/**
	 * Returns the value of the Fax child.
	 * @return the value of the Fax child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getFax();


}
