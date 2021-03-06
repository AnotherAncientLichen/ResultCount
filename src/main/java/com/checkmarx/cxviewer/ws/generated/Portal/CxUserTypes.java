
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxUserTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxUserTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Domain"/>
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="OpenID"/>
 *     &lt;enumeration value="SSO"/>
 *     &lt;enumeration value="LDAP"/>
 *     &lt;enumeration value="SAML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxUserTypes")
@XmlEnum
public enum CxUserTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Domain")
    DOMAIN("Domain"),
    @XmlEnumValue("Application")
    APPLICATION("Application"),
    @XmlEnumValue("OpenID")
    OPEN_ID("OpenID"),
    SSO("SSO"),
    LDAP("LDAP"),
    SAML("SAML");
    private final String value;

    CxUserTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxUserTypes fromValue(String v) {
        for (CxUserTypes c: CxUserTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
