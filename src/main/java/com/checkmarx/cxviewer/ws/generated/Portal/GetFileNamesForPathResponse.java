
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
 *         &lt;element name="GetFileNamesForPathResult" type="{http://Checkmarx.com}CxWSResponceFileNames" minOccurs="0"/>
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
    "getFileNamesForPathResult"
})
@XmlRootElement(name = "GetFileNamesForPathResponse")
public class GetFileNamesForPathResponse {

    @XmlElement(name = "GetFileNamesForPathResult")
    protected CxWSResponceFileNames getFileNamesForPathResult;

    /**
     * Gets the value of the getFileNamesForPathResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponceFileNames }
     *     
     */
    public CxWSResponceFileNames getGetFileNamesForPathResult() {
        return getFileNamesForPathResult;
    }

    /**
     * Sets the value of the getFileNamesForPathResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponceFileNames }
     *     
     */
    public void setGetFileNamesForPathResult(CxWSResponceFileNames value) {
        this.getFileNamesForPathResult = value;
    }

}
