
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResultsAssignedToFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResultsAssignedToFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="All" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IDs" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="Usernames" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResultsAssignedToFilter", propOrder = {
    "all",
    "iDs",
    "usernames"
})
public class CxWSResultsAssignedToFilter {

    @XmlElement(name = "All")
    protected boolean all;
    @XmlElement(name = "IDs")
    protected ArrayOfLong iDs;
    @XmlElement(name = "Usernames")
    protected ArrayOfString usernames;

    /**
     * Gets the value of the all property.
     * 
     */
    public boolean isAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     */
    public void setAll(boolean value) {
        this.all = value;
    }

    /**
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setIDs(ArrayOfLong value) {
        this.iDs = value;
    }

    /**
     * Gets the value of the usernames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getUsernames() {
        return usernames;
    }

    /**
     * Sets the value of the usernames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setUsernames(ArrayOfString value) {
        this.usernames = value;
    }

}
