// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:ProductArticleReferencesResultElemType interface.
 * @author Paweł Łabuda
 */
public interface ProductArticleReferencesResult extends DomElement {

	/**
	 * Returns the list of ReferenceItem children.
	 * @return the list of ReferenceItem children.
	 */
	@NotNull
	List<ReferenceItem> getReferenceItems();
	/**
	 * Adds new child to the list of ReferenceItem children.
	 * @return created child
	 */
	ReferenceItem addReferenceItem();


}
