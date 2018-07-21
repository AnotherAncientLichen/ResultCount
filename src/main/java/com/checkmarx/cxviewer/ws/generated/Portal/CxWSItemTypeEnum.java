
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSItemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSItemTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="Scan"/>
 *     &lt;enumeration value="Preset"/>
 *     &lt;enumeration value="Configuration"/>
 *     &lt;enumeration value="Users"/>
 *     &lt;enumeration value="Roles"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SystemSettings"/>
 *     &lt;enumeration value="Ignore_Path"/>
 *     &lt;enumeration value="ResultComment"/>
 *     &lt;enumeration value="ResultSeverity"/>
 *     &lt;enumeration value="ResultStatus"/>
 *     &lt;enumeration value="AuditUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSItemTypeEnum")
@XmlEnum
public enum CxWSItemTypeEnum {

    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Task")
    TASK("Task"),
    @XmlEnumValue("Scan")
    SCAN("Scan"),
    @XmlEnumValue("Preset")
    PRESET("Preset"),
    @XmlEnumValue("Configuration")
    CONFIGURATION("Configuration"),
    @XmlEnumValue("Users")
    USERS("Users"),
    @XmlEnumValue("Roles")
    ROLES("Roles"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SystemSettings")
    SYSTEM_SETTINGS("SystemSettings"),
    @XmlEnumValue("Ignore_Path")
    IGNORE_PATH("Ignore_Path"),
    @XmlEnumValue("ResultComment")
    RESULT_COMMENT("ResultComment"),
    @XmlEnumValue("ResultSeverity")
    RESULT_SEVERITY("ResultSeverity"),
    @XmlEnumValue("ResultStatus")
    RESULT_STATUS("ResultStatus"),
    @XmlEnumValue("AuditUser")
    AUDIT_USER("AuditUser");
    private final String value;

    CxWSItemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSItemTypeEnum fromValue(String v) {
        for (CxWSItemTypeEnum c: CxWSItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
