
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSQueryGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSQueryGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSQueryGroup" type="{http://Checkmarx.com}CxWSQueryGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSQueryGroup", propOrder = {
    "cxWSQueryGroup"
})
public class ArrayOfCxWSQueryGroup {

    @XmlElement(name = "CxWSQueryGroup", nillable = true)
    protected List<CxWSQueryGroup> cxWSQueryGroup;

    /**
     * Gets the value of the cxWSQueryGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSQueryGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSQueryGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSQueryGroup }
     * 
     * 
     */
    public List<CxWSQueryGroup> getCxWSQueryGroup() {
        if (cxWSQueryGroup == null) {
            cxWSQueryGroup = new ArrayList<CxWSQueryGroup>();
        }
        return this.cxWSQueryGroup;
    }

}
