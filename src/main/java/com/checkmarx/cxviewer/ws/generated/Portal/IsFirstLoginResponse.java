
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
 *         &lt;element name="IsFirstLoginResult" type="{http://Checkmarx.com}CxWSResponseBool" minOccurs="0"/>
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
    "isFirstLoginResult"
})
@XmlRootElement(name = "IsFirstLoginResponse")
public class IsFirstLoginResponse {

    @XmlElement(name = "IsFirstLoginResult")
    protected CxWSResponseBool isFirstLoginResult;

    /**
     * Gets the value of the isFirstLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseBool }
     *     
     */
    public CxWSResponseBool getIsFirstLoginResult() {
        return isFirstLoginResult;
    }

    /**
     * Sets the value of the isFirstLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseBool }
     *     
     */
    public void setIsFirstLoginResult(CxWSResponseBool value) {
        this.isFirstLoginResult = value;
    }

}
