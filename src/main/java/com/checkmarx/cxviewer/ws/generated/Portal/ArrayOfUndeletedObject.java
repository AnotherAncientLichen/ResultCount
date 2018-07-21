
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUndeletedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUndeletedObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UndeletedObject" type="{http://Checkmarx.com}UndeletedObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUndeletedObject", propOrder = {
    "undeletedObject"
})
public class ArrayOfUndeletedObject {

    @XmlElement(name = "UndeletedObject", nillable = true)
    protected List<UndeletedObject> undeletedObject;

    /**
     * Gets the value of the undeletedObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undeletedObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndeletedObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndeletedObject }
     * 
     * 
     */
    public List<UndeletedObject> getUndeletedObject() {
        if (undeletedObject == null) {
            undeletedObject = new ArrayList<UndeletedObject>();
        }
        return this.undeletedObject;
    }

}
