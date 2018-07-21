
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
 *         &lt;element name="UploadProjectWithDefaultSettingsResult" type="{http://Checkmarx.com}CxWSResponseSourceID" minOccurs="0"/>
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
    "uploadProjectWithDefaultSettingsResult"
})
@XmlRootElement(name = "UploadProjectWithDefaultSettingsResponse")
public class UploadProjectWithDefaultSettingsResponse {

    @XmlElement(name = "UploadProjectWithDefaultSettingsResult")
    protected CxWSResponseSourceID uploadProjectWithDefaultSettingsResult;

    /**
     * Gets the value of the uploadProjectWithDefaultSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSourceID }
     *     
     */
    public CxWSResponseSourceID getUploadProjectWithDefaultSettingsResult() {
        return uploadProjectWithDefaultSettingsResult;
    }

    /**
     * Sets the value of the uploadProjectWithDefaultSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSourceID }
     *     
     */
    public void setUploadProjectWithDefaultSettingsResult(CxWSResponseSourceID value) {
        this.uploadProjectWithDefaultSettingsResult = value;
    }

}
