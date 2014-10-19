// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:InquiryListElemType interface.
 * @author Paweł Łabuda
 */
public interface InquiryList extends DomElement {

	/**
	 * Returns the list of InquiryItem children.
	 * @return the list of InquiryItem children.
	 */
	@NotNull
	List<Item> getInquiryItems();
	/**
	 * Adds new child to the list of InquiryItem children.
	 * @return created child
	 */
	Item addInquiryItem();


}
