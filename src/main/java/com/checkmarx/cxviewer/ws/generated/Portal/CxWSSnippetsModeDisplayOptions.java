
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSSnippetsModeDisplayOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSSnippetsModeDisplayOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SourceAndDestination"/>
 *     &lt;enumeration value="Full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSSnippetsModeDisplayOptions")
@XmlEnum
public enum CxWSSnippetsModeDisplayOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SourceAndDestination")
    SOURCE_AND_DESTINATION("SourceAndDestination"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    CxWSSnippetsModeDisplayOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxWSSnippetsModeDisplayOptions fromValue(String v) {
        for (CxWSSnippetsModeDisplayOptions c: CxWSSnippetsModeDisplayOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
