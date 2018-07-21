
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
 *         &lt;element name="GetQueryCollectionResult" type="{http://Checkmarx.com}CxQueryCollectionResponse" minOccurs="0"/>
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
    "getQueryCollectionResult"
})
@XmlRootElement(name = "GetQueryCollectionResponse")
public class GetQueryCollectionResponse {

    @XmlElement(name = "GetQueryCollectionResult")
    protected CxQueryCollectionResponse getQueryCollectionResult;

    /**
     * Gets the value of the getQueryCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxQueryCollectionResponse }
     *     
     */
    public CxQueryCollectionResponse getGetQueryCollectionResult() {
        return getQueryCollectionResult;
    }

    /**
     * Sets the value of the getQueryCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxQueryCollectionResponse }
     *     
     */
    public void setGetQueryCollectionResult(CxQueryCollectionResponse value) {
        this.getQueryCollectionResult = value;
    }

}
