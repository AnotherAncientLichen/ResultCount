
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
 *         &lt;element name="SsoLoginV2Result" type="{http://Checkmarx.com}CxWSResponseLoginData" minOccurs="0"/>
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
    "ssoLoginV2Result"
})
@XmlRootElement(name = "SsoLoginV2Response")
public class SsoLoginV2Response {

    @XmlElement(name = "SsoLoginV2Result")
    protected CxWSResponseLoginData ssoLoginV2Result;

    /**
     * Gets the value of the ssoLoginV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseLoginData }
     *     
     */
    public CxWSResponseLoginData getSsoLoginV2Result() {
        return ssoLoginV2Result;
    }

    /**
     * Sets the value of the ssoLoginV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseLoginData }
     *     
     */
    public void setSsoLoginV2Result(CxWSResponseLoginData value) {
        this.ssoLoginV2Result = value;
    }

}
