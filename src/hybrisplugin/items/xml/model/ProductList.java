// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:ProductListElemType interface.
 * @author Paweł Łabuda
 */
public interface ProductList extends DomElement {

	/**
	 * Returns the list of ProductItem children.
	 * @return the list of ProductItem children.
	 */
	@NotNull
	List<ProductItem> getProductItems();
	/**
	 * Adds new child to the list of ProductItem children.
	 * @return created child
	 */
	ProductItem addProductItem();


}
