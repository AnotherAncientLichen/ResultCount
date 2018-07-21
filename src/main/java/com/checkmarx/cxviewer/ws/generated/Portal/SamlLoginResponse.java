
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
 *         &lt;element name="SamlLoginResult" type="{http://Checkmarx.com}CxWSResponseLoginData" minOccurs="0"/>
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
    "samlLoginResult"
})
@XmlRootElement(name = "SamlLoginResponse")
public class SamlLoginResponse {

    @XmlElement(name = "SamlLoginResult")
    protected CxWSResponseLoginData samlLoginResult;

    /**
     * Gets the value of the samlLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseLoginData }
     *     
     */
    public CxWSResponseLoginData getSamlLoginResult() {
        return samlLoginResult;
    }

    /**
     * Sets the value of the samlLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseLoginData }
     *     
     */
    public void setSamlLoginResult(CxWSResponseLoginData value) {
        this.samlLoginResult = value;
    }

}
