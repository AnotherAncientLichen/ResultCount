
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSystemLanguages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSystemLanguages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="list" type="{http://Checkmarx.com}ArrayOfSystemLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSystemLanguages", propOrder = {
    "list"
})
public class CxWSResponseSystemLanguages
    extends CxWSBasicRepsonse
{

    protected ArrayOfSystemLanguage list;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSystemLanguage }
     *     
     */
    public ArrayOfSystemLanguage getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSystemLanguage }
     *     
     */
    public void setList(ArrayOfSystemLanguage value) {
        this.list = value;
    }

}
