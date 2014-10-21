// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:indexType interface.
 * <pre>
 * <h3>Type null:indexType documentation</h3>
 * Configures a database index for enclosing type.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Index extends DomElement {

	/**
	 * Returns the value of the name child.
	 * <pre>
	 * <h3>Attribute null:name documentation</h3>
	 * The name prefix of the index.
	 * </pre>
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the remove child.
	 * <pre>
	 * <h3>Attribute null:remove documentation</h3>
	 * If 'true' this index will be ommitted while in initialization process even if there were precendent declarations.This attribute has effect only if replace = true.
	 * </pre>
	 * @return the value of the remove child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getRemove();


	/**
	 * Returns the value of the replace child.
	 * <pre>
	 * <h3>Attribute null:replace documentation</h3>
	 * If 'true' this index is a replacement/redeclaration for already existing index.
	 * </pre>
	 * @return the value of the replace child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getReplace();


	/**
	 * Returns the value of the unique child.
	 * <pre>
	 * <h3>Attribute null:unique documentation</h3>
	 * If 'true', the value of this attribute has to be unique within all instances of this index. Attributes with persistence type set to 'jalo' can not be unique. Default is 'false'.
	 * </pre>
	 * @return the value of the unique child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getUnique();


	/**
	 * Returns the list of key children.
	 * <pre>
	 * <h3>Element null:key documentation</h3>
	 * Configures a single index key.
	 * </pre>
	 * @return the list of key children.
	 */
	@NotNull
	List<IndexKey> getKeys();
	/**
	 * Adds new child to the list of key children.
	 * @return created child
	 */
	IndexKey addKey();


}
