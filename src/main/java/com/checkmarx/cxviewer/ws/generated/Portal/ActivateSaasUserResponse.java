
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
 *         &lt;element name="ActivateSaasUserResult" type="{http://Checkmarx.com}CxWSResponseSaasLoginData" minOccurs="0"/>
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
    "activateSaasUserResult"
})
@XmlRootElement(name = "ActivateSaasUserResponse")
public class ActivateSaasUserResponse {

    @XmlElement(name = "ActivateSaasUserResult")
    protected CxWSResponseSaasLoginData activateSaasUserResult;

    /**
     * Gets the value of the activateSaasUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSaasLoginData }
     *     
     */
    public CxWSResponseSaasLoginData getActivateSaasUserResult() {
        return activateSaasUserResult;
    }

    /**
     * Sets the value of the activateSaasUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSaasLoginData }
     *     
     */
    public void setActivateSaasUserResult(CxWSResponseSaasLoginData value) {
        this.activateSaasUserResult = value;
    }

}
