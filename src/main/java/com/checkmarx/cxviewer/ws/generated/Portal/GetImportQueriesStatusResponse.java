
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
 *         &lt;element name="GetImportQueriesStatusResult" type="{http://Checkmarx.com}CxWSImportQueriesRepsonse" minOccurs="0"/>
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
    "getImportQueriesStatusResult"
})
@XmlRootElement(name = "GetImportQueriesStatusResponse")
public class GetImportQueriesStatusResponse {

    @XmlElement(name = "GetImportQueriesStatusResult")
    protected CxWSImportQueriesRepsonse getImportQueriesStatusResult;

    /**
     * Gets the value of the getImportQueriesStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSImportQueriesRepsonse }
     *     
     */
    public CxWSImportQueriesRepsonse getGetImportQueriesStatusResult() {
        return getImportQueriesStatusResult;
    }

    /**
     * Sets the value of the getImportQueriesStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSImportQueriesRepsonse }
     *     
     */
    public void setGetImportQueriesStatusResult(CxWSImportQueriesRepsonse value) {
        this.getImportQueriesStatusResult = value;
    }

}
