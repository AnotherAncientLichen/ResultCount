
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxWSJIRAProjectMeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxWSJIRAProjectMeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxWSJIRAProjectMeta" type="{http://Checkmarx.com}CxWSJIRAProjectMeta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxWSJIRAProjectMeta", propOrder = {
    "cxWSJIRAProjectMeta"
})
public class ArrayOfCxWSJIRAProjectMeta {

    @XmlElement(name = "CxWSJIRAProjectMeta", nillable = true)
    protected List<CxWSJIRAProjectMeta> cxWSJIRAProjectMeta;

    /**
     * Gets the value of the cxWSJIRAProjectMeta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxWSJIRAProjectMeta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxWSJIRAProjectMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxWSJIRAProjectMeta }
     * 
     * 
     */
    public List<CxWSJIRAProjectMeta> getCxWSJIRAProjectMeta() {
        if (cxWSJIRAProjectMeta == null) {
            cxWSJIRAProjectMeta = new ArrayList<CxWSJIRAProjectMeta>();
        }
        return this.cxWSJIRAProjectMeta;
    }

}