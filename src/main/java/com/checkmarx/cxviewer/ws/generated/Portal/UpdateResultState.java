
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PathId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultLabelType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionID",
    "scanId",
    "pathId",
    "projectId",
    "remarks",
    "resultLabelType",
    "data"
})
@XmlRootElement(name = "UpdateResultState")
public class UpdateResultState {

    protected String sessionID;
    protected long scanId;
    @XmlElement(name = "PathId")
    protected long pathId;
    protected long projectId;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ResultLabelType")
    protected int resultLabelType;
    protected String data;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
     * Gets the value of the pathId property.
     * 
     */
    public long getPathId() {
        return pathId;
    }

    /**
     * Sets the value of the pathId property.
     * 
     */
    public void setPathId(long value) {
        this.pathId = value;
    }

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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the resultLabelType property.
     * 
     */
    public int getResultLabelType() {
        return resultLabelType;
    }

    /**
     * Sets the value of the resultLabelType property.
     * 
     */
    public void setResultLabelType(int value) {
        this.resultLabelType = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
