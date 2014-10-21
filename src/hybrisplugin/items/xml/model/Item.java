// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ItemType interface.
 * @author Paweł Łabuda
 */
public interface Item extends DomElement {

	/**
	 * Returns the value of the OrderNumber child.
	 * @return the value of the OrderNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderNumber();


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
	 * Returns the value of the ParamData child.
	 * @return the value of the ParamData child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getParamData();


	/**
	 * Returns the value of the UnitCode child.
	 * @return the value of the UnitCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnitCode();


	/**
	 * Returns the value of the UnitLabel child.
	 * @return the value of the UnitLabel child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnitLabel();


	/**
	 * Returns the value of the Quantity child.
	 * @return the value of the Quantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getQuantity();


	/**
	 * Returns the value of the UnitPrice child.
	 * @return the value of the UnitPrice child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnitPrice();


	/**
	 * Returns the value of the ItemPrice child.
	 * @return the value of the ItemPrice child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getItemPrice();


	/**
	 * Returns the value of the ItemTaxRate child.
	 * @return the value of the ItemTaxRate child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getItemTaxRate();


	/**
	 * Returns the value of the OrderItemReference child.
	 * @return the value of the OrderItemReference child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderItemReference();


	/**
	 * Returns the value of the Comment child.
	 * @return the value of the Comment child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComment();


}
