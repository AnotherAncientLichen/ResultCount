
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSJIRAIssueCreateMeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSJIRAIssueCreateMeta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemMeta">
 *       &lt;sequence>
 *         &lt;element name="Projects" type="{http://Checkmarx.com}ArrayOfCxWSJIRAProjectMeta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSJIRAIssueCreateMeta", propOrder = {
    "projects"
})
public class CxWSJIRAIssueCreateMeta
    extends CxWSIssueTrackingSystemMeta
{

    @XmlElement(name = "Projects")
    protected ArrayOfCxWSJIRAProjectMeta projects;

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSJIRAProjectMeta }
     *     
     */
    public ArrayOfCxWSJIRAProjectMeta getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSJIRAProjectMeta }
     *     
     */
    public void setProjects(ArrayOfCxWSJIRAProjectMeta value) {
        this.projects = value;
    }

}
