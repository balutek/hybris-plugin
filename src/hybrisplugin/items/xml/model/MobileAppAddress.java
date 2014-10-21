// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:MobileAppAddress interface.
 * @author Paweł Łabuda
 */
public interface MobileAppAddress extends DomElement {

	/**
	 * Returns the value of the PK child.
	 * @return the value of the PK child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPK();


	/**
	 * Returns the value of the companyName child.
	 * @return the value of the companyName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCompanyName();


	/**
	 * Returns the value of the streetName child.
	 * @return the value of the streetName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getStreetName();


	/**
	 * Returns the value of the streetNumber child.
	 * @return the value of the streetNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getStreetNumber();


	/**
	 * Returns the value of the postalCode child.
	 * @return the value of the postalCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPostalCode();


	/**
	 * Returns the value of the town child.
	 * @return the value of the town child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTown();


	/**
	 * Returns the value of the country child.
	 * @return the value of the country child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCountry();


}
