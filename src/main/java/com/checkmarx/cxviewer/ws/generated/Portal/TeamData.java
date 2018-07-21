
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Team" type="{http://Checkmarx.com}Group" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://Checkmarx.com}Group" minOccurs="0"/>
 *         &lt;element name="ServiceProvider" type="{http://Checkmarx.com}Group" minOccurs="0"/>
 *         &lt;element name="LdapGroupMappings" type="{http://Checkmarx.com}ArrayOfCxWSLdapGroupMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamData", propOrder = {
    "team",
    "company",
    "serviceProvider",
    "ldapGroupMappings"
})
public class TeamData {

    @XmlElement(name = "Team")
    protected Group team;
    @XmlElement(name = "Company")
    protected Group company;
    @XmlElement(name = "ServiceProvider")
    protected Group serviceProvider;
    @XmlElement(name = "LdapGroupMappings")
    protected ArrayOfCxWSLdapGroupMapping ldapGroupMappings;

    /**
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setTeam(Group value) {
        this.team = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setCompany(Group value) {
        this.company = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setServiceProvider(Group value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the ldapGroupMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *     
     */
    public ArrayOfCxWSLdapGroupMapping getLdapGroupMappings() {
        return ldapGroupMappings;
    }

    /**
     * Sets the value of the ldapGroupMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *     
     */
    public void setLdapGroupMappings(ArrayOfCxWSLdapGroupMapping value) {
        this.ldapGroupMappings = value;
    }

}
