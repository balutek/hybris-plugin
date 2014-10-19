// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ProductInfoElemType interface.
 * @author Paweł Łabuda
 */
public interface ProductInfo extends DomElement {

	/**
	 * Returns the value of the ProductNumber child.
	 * @return the value of the ProductNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductNumber();


	/**
	 * Returns the value of the ProductName child.
	 * @return the value of the ProductName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductName();


	/**
	 * Returns the value of the ProductText child.
	 * @return the value of the ProductText child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductText();


	/**
	 * Returns the value of the ProductURL child.
	 * @return the value of the ProductURL child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductURL();


	/**
	 * Returns the value of the OrderNumber child.
	 * @return the value of the OrderNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderNumber();


	/**
	 * Returns the value of the Availability child.
	 * @return the value of the Availability child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAvailability();


	/**
	 * Returns the value of the ProductRemark child.
	 * @return the value of the ProductRemark child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductRemark();


	/**
	 * Returns the value of the BaseUnitCode child.
	 * @return the value of the BaseUnitCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getBaseUnitCode();


	/**
	 * Returns the value of the PackageUnitCode child.
	 * @return the value of the PackageUnitCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPackageUnitCode();


	/**
	 * Returns the value of the BaseQuantityPerPackageUnit child.
	 * @return the value of the BaseQuantityPerPackageUnit child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getBaseQuantityPerPackageUnit();


	/**
	 * Returns the value of the OrderMinQuantity child.
	 * @return the value of the OrderMinQuantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderMinQuantity();


	/**
	 * Returns the value of the PriceUnitFactor child.
	 * @return the value of the PriceUnitFactor child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPriceUnitFactor();


	/**
	 * Returns the value of the PriceData child.
	 * @return the value of the PriceData child.
	 */
	@NotNull
	@Required
	PriceData getPriceData();


}
