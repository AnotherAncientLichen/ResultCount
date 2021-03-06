
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSaasPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSaasPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaasPackage" type="{http://Checkmarx.com}SaasPackage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSaasPackage", propOrder = {
    "saasPackage"
})
public class ArrayOfSaasPackage {

    @XmlElement(name = "SaasPackage", nillable = true)
    protected List<SaasPackage> saasPackage;

    /**
     * Gets the value of the saasPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saasPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaasPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaasPackage }
     * 
     * 
     */
    public List<SaasPackage> getSaasPackage() {
        if (saasPackage == null) {
            saasPackage = new ArrayList<SaasPackage>();
        }
        return this.saasPackage;
    }

}
