
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
 *         &lt;element name="SaasLoginResult" type="{http://Checkmarx.com}CxWSResponseSaasLoginData" minOccurs="0"/>
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
    "saasLoginResult"
})
@XmlRootElement(name = "SaasLoginResponse")
public class SaasLoginResponse {

    @XmlElement(name = "SaasLoginResult")
    protected CxWSResponseSaasLoginData saasLoginResult;

    /**
     * Gets the value of the saasLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSaasLoginData }
     *     
     */
    public CxWSResponseSaasLoginData getSaasLoginResult() {
        return saasLoginResult;
    }

    /**
     * Sets the value of the saasLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSaasLoginData }
     *     
     */
    public void setSaasLoginResult(CxWSResponseSaasLoginData value) {
        this.saasLoginResult = value;
    }

}
