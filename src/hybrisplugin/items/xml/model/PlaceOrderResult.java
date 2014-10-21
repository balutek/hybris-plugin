// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:PlaceOrderResultElemType interface.
 * @author Paweł Łabuda
 */
public interface PlaceOrderResult extends DomElement {

	/**
	 * Returns the value of the OrderNumber child.
	 * @return the value of the OrderNumber child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getOrderNumber();


}
