
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSGraphTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSGraphTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="KeyPoints"/>
 *     &lt;enumeration value="Ends"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSGraphTypeEnum")
@XmlEnum
public enum CxWSGraphTypeEnum {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("KeyPoints")
    KEY_POINTS("KeyPoints"),
    @XmlEnumValue("Ends")
    ENDS("Ends"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    CxWSGraphTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSGraphTypeEnum fromValue(String v) {
        for (CxWSGraphTypeEnum c: CxWSGraphTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
