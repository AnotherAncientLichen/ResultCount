
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWsResponseSystemSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWsResponseSystemSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="SysSettings" type="{http://Checkmarx.com}SystemSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWsResponseSystemSettings", propOrder = {
    "sysSettings"
})
public class CxWsResponseSystemSettings
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "SysSettings")
    protected SystemSettings sysSettings;

    /**
     * Gets the value of the sysSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSettings }
     *     
     */
    public SystemSettings getSysSettings() {
        return sysSettings;
    }

    /**
     * Sets the value of the sysSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSettings }
     *     
     */
    public void setSysSettings(SystemSettings value) {
        this.sysSettings = value;
    }

}
