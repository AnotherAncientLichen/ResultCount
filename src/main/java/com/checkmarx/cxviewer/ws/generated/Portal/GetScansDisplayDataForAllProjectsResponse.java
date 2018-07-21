
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
 *         &lt;element name="GetScansDisplayDataForAllProjectsResult" type="{http://Checkmarx.com}CxWSResponseScansDisplayData" minOccurs="0"/>
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
    "getScansDisplayDataForAllProjectsResult"
})
@XmlRootElement(name = "GetScansDisplayDataForAllProjectsResponse")
public class GetScansDisplayDataForAllProjectsResponse {

    @XmlElement(name = "GetScansDisplayDataForAllProjectsResult")
    protected CxWSResponseScansDisplayData getScansDisplayDataForAllProjectsResult;

    /**
     * Gets the value of the getScansDisplayDataForAllProjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseScansDisplayData }
     *     
     */
    public CxWSResponseScansDisplayData getGetScansDisplayDataForAllProjectsResult() {
        return getScansDisplayDataForAllProjectsResult;
    }

    /**
     * Sets the value of the getScansDisplayDataForAllProjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseScansDisplayData }
     *     
     */
    public void setGetScansDisplayDataForAllProjectsResult(CxWSResponseScansDisplayData value) {
        this.getScansDisplayDataForAllProjectsResult = value;
    }

}
