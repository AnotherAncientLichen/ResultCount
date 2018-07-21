
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
 *         &lt;element name="RunScanAndAddToProjectResult" type="{http://Checkmarx.com}CxWSResponseRunID" minOccurs="0"/>
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
    "runScanAndAddToProjectResult"
})
@XmlRootElement(name = "RunScanAndAddToProjectResponse")
public class RunScanAndAddToProjectResponse {

    @XmlElement(name = "RunScanAndAddToProjectResult")
    protected CxWSResponseRunID runScanAndAddToProjectResult;

    /**
     * Gets the value of the runScanAndAddToProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseRunID }
     *     
     */
    public CxWSResponseRunID getRunScanAndAddToProjectResult() {
        return runScanAndAddToProjectResult;
    }

    /**
     * Sets the value of the runScanAndAddToProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseRunID }
     *     
     */
    public void setRunScanAndAddToProjectResult(CxWSResponseRunID value) {
        this.runScanAndAddToProjectResult = value;
    }

}
