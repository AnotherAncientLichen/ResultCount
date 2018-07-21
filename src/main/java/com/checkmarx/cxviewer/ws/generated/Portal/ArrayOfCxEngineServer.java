
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCxEngineServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCxEngineServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxEngineServer" type="{http://Checkmarx.com}CxEngineServer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCxEngineServer", propOrder = {
    "cxEngineServer"
})
public class ArrayOfCxEngineServer {

    @XmlElement(name = "CxEngineServer", nillable = true)
    protected List<CxEngineServer> cxEngineServer;

    /**
     * Gets the value of the cxEngineServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxEngineServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxEngineServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CxEngineServer }
     * 
     * 
     */
    public List<CxEngineServer> getCxEngineServer() {
        if (cxEngineServer == null) {
            cxEngineServer = new ArrayList<CxEngineServer>();
        }
        return this.cxEngineServer;
    }

}
