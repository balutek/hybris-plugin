// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:maptypesType interface.
 * <pre>
 * <h3>Type null:maptypesType documentation</h3>
 * Specifies a list of map types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Maptypes extends DomElement {

	/**
	 * Returns the list of maptype children.
	 * <pre>
	 * <h3>Element null:maptype documentation</h3>
	 * Like the java collection framework, a type, which defines map objects. Attention: When used as type for an attribute, the attribute will not be searchable and the access performance is not effective. Consider to use a relation.
	 * </pre>
	 * @return the list of maptype children.
	 */
	@NotNull
	List<Maptype> getMaptypes();
	/**
	 * Adds new child to the list of maptype children.
	 * @return created child
	 */
	Maptype addMaptype();


}
