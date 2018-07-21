
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportQueryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportQueryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="OnProgress"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Succeeded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportQueryStatus")
@XmlEnum
public enum ImportQueryStatus {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("OnProgress")
    ON_PROGRESS("OnProgress"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded");
    private final String value;

    ImportQueryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportQueryStatus fromValue(String v) {
        for (ImportQueryStatus c: ImportQueryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
