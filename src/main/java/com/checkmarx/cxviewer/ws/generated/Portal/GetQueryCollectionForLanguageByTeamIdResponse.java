
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
 *         &lt;element name="GetQueryCollectionForLanguageByTeamIdResult" type="{http://Checkmarx.com}CxQueryCollectionResponse" minOccurs="0"/>
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
    "getQueryCollectionForLanguageByTeamIdResult"
})
@XmlRootElement(name = "GetQueryCollectionForLanguageByTeamIdResponse")
public class GetQueryCollectionForLanguageByTeamIdResponse {

    @XmlElement(name = "GetQueryCollectionForLanguageByTeamIdResult")
    protected CxQueryCollectionResponse getQueryCollectionForLanguageByTeamIdResult;

    /**
     * Gets the value of the getQueryCollectionForLanguageByTeamIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxQueryCollectionResponse }
     *     
     */
    public CxQueryCollectionResponse getGetQueryCollectionForLanguageByTeamIdResult() {
        return getQueryCollectionForLanguageByTeamIdResult;
    }

    /**
     * Sets the value of the getQueryCollectionForLanguageByTeamIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxQueryCollectionResponse }
     *     
     */
    public void setGetQueryCollectionForLanguageByTeamIdResult(CxQueryCollectionResponse value) {
        this.getQueryCollectionForLanguageByTeamIdResult = value;
    }

}
