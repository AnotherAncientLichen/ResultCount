
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseHierarchyGroupNodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseHierarchyGroupNodes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="HierarchyGroupNodes" type="{http://Checkmarx.com}ArrayOfHierarchyGroupNode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseHierarchyGroupNodes", propOrder = {
    "hierarchyGroupNodes"
})
public class CxWSResponseHierarchyGroupNodes
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "HierarchyGroupNodes")
    protected ArrayOfHierarchyGroupNode hierarchyGroupNodes;

    /**
     * Gets the value of the hierarchyGroupNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHierarchyGroupNode }
     *     
     */
    public ArrayOfHierarchyGroupNode getHierarchyGroupNodes() {
        return hierarchyGroupNodes;
    }

    /**
     * Sets the value of the hierarchyGroupNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHierarchyGroupNode }
     *     
     */
    public void setHierarchyGroupNodes(ArrayOfHierarchyGroupNode value) {
        this.hierarchyGroupNodes = value;
    }

}
