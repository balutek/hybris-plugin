// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:itemtypesType interface.
 * <pre>
 * <h3>Type null:itemtypesType documentation</h3>
 * Defines a grouping of item types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Itemtypes extends DomElement {

	/**
	 * Returns the list of itemtype children.
	 * <pre>
	 * <h3>Element null:itemtype documentation</h3>
	 * Specifies a specific ComposedType.
	 * </pre>
	 * @return the list of itemtype children.
	 */
	@NotNull
	List<Itemtype> getItemtypes();
	/**
	 * Adds new child to the list of itemtype children.
	 * @return created child
	 */
	Itemtype addItemtype();


	/**
	 * Returns the list of typegroup children.
	 * <pre>
	 * <h3>Element null:typegroup documentation</h3>
	 * Specifies a group of ComposedTypes to allow better structuring within the items.xml file.
	 * </pre>
	 * @return the list of typegroup children.
	 */
	@NotNull
	List<TypeGroup> getTypegroups();
	/**
	 * Adds new child to the list of typegroup children.
	 * @return created child
	 */
	TypeGroup addTypegroup();


}
