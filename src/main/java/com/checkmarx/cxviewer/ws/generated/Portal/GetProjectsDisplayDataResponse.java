
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
 *         &lt;element name="GetProjectsDisplayDataResult" type="{http://Checkmarx.com}CxWSResponseProjectsDisplayData" minOccurs="0"/>
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
    "getProjectsDisplayDataResult"
})
@XmlRootElement(name = "GetProjectsDisplayDataResponse")
public class GetProjectsDisplayDataResponse {

    @XmlElement(name = "GetProjectsDisplayDataResult")
    protected CxWSResponseProjectsDisplayData getProjectsDisplayDataResult;

    /**
     * Gets the value of the getProjectsDisplayDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProjectsDisplayData }
     *     
     */
    public CxWSResponseProjectsDisplayData getGetProjectsDisplayDataResult() {
        return getProjectsDisplayDataResult;
    }

    /**
     * Sets the value of the getProjectsDisplayDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProjectsDisplayData }
     *     
     */
    public void setGetProjectsDisplayDataResult(CxWSResponseProjectsDisplayData value) {
        this.getProjectsDisplayDataResult = value;
    }

}
