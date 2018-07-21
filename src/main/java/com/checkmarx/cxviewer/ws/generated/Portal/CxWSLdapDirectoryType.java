
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapDirectoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSLdapDirectoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ActiveDirectory"/>
 *     &lt;enumeration value="OpenLDAP"/>
 *     &lt;enumeration value="CustomLDAPServer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSLdapDirectoryType")
@XmlEnum
public enum CxWSLdapDirectoryType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"),
    @XmlEnumValue("OpenLDAP")
    OPEN_LDAP("OpenLDAP"),
    @XmlEnumValue("CustomLDAPServer")
    CUSTOM_LDAP_SERVER("CustomLDAPServer");
    private final String value;

    CxWSLdapDirectoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSLdapDirectoryType fromValue(String v) {
        for (CxWSLdapDirectoryType c: CxWSLdapDirectoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
