
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsePreset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsePreset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Preset" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="OverridenCorpQueryNames" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsePreset", propOrder = {
    "preset",
    "overridenCorpQueryNames"
})
public class CxWSResponsePreset
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Preset")
    protected byte[] preset;
    @XmlElement(name = "OverridenCorpQueryNames")
    protected ArrayOfString overridenCorpQueryNames;

    /**
     * Gets the value of the preset property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPreset(byte[] value) {
        this.preset = value;
    }

    /**
     * Gets the value of the overridenCorpQueryNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOverridenCorpQueryNames() {
        return overridenCorpQueryNames;
    }

    /**
     * Sets the value of the overridenCorpQueryNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOverridenCorpQueryNames(ArrayOfString value) {
        this.overridenCorpQueryNames = value;
    }

}
