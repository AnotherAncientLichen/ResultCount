
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSIssueTrackingMetaRequestParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSIssueTrackingMetaRequestParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSIssueTrackingMetaRequestParam" type="{http://Checkmarx.com}CxWSIssueTrackingMetaRequestParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSIssueTrackingMetaRequestParam", propOrder = {
    "cxWSIssueTrackingMetaRequestParam"
})
public class ArrayOfCxWSIssueTrackingMetaRequestParam {

    @XmlElement(name = "CxWSIssueTrackingMetaRequestParam", nillable = true)
    protected List<CxWSIssueTrackingMetaRequestParam> cxWSIssueTrackingMetaRequestParam;

    /**
     * Gets the value of the cxWSIssueTrackingMetaRequestParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSIssueTrackingMetaRequestParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSIssueTrackingMetaRequestParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSIssueTrackingMetaRequestParam }
     * 
     * 
     */
    public List<CxWSIssueTrackingMetaRequestParam> getCxWSIssueTrackingMetaRequestParam() {
        if (cxWSIssueTrackingMetaRequestParam == null) {
            cxWSIssueTrackingMetaRequestParam = new ArrayList<CxWSIssueTrackingMetaRequestParam>();
        }
        return this.cxWSIssueTrackingMetaRequestParam;
    }

}
