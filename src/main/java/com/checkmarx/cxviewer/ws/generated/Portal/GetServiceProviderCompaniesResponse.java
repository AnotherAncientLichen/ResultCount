
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
 *         &lt;element name="GetServiceProviderCompaniesResult" type="{http://Checkmarx.com}CxWSResponseTeamData" minOccurs="0"/>
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
    "getServiceProviderCompaniesResult"
})
@XmlRootElement(name = "GetServiceProviderCompaniesResponse")
public class GetServiceProviderCompaniesResponse {

    @XmlElement(name = "GetServiceProviderCompaniesResult")
    protected CxWSResponseTeamData getServiceProviderCompaniesResult;

    /**
     * Gets the value of the getServiceProviderCompaniesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public CxWSResponseTeamData getGetServiceProviderCompaniesResult() {
        return getServiceProviderCompaniesResult;
    }

    /**
     * Sets the value of the getServiceProviderCompaniesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public void setGetServiceProviderCompaniesResult(CxWSResponseTeamData value) {
        this.getServiceProviderCompaniesResult = value;
    }

}