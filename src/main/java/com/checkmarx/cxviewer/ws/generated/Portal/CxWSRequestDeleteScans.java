
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSRequestDeleteScans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSRequestDeleteScans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScanIDs" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://Checkmarx.com}DeleteFlags"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSRequestDeleteScans", propOrder = {
    "sessionID",
    "scanIDs",
    "flags"
})
public class CxWSRequestDeleteScans {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "ScanIDs")
    protected ArrayOfLong scanIDs;
    @XmlList
    @XmlElement(name = "Flags", required = true)
    protected List<String> flags;

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
     * Gets the value of the scanIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getScanIDs() {
        return scanIDs;
    }

    /**
     * Sets the value of the scanIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setScanIDs(ArrayOfLong value) {
        this.scanIDs = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlags() {
        if (flags == null) {
            flags = new ArrayList<String>();
        }
        return this.flags;
    }

}