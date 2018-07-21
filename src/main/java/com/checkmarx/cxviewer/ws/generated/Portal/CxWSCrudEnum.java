
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSCrudEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSCrudEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="View"/>
 *     &lt;enumeration value="Run"/>
 *     &lt;enumeration value="Investigate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSCrudEnum")
@XmlEnum
public enum CxWSCrudEnum {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("View")
    VIEW("View"),
    @XmlEnumValue("Run")
    RUN("Run"),
    @XmlEnumValue("Investigate")
    INVESTIGATE("Investigate");
    private final String value;

    CxWSCrudEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSCrudEnum fromValue(String v) {
        for (CxWSCrudEnum c: CxWSCrudEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
