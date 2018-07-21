
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
 *         &lt;element name="GetQueryDescriptionByQueryIdResult" type="{http://Checkmarx.com}CxWSResponseQueryDescription" minOccurs="0"/>
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
    "getQueryDescriptionByQueryIdResult"
})
@XmlRootElement(name = "GetQueryDescriptionByQueryIdResponse")
public class GetQueryDescriptionByQueryIdResponse {

    @XmlElement(name = "GetQueryDescriptionByQueryIdResult")
    protected CxWSResponseQueryDescription getQueryDescriptionByQueryIdResult;

    /**
     * Gets the value of the getQueryDescriptionByQueryIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseQueryDescription }
     *     
     */
    public CxWSResponseQueryDescription getGetQueryDescriptionByQueryIdResult() {
        return getQueryDescriptionByQueryIdResult;
    }

    /**
     * Sets the value of the getQueryDescriptionByQueryIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseQueryDescription }
     *     
     */
    public void setGetQueryDescriptionByQueryIdResult(CxWSResponseQueryDescription value) {
        this.getQueryDescriptionByQueryIdResult = value;
    }

}
