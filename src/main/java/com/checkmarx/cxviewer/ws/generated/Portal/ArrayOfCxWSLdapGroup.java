
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSLdapGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSLdapGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSLdapGroup" type="{http://Checkmarx.com}CxWSLdapGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSLdapGroup", propOrder = {
    "cxWSLdapGroup"
})
public class ArrayOfCxWSLdapGroup {

    @XmlElement(name = "CxWSLdapGroup", nillable = true)
    protected List<CxWSLdapGroup> cxWSLdapGroup;

    /**
     * Gets the value of the cxWSLdapGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSLdapGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSLdapGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSLdapGroup }
     * 
     * 
     */
    public List<CxWSLdapGroup> getCxWSLdapGroup() {
        if (cxWSLdapGroup == null) {
            cxWSLdapGroup = new ArrayList<CxWSLdapGroup>();
        }
        return this.cxWSLdapGroup;
    }

}
