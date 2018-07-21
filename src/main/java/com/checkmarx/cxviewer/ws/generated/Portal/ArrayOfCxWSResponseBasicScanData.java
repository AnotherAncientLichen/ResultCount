
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSResponseBasicScanData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSResponseBasicScanData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSResponseBasicScanData" type="{http://Checkmarx.com}CxWSResponseBasicScanData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSResponseBasicScanData", propOrder = {
    "cxWSResponseBasicScanData"
})
public class ArrayOfCxWSResponseBasicScanData {

    @XmlElement(name = "CxWSResponseBasicScanData", nillable = true)
    protected List<CxWSResponseBasicScanData> cxWSResponseBasicScanData;

    /**
     * Gets the value of the cxWSResponseBasicScanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSResponseBasicScanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSResponseBasicScanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSResponseBasicScanData }
     * 
     * 
     */
    public List<CxWSResponseBasicScanData> getCxWSResponseBasicScanData() {
        if (cxWSResponseBasicScanData == null) {
            cxWSResponseBasicScanData = new ArrayList<CxWSResponseBasicScanData>();
        }
        return this.cxWSResponseBasicScanData;
    }

}
