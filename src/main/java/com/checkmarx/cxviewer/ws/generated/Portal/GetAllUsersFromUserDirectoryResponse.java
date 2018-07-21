
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
 *         &lt;element name="GetAllUsersFromUserDirectoryResult" type="{http://Checkmarx.com}CxWSResponseDomainUserList" minOccurs="0"/>
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
    "getAllUsersFromUserDirectoryResult"
})
@XmlRootElement(name = "GetAllUsersFromUserDirectoryResponse")
public class GetAllUsersFromUserDirectoryResponse {

    @XmlElement(name = "GetAllUsersFromUserDirectoryResult")
    protected CxWSResponseDomainUserList getAllUsersFromUserDirectoryResult;

    /**
     * Gets the value of the getAllUsersFromUserDirectoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseDomainUserList }
     *     
     */
    public CxWSResponseDomainUserList getGetAllUsersFromUserDirectoryResult() {
        return getAllUsersFromUserDirectoryResult;
    }

    /**
     * Sets the value of the getAllUsersFromUserDirectoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseDomainUserList }
     *     
     */
    public void setGetAllUsersFromUserDirectoryResult(CxWSResponseDomainUserList value) {
        this.getAllUsersFromUserDirectoryResult = value;
    }

}
