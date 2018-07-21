
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectSettings" type="{http://Checkmarx.com}ProjectSettings" minOccurs="0"/>
 *         &lt;element name="LocalCodeContainer" type="{http://Checkmarx.com}LocalCodeContainer" minOccurs="0"/>
 *         &lt;element name="visibleToOtherUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "projectSettings",
    "localCodeContainer",
    "visibleToOtherUsers"
})
@XmlRootElement(name = "CreateAndRunProject")
public class CreateAndRunProject {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "ProjectSettings")
    protected ProjectSettings projectSettings;
    @XmlElement(name = "LocalCodeContainer")
    protected LocalCodeContainer localCodeContainer;
    protected boolean visibleToOtherUsers;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the projectSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectSettings }
     *     
     */
    public ProjectSettings getProjectSettings() {
        return projectSettings;
    }

    /**
     * Sets the value of the projectSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectSettings }
     *     
     */
    public void setProjectSettings(ProjectSettings value) {
        this.projectSettings = value;
    }

    /**
     * Gets the value of the localCodeContainer property.
     * 
     * @return
     *     possible object is
     *     {@link LocalCodeContainer }
     *     
     */
    public LocalCodeContainer getLocalCodeContainer() {
        return localCodeContainer;
    }

    /**
     * Sets the value of the localCodeContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalCodeContainer }
     *     
     */
    public void setLocalCodeContainer(LocalCodeContainer value) {
        this.localCodeContainer = value;
    }

    /**
     * Gets the value of the visibleToOtherUsers property.
     * 
     */
    public boolean isVisibleToOtherUsers() {
        return visibleToOtherUsers;
    }

    /**
     * Sets the value of the visibleToOtherUsers property.
     * 
     */
    public void setVisibleToOtherUsers(boolean value) {
        this.visibleToOtherUsers = value;
    }

}
