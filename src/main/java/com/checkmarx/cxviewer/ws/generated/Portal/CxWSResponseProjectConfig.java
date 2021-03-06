
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseProjectConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseProjectConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ProjectConfig" type="{http://Checkmarx.com}ProjectConfiguration" minOccurs="0"/>
 *         &lt;element name="Permission" type="{http://Checkmarx.com}UserPermission" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseProjectConfig", propOrder = {
    "projectConfig",
    "permission"
})
public class CxWSResponseProjectConfig
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ProjectConfig")
    protected ProjectConfiguration projectConfig;
    @XmlElement(name = "Permission")
    protected UserPermission permission;

    /**
     * Gets the value of the projectConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectConfiguration }
     *     
     */
    public ProjectConfiguration getProjectConfig() {
        return projectConfig;
    }

    /**
     * Sets the value of the projectConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectConfiguration }
     *     
     */
    public void setProjectConfig(ProjectConfiguration value) {
        this.projectConfig = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link UserPermission }
     *     
     */
    public UserPermission getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPermission }
     *     
     */
    public void setPermission(UserPermission value) {
        this.permission = value;
    }

}
