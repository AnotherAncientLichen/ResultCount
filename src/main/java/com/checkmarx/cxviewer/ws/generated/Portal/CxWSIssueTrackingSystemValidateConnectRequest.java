
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemValidateConnectRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemValidateConnectRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemRequest">
 *       &lt;sequence>
 *         &lt;element name="TrackingSystem" type="{http://Checkmarx.com}CxWSIssueTrackingSystem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemValidateConnectRequest", propOrder = {
    "trackingSystem"
})
public class CxWSIssueTrackingSystemValidateConnectRequest
    extends CxWSIssueTrackingSystemRequest
{

    @XmlElement(name = "TrackingSystem")
    protected CxWSIssueTrackingSystem trackingSystem;

    /**
     * Gets the value of the trackingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSIssueTrackingSystem }
     *     
     */
    public CxWSIssueTrackingSystem getTrackingSystem() {
        return trackingSystem;
    }

    /**
     * Sets the value of the trackingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSIssueTrackingSystem }
     *     
     */
    public void setTrackingSystem(CxWSIssueTrackingSystem value) {
        this.trackingSystem = value;
    }

}
