
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPivotClientBaseParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPivotClientBaseParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PivotClientBaseParam" type="{http://Checkmarx.com}PivotClientBaseParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPivotClientBaseParam", propOrder = {
    "pivotClientBaseParam"
})
public class ArrayOfPivotClientBaseParam {

    @XmlElement(name = "PivotClientBaseParam", nillable = true)
    protected List<PivotClientBaseParam> pivotClientBaseParam;

    /**
     * Gets the value of the pivotClientBaseParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pivotClientBaseParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPivotClientBaseParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PivotClientBaseParam }
     * 
     * 
     */
    public List<PivotClientBaseParam> getPivotClientBaseParam() {
        if (pivotClientBaseParam == null) {
            pivotClientBaseParam = new ArrayList<PivotClientBaseParam>();
        }
        return this.pivotClientBaseParam;
    }

}
