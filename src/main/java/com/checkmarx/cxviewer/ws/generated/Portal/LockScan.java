
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="i_SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_ScanID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "iSessionID",
    "iScanID"
})
@XmlRootElement(name = "LockScan")
public class LockScan {

    @XmlElement(name = "i_SessionID")
    protected String iSessionID;
    @XmlElement(name = "i_ScanID")
    protected long iScanID;

    /**
     * Gets the value of the iSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISessionID() {
        return iSessionID;
    }

    /**
     * Sets the value of the iSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISessionID(String value) {
        this.iSessionID = value;
    }

    /**
     * Gets the value of the iScanID property.
     * 
     */
    public long getIScanID() {
        return iScanID;
    }

    /**
     * Sets the value of the iScanID property.
     * 
     */
    public void setIScanID(long value) {
        this.iScanID = value;
    }

}
