// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:dataElemType interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:dataElemType documentation</h3>
 * General root container for pubserver entity data like Buckets, Texts, etc.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Data extends DomElement {

	/**
	 * Returns the list of assortment children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:assortment documentation</h3>
	 * Assortment as part of Context&lt;p&gt;
	 *  The assortment of goods plays an important role when planning product data in a publication. 
	 *  Especially for the selection of data. 
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of assortment children.
	 */
	@NotNull
	List<Assortment> getAssortments();
	/**
	 * Adds new child to the list of assortment children.
	 * @return created child
	 */
	Assortment addAssortment();


	/**
	 * Returns the list of brand children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:brand documentation</h3>
	 * Brand as part of Context&lt;p&gt;
	 *  From time to time a brand will be important as criteria for selecting content. 
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of brand children.
	 */
	@NotNull
	List<Brand> getBrands();
	/**
	 * Adds new child to the list of brand children.
	 * @return created child
	 */
	Brand addBrand();


	/**
	 * Returns the list of bucket children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:bucket documentation</h3>
	 * Data object related to entity type Bucket&lt;p&gt;
	 *  A bucket is a container to collect content.
	 * </pre>
	 * @return the list of bucket children.
	 */
	@NotNull
	List<Bucket> getBuckets();
	/**
	 * Adds new child to the list of bucket children.
	 * @return created child
	 */
	Bucket addBucket();


	/**
	 * Returns the list of connectorEntity children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:connectorEntity documentation</h3>
	 * Representation of a connector entity. &lt;p&gt;
	 *  Used to map between entity model and data structure in the content system.
	 * </pre>
	 * @return the list of connectorEntity children.
	 */
	@NotNull
	@SubTagList ("connectorEntity")
	List<ConnectorEntity> getConnectorEntities();
	/**
	 * Adds new child to the list of connectorEntity children.
	 * @return created child
	 */
	@SubTagList ("connectorEntity")
	ConnectorEntity addConnectorEntity();


	/**
	 * Returns the list of connectorPlugin children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:connectorPlugin documentation</h3>
	 * An entity representing a connector plug-in.
	 * </pre>
	 * @return the list of connectorPlugin children.
	 */
	@NotNull
	@SubTagList ("connectorPlugin")
	List<ConnectorPlugin> getConnectorPlugins();
	/**
	 * Adds new child to the list of connectorPlugin children.
	 * @return created child
	 */
	@SubTagList ("connectorPlugin")
	ConnectorPlugin addConnectorPlugin();


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
	 * Returns the list of market children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:market documentation</h3>
	 * Market as part of Context
	 *  &lt;p&gt;
	 *  A market is defined as an trade channel. This could be a country, region of a country, a group of retail stores or a single retail store.
	 *  Often market is used as the criterion for individualization when individualizing prices.
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of market children.
	 */
	@NotNull
	List<Market> getMarkets();
	/**
	 * Adds new child to the list of market children.
	 * @return created child
	 */
	Market addMarket();


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
	 * Returns the list of organization children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:organization documentation</h3>
	 * Organization as part of Context
	 *  &lt;p&gt;
	 *  In large enterprises content is often organized by subgroups or divisions. 
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of organization children.
	 */
	@NotNull
	List<Organization> getOrganizations();
	/**
	 * Adds new child to the list of organization children.
	 * @return created child
	 */
	Organization addOrganization();


	/**
	 * Returns the list of participant children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:participant documentation</h3>
	 * Participant who is working on an Entity Object (like a product)
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of participant children.
	 */
	@NotNull
	List<Participant> getParticipants();
	/**
	 * Adds new child to the list of participant children.
	 * @return created child
	 */
	Participant addParticipant();


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
	 * Returns the list of status children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:status documentation</h3>
	 * Status of an Entity Object
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of status children.
	 */
	@NotNull
	List<Status> getStatuses();
	/**
	 * Adds new child to the list of status children.
	 * @return created child
	 */
	Status addStatus();


	/**
	 * Returns the list of targetGroup children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:targetGroup documentation</h3>
	 * Target groups are an important criterion when personalizing content or individualizing prices.
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of targetGroup children.
	 */
	@NotNull
	@SubTagList ("targetGroup")
	List<TargetGroup> getTargetGroups();
	/**
	 * Adds new child to the list of targetGroup children.
	 * @return created child
	 */
	@SubTagList ("targetGroup")
	TargetGroup addTargetGroup();


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


	/**
	 * Returns the list of well children.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:well documentation</h3>
	 * Content systems do often organize data for publication in "pools". In our terms this is called a "well". Wells are part of the context. So, many queries need to be augmented by the name of the relevant data pool.
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the list of well children.
	 */
	@NotNull
	List<Well> getWells();
	/**
	 * Adds new child to the list of well children.
	 * @return created child
	 */
	Well addWell();


}
