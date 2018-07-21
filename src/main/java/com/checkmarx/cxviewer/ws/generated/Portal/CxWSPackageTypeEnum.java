
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSPackageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSPackageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cx"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="Team"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSPackageTypeEnum")
@XmlEnum
public enum CxWSPackageTypeEnum {

    @XmlEnumValue("Cx")
    CX("Cx"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Team")
    TEAM("Team");
    private final String value;

    CxWSPackageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSPackageTypeEnum fromValue(String v) {
        for (CxWSPackageTypeEnum c: CxWSPackageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
