// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

/**
 * null:collectiontypeAttrType enumeration.
 * @author Paweł Łabuda
 * <pre>
 * <h3>Type null:collectiontypeType documentation</h3>
 * A CollectionType defines a collection of typed elements. Attention: If using a collection type for persistent attributes (not jalo) you can not search on that attribute and you are limited in size of collection. Consider to use a relation instead.
 * </pre>
 */
public enum Collectiontype implements com.intellij.util.xml.NamedEnum {
	autocreate ("autocreate"),
	code ("code"),
	COLLECTION ("collection"),
	elementtype ("elementtype"),
	generate ("generate"),
	LIST ("list"),
	SET ("set"),
	type ("type");

	private final String value;
	private Collectiontype(String value) { this.value = value; }
	public String getValue() { return value; }

}
