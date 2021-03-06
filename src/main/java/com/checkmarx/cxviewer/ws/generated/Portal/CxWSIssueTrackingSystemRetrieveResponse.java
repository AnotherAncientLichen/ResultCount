
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemRetrieveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemRetrieveResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemResponse">
 *       &lt;sequence>
 *         &lt;element name="TrackingSystems" type="{http://Checkmarx.com}ArrayOfCxWSIssueTrackingSystem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemRetrieveResponse", propOrder = {
    "trackingSystems"
})
public class CxWSIssueTrackingSystemRetrieveResponse
    extends CxWSIssueTrackingSystemResponse
{

    @XmlElement(name = "TrackingSystems")
    protected ArrayOfCxWSIssueTrackingSystem trackingSystems;

    /**
     * Gets the value of the trackingSystems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSIssueTrackingSystem }
     *     
     */
    public ArrayOfCxWSIssueTrackingSystem getTrackingSystems() {
        return trackingSystems;
    }

    /**
     * Sets the value of the trackingSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSIssueTrackingSystem }
     *     
     */
    public void setTrackingSystems(ArrayOfCxWSIssueTrackingSystem value) {
        this.trackingSystems = value;
    }

}
