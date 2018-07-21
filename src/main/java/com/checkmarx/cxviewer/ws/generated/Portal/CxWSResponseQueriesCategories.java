
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseQueriesCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseQueriesCategories">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="QueriesCategories" type="{http://Checkmarx.com}ArrayOfCxQueryCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseQueriesCategories", propOrder = {
    "queriesCategories"
})
public class CxWSResponseQueriesCategories
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "QueriesCategories")
    protected ArrayOfCxQueryCategory queriesCategories;

    /**
     * Gets the value of the queriesCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxQueryCategory }
     *     
     */
    public ArrayOfCxQueryCategory getQueriesCategories() {
        return queriesCategories;
    }

    /**
     * Sets the value of the queriesCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxQueryCategory }
     *     
     */
    public void setQueriesCategories(ArrayOfCxQueryCategory value) {
        this.queriesCategories = value;
    }

}
