// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:collectiontypesType interface.
 * <pre>
 * <h3>Type null:collectiontypesType documentation</h3>
 * Defines a list of collection types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Collectiontypes extends DomElement {

	/**
	 * Returns the list of collectiontype children.
	 * <pre>
	 * <h3>Element null:collectiontype documentation</h3>
	 * A CollectionType defines a collection of typed elements.
	 * </pre>
	 * @return the list of collectiontype children.
	 */
	@NotNull
	List<GenericDomValue<Collectiontype>> getCollectiontypes();
	/**
	 * Adds new child to the list of collectiontype children.
	 * @return created child
	 */
	GenericDomValue<Collectiontype> addCollectiontype();


}
