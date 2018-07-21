
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSQueryVersionDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSQueryVersionDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="QueryDetails" type="{http://Checkmarx.com}CxWSQueryVersionDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSQueryVersionDetailsResponse", propOrder = {
    "queryDetails"
})
public class CxWSQueryVersionDetailsResponse
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "QueryDetails")
    protected CxWSQueryVersionDetails queryDetails;

    /**
     * Gets the value of the queryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSQueryVersionDetails }
     *     
     */
    public CxWSQueryVersionDetails getQueryDetails() {
        return queryDetails;
    }

    /**
     * Sets the value of the queryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSQueryVersionDetails }
     *     
     */
    public void setQueryDetails(CxWSQueryVersionDetails value) {
        this.queryDetails = value;
    }

}
