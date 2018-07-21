
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
 *         &lt;element name="ImportPresetResult" type="{http://Checkmarx.com}CxWSImportQueriesRepsonse" minOccurs="0"/>
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
    "importPresetResult"
})
@XmlRootElement(name = "ImportPresetResponse")
public class ImportPresetResponse {

    @XmlElement(name = "ImportPresetResult")
    protected CxWSImportQueriesRepsonse importPresetResult;

    /**
     * Gets the value of the importPresetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSImportQueriesRepsonse }
     *     
     */
    public CxWSImportQueriesRepsonse getImportPresetResult() {
        return importPresetResult;
    }

    /**
     * Sets the value of the importPresetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSImportQueriesRepsonse }
     *     
     */
    public void setImportPresetResult(CxWSImportQueriesRepsonse value) {
        this.importPresetResult = value;
    }

}
