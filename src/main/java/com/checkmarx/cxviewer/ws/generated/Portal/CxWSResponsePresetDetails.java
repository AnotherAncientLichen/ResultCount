
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsePresetDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsePresetDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="preset" type="{http://Checkmarx.com}CxPresetDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsePresetDetails", propOrder = {
    "preset"
})
public class CxWSResponsePresetDetails
    extends CxWSBasicRepsonse
{

    protected CxPresetDetails preset;

    /**
     * Gets the value of the preset property.
     * 
     * @return
     *     possible object is
     *     {@link CxPresetDetails }
     *     
     */
    public CxPresetDetails getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxPresetDetails }
     *     
     */
    public void setPreset(CxPresetDetails value) {
        this.preset = value;
    }

}
