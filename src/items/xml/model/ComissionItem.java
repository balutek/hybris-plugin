// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ComissionItemElemType interface.
 * @author Paweł Łabuda
 */
public interface ComissionItem extends DomElement {

	/**
	 * Returns the value of the ComissionName child.
	 * @return the value of the ComissionName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComissionName();


	/**
	 * Returns the value of the ComissionCode child.
	 * @return the value of the ComissionCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComissionCode();


}
