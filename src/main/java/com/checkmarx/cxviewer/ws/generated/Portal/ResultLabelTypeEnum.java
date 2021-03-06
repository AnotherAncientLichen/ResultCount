
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultLabelTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultLabelTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IgnorePath"/>
 *     &lt;enumeration value="Remark"/>
 *     &lt;enumeration value="Severity"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Assign"/>
 *     &lt;enumeration value="IssueTracking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultLabelTypeEnum")
@XmlEnum
public enum ResultLabelTypeEnum {

    @XmlEnumValue("IgnorePath")
    IGNORE_PATH("IgnorePath"),
    @XmlEnumValue("Remark")
    REMARK("Remark"),
    @XmlEnumValue("Severity")
    SEVERITY("Severity"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Assign")
    ASSIGN("Assign"),
    @XmlEnumValue("IssueTracking")
    ISSUE_TRACKING("IssueTracking");
    private final String value;

    ResultLabelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultLabelTypeEnum fromValue(String v) {
        for (ResultLabelTypeEnum c: ResultLabelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
