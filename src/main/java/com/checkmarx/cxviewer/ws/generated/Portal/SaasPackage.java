
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaasPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaasPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Languages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PresetsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PresetsIds" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="Free" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SourceControlEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreatePDFEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnlineViewerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PluginsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="System" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScansToDisplay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Is_Deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaasPackage", propOrder = {
    "id",
    "name",
    "users",
    "languages",
    "loc",
    "presetsNumber",
    "presetsIds",
    "free",
    "sourceControlEnabled",
    "createPDFEnabled",
    "onlineViewerEnabled",
    "pluginsEnabled",
    "system",
    "scansToDisplay",
    "isDeprecated"
})
public class SaasPackage {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Users")
    protected long users;
    @XmlElement(name = "Languages")
    protected int languages;
    @XmlElement(name = "LOC")
    protected long loc;
    @XmlElement(name = "PresetsNumber")
    protected int presetsNumber;
    @XmlElement(name = "PresetsIds")
    protected ArrayOfLong presetsIds;
    @XmlElement(name = "Free")
    protected boolean free;
    @XmlElement(name = "SourceControlEnabled")
    protected boolean sourceControlEnabled;
    @XmlElement(name = "CreatePDFEnabled")
    protected boolean createPDFEnabled;
    @XmlElement(name = "OnlineViewerEnabled")
    protected boolean onlineViewerEnabled;
    @XmlElement(name = "PluginsEnabled")
    protected boolean pluginsEnabled;
    @XmlElement(name = "System")
    protected boolean system;
    @XmlElement(name = "ScansToDisplay")
    protected int scansToDisplay;
    @XmlElement(name = "Is_Deprecated")
    protected boolean isDeprecated;

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
     * Gets the value of the users property.
     * 
     */
    public long getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     */
    public void setUsers(long value) {
        this.users = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     */
    public int getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     */
    public void setLanguages(int value) {
        this.languages = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     */
    public long getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     */
    public void setLOC(long value) {
        this.loc = value;
    }

    /**
     * Gets the value of the presetsNumber property.
     * 
     */
    public int getPresetsNumber() {
        return presetsNumber;
    }

    /**
     * Sets the value of the presetsNumber property.
     * 
     */
    public void setPresetsNumber(int value) {
        this.presetsNumber = value;
    }

    /**
     * Gets the value of the presetsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getPresetsIds() {
        return presetsIds;
    }

    /**
     * Sets the value of the presetsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setPresetsIds(ArrayOfLong value) {
        this.presetsIds = value;
    }

    /**
     * Gets the value of the free property.
     * 
     */
    public boolean isFree() {
        return free;
    }

    /**
     * Sets the value of the free property.
     * 
     */
    public void setFree(boolean value) {
        this.free = value;
    }

    /**
     * Gets the value of the sourceControlEnabled property.
     * 
     */
    public boolean isSourceControlEnabled() {
        return sourceControlEnabled;
    }

    /**
     * Sets the value of the sourceControlEnabled property.
     * 
     */
    public void setSourceControlEnabled(boolean value) {
        this.sourceControlEnabled = value;
    }

    /**
     * Gets the value of the createPDFEnabled property.
     * 
     */
    public boolean isCreatePDFEnabled() {
        return createPDFEnabled;
    }

    /**
     * Sets the value of the createPDFEnabled property.
     * 
     */
    public void setCreatePDFEnabled(boolean value) {
        this.createPDFEnabled = value;
    }

    /**
     * Gets the value of the onlineViewerEnabled property.
     * 
     */
    public boolean isOnlineViewerEnabled() {
        return onlineViewerEnabled;
    }

    /**
     * Sets the value of the onlineViewerEnabled property.
     * 
     */
    public void setOnlineViewerEnabled(boolean value) {
        this.onlineViewerEnabled = value;
    }

    /**
     * Gets the value of the pluginsEnabled property.
     * 
     */
    public boolean isPluginsEnabled() {
        return pluginsEnabled;
    }

    /**
     * Sets the value of the pluginsEnabled property.
     * 
     */
    public void setPluginsEnabled(boolean value) {
        this.pluginsEnabled = value;
    }

    /**
     * Gets the value of the system property.
     * 
     */
    public boolean isSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     */
    public void setSystem(boolean value) {
        this.system = value;
    }

    /**
     * Gets the value of the scansToDisplay property.
     * 
     */
    public int getScansToDisplay() {
        return scansToDisplay;
    }

    /**
     * Sets the value of the scansToDisplay property.
     * 
     */
    public void setScansToDisplay(int value) {
        this.scansToDisplay = value;
    }

    /**
     * Gets the value of the isDeprecated property.
     * 
     */
    public boolean isIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Sets the value of the isDeprecated property.
     * 
     */
    public void setIsDeprecated(boolean value) {
        this.isDeprecated = value;
    }

}
