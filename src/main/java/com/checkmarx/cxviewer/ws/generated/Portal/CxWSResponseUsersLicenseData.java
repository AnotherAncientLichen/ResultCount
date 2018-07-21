
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseUsersLicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseUsersLicenseData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="MaxReviewers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentReviewers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxScanners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentScanners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseUsersLicenseData", propOrder = {
    "maxReviewers",
    "currentReviewers",
    "maxScanners",
    "currentScanners"
})
@XmlSeeAlso({
    CxWSResponseCompaniesLicenseData.class
})
public class CxWSResponseUsersLicenseData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "MaxReviewers")
    protected int maxReviewers;
    @XmlElement(name = "CurrentReviewers")
    protected int currentReviewers;
    @XmlElement(name = "MaxScanners")
    protected int maxScanners;
    @XmlElement(name = "CurrentScanners")
    protected int currentScanners;

    /**
     * Gets the value of the maxReviewers property.
     * 
     */
    public int getMaxReviewers() {
        return maxReviewers;
    }

    /**
     * Sets the value of the maxReviewers property.
     * 
     */
    public void setMaxReviewers(int value) {
        this.maxReviewers = value;
    }

    /**
     * Gets the value of the currentReviewers property.
     * 
     */
    public int getCurrentReviewers() {
        return currentReviewers;
    }

    /**
     * Sets the value of the currentReviewers property.
     * 
     */
    public void setCurrentReviewers(int value) {
        this.currentReviewers = value;
    }

    /**
     * Gets the value of the maxScanners property.
     * 
     */
    public int getMaxScanners() {
        return maxScanners;
    }

    /**
     * Sets the value of the maxScanners property.
     * 
     */
    public void setMaxScanners(int value) {
        this.maxScanners = value;
    }

    /**
     * Gets the value of the currentScanners property.
     * 
     */
    public int getCurrentScanners() {
        return currentScanners;
    }

    /**
     * Sets the value of the currentScanners property.
     * 
     */
    public void setCurrentScanners(int value) {
        this.currentScanners = value;
    }

}
