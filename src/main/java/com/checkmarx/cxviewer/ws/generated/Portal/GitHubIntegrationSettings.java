
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GitHubIntegrationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GitHubIntegrationSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContributorCredentials" type="{http://Checkmarx.com}Credentials" minOccurs="0"/>
 *         &lt;element name="OwnerCredentials" type="{http://Checkmarx.com}Credentials" minOccurs="0"/>
 *         &lt;element name="EventsThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GitHubIntegrationSettings", propOrder = {
    "contributorCredentials",
    "ownerCredentials",
    "eventsThreshold"
})
public class GitHubIntegrationSettings {

    @XmlElement(name = "ContributorCredentials")
    protected Credentials contributorCredentials;
    @XmlElement(name = "OwnerCredentials")
    protected Credentials ownerCredentials;
    @XmlElement(name = "EventsThreshold")
    protected int eventsThreshold;

    /**
     * Gets the value of the contributorCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getContributorCredentials() {
        return contributorCredentials;
    }

    /**
     * Sets the value of the contributorCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setContributorCredentials(Credentials value) {
        this.contributorCredentials = value;
    }

    /**
     * Gets the value of the ownerCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getOwnerCredentials() {
        return ownerCredentials;
    }

    /**
     * Sets the value of the ownerCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setOwnerCredentials(Credentials value) {
        this.ownerCredentials = value;
    }

    /**
     * Gets the value of the eventsThreshold property.
     * 
     */
    public int getEventsThreshold() {
        return eventsThreshold;
    }

    /**
     * Sets the value of the eventsThreshold property.
     * 
     */
    public void setEventsThreshold(int value) {
        this.eventsThreshold = value;
    }

}
