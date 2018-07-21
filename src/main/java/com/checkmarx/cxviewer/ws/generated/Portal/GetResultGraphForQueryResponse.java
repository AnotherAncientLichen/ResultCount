
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
 *         &lt;element name="GetResultGraphForQueryResult" type="{http://Checkmarx.com}CxWSResponseResultGraph" minOccurs="0"/>
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
    "getResultGraphForQueryResult"
})
@XmlRootElement(name = "GetResultGraphForQueryResponse")
public class GetResultGraphForQueryResponse {

    @XmlElement(name = "GetResultGraphForQueryResult")
    protected CxWSResponseResultGraph getResultGraphForQueryResult;

    /**
     * Gets the value of the getResultGraphForQueryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseResultGraph }
     *     
     */
    public CxWSResponseResultGraph getGetResultGraphForQueryResult() {
        return getResultGraphForQueryResult;
    }

    /**
     * Sets the value of the getResultGraphForQueryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseResultGraph }
     *     
     */
    public void setGetResultGraphForQueryResult(CxWSResponseResultGraph value) {
        this.getResultGraphForQueryResult = value;
    }

}
