
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ALLSCANS"/>
 *     &lt;enumeration value="REGULAR"/>
 *     &lt;enumeration value="SUBSET"/>
 *     &lt;enumeration value="PARTIAL"/>
 *     &lt;enumeration value="RUNNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScanType")
@XmlEnum
public enum ScanType {

    UNKNOWN,
    ALLSCANS,
    REGULAR,
    SUBSET,
    PARTIAL,
    RUNNING;

    public String value() {
        return name();
    }

    public static ScanType fromValue(String v) {
        return valueOf(v);
    }

}
