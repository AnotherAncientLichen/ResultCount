
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseCache complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseCache">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Cache" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseCache", propOrder = {
    "cache"
})
public class CxWSResponseCache
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Cache")
    protected byte[] cache;

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCache(byte[] value) {
        this.cache = value;
    }

}
