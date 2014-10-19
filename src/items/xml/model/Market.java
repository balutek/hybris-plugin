// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:market interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:market documentation</h3>
 * Market as part of Context
 *  &lt;p&gt;
 *  A market is defined as an trade channel. This could be a country, region of a country, a group of retail stores or a single retail store.
 *  Often market is used as the criterion for individualization when individualizing prices.
 *  &lt;p&gt;
 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Market extends DomElement {

	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Name of the Market.
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getLabel();


}
