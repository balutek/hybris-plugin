// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ListElemType interface.
 * @author Paweł Łabuda
 */
public interface List extends DomElement {

	/**
	 * Returns the list of Article children.
	 * @return the list of Article children.
	 */
	@NotNull
	java.util.List<Article> getArticles();
	/**
	 * Adds new child to the list of Article children.
	 * @return created child
	 */
	Article addArticle();


}
