
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsePivotLayouts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsePivotLayouts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Layouts" type="{http://Checkmarx.com}ArrayOfCxPivotLayout" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsePivotLayouts", propOrder = {
    "layouts"
})
public class CxWSResponsePivotLayouts
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Layouts")
    protected ArrayOfCxPivotLayout layouts;

    /**
     * Gets the value of the layouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxPivotLayout }
     *     
     */
    public ArrayOfCxPivotLayout getLayouts() {
        return layouts;
    }

    /**
     * Sets the value of the layouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxPivotLayout }
     *     
     */
    public void setLayouts(ArrayOfCxPivotLayout value) {
        this.layouts = value;
    }

}
