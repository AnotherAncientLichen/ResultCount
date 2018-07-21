
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
 *         &lt;element name="LoginBySIDResult" type="{http://Checkmarx.com}CxWSResponseLoginData" minOccurs="0"/>
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
    "loginBySIDResult"
})
@XmlRootElement(name = "LoginBySIDResponse")
public class LoginBySIDResponse {

    @XmlElement(name = "LoginBySIDResult")
    protected CxWSResponseLoginData loginBySIDResult;

    /**
     * Gets the value of the loginBySIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseLoginData }
     *     
     */
    public CxWSResponseLoginData getLoginBySIDResult() {
        return loginBySIDResult;
    }

    /**
     * Sets the value of the loginBySIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseLoginData }
     *     
     */
    public void setLoginBySIDResult(CxWSResponseLoginData value) {
        this.loginBySIDResult = value;
    }

}
