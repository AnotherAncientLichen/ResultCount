
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResultPathDisplayDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResultPathDisplayDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ScanDate" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *         &lt;element name="PathIds" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResultPathDisplayDetails", propOrder = {
    "projectId",
    "projectName",
    "scanId",
    "scanDate",
    "pathIds"
})
public class CxWSResultPathDisplayDetails {

    @XmlElement(name = "ProjectId")
    protected long projectId;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "ScanId")
    protected long scanId;
    @XmlElement(name = "ScanDate")
    protected CxDateTime scanDate;
    @XmlElement(name = "PathIds")
    protected ArrayOfLong pathIds;

    /**
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the scanId property.
     * 
     */
    public long getScanId() {
        return scanId;
    }

    /**
     * Sets the value of the scanId property.
     * 
     */
    public void setScanId(long value) {
        this.scanId = value;
    }

    /**
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setScanDate(CxDateTime value) {
        this.scanDate = value;
    }

    /**
     * Gets the value of the pathIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getPathIds() {
        return pathIds;
    }

    /**
     * Sets the value of the pathIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setPathIds(ArrayOfLong value) {
        this.pathIds = value;
    }

}
