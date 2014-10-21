// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:text interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:text documentation</h3>
 * Data object of entity type Text
 * </pre>
 * @author Paweł Łabuda
 */
public interface Text extends DomElement {

	/**
	 * Returns the value of the bucketId child.
	 * <pre>
	 * <h3>Attribute null:bucketId documentation</h3>
	 * Identifier of parent bucket that this text is related to.
	 * </pre>
	 * @return the value of the bucketId child.
	 */
	@NotNull
	GenericAttributeValue<String> getBucketId();


	/**
	 * Returns the value of the entityTextId child.
	 * <pre>
	 * <h3>Attribute null:entityTextId documentation</h3>
	 * Identifier of related entity in entity model.
	 * </pre>
	 * @return the value of the entityTextId child.
	 */
	@NotNull
	GenericAttributeValue<String> getEntityTextId();


	/**
	 * Returns the value of the groupIdentifier child.
	 * <pre>
	 * <h3>Attribute null:groupIdentifier documentation</h3>
	 * String key for grouping texts of the same type.
	 * </pre>
	 * @return the value of the groupIdentifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getGroupIdentifier();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier of the Text.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the sequence child.
	 * <pre>
	 * <h3>Attribute null:sequence documentation</h3>
	 * Sequence number for the text as given in the content system. &lt;p&gt;
	 *  This should reflect the position of the current text in the sorting of texts of its parent object.
	 * </pre>
	 * @return the value of the sequence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getSequence();


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
	 * Returns the value of the text child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:text documentation</h3>
	 * Data object of entity type Text
	 * </pre>
	 * @return the value of the text child.
	 */
	@NotNull
	GenericDomValue<String> getText();


}
