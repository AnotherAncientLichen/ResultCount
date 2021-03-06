
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
 *         &lt;element name="GetAllUsersResult" type="{http://Checkmarx.com}CxWSResponseUserData" minOccurs="0"/>
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
    "getAllUsersResult"
})
@XmlRootElement(name = "GetAllUsersResponse")
public class GetAllUsersResponse {

    @XmlElement(name = "GetAllUsersResult")
    protected CxWSResponseUserData getAllUsersResult;

    /**
     * Gets the value of the getAllUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseUserData }
     *     
     */
    public CxWSResponseUserData getGetAllUsersResult() {
        return getAllUsersResult;
    }

    /**
     * Sets the value of the getAllUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseUserData }
     *     
     */
    public void setGetAllUsersResult(CxWSResponseUserData value) {
        this.getAllUsersResult = value;
    }

}
