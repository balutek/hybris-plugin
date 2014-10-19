// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:atomictypesType interface.
 * <pre>
 * <h3>Type null:atomictypesType documentation</h3>
 * Defines a list of atomic types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Atomictypes extends DomElement {

	/**
	 * Returns the list of atomictype children.
	 * <pre>
	 * <h3>Element null:atomictype documentation</h3>
	 * An AtomicType represents a simple java object. (The name 'atomic' just means 'non-composed' objects.)
	 * </pre>
	 * @return the list of atomictype children.
	 */
	@NotNull
	List<Atomictype> getAtomictypes();
	/**
	 * Adds new child to the list of atomictype children.
	 * @return created child
	 */
	Atomictype addAtomictype();


}
