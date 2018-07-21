
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseScanLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseScanLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ScanLog" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseScanLog", propOrder = {
    "scanLog"
})
public class CxWSResponseScanLog
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ScanLog")
    protected byte[] scanLog;

    /**
     * Gets the value of the scanLog property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getScanLog() {
        return scanLog;
    }

    /**
     * Sets the value of the scanLog property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setScanLog(byte[] value) {
        this.scanLog = value;
    }

}
