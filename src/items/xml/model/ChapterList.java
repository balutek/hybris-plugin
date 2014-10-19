// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:ChapterListElemType interface.
 * @author Paweł Łabuda
 */
public interface ChapterList extends DomElement {

	/**
	 * Returns the list of ChapterItem children.
	 * @return the list of ChapterItem children.
	 */
	@NotNull
	List<ChapterItem> getChapterItems();
	/**
	 * Adds new child to the list of ChapterItem children.
	 * @return created child
	 */
	ChapterItem addChapterItem();


}
