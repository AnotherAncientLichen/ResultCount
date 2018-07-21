
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapServerConfigurationAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSLdapServerConfigurationAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSLdapServerConfigurationAction")
@XmlEnum
public enum CxWSLdapServerConfigurationAction {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    CxWSLdapServerConfigurationAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSLdapServerConfigurationAction fromValue(String v) {
        for (CxWSLdapServerConfigurationAction c: CxWSLdapServerConfigurationAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
