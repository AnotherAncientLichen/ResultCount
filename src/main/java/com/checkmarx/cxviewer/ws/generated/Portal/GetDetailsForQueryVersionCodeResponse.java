
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
 *         &lt;element name="GetDetailsForQueryVersionCodeResult" type="{http://Checkmarx.com}CxWSQueryVersionDetailsResponse" minOccurs="0"/>
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
    "getDetailsForQueryVersionCodeResult"
})
@XmlRootElement(name = "GetDetailsForQueryVersionCodeResponse")
public class GetDetailsForQueryVersionCodeResponse {

    @XmlElement(name = "GetDetailsForQueryVersionCodeResult")
    protected CxWSQueryVersionDetailsResponse getDetailsForQueryVersionCodeResult;

    /**
     * Gets the value of the getDetailsForQueryVersionCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSQueryVersionDetailsResponse }
     *     
     */
    public CxWSQueryVersionDetailsResponse getGetDetailsForQueryVersionCodeResult() {
        return getDetailsForQueryVersionCodeResult;
    }

    /**
     * Sets the value of the getDetailsForQueryVersionCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSQueryVersionDetailsResponse }
     *     
     */
    public void setGetDetailsForQueryVersionCodeResult(CxWSQueryVersionDetailsResponse value) {
        this.getDetailsForQueryVersionCodeResult = value;
    }

}
