
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
 *         &lt;element name="GetSystemSettingsResult" type="{http://Checkmarx.com}CxWsResponseSystemSettings" minOccurs="0"/>
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
    "getSystemSettingsResult"
})
@XmlRootElement(name = "GetSystemSettingsResponse")
public class GetSystemSettingsResponse {

    @XmlElement(name = "GetSystemSettingsResult")
    protected CxWsResponseSystemSettings getSystemSettingsResult;

    /**
     * Gets the value of the getSystemSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsResponseSystemSettings }
     *     
     */
    public CxWsResponseSystemSettings getGetSystemSettingsResult() {
        return getSystemSettingsResult;
    }

    /**
     * Sets the value of the getSystemSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsResponseSystemSettings }
     *     
     */
    public void setGetSystemSettingsResult(CxWsResponseSystemSettings value) {
        this.getSystemSettingsResult = value;
    }

}
