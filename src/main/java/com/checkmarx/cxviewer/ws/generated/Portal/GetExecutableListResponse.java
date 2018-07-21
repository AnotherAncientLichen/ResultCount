
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
 *         &lt;element name="GetExecutableListResult" type="{http://Checkmarx.com}CxWSResponseNameList" minOccurs="0"/>
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
    "getExecutableListResult"
})
@XmlRootElement(name = "GetExecutableListResponse")
public class GetExecutableListResponse {

    @XmlElement(name = "GetExecutableListResult")
    protected CxWSResponseNameList getExecutableListResult;

    /**
     * Gets the value of the getExecutableListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseNameList }
     *     
     */
    public CxWSResponseNameList getGetExecutableListResult() {
        return getExecutableListResult;
    }

    /**
     * Sets the value of the getExecutableListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseNameList }
     *     
     */
    public void setGetExecutableListResult(CxWSResponseNameList value) {
        this.getExecutableListResult = value;
    }

}
