
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
 *         &lt;element name="GetScansStatusesResult" type="{http://Checkmarx.com}CxWSResponseScanStatusArray" minOccurs="0"/>
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
    "getScansStatusesResult"
})
@XmlRootElement(name = "GetScansStatusesResponse")
public class GetScansStatusesResponse {

    @XmlElement(name = "GetScansStatusesResult")
    protected CxWSResponseScanStatusArray getScansStatusesResult;

    /**
     * Gets the value of the getScansStatusesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseScanStatusArray }
     *     
     */
    public CxWSResponseScanStatusArray getGetScansStatusesResult() {
        return getScansStatusesResult;
    }

    /**
     * Sets the value of the getScansStatusesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseScanStatusArray }
     *     
     */
    public void setGetScansStatusesResult(CxWSResponseScanStatusArray value) {
        this.getScansStatusesResult = value;
    }

}
