// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

import com.intellij.util.xml.*;
import com.intellij.util.xml.Attribute;
import items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:relationType interface.
 * <pre>
 * <h3>Type null:relationType documentation</h3>
 * A RelationType defines a n-m or 1-n relation between types.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Relation extends DomElement {

	/**
	 * Returns the value of the code child.
	 * <pre>
	 * <h3>Attribute null:code documentation</h3>
	 * The typecode.
	 * </pre>
	 * @return the value of the code child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getCode();


	/**
	 * Returns the value of the localized child.
	 * <pre>
	 * <h3>Attribute null:localized documentation</h3>
	 * A localized n-m relation can have a link between two items for each language.
	 * </pre>
	 * @return the value of the localized child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Boolean> getLocalized();


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
	 * Returns the value of the autocreate child.
	 * <pre>
	 * <h3>Attribute null:autocreate documentation</h3>
	 * If 'true', the item will be created during initialization.
	 * </pre>
	 * @return the value of the autocreate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getAutocreate();


	/**
	 * Returns the value of the generate child.
	 * <pre>
	 * <h3>Attribute null:generate documentation</h3>
	 * Deprecated. Will have no effect for relations.
	 * </pre>
	 * @return the value of the generate child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getGenerate();


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
	 * Configures deployment information for this relation (table name and typecode).
	 * </pre>
	 * @return the value of the deployment child.
	 */
	@NotNull
	Deployment getDeployment();


	/**
	 * Returns the value of the sourceElement child.
	 * <pre>
	 * <h3>Element null:sourceElement documentation</h3>
	 * Configures the generated attribute at source relation end
	 * </pre>
	 * @return the value of the sourceElement child.
	 */
	@NotNull
	@Required
	RelationElement getSourceElement();


	/**
	 * Returns the value of the targetElement child.
	 * <pre>
	 * <h3>Element null:targetElement documentation</h3>
	 * Configures the generated attribute at target relation end
	 * </pre>
	 * @return the value of the targetElement child.
	 */
	@NotNull
	@Required
	RelationElement getTargetElement();


}
