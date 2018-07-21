
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
 *         &lt;element name="GetExistingQueriesResult" type="{http://Checkmarx.com}CxWSResponseTransportedQueries" minOccurs="0"/>
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
    "getExistingQueriesResult"
})
@XmlRootElement(name = "GetExistingQueriesResponse")
public class GetExistingQueriesResponse {

    @XmlElement(name = "GetExistingQueriesResult")
    protected CxWSResponseTransportedQueries getExistingQueriesResult;

    /**
     * Gets the value of the getExistingQueriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseTransportedQueries }
     *     
     */
    public CxWSResponseTransportedQueries getGetExistingQueriesResult() {
        return getExistingQueriesResult;
    }

    /**
     * Sets the value of the getExistingQueriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseTransportedQueries }
     *     
     */
    public void setGetExistingQueriesResult(CxWSResponseTransportedQueries value) {
        this.getExistingQueriesResult = value;
    }

}
