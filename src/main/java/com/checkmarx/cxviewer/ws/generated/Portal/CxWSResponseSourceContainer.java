
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSourceContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSourceContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="sourceCodeContainer" type="{http://Checkmarx.com}LocalCodeContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSourceContainer", propOrder = {
    "sourceCodeContainer"
})
public class CxWSResponseSourceContainer
    extends CxWSBasicRepsonse
{

    protected LocalCodeContainer sourceCodeContainer;

    /**
     * Gets the value of the sourceCodeContainer property.
     * 
     * @return
     *     possible object is
     *     {@link LocalCodeContainer }
     *     
     */
    public LocalCodeContainer getSourceCodeContainer() {
        return sourceCodeContainer;
    }

    /**
     * Sets the value of the sourceCodeContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalCodeContainer }
     *     
     */
    public void setSourceCodeContainer(LocalCodeContainer value) {
        this.sourceCodeContainer = value;
    }

}
