
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponceResultPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponceResultPath">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Path" type="{http://Checkmarx.com}CxWSResultPath" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponceResultPath", propOrder = {
    "path"
})
public class CxWSResponceResultPath
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Path")
    protected CxWSResultPath path;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResultPath }
     *     
     */
    public CxWSResultPath getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResultPath }
     *     
     */
    public void setPath(CxWSResultPath value) {
        this.path = value;
    }

}
