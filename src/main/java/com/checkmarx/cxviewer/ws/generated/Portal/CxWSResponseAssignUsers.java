
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseAssignUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseAssignUsers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="AssignUsers" type="{http://Checkmarx.com}ArrayOfAssignUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseAssignUsers", propOrder = {
    "assignUsers"
})
public class CxWSResponseAssignUsers
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "AssignUsers")
    protected ArrayOfAssignUser assignUsers;

    /**
     * Gets the value of the assignUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssignUser }
     *     
     */
    public ArrayOfAssignUser getAssignUsers() {
        return assignUsers;
    }

    /**
     * Sets the value of the assignUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssignUser }
     *     
     */
    public void setAssignUsers(ArrayOfAssignUser value) {
        this.assignUsers = value;
    }

}
