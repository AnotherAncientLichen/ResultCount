
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectBasicSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectBasicSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociatedGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectBasicSettings", propOrder = {
    "projectName",
    "associatedGroupID"
})
public class ProjectBasicSettings {

    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "AssociatedGroupID")
    protected String associatedGroupID;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the associatedGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedGroupID() {
        return associatedGroupID;
    }

    /**
     * Sets the value of the associatedGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedGroupID(String value) {
        this.associatedGroupID = value;
    }

}
