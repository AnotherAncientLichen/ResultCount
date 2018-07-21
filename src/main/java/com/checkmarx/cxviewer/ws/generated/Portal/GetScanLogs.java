
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cxWSRequestScanLog" type="{http://Checkmarx.com}CxWSRequestScanLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cxWSRequestScanLog"
})
@XmlRootElement(name = "GetScanLogs")
public class GetScanLogs {

    protected CxWSRequestScanLog cxWSRequestScanLog;

    /**
     * Gets the value of the cxWSRequestScanLog property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSRequestScanLog }
     *     
     */
    public CxWSRequestScanLog getCxWSRequestScanLog() {
        return cxWSRequestScanLog;
    }

    /**
     * Sets the value of the cxWSRequestScanLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSRequestScanLog }
     *     
     */
    public void setCxWSRequestScanLog(CxWSRequestScanLog value) {
        this.cxWSRequestScanLog = value;
    }

}
