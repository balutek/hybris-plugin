// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:modelMethodType interface.
 * <pre>
 * <h3>Type null:modelMethodType documentation</h3>
 * Allows to configure alternative methods at generated model.
 * </pre>
 * @author Paweł Łabuda
 */
public interface ModelMethod extends DomElement {

	/**
	 * Returns the value of the name child.
	 * <pre>
	 * <h3>Attribute null:name documentation</h3>
	 * Name of the alternative getter method.
	 * </pre>
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the deprecated child.
	 * <pre>
	 * <h3>Attribute null:deprecated documentation</h3>
	 * Will the method be marked deprecated? Default is
	 * 					false.
	 * </pre>
	 * @return the value of the deprecated child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getDeprecated();


	/**
	 * Returns the value of the default child.
	 * <pre>
	 * <h3>Attribute null:default documentation</h3>
	 * Will this method be the default method and replace the original one instead of adding it additional? Default is false.
	 * </pre>
	 * @return the value of the default child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getDefault();


}
