
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxPivotTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxPivotTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{http://Checkmarx.com}ArrayOfCxPivotColumn" minOccurs="0"/>
 *         &lt;element name="Rows" type="{http://Checkmarx.com}ArrayOfCxPivotRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxPivotTable", propOrder = {
    "columns",
    "rows"
})
public class CxPivotTable {

    @XmlElement(name = "Columns")
    protected ArrayOfCxPivotColumn columns;
    @XmlElement(name = "Rows")
    protected ArrayOfCxPivotRow rows;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxPivotColumn }
     *     
     */
    public ArrayOfCxPivotColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxPivotColumn }
     *     
     */
    public void setColumns(ArrayOfCxPivotColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxPivotRow }
     *     
     */
    public ArrayOfCxPivotRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxPivotRow }
     *     
     */
    public void setRows(ArrayOfCxPivotRow value) {
        this.rows = value;
    }

}
