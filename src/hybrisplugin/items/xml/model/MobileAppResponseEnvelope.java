// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:MobileAppResponseEnvelopeElemType interface.
 * @author Paweł Łabuda
 */
public interface MobileAppResponseEnvelope extends DomElement {

	/**
	 * Returns the value of the ResponseHeader child.
	 * @return the value of the ResponseHeader child.
	 */
	@NotNull
	@Required
	ResponseHeader getResponseHeader();


	/**
	 * Returns the value of the ResponseBody child.
	 * @return the value of the ResponseBody child.
	 */
	@NotNull
	ResponseBody getResponseBody();


}
