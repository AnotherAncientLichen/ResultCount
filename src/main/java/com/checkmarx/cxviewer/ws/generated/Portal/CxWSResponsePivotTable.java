
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsePivotTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsePivotTable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="PivotTable" type="{http://Checkmarx.com}CxPivotTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsePivotTable", propOrder = {
    "pivotTable"
})
public class CxWSResponsePivotTable
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "PivotTable")
    protected CxPivotTable pivotTable;

    /**
     * Gets the value of the pivotTable property.
     * 
     * @return
     *     possible object is
     *     {@link CxPivotTable }
     *     
     */
    public CxPivotTable getPivotTable() {
        return pivotTable;
    }

    /**
     * Sets the value of the pivotTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxPivotTable }
     *     
     */
    public void setPivotTable(CxPivotTable value) {
        this.pivotTable = value;
    }

}
