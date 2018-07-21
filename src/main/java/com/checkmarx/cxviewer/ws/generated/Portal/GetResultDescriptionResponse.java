
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
 *         &lt;element name="GetResultDescriptionResult" type="{http://Checkmarx.com}CxWSResponseResultDescription" minOccurs="0"/>
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
    "getResultDescriptionResult"
})
@XmlRootElement(name = "GetResultDescriptionResponse")
public class GetResultDescriptionResponse {

    @XmlElement(name = "GetResultDescriptionResult")
    protected CxWSResponseResultDescription getResultDescriptionResult;

    /**
     * Gets the value of the getResultDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseResultDescription }
     *     
     */
    public CxWSResponseResultDescription getGetResultDescriptionResult() {
        return getResultDescriptionResult;
    }

    /**
     * Sets the value of the getResultDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseResultDescription }
     *     
     */
    public void setGetResultDescriptionResult(CxWSResponseResultDescription value) {
        this.getResultDescriptionResult = value;
    }

}
