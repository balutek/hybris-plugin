// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * null:columntypeType interface.
 * <pre>
 * <h3>Type null:columntypeType documentation</h3>
 * Configures a persistence definition for a specific database.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Columntype extends DomElement {

	/**
	 * Returns the value of the database child.
	 * <pre>
	 * <h3>Attribute null:database documentation</h3>
	 * The database the given definition will be used for. One of 'oracle', 'mysql', 'sqlserver' or 'hsql'. Default is empty which configures fallback for non specified databases.
	 * </pre>
	 * @return the value of the database child.
	 */
	@NotNull
	GenericAttributeValue<String> getDatabase();


	/**
	 * Returns the value of the value child.
	 * <pre>
	 * <h3>Element null:value documentation</h3>
	 * The attribute type used in the create statement of the database table, such as 'varchar2(4000)'.
	 * </pre>
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getValue();


}
