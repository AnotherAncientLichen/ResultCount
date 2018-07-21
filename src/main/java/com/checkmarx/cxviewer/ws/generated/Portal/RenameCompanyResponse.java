
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
 *         &lt;element name="RenameCompanyResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "renameCompanyResult"
})
@XmlRootElement(name = "RenameCompanyResponse")
public class RenameCompanyResponse {

    @XmlElement(name = "RenameCompanyResult")
    protected CxWSBasicRepsonse renameCompanyResult;

    /**
     * Gets the value of the renameCompanyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getRenameCompanyResult() {
        return renameCompanyResult;
    }

    /**
     * Sets the value of the renameCompanyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setRenameCompanyResult(CxWSBasicRepsonse value) {
        this.renameCompanyResult = value;
    }

}
