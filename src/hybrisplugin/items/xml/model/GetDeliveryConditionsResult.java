// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:GetDeliveryConditionsResultElemType interface.
 * @author Paweł Łabuda
 */
public interface GetDeliveryConditionsResult extends DomElement {

	/**
	 * Returns the value of the DeliveryConditions child.
	 * @return the value of the DeliveryConditions child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getDeliveryConditions();


	/**
	 * Returns the value of the DeliveryOptions child.
	 * @return the value of the DeliveryOptions child.
	 */
	@NotNull
	@Required
	DeliveryOptions getDeliveryOptions();


}
