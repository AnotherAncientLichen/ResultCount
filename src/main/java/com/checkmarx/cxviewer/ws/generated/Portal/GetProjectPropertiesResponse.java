
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
 *         &lt;element name="GetProjectPropertiesResult" type="{http://Checkmarx.com}CxWSResponsProjectProperties" minOccurs="0"/>
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
    "getProjectPropertiesResult"
})
@XmlRootElement(name = "GetProjectPropertiesResponse")
public class GetProjectPropertiesResponse {

    @XmlElement(name = "GetProjectPropertiesResult")
    protected CxWSResponsProjectProperties getProjectPropertiesResult;

    /**
     * Gets the value of the getProjectPropertiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponsProjectProperties }
     *     
     */
    public CxWSResponsProjectProperties getGetProjectPropertiesResult() {
        return getProjectPropertiesResult;
    }

    /**
     * Sets the value of the getProjectPropertiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponsProjectProperties }
     *     
     */
    public void setGetProjectPropertiesResult(CxWSResponsProjectProperties value) {
        this.getProjectPropertiesResult = value;
    }

}
