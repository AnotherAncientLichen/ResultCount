
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
 *         &lt;element name="GetLatestFinishedDataRetentionRequestResult" type="{http://Checkmarx.com}CxWSDataRetentionRequestResponse" minOccurs="0"/>
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
    "getLatestFinishedDataRetentionRequestResult"
})
@XmlRootElement(name = "GetLatestFinishedDataRetentionRequestResponse")
public class GetLatestFinishedDataRetentionRequestResponse {

    @XmlElement(name = "GetLatestFinishedDataRetentionRequestResult")
    protected CxWSDataRetentionRequestResponse getLatestFinishedDataRetentionRequestResult;

    /**
     * Gets the value of the getLatestFinishedDataRetentionRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSDataRetentionRequestResponse }
     *     
     */
    public CxWSDataRetentionRequestResponse getGetLatestFinishedDataRetentionRequestResult() {
        return getLatestFinishedDataRetentionRequestResult;
    }

    /**
     * Sets the value of the getLatestFinishedDataRetentionRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSDataRetentionRequestResponse }
     *     
     */
    public void setGetLatestFinishedDataRetentionRequestResult(CxWSDataRetentionRequestResponse value) {
        this.getLatestFinishedDataRetentionRequestResult = value;
    }

}
