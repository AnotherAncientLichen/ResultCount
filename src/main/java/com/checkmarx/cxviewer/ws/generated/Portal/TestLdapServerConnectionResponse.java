
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
 *         &lt;element name="TestLdapServerConnectionResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "testLdapServerConnectionResult"
})
@XmlRootElement(name = "TestLdapServerConnectionResponse")
public class TestLdapServerConnectionResponse {

    @XmlElement(name = "TestLdapServerConnectionResult")
    protected CxWSBasicRepsonse testLdapServerConnectionResult;

    /**
     * Gets the value of the testLdapServerConnectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getTestLdapServerConnectionResult() {
        return testLdapServerConnectionResult;
    }

    /**
     * Sets the value of the testLdapServerConnectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setTestLdapServerConnectionResult(CxWSBasicRepsonse value) {
        this.testLdapServerConnectionResult = value;
    }

}
