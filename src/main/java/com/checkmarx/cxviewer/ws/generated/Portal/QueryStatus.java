
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Edited"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryStatus")
@XmlEnum
public enum QueryStatus {

    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Edited")
    EDITED("Edited"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    QueryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryStatus fromValue(String v) {
        for (QueryStatus c: QueryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
