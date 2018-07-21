
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseQueryDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseQueryDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="QueryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseQueryDescription", propOrder = {
    "queryDescription"
})
public class CxWSResponseQueryDescription
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "QueryDescription")
    protected String queryDescription;

    /**
     * Gets the value of the queryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryDescription() {
        return queryDescription;
    }

    /**
     * Sets the value of the queryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryDescription(String value) {
        this.queryDescription = value;
    }

}
