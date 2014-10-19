// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:itemsElemType interface.
 * @author Paweł Łabuda
 */
public interface Items extends DomElement {

	/**
	 * Returns the value of the atomictypes child.
	 * <pre>
	 * <h3>Element null:atomictypes documentation</h3>
	 * Defines the list of AtomicType's for your extension.
	 * </pre>
	 * @return the value of the atomictypes child.
	 */
	@NotNull
	Atomictypes getAtomictypes();


	/**
	 * Returns the value of the collectiontypes child.
	 * <pre>
	 * <h3>Element null:collectiontypes documentation</h3>
	 * Defines the list of CollectionType's for your extension.
	 * </pre>
	 * @return the value of the collectiontypes child.
	 */
	@NotNull
	Collectiontypes getCollectiontypes();


	/**
	 * Returns the value of the enumtypes child.
	 * <pre>
	 * <h3>Element null:enumtypes documentation</h3>
	 * Defines the list of EnumerationType's for your extension.
	 * </pre>
	 * @return the value of the enumtypes child.
	 */
	@NotNull
	Enumtypes getEnumtypes();


	/**
	 * Returns the value of the maptypes child.
	 * <pre>
	 * <h3>Element null:maptypes documentation</h3>
	 * Defines the list of MapType's for your extension.
	 * </pre>
	 * @return the value of the maptypes child.
	 */
	@NotNull
	Maptypes getMaptypes();


	/**
	 * Returns the value of the relations child.
	 * <pre>
	 * <h3>Element null:relations documentation</h3>
	 * Defines the list of RelationType's for your extension.
	 * </pre>
	 * @return the value of the relations child.
	 */
	@NotNull
	Relations getRelations();


	/**
	 * Returns the value of the itemtypes child.
	 * <pre>
	 * <h3>Element null:itemtypes documentation</h3>
	 * Defines the list of ComposedType's for your extension.
	 * </pre>
	 * @return the value of the itemtypes child.
	 */
	@NotNull
	Itemtypes getItemtypes();


}
