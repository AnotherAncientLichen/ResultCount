
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
 *         &lt;element name="GetCompaniesListResult" type="{http://Checkmarx.com}CxWSResponseGroupList" minOccurs="0"/>
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
    "getCompaniesListResult"
})
@XmlRootElement(name = "GetCompaniesListResponse")
public class GetCompaniesListResponse {

    @XmlElement(name = "GetCompaniesListResult")
    protected CxWSResponseGroupList getCompaniesListResult;

    /**
     * Gets the value of the getCompaniesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseGroupList }
     *     
     */
    public CxWSResponseGroupList getGetCompaniesListResult() {
        return getCompaniesListResult;
    }

    /**
     * Sets the value of the getCompaniesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseGroupList }
     *     
     */
    public void setGetCompaniesListResult(CxWSResponseGroupList value) {
        this.getCompaniesListResult = value;
    }

}
