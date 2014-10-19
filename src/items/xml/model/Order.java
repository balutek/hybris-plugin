// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:OrderElemType interface.
 * @author Paweł Łabuda
 */
public interface Order extends DomElement {

	/**
	 * Returns the value of the OrderHeader child.
	 * @return the value of the OrderHeader child.
	 */
	@NotNull
	@Required
	OrderHeader getOrderHeader();


	/**
	 * Returns the value of the OrderBody child.
	 * @return the value of the OrderBody child.
	 */
	@NotNull
	@Required
	OrderBody getOrderBody();


}
