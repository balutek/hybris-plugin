// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:keyValue interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:keyValue documentation</h3>
 * Data object for entity type KeyValue, e.g. technical attributes of a product like weight, or size etc.
 * </pre>
 * @author Paweł Łabuda
 */
public interface KeyValue extends DomElement {

	/**
	 * Returns the value of the bucketId child.
	 * <pre>
	 * <h3>Attribute null:bucketId documentation</h3>
	 * Identifier of parent bucket that this keyvalue is related to.
	 * </pre>
	 * @return the value of the bucketId child.
	 */
	@NotNull
	GenericAttributeValue<String> getBucketId();


	/**
	 * Returns the value of the dataType child.
	 * <pre>
	 * <h3>Attribute null:dataType documentation</h3>
	 * Data type of the value (String, int, float, boolean).
	 *  &lt;p&gt;
	 *  There is no vocabulary explicitly restricting the values of this property.
	 * </pre>
	 * @return the value of the dataType child.
	 */
	@NotNull
	GenericAttributeValue<String> getDataType();


	/**
	 * Returns the value of the entityKeyValueId child.
	 * <pre>
	 * <h3>Attribute null:entityKeyValueId documentation</h3>
	 * Identifier of related entity in entity model.
	 * </pre>
	 * @return the value of the entityKeyValueId child.
	 */
	@NotNull
	GenericAttributeValue<String> getEntityKeyValueId();


	/**
	 * Returns the value of the groupIdentifier child.
	 * <pre>
	 * <h3>Attribute null:groupIdentifier documentation</h3>
	 * String key for grouping key-values of the same type.
	 * </pre>
	 * @return the value of the groupIdentifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getGroupIdentifier();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier of the KeyValue.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the key child.
	 * <pre>
	 * <h3>Attribute null:key documentation</h3>
	 * Name of the key, e.g. "length"
	 * </pre>
	 * @return the value of the key child.
	 */
	@NotNull
	GenericAttributeValue<String> getKey();


	/**
	 * Returns the value of the keyLabel child.
	 * <pre>
	 * <h3>Attribute null:keyLabel documentation</h3>
	 * Label for the key. Used for publishing, if key itself is something like a code.
	 * </pre>
	 * @return the value of the keyLabel child.
	 */
	@NotNull
	GenericAttributeValue<String> getKeyLabel();


	/**
	 * Returns the value of the sequence child.
	 * <pre>
	 * <h3>Attribute null:sequence documentation</h3>
	 * Sequence number for the keyvalue as given in the content system. &lt;p&gt;
	 *  This should reflect the position of the current keyvalue in the sorting of keyvalues of its parent object.
	 * </pre>
	 * @return the value of the sequence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getSequence();


	/**
	 * Returns the value of the source child.
	 * <pre>
	 * <h3>Attribute null:source documentation</h3>
	 * "connector": this KeyValue comes from the connector or "entitymanager" : this is added from the comet server
	 * </pre>
	 * @return the value of the source child.
	 */
	@NotNull
	GenericAttributeValue<String> getSource();


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
	 * Returns the value of the value child.
	 * <pre>
	 * <h3>Attribute null:value documentation</h3>
	 * Value of the key-value object, e.g. "12.3" for a key named "length".
	 *  &lt;p&gt;
	 *  Value is always a string. You may use dataType property for specifying the preferred type.
	 * </pre>
	 * @return the value of the value child.
	 */
	@NotNull
	GenericAttributeValue<String> getValue();


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
	 * Returns the list of metaData children.
	 * @return the list of metaData children.
	 */
	@NotNull
	@SubTagList ("metaData")
	List<KeyValue> getMetaDatas();
	/**
	 * Adds new child to the list of metaData children.
	 * @return created child
	 */
	@SubTagList ("metaData")
	KeyValue addMetaData();


	/**
	 * Returns the value of the parentKeyValue child.
	 * @return the value of the parentKeyValue child.
	 */
	@NotNull
	KeyValue getParentKeyValue();


	/**
	 * Returns the value of the refKeyValue child.
	 * @return the value of the refKeyValue child.
	 */
	@NotNull
	KeyValue getRefKeyValue();


	/**
	 * Returns the list of subKeyValue children.
	 * @return the list of subKeyValue children.
	 */
	@NotNull
	@SubTagList ("subKeyValue")
	List<KeyValue> getSubKeyValues();
	/**
	 * Adds new child to the list of subKeyValue children.
	 * @return created child
	 */
	@SubTagList ("subKeyValue")
	KeyValue addSubKeyValue();


}
