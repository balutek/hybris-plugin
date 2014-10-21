// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:mediaObject interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:mediaObject documentation</h3>
 * Represents a file or an object in a Media Asset System
 *  &lt;p&gt;
 * </pre>
 * @author Paweł Łabuda
 */
public interface MediaObject extends DomElement {

	/**
	 * Returns the value of the filename child.
	 * <pre>
	 * <h3>Attribute null:filename documentation</h3>
	 * Name of the file (with extension).
	 * </pre>
	 * @return the value of the filename child.
	 */
	@NotNull
	GenericAttributeValue<String> getFilename();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier of the media object.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


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
	 * Returns the value of the media child.
	 * <pre>
	 * <h3>Attribute null:media documentation</h3>
	 * Optional media content.
	 * </pre>
	 * @return the value of the media child.
	 */
	@NotNull
	GenericAttributeValue<String> getMedia();


	/**
	 * Returns the value of the path child.
	 * <pre>
	 * <h3>Attribute null:path documentation</h3>
	 * System path without filename.
	 * </pre>
	 * @return the value of the path child.
	 */
	@NotNull
	GenericAttributeValue<String> getPath();


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
	 * Returns the value of the type child.
	 * <pre>
	 * <h3>Attribute null:type documentation</h3>
	 * Type like JPEG , EPS, etc. &lt;p&gt;
	 *  At the time being there is no fixed vocabulary on media object types. &lt;br&gt;
	 *  It is recommended practise to use tyes from the IANA mime type registry.
	 * </pre>
	 * @return the value of the type child.
	 */
	@NotNull
	GenericAttributeValue<String> getType();


	/**
	 * Returns the value of the url child.
	 * <pre>
	 * <h3>Attribute null:url documentation</h3>
	 * URL to media asset system
	 * </pre>
	 * @return the value of the url child.
	 */
	@NotNull
	GenericAttributeValue<String> getUrl();


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
	 * Returns the list of qualifier children.
	 * @return the list of qualifier children.
	 */
	@NotNull
	List<KeyValue> getQualifiers();
	/**
	 * Adds new child to the list of qualifier children.
	 * @return created child
	 */
	KeyValue addQualifier();


}
