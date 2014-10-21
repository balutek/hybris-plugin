// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ObjectNumberItemElemType interface.
 * @author Paweł Łabuda
 */
public interface ObjectNumberItem extends DomElement {

	/**
	 * Returns the value of the ObjectNumberName child.
	 * @return the value of the ObjectNumberName child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getObjectNumberName();


	/**
	 * Returns the value of the ObjectNumberCode child.
	 * @return the value of the ObjectNumberCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getObjectNumberCode();


}
