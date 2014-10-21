// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    com.priint.pubserver.plugin.entitydata/20131213

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * com.priint.pubserver.plugin.entitydata/20131213:connectorPlugin interface.
 * <pre>
 * <h3>Type com.priint.pubserver.plugin.entitydata/20131213:connectorPlugin documentation</h3>
 * An entity representing a connector plug-in.
 * </pre>
 * @author Paweł Łabuda
 */
public interface ConnectorPlugin extends DomElement {

	/**
	 * Returns the value of the identifier child.
	 * <pre>
	 * <h3>Attribute null:identifier documentation</h3>
	 * String identifier for the plugin (the plugin library id).
	 * </pre>
	 * @return the value of the identifier child.
	 */
	@NotNull
	GenericAttributeValue<String> getIdentifier();


	/**
	 * Returns the value of the label child.
	 * <pre>
	 * <h3>Attribute null:label documentation</h3>
	 * Display label for the plugin (the plugin mapped name).
	 * </pre>
	 * @return the value of the label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


	/**
	 * Returns the value of the type child.
	 * <pre>
	 * <h3>Attribute null:type documentation</h3>
	 * Reserved for future use.
	 * </pre>
	 * @return the value of the type child.
	 */
	@NotNull
	GenericAttributeValue<String> getType();


	/**
	 * Returns the list of instances children.
	 * @return the list of instances children.
	 */
	@NotNull
	List<GenericDomValue<String>> getInstanceses();
	/**
	 * Adds new child to the list of instances children.
	 * @return created child
	 */
	GenericDomValue<String> addInstances();


}
