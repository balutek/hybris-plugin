// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:PictureUrlItemElemType interface.
 * @author Paweł Łabuda
 */
public interface PictureUrlItem extends DomElement {

	/**
	 * Returns the value of the Small child.
	 * @return the value of the Small child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getSmall();


	/**
	 * Returns the value of the Medium child.
	 * @return the value of the Medium child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getMedium();


	/**
	 * Returns the value of the Large child.
	 * @return the value of the Large child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getLarge();


}
