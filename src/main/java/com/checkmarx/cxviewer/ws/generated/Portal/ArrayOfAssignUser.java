
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssignUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAssignUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignUser" type="{http://Checkmarx.com}AssignUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssignUser", propOrder = {
    "assignUser"
})
public class ArrayOfAssignUser {

    @XmlElement(name = "AssignUser", nillable = true)
    protected List<AssignUser> assignUser;

    /**
     * Gets the value of the assignUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignUser }
     * 
     * 
     */
    public List<AssignUser> getAssignUser() {
        if (assignUser == null) {
            assignUser = new ArrayList<AssignUser>();
        }
        return this.assignUser;
    }

}
