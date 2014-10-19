// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:deploymentType interface.
 * <pre>
 * <h3>Type null:deploymentType documentation</h3>
 * A deployment defines how a (generic) item or relation is mapped onto the database.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Deployment extends DomElement {

	/**
	 * Returns the value of the table child.
	 * <pre>
	 * <h3>Attribute null:table documentation</h3>
	 * The mapped database table. Must be globally unique.
	 * </pre>
	 * @return the value of the table child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getTable();


	/**
	 * Returns the value of the typecode child.
	 * <pre>
	 * <h3>Attribute null:typecode documentation</h3>
	 * The mapped item type code. Must be globally unique
	 * </pre>
	 * @return the value of the typecode child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getTypecode();


	/**
	 * Returns the value of the propertytable child.
	 * <pre>
	 * <h3>Attribute null:propertytable documentation</h3>
	 * The mapped dump property database table to be used for this item. Default is 'props'.
	 * </pre>
	 * @return the value of the propertytable child.
	 */
	@NotNull
	GenericAttributeValue<String> getPropertytable();


}
