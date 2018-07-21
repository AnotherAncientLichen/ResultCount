
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemMetaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemMetaRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemRequest">
 *       &lt;sequence>
 *         &lt;element name="TrackingSystemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Params" type="{http://Checkmarx.com}ArrayOfCxWSIssueTrackingMetaRequestParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemMetaRequest", propOrder = {
    "trackingSystemID",
    "params"
})
public class CxWSIssueTrackingSystemMetaRequest
    extends CxWSIssueTrackingSystemRequest
{

    @XmlElement(name = "TrackingSystemID")
    protected long trackingSystemID;
    @XmlElement(name = "Params")
    protected ArrayOfCxWSIssueTrackingMetaRequestParam params;

    /**
     * Gets the value of the trackingSystemID property.
     * 
     */
    public long getTrackingSystemID() {
        return trackingSystemID;
    }

    /**
     * Sets the value of the trackingSystemID property.
     * 
     */
    public void setTrackingSystemID(long value) {
        this.trackingSystemID = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSIssueTrackingMetaRequestParam }
     *     
     */
    public ArrayOfCxWSIssueTrackingMetaRequestParam getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSIssueTrackingMetaRequestParam }
     *     
     */
    public void setParams(ArrayOfCxWSIssueTrackingMetaRequestParam value) {
        this.params = value;
    }

}
