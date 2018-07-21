
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseEdition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseEdition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SDLC"/>
 *     &lt;enumeration value="SecurityGate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseEdition")
@XmlEnum
public enum LicenseEdition {

    SDLC("SDLC"),
    @XmlEnumValue("SecurityGate")
    SECURITY_GATE("SecurityGate");
    private final String value;

    LicenseEdition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseEdition fromValue(String v) {
        for (LicenseEdition c: LicenseEdition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
