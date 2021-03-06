
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
 *         &lt;element name="GetVersionNumberResult" type="{http://Checkmarx.com}CxWSCxVersionResponse" minOccurs="0"/>
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
    "getVersionNumberResult"
})
@XmlRootElement(name = "GetVersionNumberResponse")
public class GetVersionNumberResponse {

    @XmlElement(name = "GetVersionNumberResult")
    protected CxWSCxVersionResponse getVersionNumberResult;

    /**
     * Gets the value of the getVersionNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSCxVersionResponse }
     *     
     */
    public CxWSCxVersionResponse getGetVersionNumberResult() {
        return getVersionNumberResult;
    }

    /**
     * Sets the value of the getVersionNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSCxVersionResponse }
     *     
     */
    public void setGetVersionNumberResult(CxWSCxVersionResponse value) {
        this.getVersionNumberResult = value;
    }

}
