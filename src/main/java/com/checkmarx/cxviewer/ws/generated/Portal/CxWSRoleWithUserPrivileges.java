
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSRoleWithUserPrivileges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSRoleWithUserPrivileges">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}Role">
 *       &lt;sequence>
 *         &lt;element name="ItemsCRUD" type="{http://Checkmarx.com}ArrayOfCxWSItemAndCRUD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSRoleWithUserPrivileges", propOrder = {
    "itemsCRUD"
})
public class CxWSRoleWithUserPrivileges
    extends Role
{

    @XmlElement(name = "ItemsCRUD")
    protected ArrayOfCxWSItemAndCRUD itemsCRUD;

    /**
     * Gets the value of the itemsCRUD property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSItemAndCRUD }
     *     
     */
    public ArrayOfCxWSItemAndCRUD getItemsCRUD() {
        return itemsCRUD;
    }

    /**
     * Sets the value of the itemsCRUD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSItemAndCRUD }
     *     
     */
    public void setItemsCRUD(ArrayOfCxWSItemAndCRUD value) {
        this.itemsCRUD = value;
    }

}
