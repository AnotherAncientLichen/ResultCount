
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PivotClientDateRanges.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PivotClientDateRanges">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="PAST_DAY"/>
 *     &lt;enumeration value="PAST_WEEK"/>
 *     &lt;enumeration value="PAST_MONTH"/>
 *     &lt;enumeration value="PAST_3_MONTH"/>
 *     &lt;enumeration value="PAST_YEAR"/>
 *     &lt;enumeration value="CUSTOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PivotClientDateRanges")
@XmlEnum
public enum PivotClientDateRanges {

    ALL,
    PAST_DAY,
    PAST_WEEK,
    PAST_MONTH,
    PAST_3_MONTH,
    PAST_YEAR,
    CUSTOM;

    public String value() {
        return name();
    }

    public static PivotClientDateRanges fromValue(String v) {
        return valueOf(v);
    }

}
