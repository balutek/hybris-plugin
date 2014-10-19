// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:ComissionListResultElemType interface.
 * @author Paweł Łabuda
 */
public interface ComissionListResult extends DomElement {

	/**
	 * Returns the value of the ComissionMandatory child.
	 * @return the value of the ComissionMandatory child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComissionMandatory();


	/**
	 * Returns the list of ComissionItem children.
	 * @return the list of ComissionItem children.
	 */
	@NotNull
	List<ComissionItem> getComissionItems();
	/**
	 * Adds new child to the list of ComissionItem children.
	 * @return created child
	 */
	ComissionItem addComissionItem();


}
