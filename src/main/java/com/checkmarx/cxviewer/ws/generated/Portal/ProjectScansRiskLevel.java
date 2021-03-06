
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectScansRiskLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectScansRiskLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScanRiskParams" type="{http://Checkmarx.com}ScanRiskLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectScansRiskLevel", propOrder = {
    "label",
    "scanRiskParams"
})
public class ProjectScansRiskLevel {

    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "ScanRiskParams")
    protected ScanRiskLevel scanRiskParams;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the scanRiskParams property.
     * 
     * @return
     *     possible object is
     *     {@link ScanRiskLevel }
     *     
     */
    public ScanRiskLevel getScanRiskParams() {
        return scanRiskParams;
    }

    /**
     * Sets the value of the scanRiskParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanRiskLevel }
     *     
     */
    public void setScanRiskParams(ScanRiskLevel value) {
        this.scanRiskParams = value;
    }

}
