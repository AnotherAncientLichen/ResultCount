
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSQueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSQueryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Regular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSQueryType")
@XmlEnum
public enum CxWSQueryType {

    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Regular")
    REGULAR("Regular");
    private final String value;

    CxWSQueryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSQueryType fromValue(String v) {
        for (CxWSQueryType c: CxWSQueryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
