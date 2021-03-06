
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
 *         &lt;element name="GetQueryDescriptionResult" type="{http://Checkmarx.com}CxWSResponseQueryDescription" minOccurs="0"/>
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
    "getQueryDescriptionResult"
})
@XmlRootElement(name = "GetQueryDescriptionResponse")
public class GetQueryDescriptionResponse {

    @XmlElement(name = "GetQueryDescriptionResult")
    protected CxWSResponseQueryDescription getQueryDescriptionResult;

    /**
     * Gets the value of the getQueryDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseQueryDescription }
     *     
     */
    public CxWSResponseQueryDescription getGetQueryDescriptionResult() {
        return getQueryDescriptionResult;
    }

    /**
     * Sets the value of the getQueryDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseQueryDescription }
     *     
     */
    public void setGetQueryDescriptionResult(CxWSResponseQueryDescription value) {
        this.getQueryDescriptionResult = value;
    }

}
