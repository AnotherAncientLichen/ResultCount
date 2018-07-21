
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CxWSDataRetentionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSDataRetentionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InitiatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestTimeLimitation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Stage" type="{http://Checkmarx.com}CxDataRetentionStatus"/>
 *         &lt;element name="CurrentProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StageError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OriginalConfiguration" type="{http://Checkmarx.com}CxDataRetentionConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSDataRetentionRequest", propOrder = {
    "id",
    "requestDate",
    "requestEndDate",
    "initiatorName",
    "requestTimeLimitation",
    "stage",
    "currentProgress",
    "totalProgress",
    "stageError",
    "isDone",
    "originalConfiguration"
})
public class CxWSDataRetentionRequest {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "RequestDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "RequestEndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestEndDate;
    @XmlElement(name = "InitiatorName")
    protected String initiatorName;
    @XmlElement(name = "RequestTimeLimitation", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTimeLimitation;
    @XmlElement(name = "Stage", required = true)
    @XmlSchemaType(name = "string")
    protected CxDataRetentionStatus stage;
    @XmlElement(name = "CurrentProgress", required = true, type = Integer.class, nillable = true)
    protected Integer currentProgress;
    @XmlElement(name = "TotalProgress", required = true, type = Integer.class, nillable = true)
    protected Integer totalProgress;
    @XmlElement(name = "StageError")
    protected String stageError;
    @XmlElement(name = "IsDone")
    protected boolean isDone;
    @XmlElement(name = "OriginalConfiguration")
    protected CxDataRetentionConfiguration originalConfiguration;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requestEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestEndDate() {
        return requestEndDate;
    }

    /**
     * Sets the value of the requestEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestEndDate(XMLGregorianCalendar value) {
        this.requestEndDate = value;
    }

    /**
     * Gets the value of the initiatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * Sets the value of the initiatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorName(String value) {
        this.initiatorName = value;
    }

    /**
     * Gets the value of the requestTimeLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTimeLimitation() {
        return requestTimeLimitation;
    }

    /**
     * Sets the value of the requestTimeLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTimeLimitation(XMLGregorianCalendar value) {
        this.requestTimeLimitation = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link CxDataRetentionStatus }
     *     
     */
    public CxDataRetentionStatus getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDataRetentionStatus }
     *     
     */
    public void setStage(CxDataRetentionStatus value) {
        this.stage = value;
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

    /**
     * Gets the value of the isDone property.
     * 
     */
    public boolean isIsDone() {
        return isDone;
    }

    /**
     * Sets the value of the isDone property.
     * 
     */
    public void setIsDone(boolean value) {
        this.isDone = value;
    }

    /**
     * Gets the value of the originalConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CxDataRetentionConfiguration }
     *     
     */
    public CxDataRetentionConfiguration getOriginalConfiguration() {
        return originalConfiguration;
    }

    /**
     * Sets the value of the originalConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDataRetentionConfiguration }
     *     
     */
    public void setOriginalConfiguration(CxDataRetentionConfiguration value) {
        this.originalConfiguration = value;
    }

}
