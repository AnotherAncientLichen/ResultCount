
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxDataRetentionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxDataRetentionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Cleanup"/>
 *     &lt;enumeration value="Deletion"/>
 *     &lt;enumeration value="Stopping"/>
 *     &lt;enumeration value="Stopped"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Finished"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxDataRetentionStatus")
@XmlEnum
public enum CxDataRetentionStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Cleanup")
    CLEANUP("Cleanup"),
    @XmlEnumValue("Deletion")
    DELETION("Deletion"),
    @XmlEnumValue("Stopping")
    STOPPING("Stopping"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Finished")
    FINISHED("Finished");
    private final String value;

    CxDataRetentionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxDataRetentionStatus fromValue(String v) {
        for (CxDataRetentionStatus c: CxDataRetentionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
