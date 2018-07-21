
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSJIRAAllowedValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSJIRAAllowedValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSJIRAAllowedValues" type="{http://Checkmarx.com}CxWSJIRAAllowedValues" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSJIRAAllowedValues", propOrder = {
    "cxWSJIRAAllowedValues"
})
public class ArrayOfCxWSJIRAAllowedValues {

    @XmlElement(name = "CxWSJIRAAllowedValues", nillable = true)
    protected List<CxWSJIRAAllowedValues> cxWSJIRAAllowedValues;

    /**
     * Gets the value of the cxWSJIRAAllowedValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSJIRAAllowedValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSJIRAAllowedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSJIRAAllowedValues }
     * 
     * 
     */
    public List<CxWSJIRAAllowedValues> getCxWSJIRAAllowedValues() {
        if (cxWSJIRAAllowedValues == null) {
            cxWSJIRAAllowedValues = new ArrayList<CxWSJIRAAllowedValues>();
        }
        return this.cxWSJIRAAllowedValues;
    }

}
