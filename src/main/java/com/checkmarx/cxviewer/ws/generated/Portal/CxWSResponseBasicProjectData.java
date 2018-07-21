
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseBasicProjectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseBasicProjectData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="scans" type="{http://Checkmarx.com}ArrayOfCxWSResponseBasicScanData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseBasicProjectData", propOrder = {
    "name",
    "id",
    "scans"
})
public class CxWSResponseBasicProjectData {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ID")
    protected long id;
    protected ArrayOfCxWSResponseBasicScanData scans;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the scans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResponseBasicScanData }
     *     
     */
    public ArrayOfCxWSResponseBasicScanData getScans() {
        return scans;
    }

    /**
     * Sets the value of the scans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResponseBasicScanData }
     *     
     */
    public void setScans(ArrayOfCxWSResponseBasicScanData value) {
        this.scans = value;
    }

}
