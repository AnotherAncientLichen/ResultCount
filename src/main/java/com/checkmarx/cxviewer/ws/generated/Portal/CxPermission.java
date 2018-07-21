
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ViewPreScanActions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ViewPostScanActions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxPermission", propOrder = {
    "id",
    "viewPreScanActions",
    "viewPostScanActions"
})
public class CxPermission {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "ViewPreScanActions")
    protected boolean viewPreScanActions;
    @XmlElement(name = "ViewPostScanActions")
    protected boolean viewPostScanActions;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the viewPreScanActions property.
     * 
     */
    public boolean isViewPreScanActions() {
        return viewPreScanActions;
    }

    /**
     * Sets the value of the viewPreScanActions property.
     * 
     */
    public void setViewPreScanActions(boolean value) {
        this.viewPreScanActions = value;
    }

    /**
     * Gets the value of the viewPostScanActions property.
     * 
     */
    public boolean isViewPostScanActions() {
        return viewPostScanActions;
    }

    /**
     * Sets the value of the viewPostScanActions property.
     * 
     */
    public void setViewPostScanActions(boolean value) {
        this.viewPostScanActions = value;
    }

}
