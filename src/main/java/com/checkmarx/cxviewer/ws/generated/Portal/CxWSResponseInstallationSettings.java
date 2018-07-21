
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseInstallationSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseInstallationSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="InstallationSettingsList" type="{http://Checkmarx.com}ArrayOfInstallationSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseInstallationSettings", propOrder = {
    "installationSettingsList"
})
public class CxWSResponseInstallationSettings
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "InstallationSettingsList")
    protected ArrayOfInstallationSetting installationSettingsList;

    /**
     * Gets the value of the installationSettingsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstallationSetting }
     *     
     */
    public ArrayOfInstallationSetting getInstallationSettingsList() {
        return installationSettingsList;
    }

    /**
     * Sets the value of the installationSettingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstallationSetting }
     *     
     */
    public void setInstallationSettingsList(ArrayOfInstallationSetting value) {
        this.installationSettingsList = value;
    }

}
