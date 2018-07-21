
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
 *         &lt;element name="AddScanResultsToProjectResult" type="{http://Checkmarx.com}CxWSResponseBasicScanData" minOccurs="0"/>
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
    "addScanResultsToProjectResult"
})
@XmlRootElement(name = "AddScanResultsToProjectResponse")
public class AddScanResultsToProjectResponse {

    @XmlElement(name = "AddScanResultsToProjectResult")
    protected CxWSResponseBasicScanData addScanResultsToProjectResult;

    /**
     * Gets the value of the addScanResultsToProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseBasicScanData }
     *     
     */
    public CxWSResponseBasicScanData getAddScanResultsToProjectResult() {
        return addScanResultsToProjectResult;
    }

    /**
     * Sets the value of the addScanResultsToProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseBasicScanData }
     *     
     */
    public void setAddScanResultsToProjectResult(CxWSResponseBasicScanData value) {
        this.addScanResultsToProjectResult = value;
    }

}
