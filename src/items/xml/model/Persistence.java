// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:persistenceType interface.
 * <pre>
 * <h3>Type null:persistenceType documentation</h3>
 * Defines how the values of the attribute will be stored. Possible values: 'cmp' (deprecated), 'jalo' (not persistent), and 'property' (persistent).
 * </pre>
 * @author Paweł Łabuda
 */
public interface Persistence extends DomElement {

	/**
	 * Returns the value of the type child.
	 * <pre>
	 * <h3>Attribute null:type documentation</h3>
	 * Defines how the values of the attribute will be stored. Possible values: 'cmp' (deprecated), 'jalo' (not persistent, deprecated), 'property' (persistent), 'dynamic' (not persisted).
	 * </pre>
	 * @return the value of the type child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Type> getType();


	/**
	 * Returns the value of the qualifier child.
	 * <pre>
	 * <h3>Attribute null:qualifier documentation</h3>
	 * Deprecated. Only usable in relation with 'cmp' and 'property'(compatibility reasons) persistence type. Default is empty.
	 * </pre>
	 * @return the value of the qualifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getQualifier();


	/**
	 * Returns the value of the attributeHandler child.
	 * <pre>
	 * <h3>Attribute null:attributeHandler documentation</h3>
	 * Spring bean id that handles dynamic attributes implementation.
	 * </pre>
	 * @return the value of the attributeHandler child.
	 */
	@NotNull
	GenericAttributeValue<String> getAttributeHandler();


	/**
	 * Returns the list of columntype children.
	 * <pre>
	 * <h3>Element null:columntype documentation</h3>
	 * Configures a persistence definition for a specific database used at create statement.
	 * </pre>
	 * @return the list of columntype children.
	 */
	@NotNull
	List<Columntype> getColumntypes();
	/**
	 * Adds new child to the list of columntype children.
	 * @return created child
	 */
	Columntype addColumntype();


}
