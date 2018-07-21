
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResultStateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResultStateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultStateData" type="{http://Checkmarx.com}ResultStateData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResultStateData", propOrder = {
    "resultStateData"
})
public class ArrayOfResultStateData {

    @XmlElement(name = "ResultStateData", nillable = true)
    protected List<ResultStateData> resultStateData;

    /**
     * Gets the value of the resultStateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultStateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultStateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultStateData }
     * 
     * 
     */
    public List<ResultStateData> getResultStateData() {
        if (resultStateData == null) {
            resultStateData = new ArrayList<ResultStateData>();
        }
        return this.resultStateData;
    }

}
