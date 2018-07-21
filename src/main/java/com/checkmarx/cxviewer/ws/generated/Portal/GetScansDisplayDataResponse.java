
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
 *         &lt;element name="GetScansDisplayDataResult" type="{http://Checkmarx.com}CxWSResponseScansDisplayData" minOccurs="0"/>
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
    "getScansDisplayDataResult"
})
@XmlRootElement(name = "GetScansDisplayDataResponse")
public class GetScansDisplayDataResponse {

    @XmlElement(name = "GetScansDisplayDataResult")
    protected CxWSResponseScansDisplayData getScansDisplayDataResult;

    /**
     * Gets the value of the getScansDisplayDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseScansDisplayData }
     *     
     */
    public CxWSResponseScansDisplayData getGetScansDisplayDataResult() {
        return getScansDisplayDataResult;
    }

    /**
     * Sets the value of the getScansDisplayDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseScansDisplayData }
     *     
     */
    public void setGetScansDisplayDataResult(CxWSResponseScansDisplayData value) {
        this.getScansDisplayDataResult = value;
    }

}