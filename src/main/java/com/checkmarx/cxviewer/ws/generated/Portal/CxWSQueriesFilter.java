
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSQueriesFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSQueriesFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="All" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IDs" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSQueriesFilter", propOrder = {
    "all",
    "iDs"
})
public class CxWSQueriesFilter {

    @XmlElement(name = "All")
    protected boolean all;
    @XmlElement(name = "IDs")
    protected ArrayOfLong iDs;

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

}
