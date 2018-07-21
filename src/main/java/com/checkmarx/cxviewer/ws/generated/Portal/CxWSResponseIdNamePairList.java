
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseIdNamePairList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseIdNamePairList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://Checkmarx.com}ArrayOfCxWSIdNamePair" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseIdNamePairList", propOrder = {
    "items"
})
public class CxWSResponseIdNamePairList
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Items")
    protected ArrayOfCxWSIdNamePair items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSIdNamePair }
     *     
     */
    public ArrayOfCxWSIdNamePair getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSIdNamePair }
     *     
     */
    public void setItems(ArrayOfCxWSIdNamePair value) {
        this.items = value;
    }

}
