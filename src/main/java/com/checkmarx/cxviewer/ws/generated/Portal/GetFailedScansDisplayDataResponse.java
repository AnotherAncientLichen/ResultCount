
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
 *         &lt;element name="GetFailedScansDisplayDataResult" type="{http://Checkmarx.com}CxWSResponseFailedScansDisplayData" minOccurs="0"/>
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
    "getFailedScansDisplayDataResult"
})
@XmlRootElement(name = "GetFailedScansDisplayDataResponse")
public class GetFailedScansDisplayDataResponse {

    @XmlElement(name = "GetFailedScansDisplayDataResult")
    protected CxWSResponseFailedScansDisplayData getFailedScansDisplayDataResult;

    /**
     * Gets the value of the getFailedScansDisplayDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseFailedScansDisplayData }
     *     
     */
    public CxWSResponseFailedScansDisplayData getGetFailedScansDisplayDataResult() {
        return getFailedScansDisplayDataResult;
    }

    /**
     * Sets the value of the getFailedScansDisplayDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseFailedScansDisplayData }
     *     
     */
    public void setGetFailedScansDisplayDataResult(CxWSResponseFailedScansDisplayData value) {
        this.getFailedScansDisplayDataResult = value;
    }

}
