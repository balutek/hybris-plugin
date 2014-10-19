// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package items.xml.model;

import com.intellij.util.xml.*;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:context interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:context documentation</h3>
 * Holds context data like language, country, market etc.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Context extends DomElement {

	/**
	 * Returns the value of the country child.
	 * <pre>
	 * <h3>Attribute null:country documentation</h3>
	 * ISO 3166 alpha-2 country code (two-letter upper-case representation) e.g. "DE" for Germany or "CH" for Switzerland. &lt;br&gt;
	 *  Empty string is used for ANY country.
	 * </pre>
	 * @return the value of the country child.
	 */
	@NotNull
	GenericAttributeValue<String> getCountry();


	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the language child.
	 * <pre>
	 * <h3>Attribute null:language documentation</h3>
	 * ISO 639 alpha-3 language code (three-letter lower-case representation) e.g. "deu" for German or "fra" for French.&lt;br&gt;
	 *  Empty string is used for ANY language.
	 * </pre>
	 * @return the value of the language child.
	 */
	@NotNull
	GenericAttributeValue<String> getLanguage();


	/**
	 * Returns the value of the script child.
	 * <pre>
	 * <h3>Attribute null:script documentation</h3>
	 * ISO 15924 four letter code for writing system (four-letter title-case presentation) e.g. "Latn" oder "Cyrl"&lt;br&gt;
	 *  Empty string is used for ANY script.
	 * </pre>
	 * @return the value of the script child.
	 */
	@NotNull
	GenericAttributeValue<String> getScript();


	/**
	 * Returns the value of the assortment child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:assortment documentation</h3>
	 * Assortment as part of Context&lt;p&gt;
	 *  The assortment of goods plays an important role when planning product data in a publication. 
	 *  Especially for the selection of data. 
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the assortment child.
	 */
	@NotNull
	Assortment getAssortment();


	/**
	 * Returns the value of the brand child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:brand documentation</h3>
	 * Brand as part of Context&lt;p&gt;
	 *  From time to time a brand will be important as criteria for selecting content. 
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the brand child.
	 */
	@NotNull
	Brand getBrand();


	/**
	 * Returns the value of the market child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:market documentation</h3>
	 * Market as part of Context
	 *  &lt;p&gt;
	 *  A market is defined as an trade channel. This could be a country, region of a country, a group of retail stores or a single retail store.
	 *  Often market is used as the criterion for individualization when individualizing prices.
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the market child.
	 */
	@NotNull
	Market getMarket();


	/**
	 * Returns the value of the organization child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:organization documentation</h3>
	 * Organization as part of Context
	 *  &lt;p&gt;
	 *  In large enterprises content is often organized by subgroups or divisions. 
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the organization child.
	 */
	@NotNull
	Organization getOrganization();


	/**
	 * Returns the value of the targetGroup child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:targetGroup documentation</h3>
	 * Target groups are an important criterion when personalizing content or individualizing prices.
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the targetGroup child.
	 */
	@NotNull
	TargetGroup getTargetGroup();


	/**
	 * Returns the value of the well child.
	 * <pre>
	 * <h3>Element com.priint.pubserver.plugin.entitydata/20131213:well documentation</h3>
	 * Content systems do often organize data for publication in "pools". In our terms this is called a "well". Wells are part of the context. So, many queries need to be augmented by the name of the relevant data pool.
	 *  
	 *  &lt;p&gt;
	 *  This class has only one string field called label. Label is a required string, that will get trimmed during setting.
	 * </pre>
	 * @return the value of the well child.
	 */
	@NotNull
	Well getWell();


}
