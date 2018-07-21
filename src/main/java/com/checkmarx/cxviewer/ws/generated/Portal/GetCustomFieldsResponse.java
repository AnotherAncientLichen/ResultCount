
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
 *         &lt;element name="GetCustomFieldsResult" type="{http://Checkmarx.com}CxWSResponseCustomFields" minOccurs="0"/>
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
    "getCustomFieldsResult"
})
@XmlRootElement(name = "GetCustomFieldsResponse")
public class GetCustomFieldsResponse {

    @XmlElement(name = "GetCustomFieldsResult")
    protected CxWSResponseCustomFields getCustomFieldsResult;

    /**
     * Gets the value of the getCustomFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseCustomFields }
     *     
     */
    public CxWSResponseCustomFields getGetCustomFieldsResult() {
        return getCustomFieldsResult;
    }

    /**
     * Sets the value of the getCustomFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseCustomFields }
     *     
     */
    public void setGetCustomFieldsResult(CxWSResponseCustomFields value) {
        this.getCustomFieldsResult = value;
    }

}
