
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
 *         &lt;element name="ldapServerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionId",
    "ldapServerId",
    "searchPattern",
    "searchPatternOption"
})
@XmlRootElement(name = "GetLdapServerGroups")
public class GetLdapServerGroups {

    protected String sessionId;
    protected int ldapServerId;
    protected String searchPattern;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CxWSSearchPatternOption searchPatternOption;

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
     * Gets the value of the ldapServerId property.
     * 
     */
    public int getLdapServerId() {
        return ldapServerId;
    }

    /**
     * Sets the value of the ldapServerId property.
     * 
     */
    public void setLdapServerId(int value) {
        this.ldapServerId = value;
    }

    /**
     * Gets the value of the searchPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchPattern() {
        return searchPattern;
    }

    /**
     * Sets the value of the searchPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchPattern(String value) {
        this.searchPattern = value;
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
