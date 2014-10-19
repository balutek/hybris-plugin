// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:ObjectNumberListResultElemType interface.
 * @author Paweł Łabuda
 */
public interface ObjectNumberListResult extends DomElement {

	/**
	 * Returns the value of the ObjectNumberMandatory child.
	 * @return the value of the ObjectNumberMandatory child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getObjectNumberMandatory();


	/**
	 * Returns the value of the ObjectNumberEnabled child.
	 * @return the value of the ObjectNumberEnabled child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getObjectNumberEnabled();


	/**
	 * Returns the list of ObjectNumberItem children.
	 * @return the list of ObjectNumberItem children.
	 */
	@NotNull
	List<ObjectNumberItem> getObjectNumberItems();
	/**
	 * Adds new child to the list of ObjectNumberItem children.
	 * @return created child
	 */
	ObjectNumberItem addObjectNumberItem();


}
