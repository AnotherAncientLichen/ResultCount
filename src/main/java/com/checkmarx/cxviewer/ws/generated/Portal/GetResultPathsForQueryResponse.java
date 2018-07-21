
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
 *         &lt;element name="GetResultPathsForQueryResult" type="{http://Checkmarx.com}CxWSResponseResultPaths" minOccurs="0"/>
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
    "getResultPathsForQueryResult"
})
@XmlRootElement(name = "GetResultPathsForQueryResponse")
public class GetResultPathsForQueryResponse {

    @XmlElement(name = "GetResultPathsForQueryResult")
    protected CxWSResponseResultPaths getResultPathsForQueryResult;

    /**
     * Gets the value of the getResultPathsForQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseResultPaths }
     *     
     */
    public CxWSResponseResultPaths getGetResultPathsForQueryResult() {
        return getResultPathsForQueryResult;
    }

    /**
     * Sets the value of the getResultPathsForQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseResultPaths }
     *     
     */
    public void setGetResultPathsForQueryResult(CxWSResponseResultPaths value) {
        this.getResultPathsForQueryResult = value;
    }

}
