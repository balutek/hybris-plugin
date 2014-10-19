// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:connectorEntity interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:connectorEntity documentation</h3>
 * Representation of a connector entity. &lt;p&gt;
 *  Used to map between entity model and data structure in the content system.
 * </pre>
 * @author Paweł Łabuda
 */
public interface ConnectorEntity extends DomElement {

	/**
	 * Returns the value of the description child.
	 * <pre>
	 * <h3>Attribute null:description documentation</h3>
	 * not supported yet
	 * </pre>
	 * @return the value of the description child.
	 */
	@NotNull
	GenericAttributeValue<String> getDescription();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier as used in the connector for content system.
	 *  &lt;p&gt;
	 *  E.g. in ConnectorPubDB this is constructed as: 'container_&lt;comet_container.type_name&gt;', e.g. 'container_Katalog'.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Label of the ConnectorEntity to be used in display, e.g. in ISON. 
	 *  &lt;p&gt;
	 *  As a convention GUIs may use a slash within the label to generate a hierarchical view of the connector entity name. &lt;br&gt;
	 *  
	 *  E.g. in ConnectorPubDB this is constructed as: 'container/&lt;comet_container.type_name&gt;', e.g. 'container/Katalog'.
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


}
