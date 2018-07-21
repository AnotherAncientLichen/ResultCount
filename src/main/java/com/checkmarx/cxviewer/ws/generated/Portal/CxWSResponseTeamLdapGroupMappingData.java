
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseTeamLdapGroupMappingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseTeamLdapGroupMappingData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="TeamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LdapGroups" type="{http://Checkmarx.com}ArrayOfCxWSLdapGroupMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseTeamLdapGroupMappingData", propOrder = {
    "teamId",
    "ldapGroups"
})
public class CxWSResponseTeamLdapGroupMappingData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "TeamId")
    protected String teamId;
    @XmlElement(name = "LdapGroups")
    protected ArrayOfCxWSLdapGroupMapping ldapGroups;

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamId(String value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the ldapGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *     
     */
    public ArrayOfCxWSLdapGroupMapping getLdapGroups() {
        return ldapGroups;
    }

    /**
     * Sets the value of the ldapGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *     
     */
    public void setLdapGroups(ArrayOfCxWSLdapGroupMapping value) {
        this.ldapGroups = value;
    }

}
