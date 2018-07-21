
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSourceActionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSourceActionList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ActionList" type="{http://Checkmarx.com}ArrayOfAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSourceActionList", propOrder = {
    "actionList"
})
public class CxWSResponseSourceActionList
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ActionList")
    protected ArrayOfAction actionList;

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAction }
     *     
     */
    public ArrayOfAction getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAction }
     *     
     */
    public void setActionList(ArrayOfAction value) {
        this.actionList = value;
    }

}
