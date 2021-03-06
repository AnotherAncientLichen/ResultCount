
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSReportRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://Checkmarx.com}CxWSReportType"/>
 *         &lt;element name="ScanID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSReportRequest", propOrder = {
    "type",
    "scanID"
})
@XmlSeeAlso({
    CxWSFilteredReportRequest.class
})
public class CxWSReportRequest {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected CxWSReportType type;
    @XmlElement(name = "ScanID")
    protected long scanID;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSReportType }
     *     
     */
    public CxWSReportType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSReportType }
     *     
     */
    public void setType(CxWSReportType value) {
        this.type = value;
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

}
