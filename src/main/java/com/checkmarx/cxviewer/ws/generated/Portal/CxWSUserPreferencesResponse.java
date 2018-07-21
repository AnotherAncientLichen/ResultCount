
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSUserPreferencesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSUserPreferencesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Preferences" type="{http://Checkmarx.com}ArrayOfCxUserPreferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSUserPreferencesResponse", propOrder = {
    "preferences"
})
public class CxWSUserPreferencesResponse
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Preferences")
    protected ArrayOfCxUserPreferences preferences;

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxUserPreferences }
     *     
     */
    public ArrayOfCxUserPreferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxUserPreferences }
     *     
     */
    public void setPreferences(ArrayOfCxUserPreferences value) {
        this.preferences = value;
    }

}
