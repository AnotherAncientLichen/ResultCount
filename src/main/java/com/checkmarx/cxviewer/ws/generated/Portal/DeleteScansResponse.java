
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
 *         &lt;element name="DeleteScansResult" type="{http://Checkmarx.com}CxWSResponseDeleteScans" minOccurs="0"/>
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
    "deleteScansResult"
})
@XmlRootElement(name = "DeleteScansResponse")
public class DeleteScansResponse {

    @XmlElement(name = "DeleteScansResult")
    protected CxWSResponseDeleteScans deleteScansResult;

    /**
     * Gets the value of the deleteScansResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseDeleteScans }
     *     
     */
    public CxWSResponseDeleteScans getDeleteScansResult() {
        return deleteScansResult;
    }

    /**
     * Sets the value of the deleteScansResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseDeleteScans }
     *     
     */
    public void setDeleteScansResult(CxWSResponseDeleteScans value) {
        this.deleteScansResult = value;
    }

}
