
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
 *         &lt;element name="CountLinesResult" type="{http://Checkmarx.com}CxWSResponseCountLines" minOccurs="0"/>
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
    "countLinesResult"
})
@XmlRootElement(name = "CountLinesResponse")
public class CountLinesResponse {

    @XmlElement(name = "CountLinesResult")
    protected CxWSResponseCountLines countLinesResult;

    /**
     * Gets the value of the countLinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseCountLines }
     *     
     */
    public CxWSResponseCountLines getCountLinesResult() {
        return countLinesResult;
    }

    /**
     * Sets the value of the countLinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseCountLines }
     *     
     */
    public void setCountLinesResult(CxWSResponseCountLines value) {
        this.countLinesResult = value;
    }

}
