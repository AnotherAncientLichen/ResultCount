
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseUserData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseUserData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="UserDataList" type="{http://Checkmarx.com}ArrayOfUserData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseUserData", propOrder = {
    "userDataList"
})
public class CxWSResponseUserData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "UserDataList")
    protected ArrayOfUserData userDataList;

    /**
     * Gets the value of the userDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserData }
     *     
     */
    public ArrayOfUserData getUserDataList() {
        return userDataList;
    }

    /**
     * Sets the value of the userDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserData }
     *     
     */
    public void setUserDataList(ArrayOfUserData value) {
        this.userDataList = value;
    }

}
