
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSPLicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSPLicenseData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseCompaniesLicenseData">
 *       &lt;sequence>
 *         &lt;element name="MaxSPManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentSPManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentSPs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxSPs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSPLicenseData", propOrder = {
    "maxSPManagers",
    "currentSPManagers",
    "currentSPs",
    "maxSPs"
})
@XmlSeeAlso({
    CxWSResponseServerManagersLicenseData.class
})
public class CxWSResponseSPLicenseData
    extends CxWSResponseCompaniesLicenseData
{

    @XmlElement(name = "MaxSPManagers")
    protected int maxSPManagers;
    @XmlElement(name = "CurrentSPManagers")
    protected int currentSPManagers;
    @XmlElement(name = "CurrentSPs")
    protected int currentSPs;
    @XmlElement(name = "MaxSPs")
    protected int maxSPs;

    /**
     * Gets the value of the maxSPManagers property.
     * 
     */
    public int getMaxSPManagers() {
        return maxSPManagers;
    }

    /**
     * Sets the value of the maxSPManagers property.
     * 
     */
    public void setMaxSPManagers(int value) {
        this.maxSPManagers = value;
    }

    /**
     * Gets the value of the currentSPManagers property.
     * 
     */
    public int getCurrentSPManagers() {
        return currentSPManagers;
    }

    /**
     * Sets the value of the currentSPManagers property.
     * 
     */
    public void setCurrentSPManagers(int value) {
        this.currentSPManagers = value;
    }

    /**
     * Gets the value of the currentSPs property.
     * 
     */
    public int getCurrentSPs() {
        return currentSPs;
    }

    /**
     * Sets the value of the currentSPs property.
     * 
     */
    public void setCurrentSPs(int value) {
        this.currentSPs = value;
    }

    /**
     * Gets the value of the maxSPs property.
     * 
     */
    public int getMaxSPs() {
        return maxSPs;
    }

    /**
     * Sets the value of the maxSPs property.
     * 
     */
    public void setMaxSPs(int value) {
        this.maxSPs = value;
    }

}
