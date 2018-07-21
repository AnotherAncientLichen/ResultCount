
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapRoleMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSLdapRoleMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultRoleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AdvancedRoleMappingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultRoleApplyNotExploitable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultRoleDeleteProjectsAndScans" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DefaultRoleAllowStatusSeverityChanges" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WsLdapAdvancedRoleMapping" type="{http://Checkmarx.com}CxWSLdapAdvancedRoleMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSLdapRoleMapping", propOrder = {
    "defaultRoleId",
    "advancedRoleMappingEnabled",
    "defaultRoleApplyNotExploitable",
    "defaultRoleDeleteProjectsAndScans",
    "defaultRoleAllowStatusSeverityChanges",
    "wsLdapAdvancedRoleMapping"
})
public class CxWSLdapRoleMapping {

    @XmlElement(name = "DefaultRoleId", required = true, type = Long.class, nillable = true)
    protected Long defaultRoleId;
    @XmlElement(name = "AdvancedRoleMappingEnabled")
    protected boolean advancedRoleMappingEnabled;
    @XmlElement(name = "DefaultRoleApplyNotExploitable")
    protected boolean defaultRoleApplyNotExploitable;
    @XmlElement(name = "DefaultRoleDeleteProjectsAndScans")
    protected boolean defaultRoleDeleteProjectsAndScans;
    @XmlElement(name = "DefaultRoleAllowStatusSeverityChanges")
    protected boolean defaultRoleAllowStatusSeverityChanges;
    @XmlElement(name = "WsLdapAdvancedRoleMapping")
    protected CxWSLdapAdvancedRoleMapping wsLdapAdvancedRoleMapping;

    /**
     * Gets the value of the defaultRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultRoleId() {
        return defaultRoleId;
    }

    /**
     * Sets the value of the defaultRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultRoleId(Long value) {
        this.defaultRoleId = value;
    }

    /**
     * Gets the value of the advancedRoleMappingEnabled property.
     * 
     */
    public boolean isAdvancedRoleMappingEnabled() {
        return advancedRoleMappingEnabled;
    }

    /**
     * Sets the value of the advancedRoleMappingEnabled property.
     * 
     */
    public void setAdvancedRoleMappingEnabled(boolean value) {
        this.advancedRoleMappingEnabled = value;
    }

    /**
     * Gets the value of the defaultRoleApplyNotExploitable property.
     * 
     */
    public boolean isDefaultRoleApplyNotExploitable() {
        return defaultRoleApplyNotExploitable;
    }

    /**
     * Sets the value of the defaultRoleApplyNotExploitable property.
     * 
     */
    public void setDefaultRoleApplyNotExploitable(boolean value) {
        this.defaultRoleApplyNotExploitable = value;
    }

    /**
     * Gets the value of the defaultRoleDeleteProjectsAndScans property.
     * 
     */
    public boolean isDefaultRoleDeleteProjectsAndScans() {
        return defaultRoleDeleteProjectsAndScans;
    }

    /**
     * Sets the value of the defaultRoleDeleteProjectsAndScans property.
     * 
     */
    public void setDefaultRoleDeleteProjectsAndScans(boolean value) {
        this.defaultRoleDeleteProjectsAndScans = value;
    }

    /**
     * Gets the value of the defaultRoleAllowStatusSeverityChanges property.
     * 
     */
    public boolean isDefaultRoleAllowStatusSeverityChanges() {
        return defaultRoleAllowStatusSeverityChanges;
    }

    /**
     * Sets the value of the defaultRoleAllowStatusSeverityChanges property.
     * 
     */
    public void setDefaultRoleAllowStatusSeverityChanges(boolean value) {
        this.defaultRoleAllowStatusSeverityChanges = value;
    }

    /**
     * Gets the value of the wsLdapAdvancedRoleMapping property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSLdapAdvancedRoleMapping }
     *     
     */
    public CxWSLdapAdvancedRoleMapping getWsLdapAdvancedRoleMapping() {
        return wsLdapAdvancedRoleMapping;
    }

    /**
     * Sets the value of the wsLdapAdvancedRoleMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSLdapAdvancedRoleMapping }
     *     
     */
    public void setWsLdapAdvancedRoleMapping(CxWSLdapAdvancedRoleMapping value) {
        this.wsLdapAdvancedRoleMapping = value;
    }

}
