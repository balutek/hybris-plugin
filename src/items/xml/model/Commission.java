// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:CommissionElemType interface.
 * @author Paweł Łabuda
 */
public interface Commission extends DomElement {

	/**
	 * Returns the value of the Code child.
	 * @return the value of the Code child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCode();


	/**
	 * Returns the value of the Name child.
	 * @return the value of the Name child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getName();


}
