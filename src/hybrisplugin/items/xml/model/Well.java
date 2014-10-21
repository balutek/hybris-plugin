// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:well interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:well documentation</h3>
 * Content systems do often organize data for publication in "pools". In our terms this is called a "well". Wells are part of the context. So, many queries need to be augmented by the name of the relevant data pool.
 *  
 *  &lt;p&gt;
 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Well extends DomElement {

	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Name of the Well.
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getLabel();


}
