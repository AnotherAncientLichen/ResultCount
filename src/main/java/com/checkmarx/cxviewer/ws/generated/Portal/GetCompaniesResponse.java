
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
 *         &lt;element name="GetCompaniesResult" type="{http://Checkmarx.com}CxWSResponseGroupList" minOccurs="0"/>
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
    "getCompaniesResult"
})
@XmlRootElement(name = "GetCompaniesResponse")
public class GetCompaniesResponse {

    @XmlElement(name = "GetCompaniesResult")
    protected CxWSResponseGroupList getCompaniesResult;

    /**
     * Gets the value of the getCompaniesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseGroupList }
     *     
     */
    public CxWSResponseGroupList getGetCompaniesResult() {
        return getCompaniesResult;
    }

    /**
     * Sets the value of the getCompaniesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseGroupList }
     *     
     */
    public void setGetCompaniesResult(CxWSResponseGroupList value) {
        this.getCompaniesResult = value;
    }

}
