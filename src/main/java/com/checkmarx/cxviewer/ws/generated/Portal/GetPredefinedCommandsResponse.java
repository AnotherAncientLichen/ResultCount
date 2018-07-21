
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
 *         &lt;element name="GetPredefinedCommandsResult" type="{http://Checkmarx.com}CxWSResponsePredefinedCommands" minOccurs="0"/>
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
    "getPredefinedCommandsResult"
})
@XmlRootElement(name = "GetPredefinedCommandsResponse")
public class GetPredefinedCommandsResponse {

    @XmlElement(name = "GetPredefinedCommandsResult")
    protected CxWSResponsePredefinedCommands getPredefinedCommandsResult;

    /**
     * Gets the value of the getPredefinedCommandsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponsePredefinedCommands }
     *     
     */
    public CxWSResponsePredefinedCommands getGetPredefinedCommandsResult() {
        return getPredefinedCommandsResult;
    }

    /**
     * Sets the value of the getPredefinedCommandsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponsePredefinedCommands }
     *     
     */
    public void setGetPredefinedCommandsResult(CxWSResponsePredefinedCommands value) {
        this.getPredefinedCommandsResult = value;
    }

}
