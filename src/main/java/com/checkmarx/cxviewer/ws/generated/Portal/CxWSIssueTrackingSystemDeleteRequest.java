
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemDeleteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemDeleteRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemRequest">
 *       &lt;sequence>
 *         &lt;element name="IDs" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemDeleteRequest", propOrder = {
    "iDs"
})
public class CxWSIssueTrackingSystemDeleteRequest
    extends CxWSIssueTrackingSystemRequest
{

    @XmlElement(name = "IDs")
    protected ArrayOfLong iDs;

    /**
     * Gets the value of the iDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getIDs() {
        return iDs;
    }

    /**
     * Sets the value of the iDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setIDs(ArrayOfLong value) {
        this.iDs = value;
    }

}
