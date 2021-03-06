
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
 *         &lt;element name="dataRetentionConfiguration" type="{http://Checkmarx.com}CxDataRetentionConfiguration" minOccurs="0"/>
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
    "dataRetentionConfiguration"
})
@XmlRootElement(name = "ExecuteDataRetention")
public class ExecuteDataRetention {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    protected CxDataRetentionConfiguration dataRetentionConfiguration;

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
     * Gets the value of the dataRetentionConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CxDataRetentionConfiguration }
     *     
     */
    public CxDataRetentionConfiguration getDataRetentionConfiguration() {
        return dataRetentionConfiguration;
    }

    /**
     * Sets the value of the dataRetentionConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDataRetentionConfiguration }
     *     
     */
    public void setDataRetentionConfiguration(CxDataRetentionConfiguration value) {
        this.dataRetentionConfiguration = value;
    }

}
