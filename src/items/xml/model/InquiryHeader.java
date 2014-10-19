// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:InquiryHeaderElemType interface.
 * @author Paweł Łabuda
 */
public interface InquiryHeader extends DomElement {

	/**
	 * Returns the value of the Supplier child.
	 * @return the value of the Supplier child.
	 */
	@NotNull
	@Required
	Supplier getSupplier();


	/**
	 * Returns the value of the InquiryDate child.
	 * @return the value of the InquiryDate child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getInquiryDate();


	/**
	 * Returns the value of the InquiryReference child.
	 * @return the value of the InquiryReference child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getInquiryReference();


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
