
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSourcesContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSourcesContent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="cxWSResponseSourcesContent" type="{http://Checkmarx.com}ArrayOfCxWSResponseSourceContent" minOccurs="0"/>
 *         &lt;element name="Encode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSourcesContent", propOrder = {
    "cxWSResponseSourcesContent",
    "encode"
})
public class CxWSResponseSourcesContent
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxWSResponseSourceContent cxWSResponseSourcesContent;
    @XmlElement(name = "Encode")
    protected String encode;

    /**
     * Gets the value of the cxWSResponseSourcesContent property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResponseSourceContent }
     *     
     */
    public ArrayOfCxWSResponseSourceContent getCxWSResponseSourcesContent() {
        return cxWSResponseSourcesContent;
    }

    /**
     * Sets the value of the cxWSResponseSourcesContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResponseSourceContent }
     *     
     */
    public void setCxWSResponseSourcesContent(ArrayOfCxWSResponseSourceContent value) {
        this.cxWSResponseSourcesContent = value;
    }

    /**
     * Gets the value of the encode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncode() {
        return encode;
    }

    /**
     * Sets the value of the encode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncode(String value) {
        this.encode = value;
    }

}
