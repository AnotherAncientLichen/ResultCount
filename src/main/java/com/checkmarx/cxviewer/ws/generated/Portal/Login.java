
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
 *         &lt;element name="applicationCredentials" type="{http://Checkmarx.com}Credentials" minOccurs="0"/>
 *         &lt;element name="lcid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "applicationCredentials",
    "lcid"
})
@XmlRootElement(name = "Login")
public class Login {

    protected Credentials applicationCredentials;
    protected int lcid;

    /**
     * Gets the value of the applicationCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getApplicationCredentials() {
        return applicationCredentials;
    }

    /**
     * Sets the value of the applicationCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setApplicationCredentials(Credentials value) {
        this.applicationCredentials = value;
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

}
