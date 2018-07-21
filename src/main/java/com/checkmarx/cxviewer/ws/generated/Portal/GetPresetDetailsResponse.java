
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
 *         &lt;element name="GetPresetDetailsResult" type="{http://Checkmarx.com}CxWSResponsePresetDetails" minOccurs="0"/>
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
    "getPresetDetailsResult"
})
@XmlRootElement(name = "GetPresetDetailsResponse")
public class GetPresetDetailsResponse {

    @XmlElement(name = "GetPresetDetailsResult")
    protected CxWSResponsePresetDetails getPresetDetailsResult;

    /**
     * Gets the value of the getPresetDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponsePresetDetails }
     *     
     */
    public CxWSResponsePresetDetails getGetPresetDetailsResult() {
        return getPresetDetailsResult;
    }

    /**
     * Sets the value of the getPresetDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponsePresetDetails }
     *     
     */
    public void setGetPresetDetailsResult(CxWSResponsePresetDetails value) {
        this.getPresetDetailsResult = value;
    }

}
