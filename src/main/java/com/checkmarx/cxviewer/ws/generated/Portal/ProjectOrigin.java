
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectOrigin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectOrigin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LocalPath"/>
 *     &lt;enumeration value="SharedPath"/>
 *     &lt;enumeration value="TFS"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="SVN"/>
 *     &lt;enumeration value="CVS"/>
 *     &lt;enumeration value="GIT"/>
 *     &lt;enumeration value="Perforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectOrigin")
@XmlEnum
public enum ProjectOrigin {

    @XmlEnumValue("LocalPath")
    LOCAL_PATH("LocalPath"),
    @XmlEnumValue("SharedPath")
    SHARED_PATH("SharedPath"),
    TFS("TFS"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    SVN("SVN"),
    CVS("CVS"),
    GIT("GIT"),
    @XmlEnumValue("Perforce")
    PERFORCE("Perforce");
    private final String value;

    ProjectOrigin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectOrigin fromValue(String v) {
        for (ProjectOrigin c: ProjectOrigin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
