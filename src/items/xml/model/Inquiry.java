// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:InquiryElemType interface.
 * @author Paweł Łabuda
 */
public interface Inquiry extends DomElement {

	/**
	 * Returns the value of the InquiryHeader child.
	 * @return the value of the InquiryHeader child.
	 */
	@NotNull
	@Required
	InquiryHeader getInquiryHeader();


	/**
	 * Returns the value of the InquiryBody child.
	 * @return the value of the InquiryBody child.
	 */
	@NotNull
	@Required
	InquiryBody getInquiryBody();


}
