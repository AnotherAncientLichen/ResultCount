
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseResultStateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseResultStateList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ResultStateList" type="{http://Checkmarx.com}ArrayOfResultState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseResultStateList", propOrder = {
    "resultStateList"
})
public class CxWSResponseResultStateList
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ResultStateList")
    protected ArrayOfResultState resultStateList;

    /**
     * Gets the value of the resultStateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResultState }
     *     
     */
    public ArrayOfResultState getResultStateList() {
        return resultStateList;
    }

    /**
     * Sets the value of the resultStateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResultState }
     *     
     */
    public void setResultStateList(ArrayOfResultState value) {
        this.resultStateList = value;
    }

}
