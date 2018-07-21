
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndeletedObjectCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UndeletedObjectCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authorization"/>
 *     &lt;enumeration value="Locked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UndeletedObjectCode")
@XmlEnum
public enum UndeletedObjectCode {

    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("Locked")
    LOCKED("Locked");
    private final String value;

    UndeletedObjectCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UndeletedObjectCode fromValue(String v) {
        for (UndeletedObjectCode c: UndeletedObjectCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
