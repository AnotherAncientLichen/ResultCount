
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxPresetDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxPresetDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryIds" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owningteam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isUserAllowToUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isUserAllowToDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsDuplicate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxPresetDetails", propOrder = {
    "queryIds",
    "id",
    "name",
    "owningteam",
    "isPublic",
    "owner",
    "isUserAllowToUpdate",
    "isUserAllowToDelete",
    "isDuplicate"
})
public class CxPresetDetails {

    protected ArrayOfLong queryIds;
    protected long id;
    protected String name;
    protected String owningteam;
    protected boolean isPublic;
    protected String owner;
    protected boolean isUserAllowToUpdate;
    protected boolean isUserAllowToDelete;
    @XmlElement(name = "IsDuplicate")
    protected boolean isDuplicate;

    /**
     * Gets the value of the queryIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getQueryIds() {
        return queryIds;
    }

    /**
     * Sets the value of the queryIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setQueryIds(ArrayOfLong value) {
        this.queryIds = value;
    }

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
     * Gets the value of the owningteam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwningteam() {
        return owningteam;
    }

    /**
     * Sets the value of the owningteam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwningteam(String value) {
        this.owningteam = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     */
    public void setIsPublic(boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the isUserAllowToUpdate property.
     * 
     */
    public boolean isIsUserAllowToUpdate() {
        return isUserAllowToUpdate;
    }

    /**
     * Sets the value of the isUserAllowToUpdate property.
     * 
     */
    public void setIsUserAllowToUpdate(boolean value) {
        this.isUserAllowToUpdate = value;
    }

    /**
     * Gets the value of the isUserAllowToDelete property.
     * 
     */
    public boolean isIsUserAllowToDelete() {
        return isUserAllowToDelete;
    }

    /**
     * Sets the value of the isUserAllowToDelete property.
     * 
     */
    public void setIsUserAllowToDelete(boolean value) {
        this.isUserAllowToDelete = value;
    }

    /**
     * Gets the value of the isDuplicate property.
     * 
     */
    public boolean isIsDuplicate() {
        return isDuplicate;
    }

    /**
     * Sets the value of the isDuplicate property.
     * 
     */
    public void setIsDuplicate(boolean value) {
        this.isDuplicate = value;
    }

}
