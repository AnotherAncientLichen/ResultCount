
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxPivotLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxPivotLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SerializedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChartType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSystem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Owner_Team" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ViewId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Teams" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Criteria" type="{http://Checkmarx.com}ArrayOfPivotClientBaseParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxPivotLayout", propOrder = {
    "id",
    "name",
    "owner",
    "serializedData",
    "chartType",
    "isSystem",
    "ownerTeam",
    "isPublic",
    "viewId",
    "teams",
    "criteria"
})
public class CxPivotLayout {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Owner")
    protected long owner;
    @XmlElement(name = "SerializedData")
    protected String serializedData;
    @XmlElement(name = "ChartType")
    protected String chartType;
    @XmlElement(name = "IsSystem")
    protected boolean isSystem;
    @XmlElement(name = "Owner_Team")
    protected String ownerTeam;
    @XmlElement(name = "IsPublic")
    protected boolean isPublic;
    @XmlElement(name = "ViewId")
    protected long viewId;
    @XmlElement(name = "Teams")
    protected ArrayOfString teams;
    @XmlElement(name = "Criteria")
    protected ArrayOfPivotClientBaseParam criteria;

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
     * Gets the value of the owner property.
     * 
     */
    public long getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     */
    public void setOwner(long value) {
        this.owner = value;
    }

    /**
     * Gets the value of the serializedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerializedData() {
        return serializedData;
    }

    /**
     * Sets the value of the serializedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerializedData(String value) {
        this.serializedData = value;
    }

    /**
     * Gets the value of the chartType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartType() {
        return chartType;
    }

    /**
     * Sets the value of the chartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartType(String value) {
        this.chartType = value;
    }

    /**
     * Gets the value of the isSystem property.
     * 
     */
    public boolean isIsSystem() {
        return isSystem;
    }

    /**
     * Sets the value of the isSystem property.
     * 
     */
    public void setIsSystem(boolean value) {
        this.isSystem = value;
    }

    /**
     * Gets the value of the ownerTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTeam() {
        return ownerTeam;
    }

    /**
     * Sets the value of the ownerTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTeam(String value) {
        this.ownerTeam = value;
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
     * Gets the value of the viewId property.
     * 
     */
    public long getViewId() {
        return viewId;
    }

    /**
     * Sets the value of the viewId property.
     * 
     */
    public void setViewId(long value) {
        this.viewId = value;
    }

    /**
     * Gets the value of the teams property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTeams() {
        return teams;
    }

    /**
     * Sets the value of the teams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTeams(ArrayOfString value) {
        this.teams = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPivotClientBaseParam }
     *     
     */
    public ArrayOfPivotClientBaseParam getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPivotClientBaseParam }
     *     
     */
    public void setCriteria(ArrayOfPivotClientBaseParam value) {
        this.criteria = value;
    }

}
