
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseEngineServers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseEngineServers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="list" type="{http://Checkmarx.com}ArrayOfCxEngineServer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseEngineServers", propOrder = {
    "list"
})
public class CxWSResponseEngineServers
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxEngineServer list;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxEngineServer }
     *     
     */
    public ArrayOfCxEngineServer getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxEngineServer }
     *     
     */
    public void setList(ArrayOfCxEngineServer value) {
        this.list = value;
    }

}
