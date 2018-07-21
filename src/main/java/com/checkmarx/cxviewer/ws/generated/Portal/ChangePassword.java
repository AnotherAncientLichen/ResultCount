
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPsw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPsw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionID",
    "oldPsw",
    "newPsw"
})
@XmlRootElement(name = "ChangePassword")
public class ChangePassword {

    protected String sessionID;
    protected String oldPsw;
    protected String newPsw;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the oldPsw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPsw() {
        return oldPsw;
    }

    /**
     * Sets the value of the oldPsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPsw(String value) {
        this.oldPsw = value;
    }

    /**
     * Gets the value of the newPsw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPsw() {
        return newPsw;
    }

    /**
     * Sets the value of the newPsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPsw(String value) {
        this.newPsw = value;
    }

}