
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
 *         &lt;element name="GetServerLanguageListResult" type="{http://Checkmarx.com}CxWSResponseSystemLanguages" minOccurs="0"/>
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
    "getServerLanguageListResult"
})
@XmlRootElement(name = "GetServerLanguageListResponse")
public class GetServerLanguageListResponse {

    @XmlElement(name = "GetServerLanguageListResult")
    protected CxWSResponseSystemLanguages getServerLanguageListResult;

    /**
     * Gets the value of the getServerLanguageListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSystemLanguages }
     *     
     */
    public CxWSResponseSystemLanguages getGetServerLanguageListResult() {
        return getServerLanguageListResult;
    }

    /**
     * Sets the value of the getServerLanguageListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSystemLanguages }
     *     
     */
    public void setGetServerLanguageListResult(CxWSResponseSystemLanguages value) {
        this.getServerLanguageListResult = value;
    }

}
