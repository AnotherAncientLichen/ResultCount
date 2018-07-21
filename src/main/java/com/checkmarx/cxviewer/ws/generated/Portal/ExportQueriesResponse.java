
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
 *         &lt;element name="ExportQueriesResult" type="{http://Checkmarx.com}CxWSResponseQueries" minOccurs="0"/>
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
    "exportQueriesResult"
})
@XmlRootElement(name = "ExportQueriesResponse")
public class ExportQueriesResponse {

    @XmlElement(name = "ExportQueriesResult")
    protected CxWSResponseQueries exportQueriesResult;

    /**
     * Gets the value of the exportQueriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseQueries }
     *     
     */
    public CxWSResponseQueries getExportQueriesResult() {
        return exportQueriesResult;
    }

    /**
     * Sets the value of the exportQueriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseQueries }
     *     
     */
    public void setExportQueriesResult(CxWSResponseQueries value) {
        this.exportQueriesResult = value;
    }

}
