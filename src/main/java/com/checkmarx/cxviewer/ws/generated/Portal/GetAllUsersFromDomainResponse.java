
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
 *         &lt;element name="GetAllUsersFromDomainResult" type="{http://Checkmarx.com}CxWSResponseDomainUserList" minOccurs="0"/>
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
    "getAllUsersFromDomainResult"
})
@XmlRootElement(name = "GetAllUsersFromDomainResponse")
public class GetAllUsersFromDomainResponse {

    @XmlElement(name = "GetAllUsersFromDomainResult")
    protected CxWSResponseDomainUserList getAllUsersFromDomainResult;

    /**
     * Gets the value of the getAllUsersFromDomainResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseDomainUserList }
     *     
     */
    public CxWSResponseDomainUserList getGetAllUsersFromDomainResult() {
        return getAllUsersFromDomainResult;
    }

    /**
     * Sets the value of the getAllUsersFromDomainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseDomainUserList }
     *     
     */
    public void setGetAllUsersFromDomainResult(CxWSResponseDomainUserList value) {
        this.getAllUsersFromDomainResult = value;
    }

}
