// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ReferenceItemElemType interface.
 * @author Paweł Łabuda
 */
public interface ReferenceItem extends DomElement {

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
	 * Returns the value of the Description child.
	 * @return the value of the Description child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getDescription();


	/**
	 * Returns the value of the Small child.
	 * @return the value of the Small child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getSmall();


	/**
	 * Returns the value of the Medium child.
	 * @return the value of the Medium child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getMedium();


	/**
	 * Returns the value of the Large child.
	 * @return the value of the Large child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getLarge();


	/**
	 * Returns the value of the Type child.
	 * @return the value of the Type child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getType();


	/**
	 * Returns the value of the Quantity child.
	 * @return the value of the Quantity child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getQuantity();


}
