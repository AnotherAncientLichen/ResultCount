
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_SearchPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchPatternOption" type="{http://Checkmarx.com}CxWSSearchPatternOption"/>
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
    "domain",
    "iSearchPattern",
    "searchPatternOption"
})
@XmlRootElement(name = "GetAllUsersFromUserDirectory")
public class GetAllUsersFromUserDirectory {

    protected String sessionID;
    protected String domain;
    @XmlElement(name = "i_SearchPattern")
    protected String iSearchPattern;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CxWSSearchPatternOption searchPatternOption;

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
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the iSearchPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISearchPattern() {
        return iSearchPattern;
    }

    /**
     * Sets the value of the iSearchPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISearchPattern(String value) {
        this.iSearchPattern = value;
    }

    /**
     * Gets the value of the searchPatternOption property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSSearchPatternOption }
     *     
     */
    public CxWSSearchPatternOption getSearchPatternOption() {
        return searchPatternOption;
    }

    /**
     * Sets the value of the searchPatternOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSSearchPatternOption }
     *     
     */
    public void setSearchPatternOption(CxWSSearchPatternOption value) {
        this.searchPatternOption = value;
    }

}
