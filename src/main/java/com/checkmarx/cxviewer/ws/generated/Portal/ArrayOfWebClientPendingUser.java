
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWebClientPendingUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWebClientPendingUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebClientPendingUser" type="{http://Checkmarx.com}WebClientPendingUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWebClientPendingUser", propOrder = {
    "webClientPendingUser"
})
public class ArrayOfWebClientPendingUser {

    @XmlElement(name = "WebClientPendingUser", nillable = true)
    protected List<WebClientPendingUser> webClientPendingUser;

    /**
     * Gets the value of the webClientPendingUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webClientPendingUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebClientPendingUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebClientPendingUser }
     * 
     * 
     */
    public List<WebClientPendingUser> getWebClientPendingUser() {
        if (webClientPendingUser == null) {
            webClientPendingUser = new ArrayList<WebClientPendingUser>();
        }
        return this.webClientPendingUser;
    }

}
