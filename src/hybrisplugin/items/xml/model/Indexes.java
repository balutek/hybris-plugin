// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

import com.intellij.util.xml.*;
import hybrisplugin.items.xml.model.util.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * null:indexesType interface.
 * <pre>
 * <h3>Type null:indexesType documentation</h3>
 * Configures a list of indexes.
 * </pre>
 * @author Paweł Łabuda
 */
public interface Indexes extends DomElement {

	/**
	 * Returns the list of index children.
	 * <pre>
	 * <h3>Element null:index documentation</h3>
	 * Configures a single index.
	 * </pre>
	 * @return the list of index children.
	 */
	@NotNull
	@Required
	List<Index> getIndexes();
	/**
	 * Adds new child to the list of index children.
	 * @return created child
	 */
	Index addIndex();


}
