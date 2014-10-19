// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:valueType interface.
 * <pre>
 * <h3>Type null:valueType documentation</h3>
 * Configures a single element.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Value extends DomElement {

	/**
	 * Returns the value of the code child.
	 * <pre>
	 * <h3>Attribute null:code documentation</h3>
	 * The unique code of this element.
	 * </pre>
	 * @return the value of the code child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getCode();


}
