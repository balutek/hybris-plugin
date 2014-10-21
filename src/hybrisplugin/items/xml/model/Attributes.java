// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.Attribute;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:attributesType interface.
 * <pre>
 * <h3>Type null:attributesType documentation</h3>
 * Configures a list of attributes.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Attributes extends DomElement {

	/**
	 * Returns the list of attribute children.
	 * <pre>
	 * <h3>Element null:attribute documentation</h3>
	 * Defines a single attribute.
	 * </pre>
	 * @return the list of attribute children.
	 */
	@NotNull
	List<com.intellij.util.xml.Attribute> getAttributes();
	/**
	 * Adds new child to the list of attribute children.
	 * @return created child
	 */
	Attribute addAttribute();


}
