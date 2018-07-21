
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
 *         &lt;element name="GetAllUsersInGroupResult" type="{http://Checkmarx.com}CxWSResponseUserData" minOccurs="0"/>
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
    "getAllUsersInGroupResult"
})
@XmlRootElement(name = "GetAllUsersInGroupResponse")
public class GetAllUsersInGroupResponse {

    @XmlElement(name = "GetAllUsersInGroupResult")
    protected CxWSResponseUserData getAllUsersInGroupResult;

    /**
     * Gets the value of the getAllUsersInGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseUserData }
     *     
     */
    public CxWSResponseUserData getGetAllUsersInGroupResult() {
        return getAllUsersInGroupResult;
    }

    /**
     * Sets the value of the getAllUsersInGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseUserData }
     *     
     */
    public void setGetAllUsersInGroupResult(CxWSResponseUserData value) {
        this.getAllUsersInGroupResult = value;
    }

}
