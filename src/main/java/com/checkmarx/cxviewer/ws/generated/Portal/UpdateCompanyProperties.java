
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
 *         &lt;element name="companyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxReviewers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxScanners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "companyID",
    "companyName",
    "maxReviewers",
    "maxScanners",
    "maxManagers"
})
@XmlRootElement(name = "UpdateCompanyProperties")
public class UpdateCompanyProperties {

    protected String sessionID;
    protected String companyID;
    protected String companyName;
    protected int maxReviewers;
    protected int maxScanners;
    protected int maxManagers;

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
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

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
     * Gets the value of the maxManagers property.
     * 
     */
    public int getMaxManagers() {
        return maxManagers;
    }

    /**
     * Sets the value of the maxManagers property.
     * 
     */
    public void setMaxManagers(int value) {
        this.maxManagers = value;
    }

}
