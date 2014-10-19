// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:relationsType interface.
 * <pre>
 * <h3>Type null:relationsType documentation</h3>
 * Defines a list of relation types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Relations extends DomElement {

	/**
	 * Returns the list of relation children.
	 * <pre>
	 * <h3>Element null:relation documentation</h3>
	 * A RelationType defines a n-m or 1-n relation between types.
	 * </pre>
	 * @return the list of relation children.
	 */
	@NotNull
	List<Relation> getRelations();
	/**
	 * Adds new child to the list of relation children.
	 * @return created child
	 */
	Relation addRelation();


}
