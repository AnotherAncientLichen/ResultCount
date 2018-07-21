
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
 *         &lt;element name="GetProjectScannedDisplayDataResult" type="{http://Checkmarx.com}CxWSResponseProjectScannedDisplayData" minOccurs="0"/>
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
    "getProjectScannedDisplayDataResult"
})
@XmlRootElement(name = "GetProjectScannedDisplayDataResponse")
public class GetProjectScannedDisplayDataResponse {

    @XmlElement(name = "GetProjectScannedDisplayDataResult")
    protected CxWSResponseProjectScannedDisplayData getProjectScannedDisplayDataResult;

    /**
     * Gets the value of the getProjectScannedDisplayDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProjectScannedDisplayData }
     *     
     */
    public CxWSResponseProjectScannedDisplayData getGetProjectScannedDisplayDataResult() {
        return getProjectScannedDisplayDataResult;
    }

    /**
     * Sets the value of the getProjectScannedDisplayDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProjectScannedDisplayData }
     *     
     */
    public void setGetProjectScannedDisplayDataResult(CxWSResponseProjectScannedDisplayData value) {
        this.getProjectScannedDisplayDataResult = value;
    }

}
