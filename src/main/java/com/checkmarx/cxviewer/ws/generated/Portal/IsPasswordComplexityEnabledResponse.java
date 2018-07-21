
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
 *         &lt;element name="IsPasswordComplexityEnabledResult" type="{http://Checkmarx.com}CxWSResponseBool" minOccurs="0"/>
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
    "isPasswordComplexityEnabledResult"
})
@XmlRootElement(name = "IsPasswordComplexityEnabledResponse")
public class IsPasswordComplexityEnabledResponse {

    @XmlElement(name = "IsPasswordComplexityEnabledResult")
    protected CxWSResponseBool isPasswordComplexityEnabledResult;

    /**
     * Gets the value of the isPasswordComplexityEnabledResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseBool }
     *     
     */
    public CxWSResponseBool getIsPasswordComplexityEnabledResult() {
        return isPasswordComplexityEnabledResult;
    }

    /**
     * Sets the value of the isPasswordComplexityEnabledResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseBool }
     *     
     */
    public void setIsPasswordComplexityEnabledResult(CxWSResponseBool value) {
        this.isPasswordComplexityEnabledResult = value;
    }

}
