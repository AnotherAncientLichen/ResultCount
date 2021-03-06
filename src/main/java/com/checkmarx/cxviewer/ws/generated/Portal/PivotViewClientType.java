
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PivotViewClientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PivotViewClientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllProjectScans"/>
 *     &lt;enumeration value="LastMonthProjectScans"/>
 *     &lt;enumeration value="ProjectsLastScan"/>
 *     &lt;enumeration value="LastWeekOWASPTop10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PivotViewClientType")
@XmlEnum
public enum PivotViewClientType {

    @XmlEnumValue("AllProjectScans")
    ALL_PROJECT_SCANS("AllProjectScans"),
    @XmlEnumValue("LastMonthProjectScans")
    LAST_MONTH_PROJECT_SCANS("LastMonthProjectScans"),
    @XmlEnumValue("ProjectsLastScan")
    PROJECTS_LAST_SCAN("ProjectsLastScan"),
    @XmlEnumValue("LastWeekOWASPTop10")
    LAST_WEEK_OWASP_TOP_10("LastWeekOWASPTop10");
    private final String value;

    PivotViewClientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PivotViewClientType fromValue(String v) {
        for (PivotViewClientType c: PivotViewClientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
