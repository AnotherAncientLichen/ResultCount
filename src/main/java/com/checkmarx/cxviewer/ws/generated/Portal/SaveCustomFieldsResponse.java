
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
 *         &lt;element name="SaveCustomFieldsResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "saveCustomFieldsResult"
})
@XmlRootElement(name = "SaveCustomFieldsResponse")
public class SaveCustomFieldsResponse {

    @XmlElement(name = "SaveCustomFieldsResult")
    protected CxWSBasicRepsonse saveCustomFieldsResult;

    /**
     * Gets the value of the saveCustomFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getSaveCustomFieldsResult() {
        return saveCustomFieldsResult;
    }

    /**
     * Sets the value of the saveCustomFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setSaveCustomFieldsResult(CxWSBasicRepsonse value) {
        this.saveCustomFieldsResult = value;
    }

}
