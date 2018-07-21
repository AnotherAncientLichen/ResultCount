
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
 *         &lt;element name="GetPostScanActionListResult" type="{http://Checkmarx.com}CxWSResponseSourceActionList" minOccurs="0"/>
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
    "getPostScanActionListResult"
})
@XmlRootElement(name = "GetPostScanActionListResponse")
public class GetPostScanActionListResponse {

    @XmlElement(name = "GetPostScanActionListResult")
    protected CxWSResponseSourceActionList getPostScanActionListResult;

    /**
     * Gets the value of the getPostScanActionListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSourceActionList }
     *     
     */
    public CxWSResponseSourceActionList getGetPostScanActionListResult() {
        return getPostScanActionListResult;
    }

    /**
     * Sets the value of the getPostScanActionListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSourceActionList }
     *     
     */
    public void setGetPostScanActionListResult(CxWSResponseSourceActionList value) {
        this.getPostScanActionListResult = value;
    }

}
