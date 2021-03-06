
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
 *         &lt;element name="BranchProjectResult" type="{http://Checkmarx.com}CxWSResponseRunID" minOccurs="0"/>
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
    "branchProjectResult"
})
@XmlRootElement(name = "BranchProjectResponse")
public class BranchProjectResponse {

    @XmlElement(name = "BranchProjectResult")
    protected CxWSResponseRunID branchProjectResult;

    /**
     * Gets the value of the branchProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseRunID }
     *     
     */
    public CxWSResponseRunID getBranchProjectResult() {
        return branchProjectResult;
    }

    /**
     * Sets the value of the branchProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseRunID }
     *     
     */
    public void setBranchProjectResult(CxWSResponseRunID value) {
        this.branchProjectResult = value;
    }

}
