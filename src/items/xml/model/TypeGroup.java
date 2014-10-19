// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:typeGroupType interface.
 * @author Paweł Łabuda
 */
public interface TypeGroup extends DomElement {

	/**
	 * Returns the value of the name child.
	 * <pre>
	 * <h3>Attribute null:name documentation</h3>
	 * Defines the name of this group. Only for structural purpose, will have no effect on runtime. Default is empty.
	 * </pre>
	 * @return the value of the name child.
	 */
	@NotNull
	GenericAttributeValue<String> getName();


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


}
