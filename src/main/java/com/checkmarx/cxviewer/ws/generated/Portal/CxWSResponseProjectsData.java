
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseProjectsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseProjectsData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ProjectsList" type="{http://Checkmarx.com}ArrayOfCxProjectData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseProjectsData", propOrder = {
    "projectsList"
})
public class CxWSResponseProjectsData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ProjectsList")
    protected ArrayOfCxProjectData projectsList;

    /**
     * Gets the value of the projectsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxProjectData }
     *     
     */
    public ArrayOfCxProjectData getProjectsList() {
        return projectsList;
    }

    /**
     * Sets the value of the projectsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxProjectData }
     *     
     */
    public void setProjectsList(ArrayOfCxProjectData value) {
        this.projectsList = value;
    }

}
