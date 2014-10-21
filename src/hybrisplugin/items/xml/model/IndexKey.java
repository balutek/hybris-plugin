// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:indexKeyType interface.
 * <pre>
 * <h3>Type null:indexKeyType documentation</h3>
 * Configures a single index key.
 * </pre>
 * @author Paweł Łabuda
 */
public interface IndexKey extends DomElement {

	/**
	 * Returns the value of the attribute child.
	 * <pre>
	 * <h3>Attribute null:attribute documentation</h3>
	 * Type attribute to be indexed.
	 * </pre>
	 * @return the value of the attribute child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getAttribute();


	/**
	 * Returns the value of the lower child.
	 * <pre>
	 * <h3>Attribute null:lower documentation</h3>
	 * Elements will be indexed case-insensitive. Default is 'false'.
	 * </pre>
	 * @return the value of the lower child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getLower();


}
