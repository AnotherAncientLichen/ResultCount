
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsePendingUsersList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsePendingUsersList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="pendingUsersList" type="{http://Checkmarx.com}ArrayOfWebClientPendingUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsePendingUsersList", propOrder = {
    "pendingUsersList"
})
public class CxWSResponsePendingUsersList
    extends CxWSBasicRepsonse
{

    protected ArrayOfWebClientPendingUser pendingUsersList;

    /**
     * Gets the value of the pendingUsersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWebClientPendingUser }
     *     
     */
    public ArrayOfWebClientPendingUser getPendingUsersList() {
        return pendingUsersList;
    }

    /**
     * Sets the value of the pendingUsersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebClientPendingUser }
     *     
     */
    public void setPendingUsersList(ArrayOfWebClientPendingUser value) {
        this.pendingUsersList = value;
    }

}
