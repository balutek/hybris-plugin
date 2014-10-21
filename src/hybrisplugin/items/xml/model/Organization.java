// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:organization interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:organization documentation</h3>
 * Organization as part of Context
 *  &lt;p&gt;
 *  In large enterprises content is often organized by subgroups or divisions. 
 *  &lt;p&gt;
 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Organization extends DomElement {

	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Name of the Organization.
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getLabel();


}
