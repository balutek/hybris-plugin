// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:VariantListItemElemType interface.
 * @author Paweł Łabuda
 */
public interface VariantListItem extends DomElement {

	/**
	 * Returns the value of the VariantCode child.
	 * @return the value of the VariantCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getVariantCode();


	/**
	 * Returns the value of the VariantName child.
	 * @return the value of the VariantName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getVariantName();


	/**
	 * Returns the value of the VariantDescription child.
	 * @return the value of the VariantDescription child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getVariantDescription();


	/**
	 * Returns the value of the AttributeList child.
	 * @return the value of the AttributeList child.
	 */
	@NotNull
	@Required
	AttributeList getAttributeList();


	/**
	 * Returns the value of the Currency child.
	 * @return the value of the Currency child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCurrency();


	/**
	 * Returns the value of the Quantity child.
	 * @return the value of the Quantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getQuantity();


	/**
	 * Returns the value of the Price child.
	 * @return the value of the Price child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPrice();


	/**
	 * Returns the value of the Unit child.
	 * @return the value of the Unit child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnit();


}
