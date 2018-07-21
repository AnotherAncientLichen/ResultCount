
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
 *         &lt;element name="GetProjectsWithUserCredentialsResult" type="{http://Checkmarx.com}CxWSResponseProjectsData" minOccurs="0"/>
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
    "getProjectsWithUserCredentialsResult"
})
@XmlRootElement(name = "GetProjectsWithUserCredentialsResponse")
public class GetProjectsWithUserCredentialsResponse {

    @XmlElement(name = "GetProjectsWithUserCredentialsResult")
    protected CxWSResponseProjectsData getProjectsWithUserCredentialsResult;

    /**
     * Gets the value of the getProjectsWithUserCredentialsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProjectsData }
     *     
     */
    public CxWSResponseProjectsData getGetProjectsWithUserCredentialsResult() {
        return getProjectsWithUserCredentialsResult;
    }

    /**
     * Sets the value of the getProjectsWithUserCredentialsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProjectsData }
     *     
     */
    public void setGetProjectsWithUserCredentialsResult(CxWSResponseProjectsData value) {
        this.getProjectsWithUserCredentialsResult = value;
    }

}
