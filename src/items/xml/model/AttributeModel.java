// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:attributeModelType interface.
 * <pre>
 * <h3>Type null:attributeModelType documentation</h3>
 * Allows to configure model generation for this attribute used at servicelayer.
 * </pre>
 * @author Paweł Łabuda
 */
public interface AttributeModel extends DomElement {

	/**
	 * Returns the value of the generate child.
	 * <pre>
	 * <h3>Attribute null:generate documentation</h3>
	 * Whether getter and setter methods for the model representation of the attribute will be generated. Default is 'true'.
	 * </pre>
	 * @return the value of the generate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getGenerate();


	/**
	 * Returns the list of getter children.
	 * <pre>
	 * <h3>Element null:getter documentation</h3>
	 * Allows to configure alternative getter methods at generated model.
	 * </pre>
	 * @return the list of getter children.
	 */
	@NotNull
	List<ModelMethod> getGetters();
	/**
	 * Adds new child to the list of getter children.
	 * @return created child
	 */
	ModelMethod addGetter();


	/**
	 * Returns the list of setter children.
	 * <pre>
	 * <h3>Element null:setter documentation</h3>
	 * Allows to configure alternative setter methods at generated model.
	 * </pre>
	 * @return the list of setter children.
	 */
	@NotNull
	List<ModelMethod> getSetters();
	/**
	 * Adds new child to the list of setter children.
	 * @return created child
	 */
	ModelMethod addSetter();


}
