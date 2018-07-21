
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
 *         &lt;element name="DeleteProjectsResult" type="{http://Checkmarx.com}CxWSResponseDeleteProjects" minOccurs="0"/>
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
    "deleteProjectsResult"
})
@XmlRootElement(name = "DeleteProjectsResponse")
public class DeleteProjectsResponse {

    @XmlElement(name = "DeleteProjectsResult")
    protected CxWSResponseDeleteProjects deleteProjectsResult;

    /**
     * Gets the value of the deleteProjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseDeleteProjects }
     *     
     */
    public CxWSResponseDeleteProjects getDeleteProjectsResult() {
        return deleteProjectsResult;
    }

    /**
     * Sets the value of the deleteProjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseDeleteProjects }
     *     
     */
    public void setDeleteProjectsResult(CxWSResponseDeleteProjects value) {
        this.deleteProjectsResult = value;
    }

}
