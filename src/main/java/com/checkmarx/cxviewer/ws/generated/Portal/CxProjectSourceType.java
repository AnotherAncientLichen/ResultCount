
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxProjectSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxProjectSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LocalPath"/>
 *     &lt;enumeration value="UNC"/>
 *     &lt;enumeration value="TFS"/>
 *     &lt;enumeration value="SVN"/>
 *     &lt;enumeration value="SourceSafe"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="CVS"/>
 *     &lt;enumeration value="Perforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxProjectSourceType")
@XmlEnum
public enum CxProjectSourceType {

    @XmlEnumValue("LocalPath")
    LOCAL_PATH("LocalPath"),
    UNC("UNC"),
    TFS("TFS"),
    SVN("SVN"),
    @XmlEnumValue("SourceSafe")
    SOURCE_SAFE("SourceSafe"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    CVS("CVS"),
    @XmlEnumValue("Perforce")
    PERFORCE("Perforce");
    private final String value;

    CxProjectSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxProjectSourceType fromValue(String v) {
        for (CxProjectSourceType c: CxProjectSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
