
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
 *         &lt;element name="ResultId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PathId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="falsePositiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "resultId",
    "pathId",
    "projectId",
    "falsePositiveFlag"
})
@XmlRootElement(name = "SetFalsePositiveFlag")
public class SetFalsePositiveFlag {

    protected String sessionID;
    @XmlElement(name = "ResultId")
    protected long resultId;
    @XmlElement(name = "PathId")
    protected long pathId;
    protected long projectId;
    protected boolean falsePositiveFlag;

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
     * Gets the value of the resultId property.
     * 
     */
    public long getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     */
    public void setResultId(long value) {
        this.resultId = value;
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
     * Gets the value of the falsePositiveFlag property.
     * 
     */
    public boolean isFalsePositiveFlag() {
        return falsePositiveFlag;
    }

    /**
     * Sets the value of the falsePositiveFlag property.
     * 
     */
    public void setFalsePositiveFlag(boolean value) {
        this.falsePositiveFlag = value;
    }

}
