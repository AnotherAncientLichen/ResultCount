
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseEngineServerId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseEngineServerId">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="isContinuousRange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="continuousRangeWarningMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseEngineServerId", propOrder = {
    "id",
    "isContinuousRange",
    "continuousRangeWarningMessage"
})
public class CxWSResponseEngineServerId
    extends CxWSBasicRepsonse
{

    protected long id;
    protected boolean isContinuousRange;
    protected String continuousRangeWarningMessage;

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
     * Gets the value of the isContinuousRange property.
     * 
     */
    public boolean isIsContinuousRange() {
        return isContinuousRange;
    }

    /**
     * Sets the value of the isContinuousRange property.
     * 
     */
    public void setIsContinuousRange(boolean value) {
        this.isContinuousRange = value;
    }

    /**
     * Gets the value of the continuousRangeWarningMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinuousRangeWarningMessage() {
        return continuousRangeWarningMessage;
    }

    /**
     * Sets the value of the continuousRangeWarningMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinuousRangeWarningMessage(String value) {
        this.continuousRangeWarningMessage = value;
    }

}
