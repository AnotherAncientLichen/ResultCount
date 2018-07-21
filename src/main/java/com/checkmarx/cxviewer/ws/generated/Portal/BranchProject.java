
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
 *         &lt;element name="Project" type="{http://Checkmarx.com}ProjectConfiguration" minOccurs="0"/>
 *         &lt;element name="originalProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "project",
    "originalProjectId"
})
@XmlRootElement(name = "BranchProject")
public class BranchProject {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "Project")
    protected ProjectConfiguration project;
    protected long originalProjectId;

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
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectConfiguration }
     *     
     */
    public ProjectConfiguration getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectConfiguration }
     *     
     */
    public void setProject(ProjectConfiguration value) {
        this.project = value;
    }

    /**
     * Gets the value of the originalProjectId property.
     * 
     */
    public long getOriginalProjectId() {
        return originalProjectId;
    }

    /**
     * Sets the value of the originalProjectId property.
     * 
     */
    public void setOriginalProjectId(long value) {
        this.originalProjectId = value;
    }

}
