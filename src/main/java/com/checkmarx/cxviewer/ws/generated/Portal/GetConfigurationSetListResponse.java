
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
 *         &lt;element name="GetConfigurationSetListResult" type="{http://Checkmarx.com}CxWSResponseConfigSetList" minOccurs="0"/>
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
    "getConfigurationSetListResult"
})
@XmlRootElement(name = "GetConfigurationSetListResponse")
public class GetConfigurationSetListResponse {

    @XmlElement(name = "GetConfigurationSetListResult")
    protected CxWSResponseConfigSetList getConfigurationSetListResult;

    /**
     * Gets the value of the getConfigurationSetListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseConfigSetList }
     *     
     */
    public CxWSResponseConfigSetList getGetConfigurationSetListResult() {
        return getConfigurationSetListResult;
    }

    /**
     * Sets the value of the getConfigurationSetListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseConfigSetList }
     *     
     */
    public void setGetConfigurationSetListResult(CxWSResponseConfigSetList value) {
        this.getConfigurationSetListResult = value;
    }

}
