// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ArticleElemType interface.
 * @author Paweł Łabuda
 */
public interface Article extends DomElement {

	/**
	 * Returns the value of the ArticleNr child.
	 * @return the value of the ArticleNr child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getArticleNr();


	/**
	 * Returns the value of the Count child.
	 * @return the value of the Count child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCount();


	/**
	 * Returns the value of the DateTime child.
	 * @return the value of the DateTime child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getDateTime();


}
