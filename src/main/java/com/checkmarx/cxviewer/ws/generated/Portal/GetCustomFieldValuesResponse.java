
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCustomFieldValuesResult" type="{http://Checkmarx.com}CxWSResponseCustomFieldValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCustomFieldValuesResult"
})
@XmlRootElement(name = "GetCustomFieldValuesResponse")
public class GetCustomFieldValuesResponse {

    @XmlElement(name = "GetCustomFieldValuesResult")
    protected CxWSResponseCustomFieldValues getCustomFieldValuesResult;

    /**
     * Gets the value of the getCustomFieldValuesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseCustomFieldValues }
     *     
     */
    public CxWSResponseCustomFieldValues getGetCustomFieldValuesResult() {
        return getCustomFieldValuesResult;
    }

    /**
     * Sets the value of the getCustomFieldValuesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseCustomFieldValues }
     *     
     */
    public void setGetCustomFieldValuesResult(CxWSResponseCustomFieldValues value) {
        this.getCustomFieldValuesResult = value;
    }

}
