
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CXWSResponseResultSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CXWSResponseResultSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="SummaryList" type="{http://Checkmarx.com}ArrayOfCxWSResultSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CXWSResponseResultSummary", propOrder = {
    "summaryList"
})
public class CXWSResponseResultSummary
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "SummaryList")
    protected ArrayOfCxWSResultSummary summaryList;

    /**
     * Gets the value of the summaryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResultSummary }
     *     
     */
    public ArrayOfCxWSResultSummary getSummaryList() {
        return summaryList;
    }

    /**
     * Sets the value of the summaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResultSummary }
     *     
     */
    public void setSummaryList(ArrayOfCxWSResultSummary value) {
        this.summaryList = value;
    }

}
