
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CxWSIssueTrackingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JIRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CxWSIssueTrackingType")
@XmlEnum
public enum CxWSIssueTrackingType {

    JIRA;

    public String value() {
        return name();
    }

    public static CxWSIssueTrackingType fromValue(String v) {
        return valueOf(v);
    }

}
