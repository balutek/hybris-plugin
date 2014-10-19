// Generated on Sun Oct 19 19:06:58 CEST 2014
// DTD/Schema  :    null

package items.xml.model;

/**
 * null:cardinalityAttrType enumeration.
 * @author Paweł Łabuda
 */
public enum Cardinality implements com.intellij.util.xml.NamedEnum {
	MANY ("many"),
	ONE ("one");

	private final String value;
	private Cardinality(String value) { this.value = value; }
	public String getValue() { return value; }

}
