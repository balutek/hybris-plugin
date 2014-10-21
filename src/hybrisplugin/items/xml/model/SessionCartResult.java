// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:SessionCartResultElemType interface.
 * @author Paweł Łabuda
 */
public interface SessionCartResult extends DomElement {

	/**
	 * Returns the value of the TotalUnitCount child.
	 * @return the value of the TotalUnitCount child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTotalUnitCount();


	/**
	 * Returns the value of the TotalPrice child.
	 * @return the value of the TotalPrice child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTotalPrice();


	/**
	 * Returns the value of the TotalTax child.
	 * @return the value of the TotalTax child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTotalTax();


	/**
	 * Returns the value of the SubTotal child.
	 * @return the value of the SubTotal child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getSubTotal();


	/**
	 * Returns the value of the Currency child.
	 * @return the value of the Currency child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCurrency();


	/**
	 * Returns the value of the Comment child.
	 * @return the value of the Comment child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComment();


	/**
	 * Returns the list of ArticleItem children.
	 * @return the list of ArticleItem children.
	 */
	@NotNull
	List<ArticleItem> getArticleItems();
	/**
	 * Adds new child to the list of ArticleItem children.
	 * @return created child
	 */
	ArticleItem addArticleItem();


}
