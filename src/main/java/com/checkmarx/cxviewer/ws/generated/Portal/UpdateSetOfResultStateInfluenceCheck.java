
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="resultsStates" type="{http://Checkmarx.com}ArrayOfResultStateData" minOccurs="0"/>
 *         &lt;element name="checkPathInfluence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "resultsStates",
    "checkPathInfluence"
})
@XmlRootElement(name = "UpdateSetOfResultStateInfluenceCheck")
public class UpdateSetOfResultStateInfluenceCheck {

    protected String sessionID;
    protected ArrayOfResultStateData resultsStates;
    protected boolean checkPathInfluence;

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
     * Gets the value of the resultsStates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultStateData }
     *     
     */
    public ArrayOfResultStateData getResultsStates() {
        return resultsStates;
    }

    /**
     * Sets the value of the resultsStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultStateData }
     *     
     */
    public void setResultsStates(ArrayOfResultStateData value) {
        this.resultsStates = value;
    }

    /**
     * Gets the value of the checkPathInfluence property.
     * 
     */
    public boolean isCheckPathInfluence() {
        return checkPathInfluence;
    }

    /**
     * Sets the value of the checkPathInfluence property.
     * 
     */
    public void setCheckPathInfluence(boolean value) {
        this.checkPathInfluence = value;
    }

}
