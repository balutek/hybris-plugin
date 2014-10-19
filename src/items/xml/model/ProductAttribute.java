// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ProductAttribute interface.
 * @author Paweł Łabuda
 */
public interface ProductAttribute extends DomElement {

	/**
	 * Returns the value of the AttributeName child.
	 * @return the value of the AttributeName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAttributeName();


	/**
	 * Returns the value of the AttributeValue child.
	 * @return the value of the AttributeValue child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAttributeValue();


}
