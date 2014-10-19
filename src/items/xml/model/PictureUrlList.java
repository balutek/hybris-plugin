// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:PictureUrlListElemType interface.
 * @author Paweł Łabuda
 */
public interface PictureUrlList extends DomElement {

	/**
	 * Returns the list of PictureUrlItem children.
	 * @return the list of PictureUrlItem children.
	 */
	@NotNull
	List<PictureUrlItem> getPictureUrlItems();
	/**
	 * Adds new child to the list of PictureUrlItem children.
	 * @return created child
	 */
	PictureUrlItem addPictureUrlItem();


}
