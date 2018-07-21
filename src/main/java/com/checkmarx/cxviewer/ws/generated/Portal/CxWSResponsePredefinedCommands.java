
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsePredefinedCommands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsePredefinedCommands">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="commands" type="{http://Checkmarx.com}ArrayOfCxPredefinedCommand" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsePredefinedCommands", propOrder = {
    "commands"
})
public class CxWSResponsePredefinedCommands
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxPredefinedCommand commands;

    /**
     * Gets the value of the commands property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxPredefinedCommand }
     *     
     */
    public ArrayOfCxPredefinedCommand getCommands() {
        return commands;
    }

    /**
     * Sets the value of the commands property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxPredefinedCommand }
     *     
     */
    public void setCommands(ArrayOfCxPredefinedCommand value) {
        this.commands = value;
    }

}
