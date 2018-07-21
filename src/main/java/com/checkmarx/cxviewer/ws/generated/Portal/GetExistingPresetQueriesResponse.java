
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
 *         &lt;element name="GetExistingPresetQueriesResult" type="{http://Checkmarx.com}CxWSResponseExistsingTransportedPresetQueries" minOccurs="0"/>
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
    "getExistingPresetQueriesResult"
})
@XmlRootElement(name = "GetExistingPresetQueriesResponse")
public class GetExistingPresetQueriesResponse {

    @XmlElement(name = "GetExistingPresetQueriesResult")
    protected CxWSResponseExistsingTransportedPresetQueries getExistingPresetQueriesResult;

    /**
     * Gets the value of the getExistingPresetQueriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseExistsingTransportedPresetQueries }
     *     
     */
    public CxWSResponseExistsingTransportedPresetQueries getGetExistingPresetQueriesResult() {
        return getExistingPresetQueriesResult;
    }

    /**
     * Sets the value of the getExistingPresetQueriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseExistsingTransportedPresetQueries }
     *     
     */
    public void setGetExistingPresetQueriesResult(CxWSResponseExistsingTransportedPresetQueries value) {
        this.getExistingPresetQueriesResult = value;
    }

}
