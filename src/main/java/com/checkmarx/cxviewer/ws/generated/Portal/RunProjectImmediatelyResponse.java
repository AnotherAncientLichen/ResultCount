
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
 *         &lt;element name="RunProjectImmediatelyResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "runProjectImmediatelyResult"
})
@XmlRootElement(name = "RunProjectImmediatelyResponse")
public class RunProjectImmediatelyResponse {

    @XmlElement(name = "RunProjectImmediatelyResult")
    protected CxWSBasicRepsonse runProjectImmediatelyResult;

    /**
     * Gets the value of the runProjectImmediatelyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getRunProjectImmediatelyResult() {
        return runProjectImmediatelyResult;
    }

    /**
     * Sets the value of the runProjectImmediatelyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setRunProjectImmediatelyResult(CxWSBasicRepsonse value) {
        this.runProjectImmediatelyResult = value;
    }

}
