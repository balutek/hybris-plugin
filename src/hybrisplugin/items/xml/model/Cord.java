// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:cord interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:cord documentation</h3>
 * Object of entity type Cord represent n:m relationship between buckets.&lt;p&gt;
 *  A cord can contain its own content. For this cases the cord is related to a third bucket representing the connection content.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Cord extends DomElement {

	/**
	 * Returns the value of the destinationLabel child.
	 * <pre>
	 * <h3>Attribute null:destinationLabel documentation</h3>
	 * Display name for the "to Bucket" relationship
	 * </pre>
	 * @return the value of the destinationLabel child.
	 */
	@NotNull
	GenericAttributeValue<String> getDestinationLabel();


	/**
	 * Returns the value of the entityCordId child.
	 * <pre>
	 * <h3>Attribute null:entityCordId documentation</h3>
	 * Identifier of related entity in entity model.
	 * </pre>
	 * @return the value of the entityCordId child.
	 */
	@NotNull
	GenericAttributeValue<String> getEntityCordId();


	/**
	 * Returns the value of the groupIdentifier child.
	 * <pre>
	 * <h3>Attribute null:groupIdentifier documentation</h3>
	 * String key for grouping cords of the same type.
	 * </pre>
	 * @return the value of the groupIdentifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getGroupIdentifier();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier of the cord.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Display label for the cord.
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


	/**
	 * Returns the value of the sequence child.
	 * <pre>
	 * <h3>Attribute null:sequence documentation</h3>
	 * Sequence number for the cord as given in the content system. &lt;p&gt;
	 *  This should reflect the position of the current cord in the sorting of cords of its parentBucket.
	 * </pre>
	 * @return the value of the sequence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getSequence();


	/**
	 * Returns the value of the sourceLabel child.
	 * <pre>
	 * <h3>Attribute null:sourceLabel documentation</h3>
	 * Display name for the "from Bucket" relationship
	 * </pre>
	 * @return the value of the sourceLabel child.
	 */
	@NotNull
	GenericAttributeValue<String> getSourceLabel();


	/**
	 * Returns the value of the template child.
	 * <pre>
	 * <h3>Attribute null:template documentation</h3>
	 * String identifier of the priint:comet template.
	 * </pre>
	 * @return the value of the template child.
	 */
	@NotNull
	GenericAttributeValue<String> getTemplate();


	/**
	 * Returns the value of the timestamp child.
	 * <pre>
	 * <h3>Attribute null:timestamp documentation</h3>
	 * Timestamp from the content system. 
	 *  &lt;p&gt;Timestamp is used as a string to support differing types of timestamp representation as used by different content system.
	 * </pre>
	 * @return the value of the timestamp child.
	 */
	@NotNull
	GenericAttributeValue<String> getTimestamp();


	/**
	 * Returns the value of the version child.
	 * <pre>
	 * <h3>Attribute null:version documentation</h3>
	 * Version string from the content system.
	 * </pre>
	 * @return the value of the version child.
	 */
	@NotNull
	GenericAttributeValue<String> getVersion();


	/**
	 * Returns the value of the connectorEntity child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:connectorEntity documentation</h3>
	 * Representation of a connector entity. &lt;p&gt;
	 *  Used to map between entity model and data structure in the content system.
	 * </pre>
	 * @return the value of the connectorEntity child.
	 */
	@NotNull
	ConnectorEntity getConnectorEntity();


	/**
	 * Returns the value of the contentBucket child.
	 * @return the value of the contentBucket child.
	 */
	@NotNull
	Bucket getContentBucket();


	/**
	 * Returns the value of the context child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:context documentation</h3>
	 * Holds context data like language, country, market etc.
	 * </pre>
	 * @return the value of the context child.
	 */
	@NotNull
	Context getContext();


	/**
	 * Returns the value of the destinationBucket child.
	 * @return the value of the destinationBucket child.
	 */
	@NotNull
	Bucket getDestinationBucket();


	/**
	 * Returns the value of the sourceBucket child.
	 * @return the value of the sourceBucket child.
	 */
	@NotNull
	Bucket getSourceBucket();


}
