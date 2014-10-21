// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:BaseProductDataElemType interface.
 * @author Paweł Łabuda
 */
public interface BaseProductData extends DomElement {

	/**
	 * Returns the value of the ProductName child.
	 * @return the value of the ProductName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductName();


	/**
	 * Returns the value of the ProductCode child.
	 * @return the value of the ProductCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductCode();


	/**
	 * Returns the value of the ArticleRange child.
	 * @return the value of the ArticleRange child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getArticleRange();


	/**
	 * Returns the value of the PictureUrlList child.
	 * @return the value of the PictureUrlList child.
	 */
	@NotNull
	@Required
	PictureUrlList getPictureUrlList();


	/**
	 * Returns the value of the ProductDescription child.
	 * @return the value of the ProductDescription child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getProductDescription();


	/**
	 * Returns the value of the AttributeList child.
	 * @return the value of the AttributeList child.
	 */
	@NotNull
	@Required
	AttributeList getAttributeList();


	/**
	 * Returns the value of the VariantList child.
	 * @return the value of the VariantList child.
	 */
	@NotNull
	@Required
	VariantList getVariantList();


}
