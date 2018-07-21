
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSTransportedQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSTransportedQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSTransportedQuery" type="{http://Checkmarx.com}CxWSTransportedQuery" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSTransportedQuery", propOrder = {
    "cxWSTransportedQuery"
})
public class ArrayOfCxWSTransportedQuery {

    @XmlElement(name = "CxWSTransportedQuery", nillable = true)
    protected List<CxWSTransportedQuery> cxWSTransportedQuery;

    /**
     * Gets the value of the cxWSTransportedQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSTransportedQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSTransportedQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSTransportedQuery }
     * 
     * 
     */
    public List<CxWSTransportedQuery> getCxWSTransportedQuery() {
        if (cxWSTransportedQuery == null) {
            cxWSTransportedQuery = new ArrayList<CxWSTransportedQuery>();
        }
        return this.cxWSTransportedQuery;
    }

}
