
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSDataRetentionStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSDataRetentionStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://Checkmarx.com}CxDataRetentionStatus"/>
 *         &lt;element name="CurrentProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StageError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSDataRetentionStatusResponse", propOrder = {
    "status",
    "currentProgress",
    "totalProgress",
    "stageError"
})
public class CxWSDataRetentionStatusResponse
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected CxDataRetentionStatus status;
    @XmlElement(name = "CurrentProgress", required = true, type = Integer.class, nillable = true)
    protected Integer currentProgress;
    @XmlElement(name = "TotalProgress", required = true, type = Integer.class, nillable = true)
    protected Integer totalProgress;
    @XmlElement(name = "StageError")
    protected String stageError;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CxDataRetentionStatus }
     *     
     */
    public CxDataRetentionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDataRetentionStatus }
     *     
     */
    public void setStatus(CxDataRetentionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the currentProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentProgress() {
        return currentProgress;
    }

    /**
     * Sets the value of the currentProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentProgress(Integer value) {
        this.currentProgress = value;
    }

    /**
     * Gets the value of the totalProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalProgress() {
        return totalProgress;
    }

    /**
     * Sets the value of the totalProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalProgress(Integer value) {
        this.totalProgress = value;
    }

    /**
     * Gets the value of the stageError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageError() {
        return stageError;
    }

    /**
     * Sets the value of the stageError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageError(String value) {
        this.stageError = value;
    }

}
