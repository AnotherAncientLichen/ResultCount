
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemCreateIssueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemCreateIssueRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemRequest">
 *       &lt;sequence>
 *         &lt;element name="TrackingSystemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ScanID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ResultIDs" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="Params" type="{http://Checkmarx.com}ArrayOfCxWSIssueTrackingParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemCreateIssueRequest", propOrder = {
    "trackingSystemID",
    "scanID",
    "resultIDs",
    "params"
})
public class CxWSIssueTrackingSystemCreateIssueRequest
    extends CxWSIssueTrackingSystemRequest
{

    @XmlElement(name = "TrackingSystemID")
    protected long trackingSystemID;
    @XmlElement(name = "ScanID")
    protected long scanID;
    @XmlElement(name = "ResultIDs")
    protected ArrayOfLong resultIDs;
    @XmlElement(name = "Params")
    protected ArrayOfCxWSIssueTrackingParam params;

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
     * Gets the value of the scanID property.
     * 
     */
    public long getScanID() {
        return scanID;
    }

    /**
     * Sets the value of the scanID property.
     * 
     */
    public void setScanID(long value) {
        this.scanID = value;
    }

    /**
     * Gets the value of the resultIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getResultIDs() {
        return resultIDs;
    }

    /**
     * Sets the value of the resultIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setResultIDs(ArrayOfLong value) {
        this.resultIDs = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSIssueTrackingParam }
     *     
     */
    public ArrayOfCxWSIssueTrackingParam getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSIssueTrackingParam }
     *     
     */
    public void setParams(ArrayOfCxWSIssueTrackingParam value) {
        this.params = value;
    }

}