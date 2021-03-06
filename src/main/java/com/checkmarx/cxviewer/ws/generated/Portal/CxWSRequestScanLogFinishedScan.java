
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSRequestScanLogFinishedScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSRequestScanLogFinishedScan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSRequestScanLog">
 *       &lt;sequence>
 *         &lt;element name="ScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSRequestScanLogFinishedScan", propOrder = {
    "scanId"
})
public class CxWSRequestScanLogFinishedScan
    extends CxWSRequestScanLog
{

    @XmlElement(name = "ScanId")
    protected long scanId;

    /**
     * Gets the value of the scanId property.
     * 
     */
    public long getScanId() {
        return scanId;
    }

    /**
     * Sets the value of the scanId property.
     * 
     */
    public void setScanId(long value) {
        this.scanId = value;
    }

}
