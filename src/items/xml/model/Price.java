// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:price interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:price documentation</h3>
 * Data object of entity type Price with amount, value and valid date.
 *  A price manages all information relevant to prices like price, scaled price, purchase quantities, quantity
 *  units, packaging units, etc. A price is related to exactly one bucket.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Price extends DomElement {

	/**
	 * Returns the value of the amount child.
	 * <pre>
	 * <h3>Attribute null:amount documentation</h3>
	 * Amount&lt;p&gt;
	 *  There is not special format for amounts, because this can have very different representations.
	 * </pre>
	 * @return the value of the amount child.
	 */
	@NotNull
	GenericAttributeValue<String> getAmount();


	/**
	 * Returns the value of the bucketId child.
	 * <pre>
	 * <h3>Attribute null:bucketId documentation</h3>
	 * Identifier of parent bucket that this price is related to.
	 * </pre>
	 * @return the value of the bucketId child.
	 */
	@NotNull
	GenericAttributeValue<String> getBucketId();


	/**
	 * Returns the value of the entityPriceId child.
	 * <pre>
	 * <h3>Attribute null:entityPriceId documentation</h3>
	 * Identifier of Entity from Entity Model
	 * </pre>
	 * @return the value of the entityPriceId child.
	 */
	@NotNull
	GenericAttributeValue<String> getEntityPriceId();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier of the Price.
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Name
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


	/**
	 * Returns the value of the sequence child.
	 * <pre>
	 * <h3>Attribute null:sequence documentation</h3>
	 * Sequence number for the bucket as given in the content system. &lt;p&gt;
	 *  This should reflect the position of the current price in the sorting of prices of its parent object.
	 * </pre>
	 * @return the value of the sequence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getSequence();


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
	 * Returns the value of the validFrom child.
	 * <pre>
	 * <h3>Attribute null:validFrom documentation</h3>
	 * Price is valid from
	 * </pre>
	 * @return the value of the validFrom child.
	 */
	@NotNull
	GenericAttributeValue<String> getValidFrom();


	/**
	 * Returns the value of the validTo child.
	 * <pre>
	 * <h3>Attribute null:validTo documentation</h3>
	 * Price is valid to
	 * </pre>
	 * @return the value of the validTo child.
	 */
	@NotNull
	GenericAttributeValue<String> getValidTo();


	/**
	 * Returns the value of the value child.
	 * <pre>
	 * <h3>Attribute null:value documentation</h3>
	 * Price
	 *  &lt;p&gt;
	 *  There is not special format for prices, because this can have very different representations.
	 * </pre>
	 * @return the value of the value child.
	 */
	@NotNull
	GenericAttributeValue<String> getValue();


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


}
