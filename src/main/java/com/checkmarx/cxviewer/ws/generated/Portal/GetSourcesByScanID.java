
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="filesToRetreive" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
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
    "sessionID",
    "scanID",
    "filesToRetreive"
})
@XmlRootElement(name = "GetSourcesByScanID")
public class GetSourcesByScanID {

    protected String sessionID;
    protected long scanID;
    protected ArrayOfString filesToRetreive;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
     * Gets the value of the filesToRetreive property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFilesToRetreive() {
        return filesToRetreive;
    }

    /**
     * Sets the value of the filesToRetreive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFilesToRetreive(ArrayOfString value) {
        this.filesToRetreive = value;
    }

}
