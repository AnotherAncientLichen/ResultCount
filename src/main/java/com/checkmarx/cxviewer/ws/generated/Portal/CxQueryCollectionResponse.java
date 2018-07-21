
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxQueryCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxQueryCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="QueryGroups" type="{http://Checkmarx.com}ArrayOfCxWSQueryGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxQueryCollectionResponse", propOrder = {
    "queryGroups"
})
public class CxQueryCollectionResponse
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "QueryGroups")
    protected ArrayOfCxWSQueryGroup queryGroups;

    /**
     * Gets the value of the queryGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSQueryGroup }
     *     
     */
    public ArrayOfCxWSQueryGroup getQueryGroups() {
        return queryGroups;
    }

    /**
     * Sets the value of the queryGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSQueryGroup }
     *     
     */
    public void setQueryGroups(ArrayOfCxWSQueryGroup value) {
        this.queryGroups = value;
    }

}
