
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
 *         &lt;element name="UpdateProjectIncrementalConfigurationResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "updateProjectIncrementalConfigurationResult"
})
@XmlRootElement(name = "UpdateProjectIncrementalConfigurationResponse")
public class UpdateProjectIncrementalConfigurationResponse {

    @XmlElement(name = "UpdateProjectIncrementalConfigurationResult")
    protected CxWSBasicRepsonse updateProjectIncrementalConfigurationResult;

    /**
     * Gets the value of the updateProjectIncrementalConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getUpdateProjectIncrementalConfigurationResult() {
        return updateProjectIncrementalConfigurationResult;
    }

    /**
     * Sets the value of the updateProjectIncrementalConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setUpdateProjectIncrementalConfigurationResult(CxWSBasicRepsonse value) {
        this.updateProjectIncrementalConfigurationResult = value;
    }

}
