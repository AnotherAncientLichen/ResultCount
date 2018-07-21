
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
 *         &lt;element name="GetCompanyTeamsResult" type="{http://Checkmarx.com}CxWSResponseTeamData" minOccurs="0"/>
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
    "getCompanyTeamsResult"
})
@XmlRootElement(name = "GetCompanyTeamsResponse")
public class GetCompanyTeamsResponse {

    @XmlElement(name = "GetCompanyTeamsResult")
    protected CxWSResponseTeamData getCompanyTeamsResult;

    /**
     * Gets the value of the getCompanyTeamsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public CxWSResponseTeamData getGetCompanyTeamsResult() {
        return getCompanyTeamsResult;
    }

    /**
     * Sets the value of the getCompanyTeamsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public void setGetCompanyTeamsResult(CxWSResponseTeamData value) {
        this.getCompanyTeamsResult = value;
    }

}
