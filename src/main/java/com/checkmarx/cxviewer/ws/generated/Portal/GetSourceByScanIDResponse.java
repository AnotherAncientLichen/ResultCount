
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
 *         &lt;element name="GetSourceByScanIDResult" type="{http://Checkmarx.com}CxWSResponseSourceContent" minOccurs="0"/>
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
    "getSourceByScanIDResult"
})
@XmlRootElement(name = "GetSourceByScanIDResponse")
public class GetSourceByScanIDResponse {

    @XmlElement(name = "GetSourceByScanIDResult")
    protected CxWSResponseSourceContent getSourceByScanIDResult;

    /**
     * Gets the value of the getSourceByScanIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSourceContent }
     *     
     */
    public CxWSResponseSourceContent getGetSourceByScanIDResult() {
        return getSourceByScanIDResult;
    }

    /**
     * Sets the value of the getSourceByScanIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSourceContent }
     *     
     */
    public void setGetSourceByScanIDResult(CxWSResponseSourceContent value) {
        this.getSourceByScanIDResult = value;
    }

}
