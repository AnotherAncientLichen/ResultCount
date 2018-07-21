
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
 *         &lt;element name="GetAvailbleDomainNamesResult" type="{http://Checkmarx.com}CxWSResponseNameList" minOccurs="0"/>
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
    "getAvailbleDomainNamesResult"
})
@XmlRootElement(name = "GetAvailbleDomainNamesResponse")
public class GetAvailbleDomainNamesResponse {

    @XmlElement(name = "GetAvailbleDomainNamesResult")
    protected CxWSResponseNameList getAvailbleDomainNamesResult;

    /**
     * Gets the value of the getAvailbleDomainNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseNameList }
     *     
     */
    public CxWSResponseNameList getGetAvailbleDomainNamesResult() {
        return getAvailbleDomainNamesResult;
    }

    /**
     * Sets the value of the getAvailbleDomainNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseNameList }
     *     
     */
    public void setGetAvailbleDomainNamesResult(CxWSResponseNameList value) {
        this.getAvailbleDomainNamesResult = value;
    }

}
