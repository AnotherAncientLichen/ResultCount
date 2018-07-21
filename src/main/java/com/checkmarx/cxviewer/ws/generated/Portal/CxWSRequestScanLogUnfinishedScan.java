
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSRequestScanLogUnfinishedScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSRequestScanLogUnfinishedScan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSRequestScanLog">
 *       &lt;sequence>
 *         &lt;element name="ScanRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSRequestScanLogUnfinishedScan", propOrder = {
    "scanRequestId"
})
public class CxWSRequestScanLogUnfinishedScan
    extends CxWSRequestScanLog
{

    @XmlElement(name = "ScanRequestId")
    protected long scanRequestId;

    /**
     * Gets the value of the scanRequestId property.
     * 
     */
    public long getScanRequestId() {
        return scanRequestId;
    }

    /**
     * Sets the value of the scanRequestId property.
     * 
     */
    public void setScanRequestId(long value) {
        this.scanRequestId = value;
    }

}
