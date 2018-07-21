
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxPredefinedCommandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxPredefinedCommandType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SourceControlCommand"/>
 *     &lt;enumeration value="PostScan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxPredefinedCommandType")
@XmlEnum
public enum CxPredefinedCommandType {

    @XmlEnumValue("SourceControlCommand")
    SOURCE_CONTROL_COMMAND("SourceControlCommand"),
    @XmlEnumValue("PostScan")
    POST_SCAN("PostScan");
    private final String value;

    CxPredefinedCommandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxPredefinedCommandType fromValue(String v) {
        for (CxPredefinedCommandType c: CxPredefinedCommandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
