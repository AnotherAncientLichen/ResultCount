
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
 *         &lt;element name="GetCacheResult" type="{http://Checkmarx.com}CxWSResponseCache" minOccurs="0"/>
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
    "getCacheResult"
})
@XmlRootElement(name = "GetCacheResponse")
public class GetCacheResponse {

    @XmlElement(name = "GetCacheResult")
    protected CxWSResponseCache getCacheResult;

    /**
     * Gets the value of the getCacheResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseCache }
     *     
     */
    public CxWSResponseCache getGetCacheResult() {
        return getCacheResult;
    }

    /**
     * Sets the value of the getCacheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseCache }
     *     
     */
    public void setGetCacheResult(CxWSResponseCache value) {
        this.getCacheResult = value;
    }

}
