
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
 *         &lt;element name="GetWidgetFiltersResult" type="{http://Checkmarx.com}CxWSResponseJSONData" minOccurs="0"/>
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
    "getWidgetFiltersResult"
})
@XmlRootElement(name = "GetWidgetFiltersResponse")
public class GetWidgetFiltersResponse {

    @XmlElement(name = "GetWidgetFiltersResult")
    protected CxWSResponseJSONData getWidgetFiltersResult;

    /**
     * Gets the value of the getWidgetFiltersResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseJSONData }
     *     
     */
    public CxWSResponseJSONData getGetWidgetFiltersResult() {
        return getWidgetFiltersResult;
    }

    /**
     * Sets the value of the getWidgetFiltersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseJSONData }
     *     
     */
    public void setGetWidgetFiltersResult(CxWSResponseJSONData value) {
        this.getWidgetFiltersResult = value;
    }

}
