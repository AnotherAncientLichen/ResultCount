
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
 *         &lt;element name="GetCompanyPropertiesResult" type="{http://Checkmarx.com}CxWsResponseCompanyProperties" minOccurs="0"/>
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
    "getCompanyPropertiesResult"
})
@XmlRootElement(name = "GetCompanyPropertiesResponse")
public class GetCompanyPropertiesResponse {

    @XmlElement(name = "GetCompanyPropertiesResult")
    protected CxWsResponseCompanyProperties getCompanyPropertiesResult;

    /**
     * Gets the value of the getCompanyPropertiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsResponseCompanyProperties }
     *     
     */
    public CxWsResponseCompanyProperties getGetCompanyPropertiesResult() {
        return getCompanyPropertiesResult;
    }

    /**
     * Sets the value of the getCompanyPropertiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsResponseCompanyProperties }
     *     
     */
    public void setGetCompanyPropertiesResult(CxWsResponseCompanyProperties value) {
        this.getCompanyPropertiesResult = value;
    }

}
