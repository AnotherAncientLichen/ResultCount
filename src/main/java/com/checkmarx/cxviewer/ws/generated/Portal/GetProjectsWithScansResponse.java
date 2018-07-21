
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
 *         &lt;element name="GetProjectsWithScansResult" type="{http://Checkmarx.com}CxWSResponseProjectsScansList" minOccurs="0"/>
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
    "getProjectsWithScansResult"
})
@XmlRootElement(name = "GetProjectsWithScansResponse")
public class GetProjectsWithScansResponse {

    @XmlElement(name = "GetProjectsWithScansResult")
    protected CxWSResponseProjectsScansList getProjectsWithScansResult;

    /**
     * Gets the value of the getProjectsWithScansResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProjectsScansList }
     *     
     */
    public CxWSResponseProjectsScansList getGetProjectsWithScansResult() {
        return getProjectsWithScansResult;
    }

    /**
     * Sets the value of the getProjectsWithScansResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProjectsScansList }
     *     
     */
    public void setGetProjectsWithScansResult(CxWSResponseProjectsScansList value) {
        this.getProjectsWithScansResult = value;
    }

}
