
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
 *         &lt;element name="GetAllSPsResult" type="{http://Checkmarx.com}CxWSResponseTeamData" minOccurs="0"/>
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
    "getAllSPsResult"
})
@XmlRootElement(name = "GetAllSPsResponse")
public class GetAllSPsResponse {

    @XmlElement(name = "GetAllSPsResult")
    protected CxWSResponseTeamData getAllSPsResult;

    /**
     * Gets the value of the getAllSPsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public CxWSResponseTeamData getGetAllSPsResult() {
        return getAllSPsResult;
    }

    /**
     * Sets the value of the getAllSPsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseTeamData }
     *     
     */
    public void setGetAllSPsResult(CxWSResponseTeamData value) {
        this.getAllSPsResult = value;
    }

}
