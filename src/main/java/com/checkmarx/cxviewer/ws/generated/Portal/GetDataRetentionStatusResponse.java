
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
 *         &lt;element name="GetDataRetentionStatusResult" type="{http://Checkmarx.com}CxWSDataRetentionStatusResponse" minOccurs="0"/>
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
    "getDataRetentionStatusResult"
})
@XmlRootElement(name = "GetDataRetentionStatusResponse")
public class GetDataRetentionStatusResponse {

    @XmlElement(name = "GetDataRetentionStatusResult")
    protected CxWSDataRetentionStatusResponse getDataRetentionStatusResult;

    /**
     * Gets the value of the getDataRetentionStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSDataRetentionStatusResponse }
     *     
     */
    public CxWSDataRetentionStatusResponse getGetDataRetentionStatusResult() {
        return getDataRetentionStatusResult;
    }

    /**
     * Sets the value of the getDataRetentionStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSDataRetentionStatusResponse }
     *     
     */
    public void setGetDataRetentionStatusResult(CxWSDataRetentionStatusResponse value) {
        this.getDataRetentionStatusResult = value;
    }

}
