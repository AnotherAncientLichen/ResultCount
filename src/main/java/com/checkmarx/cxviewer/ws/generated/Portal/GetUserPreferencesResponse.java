
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
 *         &lt;element name="GetUserPreferencesResult" type="{http://Checkmarx.com}CxWSUserPreferencesResponse" minOccurs="0"/>
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
    "getUserPreferencesResult"
})
@XmlRootElement(name = "GetUserPreferencesResponse")
public class GetUserPreferencesResponse {

    @XmlElement(name = "GetUserPreferencesResult")
    protected CxWSUserPreferencesResponse getUserPreferencesResult;

    /**
     * Gets the value of the getUserPreferencesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSUserPreferencesResponse }
     *     
     */
    public CxWSUserPreferencesResponse getGetUserPreferencesResult() {
        return getUserPreferencesResult;
    }

    /**
     * Sets the value of the getUserPreferencesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSUserPreferencesResponse }
     *     
     */
    public void setGetUserPreferencesResult(CxWSUserPreferencesResponse value) {
        this.getUserPreferencesResult = value;
    }

}
