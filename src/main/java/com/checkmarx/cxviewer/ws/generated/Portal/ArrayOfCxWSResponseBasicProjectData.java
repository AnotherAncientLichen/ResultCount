
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSResponseBasicProjectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSResponseBasicProjectData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSResponseBasicProjectData" type="{http://Checkmarx.com}CxWSResponseBasicProjectData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSResponseBasicProjectData", propOrder = {
    "cxWSResponseBasicProjectData"
})
public class ArrayOfCxWSResponseBasicProjectData {

    @XmlElement(name = "CxWSResponseBasicProjectData", nillable = true)
    protected List<CxWSResponseBasicProjectData> cxWSResponseBasicProjectData;

    /**
     * Gets the value of the cxWSResponseBasicProjectData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSResponseBasicProjectData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSResponseBasicProjectData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSResponseBasicProjectData }
     * 
     * 
     */
    public List<CxWSResponseBasicProjectData> getCxWSResponseBasicProjectData() {
        if (cxWSResponseBasicProjectData == null) {
            cxWSResponseBasicProjectData = new ArrayList<CxWSResponseBasicProjectData>();
        }
        return this.cxWSResponseBasicProjectData;
    }

}
