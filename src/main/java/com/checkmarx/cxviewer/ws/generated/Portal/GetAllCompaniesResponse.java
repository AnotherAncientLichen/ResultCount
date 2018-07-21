
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
 *         &lt;element name="GetAllCompaniesResult" type="{http://Checkmarx.com}CxWSResponseTeamData" minOccurs="0"/>
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
    "getAllCompaniesResult"
})
@XmlRootElement(name = "GetAllCompaniesResponse")
public class GetAllCompaniesResponse {

    @XmlElement(name = "GetAllCompaniesResult")
    protected CxWSResponseTeamData getAllCompaniesResult;

    /**
     * Gets the value of the getAllCompaniesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public CxWSResponseTeamData getGetAllCompaniesResult() {
        return getAllCompaniesResult;
    }

    /**
     * Sets the value of the getAllCompaniesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public void setGetAllCompaniesResult(CxWSResponseTeamData value) {
        this.getAllCompaniesResult = value;
    }

}
