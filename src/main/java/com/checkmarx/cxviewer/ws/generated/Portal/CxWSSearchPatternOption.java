
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSSearchPatternOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSSearchPatternOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="StartsWith"/>
 *     &lt;enumeration value="Contains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSSearchPatternOption")
@XmlEnum
public enum CxWSSearchPatternOption {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains");
    private final String value;

    CxWSSearchPatternOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSSearchPatternOption fromValue(String v) {
        for (CxWSSearchPatternOption c: CxWSSearchPatternOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
