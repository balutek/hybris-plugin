// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:PostAcknowledgementElemType interface.
 * @author Paweł Łabuda
 */
public interface PostAcknowledgement extends DomElement {

	/**
	 * Returns the value of the PostCode child.
	 * @return the value of the PostCode child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPostCode();


	/**
	 * Returns the value of the AcknowledgementURL child.
	 * @return the value of the AcknowledgementURL child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getAcknowledgementURL();


}
