
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWsScanCompareCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWsScanCompareCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="New" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fixed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReOccured" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWsScanCompareCount", propOrder = {
    "_new",
    "fixed",
    "reOccured"
})
public class CxWsScanCompareCount {

    @XmlElement(name = "New")
    protected int _new;
    @XmlElement(name = "Fixed")
    protected int fixed;
    @XmlElement(name = "ReOccured")
    protected int reOccured;

    /**
     * Gets the value of the new property.
     * 
     */
    public int getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     */
    public void setNew(int value) {
        this._new = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     */
    public int getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     */
    public void setFixed(int value) {
        this.fixed = value;
    }

    /**
     * Gets the value of the reOccured property.
     * 
     */
    public int getReOccured() {
        return reOccured;
    }

    /**
     * Sets the value of the reOccured property.
     * 
     */
    public void setReOccured(int value) {
        this.reOccured = value;
    }

}
