
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseProjectsScansList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseProjectsScansList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="projects" type="{http://Checkmarx.com}ArrayOfCxWSResponseBasicProjectData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseProjectsScansList", propOrder = {
    "projects"
})
public class CxWSResponseProjectsScansList
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxWSResponseBasicProjectData projects;

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResponseBasicProjectData }
     *     
     */
    public ArrayOfCxWSResponseBasicProjectData getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResponseBasicProjectData }
     *     
     */
    public void setProjects(ArrayOfCxWSResponseBasicProjectData value) {
        this.projects = value;
    }

}
