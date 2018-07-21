
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseProfileData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseProfileData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ProfileData" type="{http://Checkmarx.com}ProfileData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseProfileData", propOrder = {
    "profileData"
})
public class CxWSResponseProfileData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ProfileData")
    protected ProfileData profileData;

    /**
     * Gets the value of the profileData property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileData }
     *     
     */
    public ProfileData getProfileData() {
        return profileData;
    }

    /**
     * Sets the value of the profileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileData }
     *     
     */
    public void setProfileData(ProfileData value) {
        this.profileData = value;
    }

}
