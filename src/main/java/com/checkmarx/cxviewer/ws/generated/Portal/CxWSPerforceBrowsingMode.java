
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSPerforceBrowsingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSPerforceBrowsingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Depot"/>
 *     &lt;enumeration value="Workspace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSPerforceBrowsingMode")
@XmlEnum
public enum CxWSPerforceBrowsingMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Depot")
    DEPOT("Depot"),
    @XmlEnumValue("Workspace")
    WORKSPACE("Workspace");
    private final String value;

    CxWSPerforceBrowsingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSPerforceBrowsingMode fromValue(String v) {
        for (CxWSPerforceBrowsingMode c: CxWSPerforceBrowsingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
