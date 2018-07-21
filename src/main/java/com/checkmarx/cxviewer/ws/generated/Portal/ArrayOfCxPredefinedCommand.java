
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxPredefinedCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxPredefinedCommand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxPredefinedCommand" type="{http://Checkmarx.com}CxPredefinedCommand" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxPredefinedCommand", propOrder = {
    "cxPredefinedCommand"
})
public class ArrayOfCxPredefinedCommand {

    @XmlElement(name = "CxPredefinedCommand", nillable = true)
    protected List<CxPredefinedCommand> cxPredefinedCommand;

    /**
     * Gets the value of the cxPredefinedCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxPredefinedCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxPredefinedCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxPredefinedCommand }
     * 
     * 
     */
    public List<CxPredefinedCommand> getCxPredefinedCommand() {
        if (cxPredefinedCommand == null) {
            cxPredefinedCommand = new ArrayList<CxPredefinedCommand>();
        }
        return this.cxPredefinedCommand;
    }

}
