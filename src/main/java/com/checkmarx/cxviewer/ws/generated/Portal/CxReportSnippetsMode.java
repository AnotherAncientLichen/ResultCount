
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxReportSnippetsMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxReportSnippetsMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SourceAndDestination"/>
 *     &lt;enumeration value="Full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxReportSnippetsMode")
@XmlEnum
public enum CxReportSnippetsMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SourceAndDestination")
    SOURCE_AND_DESTINATION("SourceAndDestination"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    CxReportSnippetsMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxReportSnippetsMode fromValue(String v) {
        for (CxReportSnippetsMode c: CxReportSnippetsMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
