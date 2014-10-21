// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package hybrisplugin.items.xml.model;

/**
 * null:typeAttrType enumeration.
 * @author Paweł Łabuda
 */
public enum Type implements com.intellij.util.xml.NamedEnum {
	COLLECTION ("collection"),
	LIST ("list"),
	SET ("set");

	private final String value;
	private Type(String value) { this.value = value; }
	public String getValue() { return value; }

}
