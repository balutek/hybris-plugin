// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import com.intellij.util.xml.Attribute;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:itemtypeType interface.
 * <pre>
 * <h3>Type null:itemtypeType documentation</h3>
 * Specifies a specific ComposedType.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Itemtype extends DomElement {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue();
	/**
	 * Sets the value of the simple content.
	 * @param value the new value to set
	 */
	void setValue(@NotNull String value);


	/**
	 * Returns the value of the code child.
	 * <pre>
	 * <h3>Attribute null:code documentation</h3>
	 * The unique code of this type.
	 * </pre>
	 * @return the value of the code child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getCode();


	/**
	 * Returns the value of the extends child.
	 * <pre>
	 * <h3>Attribute null:extends documentation</h3>
	 * Defines the class, which will be extended. Default is 'GenericItem'.
	 * </pre>
	 * @return the value of the extends child.
	 */
	@NotNull
	GenericAttributeValue<String> getExtends();


	/**
	 * Returns the value of the jaloclass child.
	 * <pre>
	 * <h3>Attribute null:jaloclass documentation</h3>
	 * Specifies the name of the associated jalo class. Default is [extension-root-package].jalo.[type-code] which will be generated if not existent.
	 * </pre>
	 * @return the value of the jaloclass child.
	 */
	@NotNull
	GenericAttributeValue<String> getJaloclass();


	/**
	 * Returns the value of the deployment child.
	 * <pre>
	 * <h3>Attribute null:deployment documentation</h3>
	 * Deprecated, please use separate deployment sub tag. All instances of this type will be stored in a separated database table. The value of this attribute represents a reference to the specified deployment in the corresponding 'advanced-deployment.xml'. Default is empty.
	 * </pre>
	 * @return the value of the deployment child.
	 */
	@NotNull
	@Attribute("deployment")
	GenericAttributeValue<String> getDeploymentAttr();


	/**
	 * Returns the value of the singleton child.
	 * <pre>
	 * <h3>Attribute null:singleton documentation</h3>
	 * If 'true', type gets marked as singleton which will be evaluated by some modules like hmc or impex, with that allowing only one instance per system. Default is 'false'.
	 * </pre>
	 * @return the value of the singleton child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getSingleton();


	/**
	 * Returns the value of the jaloonly child.
	 * <pre>
	 * <h3>Attribute null:jaloonly documentation</h3>
	 * DEPRECATED. Use 'implements JaloOnlyItem' in your bean. If 'true', the item will only exists in the jalo layer and isn't backed by an entity bean. Default is 'false'.
	 * </pre>
	 * @return the value of the jaloonly child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getJaloonly();


	/**
	 * Returns the value of the autocreate child.
	 * <pre>
	 * <h3>Attribute null:autocreate documentation</h3>
	 * If 'true', the item will be created during initialization. Default is 'true'.
	 * </pre>
	 * @return the value of the autocreate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getAutocreate();


	/**
	 * Returns the value of the generate child.
	 * <pre>
	 * <h3>Attribute null:generate documentation</h3>
	 * If 'true', the sourcecode for this item will be created. Default is 'true'.
	 * </pre>
	 * @return the value of the generate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getGenerate();


	/**
	 * Returns the value of the abstract child.
	 * <pre>
	 * <h3>Attribute null:abstract documentation</h3>
	 * Marks type and jalo class as abstract. If 'true', the type can not be instantiated. Default is 'false'.
	 * </pre>
	 * @return the value of the abstract child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getAbstract();


	/**
	 * Returns the value of the metatype child.
	 * <pre>
	 * <h3>Attribute null:metatype documentation</h3>
	 * The (meta)type which describes the assigned type. Must be a type extensing ComposedType. Default is 'ComposedType'.
	 * </pre>
	 * @return the value of the metatype child.
	 */
	@NotNull
	GenericAttributeValue<String> getMetatype();


	/**
	 * Returns the value of the description child.
	 * <pre>
	 * <h3>Element null:description documentation</h3>
	 * Provides possibility to add meaningfull description phrase for a generated model class.
	 * </pre>
	 * @return the value of the description child.
	 */
	@NotNull
	GenericDomValue<String> getDescription();


	/**
	 * Returns the value of the deployment child.
	 * <pre>
	 * <h3>Element null:deployment documentation</h3>
	 * A deployment defines how a (generic) item or relation is mapped onto the database.
	 * </pre>
	 * @return the value of the deployment child.
	 */
	@NotNull
	Deployment getDeployment();


	/**
	 * Returns the value of the custom-properties child.
	 * <pre>
	 * <h3>Element null:custom-properties documentation</h3>
	 * Defines a list of custom properties for this type.
	 * </pre>
	 * @return the value of the custom-properties child.
	 */
	@NotNull
	CustomProperties getCustomProperties();


	/**
	 * Returns the value of the attributes child.
	 * <pre>
	 * <h3>Element null:attributes documentation</h3>
	 * Defines the list of item attributes.
	 * </pre>
	 * @return the value of the attributes child.
	 */
	@NotNull
	Attributes getAttributes();


	/**
	 * Returns the value of the indexes child.
	 * <pre>
	 * <h3>Element null:indexes documentation</h3>
	 * Defines the database indexes for this type.
	 * </pre>
	 * @return the value of the indexes child.
	 */
	@NotNull
	Indexes getIndexes();


	/**
	 * Returns the value of the model child.
	 * <pre>
	 * <h3>Element null:model documentation</h3>
	 * Allows to configure model generation for this item used at servicelayer.
	 * </pre>
	 * @return the value of the model child.
	 */
	@NotNull
	ItemModel getModel();


}
