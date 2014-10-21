// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:bucket interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:bucket documentation</h3>
 * Data object related to entity type Bucket&lt;p&gt;
 *  A bucket is a container to collect content.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Bucket extends DomElement {

	/**
	 * Returns the value of the entityBucketId child.
	 * <pre>
	 * <h3>Attribute null:entityBucketId documentation</h3>
	 * String identifier of the bucket entity in the related entity model, e.g. "Product".
	 * </pre>
	 * @return the value of the entityBucketId child.
	 */
	@NotNull
	GenericAttributeValue<String> getEntityBucketId();


	/**
	 * Returns the value of the groupIdentifier child.
	 * <pre>
	 * <h3>Attribute null:groupIdentifier documentation</h3>
	 * String key for grouping buckets of the same type.
	 * </pre>
	 * @return the value of the groupIdentifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getGroupIdentifier();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier of the bucket. 
	 *  &lt;p&gt;Will be used as RecordID in priint:comet.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Display label for the bucket.
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


	/**
	 * Returns the value of the parentBucketId child.
	 * <pre>
	 * <h3>Attribute null:parentBucketId documentation</h3>
	 * Identifier of the parent bucket in the data tree.
	 * </pre>
	 * @return the value of the parentBucketId child.
	 */
	@NotNull
	GenericAttributeValue<String> getParentBucketId();


	/**
	 * Returns the value of the sequence child.
	 * <pre>
	 * <h3>Attribute null:sequence documentation</h3>
	 * Sequence number for the bucket as given in the content system. &lt;p&gt;
	 *  This should reflect the position of the current bucket in the sorting of subBuckets of its parentBucket.
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
	 * Returns the list of cord children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:cord documentation</h3>
	 * Object of entity type Cord represent n:m relationship between buckets.&lt;p&gt;
	 *  A cord can contain its own content. For this cases the cord is related to a third bucket representing the connection content.
	 * </pre>
	 * @return the list of cord children.
	 */
	@NotNull
	List<Cord> getCords();
	/**
	 * Adds new child to the list of cord children.
	 * @return created child
	 */
	Cord addCord();


	/**
	 * Returns the list of keyValue children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:keyValue documentation</h3>
	 * Data object for entity type KeyValue, e.g. technical attributes of a product like weight, or size etc.
	 * </pre>
	 * @return the list of keyValue children.
	 */
	@NotNull
	@SubTagList ("keyValue")
	List<KeyValue> getKeyValues();
	/**
	 * Adds new child to the list of keyValue children.
	 * @return created child
	 */
	@SubTagList ("keyValue")
	KeyValue addKeyValue();


	/**
	 * Returns the list of mediaAsset children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:mediaAsset documentation</h3>
	 * Object of entity type MediaAsset, e.g. images.&lt;p&gt;
	 *  An image can have more than one file for different resolutions (HighRes,
	 *  LowRes) and formats (JPEG, EPS, etc) these are stored in the Media Object
	 *  List.
	 * </pre>
	 * @return the list of mediaAsset children.
	 */
	@NotNull
	@SubTagList ("mediaAsset")
	List<MediaAsset> getMediaAssets();
	/**
	 * Adds new child to the list of mediaAsset children.
	 * @return created child
	 */
	@SubTagList ("mediaAsset")
	MediaAsset addMediaAsset();


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
	 * Returns the value of the participant child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:participant documentation</h3>
	 * Participant who is working on an Entity Object (like a product)
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the participant child.
	 */
	@NotNull
	Participant getParticipant();


	/**
	 * Returns the list of price children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:price documentation</h3>
	 * Data object of entity type Price with amount, value and valid date.
	 *  A price manages all information relevant to prices like price, scaled price, purchase quantities, quantity
	 *  units, packaging units, etc. A price is related to exactly one bucket.
	 * </pre>
	 * @return the list of price children.
	 */
	@NotNull
	List<Price> getPrices();
	/**
	 * Adds new child to the list of price children.
	 * @return created child
	 */
	Price addPrice();


	/**
	 * Returns the value of the status child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:status documentation</h3>
	 * Status of an Entity Object
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the status child.
	 */
	@NotNull
	Status getStatus();


	/**
	 * Returns the list of subBucket children.
	 * @return the list of subBucket children.
	 */
	@NotNull
	@SubTagList ("subBucket")
	List<Bucket> getSubBuckets();
	/**
	 * Adds new child to the list of subBucket children.
	 * @return created child
	 */
	@SubTagList ("subBucket")
	Bucket addSubBucket();


	/**
	 * Returns the list of text children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:text documentation</h3>
	 * Data object of entity type Text
	 * </pre>
	 * @return the list of text children.
	 */
	@NotNull
	List<Text> getTexts();
	/**
	 * Adds new child to the list of text children.
	 * @return created child
	 */
	Text addText();


}
