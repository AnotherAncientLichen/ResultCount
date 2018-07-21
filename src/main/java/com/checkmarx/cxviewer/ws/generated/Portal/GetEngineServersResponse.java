
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
 *         &lt;element name="GetEngineServersResult" type="{http://Checkmarx.com}CxWSResponseEngineServers" minOccurs="0"/>
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
    "getEngineServersResult"
})
@XmlRootElement(name = "GetEngineServersResponse")
public class GetEngineServersResponse {

    @XmlElement(name = "GetEngineServersResult")
    protected CxWSResponseEngineServers getEngineServersResult;

    /**
     * Gets the value of the getEngineServersResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseEngineServers }
     *     
     */
    public CxWSResponseEngineServers getGetEngineServersResult() {
        return getEngineServersResult;
    }

    /**
     * Sets the value of the getEngineServersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseEngineServers }
     *     
     */
    public void setGetEngineServersResult(CxWSResponseEngineServers value) {
        this.getEngineServersResult = value;
    }

}
