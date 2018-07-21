
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
 *         &lt;element name="GetUserProfileDataResult" type="{http://Checkmarx.com}CxWSResponseProfileData" minOccurs="0"/>
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
    "getUserProfileDataResult"
})
@XmlRootElement(name = "GetUserProfileDataResponse")
public class GetUserProfileDataResponse {

    @XmlElement(name = "GetUserProfileDataResult")
    protected CxWSResponseProfileData getUserProfileDataResult;

    /**
     * Gets the value of the getUserProfileDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProfileData }
     *     
     */
    public CxWSResponseProfileData getGetUserProfileDataResult() {
        return getUserProfileDataResult;
    }

    /**
     * Sets the value of the getUserProfileDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProfileData }
     *     
     */
    public void setGetUserProfileDataResult(CxWSResponseProfileData value) {
        this.getUserProfileDataResult = value;
    }

}
