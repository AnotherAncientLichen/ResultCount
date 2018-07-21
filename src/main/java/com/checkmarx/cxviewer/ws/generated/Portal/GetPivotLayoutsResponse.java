
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPivotLayoutsResult" type="{http://Checkmarx.com}CxWSResponsePivotLayouts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPivotLayoutsResult"
})
@XmlRootElement(name = "GetPivotLayoutsResponse")
public class GetPivotLayoutsResponse {

    @XmlElement(name = "GetPivotLayoutsResult")
    protected CxWSResponsePivotLayouts getPivotLayoutsResult;

    /**
     * Gets the value of the getPivotLayoutsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponsePivotLayouts }
     *     
     */
    public CxWSResponsePivotLayouts getGetPivotLayoutsResult() {
        return getPivotLayoutsResult;
    }

    /**
     * Sets the value of the getPivotLayoutsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponsePivotLayouts }
     *     
     */
    public void setGetPivotLayoutsResult(CxWSResponsePivotLayouts value) {
        this.getPivotLayoutsResult = value;
    }

}
