
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseServerManagersLicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseServerManagersLicenseData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseSPLicenseData">
 *       &lt;sequence>
 *         &lt;element name="MaxServerManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentServerManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxServerManagersWithAudit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentServerManagersWithAudit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseServerManagersLicenseData", propOrder = {
    "maxServerManagers",
    "currentServerManagers",
    "maxServerManagersWithAudit",
    "currentServerManagersWithAudit"
})
@XmlSeeAlso({
    CxWSResponseServerLicenseData.class
})
public class CxWSResponseServerManagersLicenseData
    extends CxWSResponseSPLicenseData
{

    @XmlElement(name = "MaxServerManagers")
    protected int maxServerManagers;
    @XmlElement(name = "CurrentServerManagers")
    protected int currentServerManagers;
    @XmlElement(name = "MaxServerManagersWithAudit")
    protected int maxServerManagersWithAudit;
    @XmlElement(name = "CurrentServerManagersWithAudit")
    protected int currentServerManagersWithAudit;

    /**
     * Gets the value of the maxServerManagers property.
     * 
     */
    public int getMaxServerManagers() {
        return maxServerManagers;
    }

    /**
     * Sets the value of the maxServerManagers property.
     * 
     */
    public void setMaxServerManagers(int value) {
        this.maxServerManagers = value;
    }

    /**
     * Gets the value of the currentServerManagers property.
     * 
     */
    public int getCurrentServerManagers() {
        return currentServerManagers;
    }

    /**
     * Sets the value of the currentServerManagers property.
     * 
     */
    public void setCurrentServerManagers(int value) {
        this.currentServerManagers = value;
    }

    /**
     * Gets the value of the maxServerManagersWithAudit property.
     * 
     */
    public int getMaxServerManagersWithAudit() {
        return maxServerManagersWithAudit;
    }

    /**
     * Sets the value of the maxServerManagersWithAudit property.
     * 
     */
    public void setMaxServerManagersWithAudit(int value) {
        this.maxServerManagersWithAudit = value;
    }

    /**
     * Gets the value of the currentServerManagersWithAudit property.
     * 
     */
    public int getCurrentServerManagersWithAudit() {
        return currentServerManagersWithAudit;
    }

    /**
     * Sets the value of the currentServerManagersWithAudit property.
     * 
     */
    public void setCurrentServerManagersWithAudit(int value) {
        this.currentServerManagersWithAudit = value;
    }

}
