// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:customPropertyType interface.
 * <pre>
 * <h3>Type null:customPropertyType documentation</h3>
 * Defines a custom property.
 * </pre>
 * @author Paweł Łabuda
 */
public interface CustomProperty extends DomElement {

	/**
	 * Returns the value of the name child.
	 * <pre>
	 * <h3>Attribute null:name documentation</h3>
	 * The name of the custom property.
	 * </pre>
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the value child.
	 * <pre>
	 * <h3>Element null:value documentation</h3>
	 * The value of the custom property.
	 * </pre>
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getValue();


}
