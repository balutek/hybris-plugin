// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:ContactInfoType interface.
 * @author Paweł Łabuda
 */
public interface ContactInfo extends DomElement {

	/**
	 * Returns the value of the Name child.
	 * @return the value of the Name child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getName();


	/**
	 * Returns the value of the Mail child.
	 * @return the value of the Mail child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getMail();


	/**
	 * Returns the value of the Phone child.
	 * @return the value of the Phone child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getPhone();


	/**
	 * Returns the value of the Fax child.
	 * @return the value of the Fax child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getFax();


	/**
	 * Returns the value of the Comment child.
	 * @return the value of the Comment child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getComment();


}
