
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseExistsingTransportedPresetQueries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseExistsingTransportedPresetQueries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseTransportedQueries">
 *       &lt;sequence>
 *         &lt;element name="PresetNameExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PresetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseExistsingTransportedPresetQueries", propOrder = {
    "presetNameExists",
    "presetName"
})
public class CxWSResponseExistsingTransportedPresetQueries
    extends CxWSResponseTransportedQueries
{

    @XmlElement(name = "PresetNameExists")
    protected boolean presetNameExists;
    @XmlElement(name = "PresetName")
    protected String presetName;

    /**
     * Gets the value of the presetNameExists property.
     * 
     */
    public boolean isPresetNameExists() {
        return presetNameExists;
    }

    /**
     * Sets the value of the presetNameExists property.
     * 
     */
    public void setPresetNameExists(boolean value) {
        this.presetNameExists = value;
    }

    /**
     * Gets the value of the presetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetName() {
        return presetName;
    }

    /**
     * Sets the value of the presetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresetName(String value) {
        this.presetName = value;
    }

}
