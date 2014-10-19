// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ChapterItemElemType interface.
 * @author Paweł Łabuda
 */
public interface ChapterItem extends DomElement {

	/**
	 * Returns the value of the ChapterId child.
	 * @return the value of the ChapterId child.
	 */
	@NotNull
	GenericAttributeValue<String> getChapterId();


	/**
	 * Returns the value of the ChapterNumber child.
	 * @return the value of the ChapterNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getChapterNumber();


	/**
	 * Returns the value of the ChapterName child.
	 * @return the value of the ChapterName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getChapterName();


	/**
	 * Returns the value of the ChapterText child.
	 * @return the value of the ChapterText child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getChapterText();


	/**
	 * Returns the value of the ChapterURL child.
	 * @return the value of the ChapterURL child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getChapterURL();


	/**
	 * Returns the value of the ChapterType child.
	 * @return the value of the ChapterType child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getChapterType();


	/**
	 * Returns the value of the ChapterThumbNailURL child.
	 * @return the value of the ChapterThumbNailURL child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getChapterThumbNailURL();


}
