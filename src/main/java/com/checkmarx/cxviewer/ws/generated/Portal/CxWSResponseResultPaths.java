
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseResultPaths complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseResultPaths">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Paths" type="{http://Checkmarx.com}ArrayOfCxWSResultPath" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseResultPaths", propOrder = {
    "paths"
})
public class CxWSResponseResultPaths
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Paths")
    protected ArrayOfCxWSResultPath paths;

    /**
     * Gets the value of the paths property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResultPath }
     *     
     */
    public ArrayOfCxWSResultPath getPaths() {
        return paths;
    }

    /**
     * Sets the value of the paths property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResultPath }
     *     
     */
    public void setPaths(ArrayOfCxWSResultPath value) {
        this.paths = value;
    }

}
