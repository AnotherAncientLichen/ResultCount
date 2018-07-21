
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
 *         &lt;element name="UpdateEngineServerResult" type="{http://Checkmarx.com}CxWSResponseEngineServerId" minOccurs="0"/>
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
    "updateEngineServerResult"
})
@XmlRootElement(name = "UpdateEngineServerResponse")
public class UpdateEngineServerResponse {

    @XmlElement(name = "UpdateEngineServerResult")
    protected CxWSResponseEngineServerId updateEngineServerResult;

    /**
     * Gets the value of the updateEngineServerResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseEngineServerId }
     *     
     */
    public CxWSResponseEngineServerId getUpdateEngineServerResult() {
        return updateEngineServerResult;
    }

    /**
     * Sets the value of the updateEngineServerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseEngineServerId }
     *     
     */
    public void setUpdateEngineServerResult(CxWSResponseEngineServerId value) {
        this.updateEngineServerResult = value;
    }

}
