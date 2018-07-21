
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseDomainUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseDomainUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="UserList" type="{http://Checkmarx.com}ArrayOfCxDomainUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseDomainUserList", propOrder = {
    "userList"
})
public class CxWSResponseDomainUserList
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "UserList")
    protected ArrayOfCxDomainUser userList;

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxDomainUser }
     *     
     */
    public ArrayOfCxDomainUser getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxDomainUser }
     *     
     */
    public void setUserList(ArrayOfCxDomainUser value) {
        this.userList = value;
    }

}
