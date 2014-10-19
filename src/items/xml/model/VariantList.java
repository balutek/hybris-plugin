// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:VariantListElemType interface.
 * @author Paweł Łabuda
 */
public interface VariantList extends DomElement {

	/**
	 * Returns the list of VariantListItem children.
	 * @return the list of VariantListItem children.
	 */
	@NotNull
	List<VariantListItem> getVariantListItems();
	/**
	 * Adds new child to the list of VariantListItem children.
	 * @return created child
	 */
	VariantListItem addVariantListItem();


}
