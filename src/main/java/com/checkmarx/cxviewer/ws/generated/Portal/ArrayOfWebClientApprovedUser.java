
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWebClientApprovedUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWebClientApprovedUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebClientApprovedUser" type="{http://Checkmarx.com}WebClientApprovedUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWebClientApprovedUser", propOrder = {
    "webClientApprovedUser"
})
public class ArrayOfWebClientApprovedUser {

    @XmlElement(name = "WebClientApprovedUser", nillable = true)
    protected List<WebClientApprovedUser> webClientApprovedUser;

    /**
     * Gets the value of the webClientApprovedUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webClientApprovedUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebClientApprovedUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebClientApprovedUser }
     * 
     * 
     */
    public List<WebClientApprovedUser> getWebClientApprovedUser() {
        if (webClientApprovedUser == null) {
            webClientApprovedUser = new ArrayList<WebClientApprovedUser>();
        }
        return this.webClientApprovedUser;
    }

}
