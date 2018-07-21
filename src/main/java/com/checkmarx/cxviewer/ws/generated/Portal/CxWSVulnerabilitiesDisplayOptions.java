
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSVulnerabilitiesDisplayOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSVulnerabilitiesDisplayOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Attached2Appendix"/>
 *     &lt;enumeration value="Linked2Online"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSVulnerabilitiesDisplayOptions")
@XmlEnum
public enum CxWSVulnerabilitiesDisplayOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Attached2Appendix")
    ATTACHED_2_APPENDIX("Attached2Appendix"),
    @XmlEnumValue("Linked2Online")
    LINKED_2_ONLINE("Linked2Online");
    private final String value;

    CxWSVulnerabilitiesDisplayOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSVulnerabilitiesDisplayOptions fromValue(String v) {
        for (CxWSVulnerabilitiesDisplayOptions c: CxWSVulnerabilitiesDisplayOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
