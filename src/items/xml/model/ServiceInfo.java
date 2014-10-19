// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ServiceInfoElemType interface.
 * @author Paweł Łabuda
 */
public interface ServiceInfo extends DomElement {

	/**
	 * Returns the value of the Supplier child.
	 * @return the value of the Supplier child.
	 */
	@NotNull
	@Required
	Supplier getSupplier();


	/**
	 * Returns the value of the Transfer child.
	 * @return the value of the Transfer child.
	 */
	@NotNull
	@Required
	Transfer getTransfer();


}
