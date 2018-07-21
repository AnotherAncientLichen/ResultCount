
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
 *         &lt;element name="SavePredefinedCommandsResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "savePredefinedCommandsResult"
})
@XmlRootElement(name = "SavePredefinedCommandsResponse")
public class SavePredefinedCommandsResponse {

    @XmlElement(name = "SavePredefinedCommandsResult")
    protected CxWSBasicRepsonse savePredefinedCommandsResult;

    /**
     * Gets the value of the savePredefinedCommandsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getSavePredefinedCommandsResult() {
        return savePredefinedCommandsResult;
    }

    /**
     * Sets the value of the savePredefinedCommandsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setSavePredefinedCommandsResult(CxWSBasicRepsonse value) {
        this.savePredefinedCommandsResult = value;
    }

}
