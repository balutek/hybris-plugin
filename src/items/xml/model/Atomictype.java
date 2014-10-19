// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import com.intellij.util.xml.Attribute;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:atomictypeType interface.
 * <pre>
 * <h3>Type null:atomictypeType documentation</h3>
 * An AtomicType represents a simple java object. (The name 'atomic' just means 'non-composed' objects.)
 * </pre>
 * @author Paweł Łabuda
 */
public interface Atomictype extends DomElement {

	/**
	 * Returns the value of the class child.
	 * <pre>
	 * <h3>Attribute null:class documentation</h3>
	 * Corresponding Java class in the hybris Suite; will also be used as the code of the atomic type.
	 * </pre>
	 * @return the value of the class child.
	 */
	@NotNull
	@Attribute("class")
	@Required
	GenericAttributeValue<String> getClazz();


	/**
	 * Returns the value of the autocreate child.
	 * <pre>
	 * <h3>Attribute null:autocreate documentation</h3>
	 * If 'true', the AtomicType will be created during initialization.
	 * </pre>
	 * @return the value of the autocreate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getAutocreate();


	/**
	 * Returns the value of the generate child.
	 * <pre>
	 * <h3>Attribute null:generate documentation</h3>
	 * Deprecated. Has no effect for atomic types. Default is 'true'.
	 * </pre>
	 * @return the value of the generate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getGenerate();


	/**
	 * Returns the value of the extends child.
	 * <pre>
	 * <h3>Attribute null:extends documentation</h3>
	 * Defines the class which will be extended. Default is 'java.lang.Object'.
	 * </pre>
	 * @return the value of the extends child.
	 */
	@NotNull
	GenericAttributeValue<String> getExtends();


}
