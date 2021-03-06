
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Team"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="Server"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupType")
@XmlEnum
public enum GroupType {

    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    SP("SP"),
    @XmlEnumValue("Server")
    SERVER("Server");
    private final String value;

    GroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupType fromValue(String v) {
        for (GroupType c: GroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
