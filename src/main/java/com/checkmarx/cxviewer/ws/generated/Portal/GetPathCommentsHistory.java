
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pathId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="labelType" type="{http://Checkmarx.com}ResultLabelTypeEnum"/>
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
    "sessionId",
    "scanId",
    "pathId",
    "labelType"
})
@XmlRootElement(name = "GetPathCommentsHistory")
public class GetPathCommentsHistory {

    protected String sessionId;
    protected long scanId;
    protected long pathId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResultLabelTypeEnum labelType;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
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
     * Gets the value of the labelType property.
     * 
     * @return
     *     possible object is
     *     {@link ResultLabelTypeEnum }
     *     
     */
    public ResultLabelTypeEnum getLabelType() {
        return labelType;
    }

    /**
     * Sets the value of the labelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultLabelTypeEnum }
     *     
     */
    public void setLabelType(ResultLabelTypeEnum value) {
        this.labelType = value;
    }

}
