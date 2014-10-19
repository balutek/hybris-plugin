// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ArticleDataElemType interface.
 * @author Paweł Łabuda
 */
public interface ArticleData extends DomElement {

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
	 * Returns the value of the ProductPictureUrl child.
	 * @return the value of the ProductPictureUrl child.
	 */
	@NotNull
	@Required
	ProductPictureUrl getProductPictureUrl();


	/**
	 * Returns the value of the AttributeList child.
	 * @return the value of the AttributeList child.
	 */
	@NotNull
	@Required
	AttributeList getAttributeList();


	/**
	 * Returns the value of the Availability child.
	 * @return the value of the Availability child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAvailability();


	/**
	 * Returns the value of the BackorderQuantity child.
	 * @return the value of the BackorderQuantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getBackorderQuantity();


	/**
	 * Returns the value of the Quantity child.
	 * @return the value of the Quantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getQuantity();


	/**
	 * Returns the value of the Unit child.
	 * @return the value of the Unit child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getUnit();


	/**
	 * Returns the value of the Currency child.
	 * @return the value of the Currency child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCurrency();


	/**
	 * Returns the value of the Price child.
	 * @return the value of the Price child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPrice();


	/**
	 * Returns the value of the PictureUrlList child.
	 * @return the value of the PictureUrlList child.
	 */
	@NotNull
	@Required
	PictureUrlList getPictureUrlList();


	/**
	 * Returns the value of the PriceData child.
	 * @return the value of the PriceData child.
	 */
	@NotNull
	@Required
	PriceData getPriceData();


	/**
	 * Returns the value of the Comment child.
	 * @return the value of the Comment child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComment();


	/**
	 * Returns the value of the Configurable child.
	 * @return the value of the Configurable child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getConfigurable();


}
