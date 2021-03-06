
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
 *         &lt;element name="encryptedCredentials" type="{http://Checkmarx.com}Credentials" minOccurs="0"/>
 *         &lt;element name="lcid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="useExistingSession" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "encryptedCredentials",
    "lcid",
    "useExistingSession"
})
@XmlRootElement(name = "SsoLoginV2")
public class SsoLoginV2 {

    protected Credentials encryptedCredentials;
    protected int lcid;
    protected boolean useExistingSession;

    /**
     * Gets the value of the encryptedCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getEncryptedCredentials() {
        return encryptedCredentials;
    }

    /**
     * Sets the value of the encryptedCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setEncryptedCredentials(Credentials value) {
        this.encryptedCredentials = value;
    }

    /**
     * Gets the value of the lcid property.
     * 
     */
    public int getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     */
    public void setLcid(int value) {
        this.lcid = value;
    }

    /**
     * Gets the value of the useExistingSession property.
     * 
     */
    public boolean isUseExistingSession() {
        return useExistingSession;
    }

    /**
     * Sets the value of the useExistingSession property.
     * 
     */
    public void setUseExistingSession(boolean value) {
        this.useExistingSession = value;
    }

}
