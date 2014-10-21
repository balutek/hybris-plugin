// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:AttributeListElemType interface.
 * @author Paweł Łabuda
 */
public interface AttributeList extends DomElement {

	/**
	 * Returns the list of AttributeItem children.
	 * @return the list of AttributeItem children.
	 */
	@NotNull
	List<ProductAttribute> getAttributeItems();
	/**
	 * Adds new child to the list of AttributeItem children.
	 * @return created child
	 */
	ProductAttribute addAttributeItem();


}
