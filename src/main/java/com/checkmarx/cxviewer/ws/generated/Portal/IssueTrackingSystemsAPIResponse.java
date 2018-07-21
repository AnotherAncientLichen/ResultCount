
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
 *         &lt;element name="IssueTrackingSystemsAPIResult" type="{http://Checkmarx.com}CxWSIssueTrackingSystemResponse" minOccurs="0"/>
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
    "issueTrackingSystemsAPIResult"
})
@XmlRootElement(name = "IssueTrackingSystemsAPIResponse")
public class IssueTrackingSystemsAPIResponse {

    @XmlElement(name = "IssueTrackingSystemsAPIResult")
    protected CxWSIssueTrackingSystemResponse issueTrackingSystemsAPIResult;

    /**
     * Gets the value of the issueTrackingSystemsAPIResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSIssueTrackingSystemResponse }
     *     
     */
    public CxWSIssueTrackingSystemResponse getIssueTrackingSystemsAPIResult() {
        return issueTrackingSystemsAPIResult;
    }

    /**
     * Sets the value of the issueTrackingSystemsAPIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSIssueTrackingSystemResponse }
     *     
     */
    public void setIssueTrackingSystemsAPIResult(CxWSIssueTrackingSystemResponse value) {
        this.issueTrackingSystemsAPIResult = value;
    }

}
