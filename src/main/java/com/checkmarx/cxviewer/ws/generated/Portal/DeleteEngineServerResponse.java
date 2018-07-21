
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
 *         &lt;element name="DeleteEngineServerResult" type="{http://Checkmarx.com}CxWSResponseEngineServerId" minOccurs="0"/>
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
    "deleteEngineServerResult"
})
@XmlRootElement(name = "DeleteEngineServerResponse")
public class DeleteEngineServerResponse {

    @XmlElement(name = "DeleteEngineServerResult")
    protected CxWSResponseEngineServerId deleteEngineServerResult;

    /**
     * Gets the value of the deleteEngineServerResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseEngineServerId }
     *     
     */
    public CxWSResponseEngineServerId getDeleteEngineServerResult() {
        return deleteEngineServerResult;
    }

    /**
     * Sets the value of the deleteEngineServerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseEngineServerId }
     *     
     */
    public void setDeleteEngineServerResult(CxWSResponseEngineServerId value) {
        this.deleteEngineServerResult = value;
    }

}
