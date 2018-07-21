
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResultsSeverityFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResultsSeverityFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="All" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Info" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResultsSeverityFilter", propOrder = {
    "all",
    "high",
    "medium",
    "low",
    "info"
})
public class CxWSResultsSeverityFilter {

    @XmlElement(name = "All")
    protected boolean all;
    @XmlElement(name = "High")
    protected boolean high;
    @XmlElement(name = "Medium")
    protected boolean medium;
    @XmlElement(name = "Low")
    protected boolean low;
    @XmlElement(name = "Info")
    protected boolean info;

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
     * Gets the value of the high property.
     * 
     */
    public boolean isHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     */
    public void setHigh(boolean value) {
        this.high = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     */
    public boolean isMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     */
    public void setMedium(boolean value) {
        this.medium = value;
    }

    /**
     * Gets the value of the low property.
     * 
     */
    public boolean isLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     */
    public void setLow(boolean value) {
        this.low = value;
    }

    /**
     * Gets the value of the info property.
     * 
     */
    public boolean isInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     */
    public void setInfo(boolean value) {
        this.info = value;
    }

}
