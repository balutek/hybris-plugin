// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:enumValueType interface.
 * <pre>
 * <h3>Type null:enumValueType documentation</h3>
 * Configures a single enum value.
 * </pre>
 * @author Paweł Łabuda
 */
public interface EnumValue extends DomElement {

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


	/**
	 * Returns the value of the description child.
	 * <pre>
	 * <h3>Element null:description documentation</h3>
	 * Provides possibility to add meaningfull description phrase for a generated model class.
	 * </pre>
	 * @return the value of the description child.
	 */
	@NotNull
	GenericDomValue<String> getDescription();


}
