
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
 *         &lt;element name="GetResultsForQueryResult" type="{http://Checkmarx.com}CxWSResponceScanResults" minOccurs="0"/>
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
    "getResultsForQueryResult"
})
@XmlRootElement(name = "GetResultsForQueryResponse")
public class GetResultsForQueryResponse {

    @XmlElement(name = "GetResultsForQueryResult")
    protected CxWSResponceScanResults getResultsForQueryResult;

    /**
     * Gets the value of the getResultsForQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public CxWSResponceScanResults getGetResultsForQueryResult() {
        return getResultsForQueryResult;
    }

    /**
     * Sets the value of the getResultsForQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public void setGetResultsForQueryResult(CxWSResponceScanResults value) {
        this.getResultsForQueryResult = value;
    }

}
