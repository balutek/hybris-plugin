// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:enumtypeType interface.
 * <pre>
 * <h3>Type null:enumtypeType documentation</h3>
 * An EnumerationType defines fixed value types. (The typesystem provides item enumeration only)
 * </pre>
 * @author Paweł Łabuda
 */
public interface Enumtype extends DomElement {

	/**
	 * Returns the value of the code child.
	 * <pre>
	 * <h3>Attribute null:code documentation</h3>
	 * The unique code of this Enumeration.
	 * </pre>
	 * @return the value of the code child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getCode();


	/**
	 * Returns the value of the autocreate child.
	 * <pre>
	 * <h3>Attribute null:autocreate documentation</h3>
	 * If 'true', the item will be created during initialization.
	 * </pre>
	 * @return the value of the autocreate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getAutocreate();


	/**
	 * Returns the value of the generate child.
	 * <pre>
	 * <h3>Attribute null:generate documentation</h3>
	 * If 'false' no constants will be generated at constant class of extension as well as at corresponding servicelayer enum class. Default is 'true'.
	 * </pre>
	 * @return the value of the generate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getGenerate();


	/**
	 * Returns the value of the jaloclass child.
	 * <pre>
	 * <h3>Attribute null:jaloclass documentation</h3>
	 * Specifies the name of the associated jalo class. The specified class must extend de.hybris.platform.jalo.enumeration.EnumerationValue and will not be generated. By specifying a jalo class you can change the implementation to use for the values of this enumeration. By default EnumerationValue class is used.
	 * </pre>
	 * @return the value of the jaloclass child.
	 */
	@NotNull
	GenericAttributeValue<String> getJaloclass();


	/**
	 * Returns the value of the dynamic child.
	 * <pre>
	 * <h3>Attribute null:dynamic documentation</h3>
	 * Whether it is possible to add new values by runtime. Also results in different types of enums: 'true' results in 'classic' hybris enums, 'false' results in Java enums. Default is false. Both kinds of enums are API compatible, and switching between enum types is possible by running a system update.
	 * </pre>
	 * @return the value of the dynamic child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getDynamic();


	/**
	 * Returns the value of the description child.
	 * <pre>
	 * <h3>Element null:description documentation</h3>
	 * Provides possibility to add meaningfull description phrase for a generated model class.
	 * </pre>
	 * @return the value of the description child.
	 */
	@NotNull
	GenericDomValue<String> getDescription();


	/**
	 * Returns the list of value children.
	 * <pre>
	 * <h3>Element null:value documentation</h3>
	 * Configures one value of this Enumeration.
	 * </pre>
	 * @return the list of value children.
	 */
	@NotNull
	List<EnumValue> getValues();
	/**
	 * Adds new child to the list of value children.
	 * @return created child
	 */
	EnumValue addValue();


}
