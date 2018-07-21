
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
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PivotParams" type="{http://Checkmarx.com}CxPivotDataRequest" minOccurs="0"/>
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
    "sessionID",
    "pivotParams"
})
@XmlRootElement(name = "GetPivotData")
public class GetPivotData {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "PivotParams")
    protected CxPivotDataRequest pivotParams;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the pivotParams property.
     * 
     * @return
     *     possible object is
     *     {@link CxPivotDataRequest }
     *     
     */
    public CxPivotDataRequest getPivotParams() {
        return pivotParams;
    }

    /**
     * Sets the value of the pivotParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxPivotDataRequest }
     *     
     */
    public void setPivotParams(CxPivotDataRequest value) {
        this.pivotParams = value;
    }

}
