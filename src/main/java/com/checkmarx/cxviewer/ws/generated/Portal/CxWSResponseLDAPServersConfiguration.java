
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseLDAPServersConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseLDAPServersConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="serverConfigs" type="{http://Checkmarx.com}ArrayOfCxWSLdapServerConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseLDAPServersConfiguration", propOrder = {
    "serverConfigs"
})
public class CxWSResponseLDAPServersConfiguration
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxWSLdapServerConfiguration serverConfigs;

    /**
     * Gets the value of the serverConfigs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSLdapServerConfiguration }
     *     
     */
    public ArrayOfCxWSLdapServerConfiguration getServerConfigs() {
        return serverConfigs;
    }

    /**
     * Sets the value of the serverConfigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSLdapServerConfiguration }
     *     
     */
    public void setServerConfigs(ArrayOfCxWSLdapServerConfiguration value) {
        this.serverConfigs = value;
    }

}
