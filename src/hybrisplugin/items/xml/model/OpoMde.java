// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:OpoMdeElemType interface.
 * @author Paweł Łabuda
 */
public interface OpoMde extends DomElement {

	/**
	 * Returns the value of the Version child.
	 * @return the value of the Version child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getVersion();


	/**
	 * Returns the value of the Commission child.
	 * @return the value of the Commission child.
	 */
	@NotNull
	GenericAttributeValue<String> getCommission();


	/**
	 * Returns the value of the List child.
	 * @return the value of the List child.
	 */
	@NotNull
	@Required
	List getList();


}
