
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
 *         &lt;element name="PostponeScanResult" type="{http://Checkmarx.com}CxWSResponseQueueRunID" minOccurs="0"/>
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
    "postponeScanResult"
})
@XmlRootElement(name = "PostponeScanResponse")
public class PostponeScanResponse {

    @XmlElement(name = "PostponeScanResult")
    protected CxWSResponseQueueRunID postponeScanResult;

    /**
     * Gets the value of the postponeScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseQueueRunID }
     *     
     */
    public CxWSResponseQueueRunID getPostponeScanResult() {
        return postponeScanResult;
    }

    /**
     * Sets the value of the postponeScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseQueueRunID }
     *     
     */
    public void setPostponeScanResult(CxWSResponseQueueRunID value) {
        this.postponeScanResult = value;
    }

}
