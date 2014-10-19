// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:enumtypesType interface.
 * <pre>
 * <h3>Type null:enumtypesType documentation</h3>
 * Defines a list of enumeration types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Enumtypes extends DomElement {

	/**
	 * Returns the list of enumtype children.
	 * <pre>
	 * <h3>Element null:enumtype documentation</h3>
	 * An EnumerationType defines fixed value types. (The typesystem provides item enumeration only)
	 * </pre>
	 * @return the list of enumtype children.
	 */
	@NotNull
	List<Enumtype> getEnumtypes();
	/**
	 * Adds new child to the list of enumtype children.
	 * @return created child
	 */
	Enumtype addEnumtype();


}
