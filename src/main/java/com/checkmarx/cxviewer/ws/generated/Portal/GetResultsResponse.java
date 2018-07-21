
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
 *         &lt;element name="GetResultsResult" type="{http://Checkmarx.com}CxWSResponseResultCollection" minOccurs="0"/>
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
    "getResultsResult"
})
@XmlRootElement(name = "GetResultsResponse")
public class GetResultsResponse {

    @XmlElement(name = "GetResultsResult")
    protected CxWSResponseResultCollection getResultsResult;

    /**
     * Gets the value of the getResultsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseResultCollection }
     *     
     */
    public CxWSResponseResultCollection getGetResultsResult() {
        return getResultsResult;
    }

    /**
     * Sets the value of the getResultsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseResultCollection }
     *     
     */
    public void setGetResultsResult(CxWSResponseResultCollection value) {
        this.getResultsResult = value;
    }

}
