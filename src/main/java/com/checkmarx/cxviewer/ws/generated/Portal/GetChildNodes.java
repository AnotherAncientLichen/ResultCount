
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
 *         &lt;element name="pTeamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pTeamPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pTeamId",
    "pLevel",
    "pTeamPath"
})
@XmlRootElement(name = "GetChildNodes")
public class GetChildNodes {

    protected String sessionID;
    protected String pTeamId;
    protected int pLevel;
    protected String pTeamPath;

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
     * Gets the value of the pTeamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTeamId() {
        return pTeamId;
    }

    /**
     * Sets the value of the pTeamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTeamId(String value) {
        this.pTeamId = value;
    }

    /**
     * Gets the value of the pLevel property.
     * 
     */
    public int getPLevel() {
        return pLevel;
    }

    /**
     * Sets the value of the pLevel property.
     * 
     */
    public void setPLevel(int value) {
        this.pLevel = value;
    }

    /**
     * Gets the value of the pTeamPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTeamPath() {
        return pTeamPath;
    }

    /**
     * Sets the value of the pTeamPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTeamPath(String value) {
        this.pTeamPath = value;
    }

}
