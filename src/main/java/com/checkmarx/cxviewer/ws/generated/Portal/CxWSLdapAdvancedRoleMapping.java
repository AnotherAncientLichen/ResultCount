
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapAdvancedRoleMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSLdapAdvancedRoleMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScannerWithoutRoleAttributesGroupDnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScannerWithNotExploitableGroupDnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScannerWithDeleteGroupDnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScannerWithNotExploitableAndDeleteGroupDnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReviewerWithoutRoleAttributesGroupDnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReviewerWithSeverityStatusChangeGroupDnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSLdapAdvancedRoleMapping", propOrder = {
    "scannerWithoutRoleAttributesGroupDnList",
    "scannerWithNotExploitableGroupDnList",
    "scannerWithDeleteGroupDnList",
    "scannerWithNotExploitableAndDeleteGroupDnList",
    "reviewerWithoutRoleAttributesGroupDnList",
    "reviewerWithSeverityStatusChangeGroupDnList"
})
public class CxWSLdapAdvancedRoleMapping {

    @XmlElement(name = "ScannerWithoutRoleAttributesGroupDnList")
    protected String scannerWithoutRoleAttributesGroupDnList;
    @XmlElement(name = "ScannerWithNotExploitableGroupDnList")
    protected String scannerWithNotExploitableGroupDnList;
    @XmlElement(name = "ScannerWithDeleteGroupDnList")
    protected String scannerWithDeleteGroupDnList;
    @XmlElement(name = "ScannerWithNotExploitableAndDeleteGroupDnList")
    protected String scannerWithNotExploitableAndDeleteGroupDnList;
    @XmlElement(name = "ReviewerWithoutRoleAttributesGroupDnList")
    protected String reviewerWithoutRoleAttributesGroupDnList;
    @XmlElement(name = "ReviewerWithSeverityStatusChangeGroupDnList")
    protected String reviewerWithSeverityStatusChangeGroupDnList;

    /**
     * Gets the value of the scannerWithoutRoleAttributesGroupDnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerWithoutRoleAttributesGroupDnList() {
        return scannerWithoutRoleAttributesGroupDnList;
    }

    /**
     * Sets the value of the scannerWithoutRoleAttributesGroupDnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerWithoutRoleAttributesGroupDnList(String value) {
        this.scannerWithoutRoleAttributesGroupDnList = value;
    }

    /**
     * Gets the value of the scannerWithNotExploitableGroupDnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerWithNotExploitableGroupDnList() {
        return scannerWithNotExploitableGroupDnList;
    }

    /**
     * Sets the value of the scannerWithNotExploitableGroupDnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerWithNotExploitableGroupDnList(String value) {
        this.scannerWithNotExploitableGroupDnList = value;
    }

    /**
     * Gets the value of the scannerWithDeleteGroupDnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerWithDeleteGroupDnList() {
        return scannerWithDeleteGroupDnList;
    }

    /**
     * Sets the value of the scannerWithDeleteGroupDnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerWithDeleteGroupDnList(String value) {
        this.scannerWithDeleteGroupDnList = value;
    }

    /**
     * Gets the value of the scannerWithNotExploitableAndDeleteGroupDnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerWithNotExploitableAndDeleteGroupDnList() {
        return scannerWithNotExploitableAndDeleteGroupDnList;
    }

    /**
     * Sets the value of the scannerWithNotExploitableAndDeleteGroupDnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerWithNotExploitableAndDeleteGroupDnList(String value) {
        this.scannerWithNotExploitableAndDeleteGroupDnList = value;
    }

    /**
     * Gets the value of the reviewerWithoutRoleAttributesGroupDnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerWithoutRoleAttributesGroupDnList() {
        return reviewerWithoutRoleAttributesGroupDnList;
    }

    /**
     * Sets the value of the reviewerWithoutRoleAttributesGroupDnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerWithoutRoleAttributesGroupDnList(String value) {
        this.reviewerWithoutRoleAttributesGroupDnList = value;
    }

    /**
     * Gets the value of the reviewerWithSeverityStatusChangeGroupDnList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewerWithSeverityStatusChangeGroupDnList() {
        return reviewerWithSeverityStatusChangeGroupDnList;
    }

    /**
     * Sets the value of the reviewerWithSeverityStatusChangeGroupDnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewerWithSeverityStatusChangeGroupDnList(String value) {
        this.reviewerWithSeverityStatusChangeGroupDnList = value;
    }

}
