
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSIssueTrackingParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSIssueTrackingParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSIssueTrackingParam" type="{http://Checkmarx.com}CxWSIssueTrackingParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSIssueTrackingParam", propOrder = {
    "cxWSIssueTrackingParam"
})
public class ArrayOfCxWSIssueTrackingParam {

    @XmlElement(name = "CxWSIssueTrackingParam", nillable = true)
    protected List<CxWSIssueTrackingParam> cxWSIssueTrackingParam;

    /**
     * Gets the value of the cxWSIssueTrackingParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSIssueTrackingParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSIssueTrackingParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSIssueTrackingParam }
     * 
     * 
     */
    public List<CxWSIssueTrackingParam> getCxWSIssueTrackingParam() {
        if (cxWSIssueTrackingParam == null) {
            cxWSIssueTrackingParam = new ArrayList<CxWSIssueTrackingParam>();
        }
        return this.cxWSIssueTrackingParam;
    }

}
