
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditResultsCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditResultsCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://Checkmarx.com}ArrayOfAuditScanResult" minOccurs="0"/>
 *         &lt;element name="FailedLOC" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditResultsCollection", propOrder = {
    "results",
    "failedLOC"
})
public class AuditResultsCollection {

    @XmlElement(name = "Results")
    protected ArrayOfAuditScanResult results;
    @XmlElement(name = "FailedLOC")
    protected long failedLOC;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditScanResult }
     *     
     */
    public ArrayOfAuditScanResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditScanResult }
     *     
     */
    public void setResults(ArrayOfAuditScanResult value) {
        this.results = value;
    }

    /**
     * Gets the value of the failedLOC property.
     * 
     */
    public long getFailedLOC() {
        return failedLOC;
    }

    /**
     * Sets the value of the failedLOC property.
     * 
     */
    public void setFailedLOC(long value) {
        this.failedLOC = value;
    }

}
