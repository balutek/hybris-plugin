// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:LoginInfoElemType interface.
 * @author Paweł Łabuda
 */
public interface LoginInfo extends DomElement {

	/**
	 * Returns the value of the SessionKey child.
	 * @return the value of the SessionKey child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getSessionKey();


}
