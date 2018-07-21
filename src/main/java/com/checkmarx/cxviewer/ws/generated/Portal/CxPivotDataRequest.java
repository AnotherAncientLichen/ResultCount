
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxPivotDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxPivotDataRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ViewName" type="{http://Checkmarx.com}PivotViewClientType"/>
 *         &lt;element name="Criteria" type="{http://Checkmarx.com}ArrayOfPivotClientBaseParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxPivotDataRequest", propOrder = {
    "viewName",
    "criteria"
})
public class CxPivotDataRequest {

    @XmlElement(name = "ViewName", required = true)
    @XmlSchemaType(name = "string")
    protected PivotViewClientType viewName;
    @XmlElement(name = "Criteria")
    protected ArrayOfPivotClientBaseParam criteria;

    /**
     * Gets the value of the viewName property.
     * 
     * @return
     *     possible object is
     *     {@link PivotViewClientType }
     *     
     */
    public PivotViewClientType getViewName() {
        return viewName;
    }

    /**
     * Sets the value of the viewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PivotViewClientType }
     *     
     */
    public void setViewName(PivotViewClientType value) {
        this.viewName = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPivotClientBaseParam }
     *     
     */
    public ArrayOfPivotClientBaseParam getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPivotClientBaseParam }
     *     
     */
    public void setCriteria(ArrayOfPivotClientBaseParam value) {
        this.criteria = value;
    }

}
