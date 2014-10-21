// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ResponseHeaderElemType interface.
 * @author Paweł Łabuda
 */
public interface ResponseHeader extends DomElement {

	/**
	 * Returns the value of the ResultCode child.
	 * @return the value of the ResultCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<Integer> getResultCode();


	/**
	 * Returns the value of the ResultMessage child.
	 * @return the value of the ResultMessage child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getResultMessage();


}
