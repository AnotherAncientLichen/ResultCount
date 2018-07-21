
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
 *         &lt;element name="UpdateSetOfResultStateInfluenceCheckResult" type="{http://Checkmarx.com}CxWSResponseResultStateUpdate" minOccurs="0"/>
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
    "updateSetOfResultStateInfluenceCheckResult"
})
@XmlRootElement(name = "UpdateSetOfResultStateInfluenceCheckResponse")
public class UpdateSetOfResultStateInfluenceCheckResponse {

    @XmlElement(name = "UpdateSetOfResultStateInfluenceCheckResult")
    protected CxWSResponseResultStateUpdate updateSetOfResultStateInfluenceCheckResult;

    /**
     * Gets the value of the updateSetOfResultStateInfluenceCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseResultStateUpdate }
     *     
     */
    public CxWSResponseResultStateUpdate getUpdateSetOfResultStateInfluenceCheckResult() {
        return updateSetOfResultStateInfluenceCheckResult;
    }

    /**
     * Sets the value of the updateSetOfResultStateInfluenceCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseResultStateUpdate }
     *     
     */
    public void setUpdateSetOfResultStateInfluenceCheckResult(CxWSResponseResultStateUpdate value) {
        this.updateSetOfResultStateInfluenceCheckResult = value;
    }

}
