// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ArticleItemElemType interface.
 * @author Paweł Łabuda
 */
public interface ArticleItem extends DomElement {

	/**
	 * Returns the value of the EntryNumber child.
	 * @return the value of the EntryNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getEntryNumber();


	/**
	 * Returns the value of the ArticleCode child.
	 * @return the value of the ArticleCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getArticleCode();


	/**
	 * Returns the value of the ArticleName child.
	 * @return the value of the ArticleName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getArticleName();


	/**
	 * Returns the value of the ArticleDescription child.
	 * @return the value of the ArticleDescription child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getArticleDescription();


	/**
	 * Returns the value of the Unit child.
	 * @return the value of the Unit child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnit();


	/**
	 * Returns the value of the Quantity child.
	 * @return the value of the Quantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getQuantity();


	/**
	 * Returns the value of the Currency child.
	 * @return the value of the Currency child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCurrency();


	/**
	 * Returns the value of the BasePrice child.
	 * @return the value of the BasePrice child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getBasePrice();


	/**
	 * Returns the value of the TotalPrice child.
	 * @return the value of the TotalPrice child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getTotalPrice();


	/**
	 * Returns the value of the ObjectNumber child.
	 * @return the value of the ObjectNumber child.
	 */
	@NotNull
	@Required
	ObjectNumber getObjectNumber();


	/**
	 * Returns the value of the Commission child.
	 * @return the value of the Commission child.
	 */
	@NotNull
	@Required
	Commission getCommission();


	/**
	 * Returns the value of the Comment child.
	 * @return the value of the Comment child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComment();


	/**
	 * Returns the value of the Available child.
	 * @return the value of the Available child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAvailable();


	/**
	 * Returns the value of the AvailabilityText child.
	 * @return the value of the AvailabilityText child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAvailabilityText();


}
