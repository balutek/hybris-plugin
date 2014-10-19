// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:itemModelType interface.
 * <pre>
 * <h3>Type null:itemModelType documentation</h3>
 * Allows to configure model generation for this item used at servicelayer.
 * </pre>
 * @author Paweł Łabuda
 */
public interface ItemModel extends DomElement {

	/**
	 * Returns the value of the generate child.
	 * <pre>
	 * <h3>Attribute null:generate documentation</h3>
	 * Whether a model for the type and models for subtypes will be generated. Default is 'true'.
	 * </pre>
	 * @return the value of the generate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getGenerate();


	/**
	 * Returns the list of constructor children.
	 * <pre>
	 * <h3>Element null:constructor documentation</h3>
	 * Allows to configure model constructor signatures.
	 * </pre>
	 * @return the list of constructor children.
	 */
	@NotNull
	List<ModelConstructor> getConstructors();
	/**
	 * Adds new child to the list of constructor children.
	 * @return created child
	 */
	ModelConstructor addConstructor();


}
