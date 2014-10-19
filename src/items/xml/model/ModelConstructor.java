// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:modelConstructorType interface.
 * <pre>
 * <h3>Type null:modelConstructorType documentation</h3>
 * Allows to configure model constructor signatures.
 * </pre>
 * @author Paweł Łabuda
 */
public interface ModelConstructor extends DomElement {

	/**
	 * Returns the value of the signature child.
	 * <pre>
	 * <h3>Attribute null:signature documentation</h3>
	 * Add here, as comma separated list, the attribute qualifiers for the constructor signature in the model.
	 * </pre>
	 * @return the value of the signature child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getSignature();


}
