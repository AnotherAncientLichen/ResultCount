
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
 *         &lt;element name="ImportQueriesResult" type="{http://Checkmarx.com}CxWSImportQueriesRepsonse" minOccurs="0"/>
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
    "importQueriesResult"
})
@XmlRootElement(name = "ImportQueriesResponse")
public class ImportQueriesResponse {

    @XmlElement(name = "ImportQueriesResult")
    protected CxWSImportQueriesRepsonse importQueriesResult;

    /**
     * Gets the value of the importQueriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSImportQueriesRepsonse }
     *     
     */
    public CxWSImportQueriesRepsonse getImportQueriesResult() {
        return importQueriesResult;
    }

    /**
     * Sets the value of the importQueriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSImportQueriesRepsonse }
     *     
     */
    public void setImportQueriesResult(CxWSImportQueriesRepsonse value) {
        this.importQueriesResult = value;
    }

}
