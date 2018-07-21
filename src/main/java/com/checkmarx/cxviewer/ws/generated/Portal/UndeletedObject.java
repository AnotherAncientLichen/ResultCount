
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndeletedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndeletedObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ErrorCode" type="{http://Checkmarx.com}UndeletedObjectCode"/>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndeletedObject", propOrder = {
    "id",
    "errorCode",
    "projectName",
    "teamPath",
    "startTime",
    "errorMessage"
})
public class UndeletedObject {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "ErrorCode", required = true)
    @XmlSchemaType(name = "string")
    protected UndeletedObjectCode errorCode;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "TeamPath")
    protected String teamPath;
    @XmlElement(name = "StartTime")
    protected double startTime;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link UndeletedObjectCode }
     *     
     */
    public UndeletedObjectCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeletedObjectCode }
     *     
     */
    public void setErrorCode(UndeletedObjectCode value) {
        this.errorCode = value;
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
     * Gets the value of the teamPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamPath() {
        return teamPath;
    }

    /**
     * Sets the value of the teamPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamPath(String value) {
        this.teamPath = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     */
    public double getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     */
    public void setStartTime(double value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
