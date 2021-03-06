
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
 *         &lt;element name="pendingUser" type="{http://Checkmarx.com}WebClientPendingUser" minOccurs="0"/>
 *         &lt;element name="pendingUsersTableUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pendingUsersTableUrl"
})
@XmlRootElement(name = "RegisterPendingUser")
public class RegisterPendingUser {

    protected WebClientPendingUser pendingUser;
    protected String pendingUsersTableUrl;

    /**
     * Gets the value of the pendingUser property.
     * 
     * @return
     *     possible object is
     *     {@link WebClientPendingUser }
     *     
     */
    public WebClientPendingUser getPendingUser() {
        return pendingUser;
    }

    /**
     * Sets the value of the pendingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebClientPendingUser }
     *     
     */
    public void setPendingUser(WebClientPendingUser value) {
        this.pendingUser = value;
    }

    /**
     * Gets the value of the pendingUsersTableUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingUsersTableUrl() {
        return pendingUsersTableUrl;
    }

    /**
     * Sets the value of the pendingUsersTableUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingUsersTableUrl(String value) {
        this.pendingUsersTableUrl = value;
    }

}
