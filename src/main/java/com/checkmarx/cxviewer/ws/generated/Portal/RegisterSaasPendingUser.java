
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pendingUser" type="{http://Checkmarx.com}SaasPendingUser" minOccurs="0"/>
 *         &lt;element name="activationPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pendingUser",
    "activationPageUrl"
})
@XmlRootElement(name = "RegisterSaasPendingUser")
public class RegisterSaasPendingUser {

    protected SaasPendingUser pendingUser;
    protected String activationPageUrl;

    /**
     * Gets the value of the pendingUser property.
     * 
     * @return
     *     possible object is
     *     {@link SaasPendingUser }
     *     
     */
    public SaasPendingUser getPendingUser() {
        return pendingUser;
    }

    /**
     * Sets the value of the pendingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaasPendingUser }
     *     
     */
    public void setPendingUser(SaasPendingUser value) {
        this.pendingUser = value;
    }

    /**
     * Gets the value of the activationPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationPageUrl() {
        return activationPageUrl;
    }

    /**
     * Sets the value of the activationPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationPageUrl(String value) {
        this.activationPageUrl = value;
    }

}
