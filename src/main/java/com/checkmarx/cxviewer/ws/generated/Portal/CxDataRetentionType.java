
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxDataRetentionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxDataRetentionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NumOfScansToPreserve"/>
 *     &lt;enumeration value="DatesRange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxDataRetentionType")
@XmlEnum
public enum CxDataRetentionType {

    @XmlEnumValue("NumOfScansToPreserve")
    NUM_OF_SCANS_TO_PRESERVE("NumOfScansToPreserve"),
    @XmlEnumValue("DatesRange")
    DATES_RANGE("DatesRange");
    private final String value;

    CxDataRetentionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxDataRetentionType fromValue(String v) {
        for (CxDataRetentionType c: CxDataRetentionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
