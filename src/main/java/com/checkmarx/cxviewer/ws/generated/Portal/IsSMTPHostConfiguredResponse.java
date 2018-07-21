
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
 *         &lt;element name="IsSMTPHostConfiguredResult" type="{http://Checkmarx.com}CxWSResponseBool" minOccurs="0"/>
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
    "isSMTPHostConfiguredResult"
})
@XmlRootElement(name = "IsSMTPHostConfiguredResponse")
public class IsSMTPHostConfiguredResponse {

    @XmlElement(name = "IsSMTPHostConfiguredResult")
    protected CxWSResponseBool isSMTPHostConfiguredResult;

    /**
     * Gets the value of the isSMTPHostConfiguredResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseBool }
     *     
     */
    public CxWSResponseBool getIsSMTPHostConfiguredResult() {
        return isSMTPHostConfiguredResult;
    }

    /**
     * Sets the value of the isSMTPHostConfiguredResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseBool }
     *     
     */
    public void setIsSMTPHostConfiguredResult(CxWSResponseBool value) {
        this.isSMTPHostConfiguredResult = value;
    }

}
