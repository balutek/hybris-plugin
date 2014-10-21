// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:relationElementType interface.
 * <pre>
 * <h3>Type null:relationElementType documentation</h3>
 * Configures the generated attribute at one relation end.
 * </pre>
 * @author Paweł Łabuda
 */
public interface RelationElement extends DomElement {

	/**
	 * Returns the value of the type child.
	 * <pre>
	 * <h3>Attribute null:type documentation</h3>
	 * Type of attribute which will be generated at type configured for opposite relation end.
	 * </pre>
	 * @return the value of the type child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getType();


	/**
	 * Returns the value of the qualifier child.
	 * <pre>
	 * <h3>Attribute null:qualifier documentation</h3>
	 * Qualifier of attribute which will be generated at type configured for opposite relation end. If navigable is not set to false the qualifier is mandatory. Default is empty.
	 * </pre>
	 * @return the value of the qualifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getQualifier();


	/**
	 * Returns the value of the metatype child.
	 * <pre>
	 * <h3>Attribute null:metatype documentation</h3>
	 * The (meta)type which describes the attributes type. Must be type extending RelationDescriptor. Default is 'RelationDescriptor'.
	 * </pre>
	 * @return the value of the metatype child.
	 */
	@NotNull
	GenericAttributeValue<String> getMetatype();


	/**
	 * Returns the value of the cardinality child.
	 * <pre>
	 * <h3>Attribute null:cardinality documentation</h3>
	 * The cardinality of this relation end. Choose 'one' for 'one' part of a 1:n relation or 'many' when part of a n:m relation. A 1:1 relation is not supported. Default is 'many'.
	 * </pre>
	 * @return the value of the cardinality child.
	 */
	@NotNull
	GenericAttributeValue<Cardinality> getCardinality();


	/**
	 * Returns the value of the navigable child.
	 * <pre>
	 * <h3>Attribute null:navigable documentation</h3>
	 * Is the relation navigable from this side. Can only be disabled for one side of many to many relation. If disabled, no qualifier as well as modifiers can be defined. Default is 'true'.
	 * </pre>
	 * @return the value of the navigable child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getNavigable();


	/**
	 * Returns the value of the collectiontype child.
	 * <pre>
	 * <h3>Attribute null:collectiontype documentation</h3>
	 * Configures the type of this collection if element has cardinality 'many'. Related attribute getter / setter will use corresponding java collection interfaces. Default is 'Collection'.
	 * </pre>
	 * @return the value of the collectiontype child.
	 */
	@NotNull
	GenericAttributeValue<Collectiontype> getCollectiontype();


	/**
	 * Returns the value of the ordered child.
	 * <pre>
	 * <h3>Attribute null:ordered documentation</h3>
	 * If 'true' an additional ordering attribute will be generated for maintaining ordering. Default is 'false'.
	 * </pre>
	 * @return the value of the ordered child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getOrdered();


	/**
	 * Returns the value of the description child.
	 * <pre>
	 * <h3>Element null:description documentation</h3>
	 * Documents this relation attribute. Will be cited at javadoc of generated getters/setters.
	 * </pre>
	 * @return the value of the description child.
	 */
	@NotNull
	GenericDomValue<String> getDescription();


	/**
	 * Returns the value of the modifiers child.
	 * <pre>
	 * <h3>Element null:modifiers documentation</h3>
	 * Defines properties for the attribute.
	 * </pre>
	 * @return the value of the modifiers child.
	 */
	@NotNull
	Modifiers getModifiers();


	/**
	 * Returns the value of the model child.
	 * <pre>
	 * <h3>Element null:model documentation</h3>
	 * Allows to configure model generation for this relation attribute used at servicelayer.
	 * </pre>
	 * @return the value of the model child.
	 */
	@NotNull
	AttributeModel getModel();


	/**
	 * Returns the value of the custom-properties child.
	 * <pre>
	 * <h3>Element null:custom-properties documentation</h3>
	 * Allows to configure custom properties for the relation attribute.
	 * </pre>
	 * @return the value of the custom-properties child.
	 */
	@NotNull
	CustomProperties getCustomProperties();


}
