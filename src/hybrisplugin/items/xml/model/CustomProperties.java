// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:customPropertiesType interface.
 * <pre>
 * <h3>Type null:customPropertiesType documentation</h3>
 * Defines custom properties.
 * </pre>
 * @author Paweł Łabuda
 */
public interface CustomProperties extends DomElement {

	/**
	 * Returns the list of property children.
	 * <pre>
	 * <h3>Element null:property documentation</h3>
	 * Defines a custom property.
	 * </pre>
	 * @return the list of property children.
	 */
	@NotNull
	List<CustomProperty> getProperties();
	/**
	 * Adds new child to the list of property children.
	 * @return created child
	 */
	CustomProperty addProperty();


}
