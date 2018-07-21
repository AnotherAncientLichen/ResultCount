
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSJIRAIssueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSJIRAIssueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSJIRAIssueType" type="{http://Checkmarx.com}CxWSJIRAIssueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSJIRAIssueType", propOrder = {
    "cxWSJIRAIssueType"
})
public class ArrayOfCxWSJIRAIssueType {

    @XmlElement(name = "CxWSJIRAIssueType", nillable = true)
    protected List<CxWSJIRAIssueType> cxWSJIRAIssueType;

    /**
     * Gets the value of the cxWSJIRAIssueType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSJIRAIssueType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSJIRAIssueType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSJIRAIssueType }
     * 
     * 
     */
    public List<CxWSJIRAIssueType> getCxWSJIRAIssueType() {
        if (cxWSJIRAIssueType == null) {
            cxWSJIRAIssueType = new ArrayList<CxWSJIRAIssueType>();
        }
        return this.cxWSJIRAIssueType;
    }

}
