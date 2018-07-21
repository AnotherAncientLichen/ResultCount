
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSDataRetentionRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSDataRetentionRequestResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="DataRetentionRequest" type="{http://Checkmarx.com}CxWSDataRetentionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSDataRetentionRequestResponse", propOrder = {
    "dataRetentionRequest"
})
public class CxWSDataRetentionRequestResponse
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "DataRetentionRequest")
    protected CxWSDataRetentionRequest dataRetentionRequest;

    /**
     * Gets the value of the dataRetentionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSDataRetentionRequest }
     *     
     */
    public CxWSDataRetentionRequest getDataRetentionRequest() {
        return dataRetentionRequest;
    }

    /**
     * Sets the value of the dataRetentionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSDataRetentionRequest }
     *     
     */
    public void setDataRetentionRequest(CxWSDataRetentionRequest value) {
        this.dataRetentionRequest = value;
    }

}
