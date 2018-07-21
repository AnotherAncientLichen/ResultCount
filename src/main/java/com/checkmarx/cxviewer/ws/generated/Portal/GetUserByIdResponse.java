
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
 *         &lt;element name="GetUserByIdResult" type="{http://Checkmarx.com}CxWSResponseSingleUserData" minOccurs="0"/>
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
    "getUserByIdResult"
})
@XmlRootElement(name = "GetUserByIdResponse")
public class GetUserByIdResponse {

    @XmlElement(name = "GetUserByIdResult")
    protected CxWSResponseSingleUserData getUserByIdResult;

    /**
     * Gets the value of the getUserByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSingleUserData }
     *     
     */
    public CxWSResponseSingleUserData getGetUserByIdResult() {
        return getUserByIdResult;
    }

    /**
     * Sets the value of the getUserByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSingleUserData }
     *     
     */
    public void setGetUserByIdResult(CxWSResponseSingleUserData value) {
        this.getUserByIdResult = value;
    }

}
