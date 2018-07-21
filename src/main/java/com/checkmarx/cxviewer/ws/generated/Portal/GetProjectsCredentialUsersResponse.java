
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
 *         &lt;element name="GetProjectsCredentialUsersResult" type="{http://Checkmarx.com}CxWSResponseNameList" minOccurs="0"/>
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
    "getProjectsCredentialUsersResult"
})
@XmlRootElement(name = "GetProjectsCredentialUsersResponse")
public class GetProjectsCredentialUsersResponse {

    @XmlElement(name = "GetProjectsCredentialUsersResult")
    protected CxWSResponseNameList getProjectsCredentialUsersResult;

    /**
     * Gets the value of the getProjectsCredentialUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseNameList }
     *     
     */
    public CxWSResponseNameList getGetProjectsCredentialUsersResult() {
        return getProjectsCredentialUsersResult;
    }

    /**
     * Sets the value of the getProjectsCredentialUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseNameList }
     *     
     */
    public void setGetProjectsCredentialUsersResult(CxWSResponseNameList value) {
        this.getProjectsCredentialUsersResult = value;
    }

}
