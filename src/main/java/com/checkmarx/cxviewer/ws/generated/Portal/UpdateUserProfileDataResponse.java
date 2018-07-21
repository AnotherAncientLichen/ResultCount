
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
 *         &lt;element name="UpdateUserProfileDataResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "updateUserProfileDataResult"
})
@XmlRootElement(name = "UpdateUserProfileDataResponse")
public class UpdateUserProfileDataResponse {

    @XmlElement(name = "UpdateUserProfileDataResult")
    protected CxWSBasicRepsonse updateUserProfileDataResult;

    /**
     * Gets the value of the updateUserProfileDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getUpdateUserProfileDataResult() {
        return updateUserProfileDataResult;
    }

    /**
     * Sets the value of the updateUserProfileDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setUpdateUserProfileDataResult(CxWSBasicRepsonse value) {
        this.updateUserProfileDataResult = value;
    }

}
