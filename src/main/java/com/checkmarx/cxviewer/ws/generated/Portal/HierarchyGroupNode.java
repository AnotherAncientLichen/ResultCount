
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HierarchyGroupNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchyGroupNode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}Group">
 *       &lt;sequence>
 *         &lt;element name="Childs" type="{http://Checkmarx.com}ArrayOfHierarchyGroupNode" minOccurs="0"/>
 *         &lt;element name="Membership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyGroupNode", propOrder = {
    "childs",
    "membership"
})
public class HierarchyGroupNode
    extends Group
{

    @XmlElement(name = "Childs")
    protected ArrayOfHierarchyGroupNode childs;
    @XmlElement(name = "Membership")
    protected boolean membership;

    /**
     * Gets the value of the childs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHierarchyGroupNode }
     *     
     */
    public ArrayOfHierarchyGroupNode getChilds() {
        return childs;
    }

    /**
     * Sets the value of the childs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHierarchyGroupNode }
     *     
     */
    public void setChilds(ArrayOfHierarchyGroupNode value) {
        this.childs = value;
    }

    /**
     * Gets the value of the membership property.
     * 
     */
    public boolean isMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     */
    public void setMembership(boolean value) {
        this.membership = value;
    }

}
