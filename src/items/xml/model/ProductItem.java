// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ProductItemElemType interface.
 * @author Paweł Łabuda
 */
public interface ProductItem extends DomElement {

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
	 * Returns the value of the ProductThumbNailURL child.
	 * @return the value of the ProductThumbNailURL child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductThumbNailURL();


}
