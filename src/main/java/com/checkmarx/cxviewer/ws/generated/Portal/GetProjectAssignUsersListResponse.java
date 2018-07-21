
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetProjectAssignUsersListResult" type="{http://Checkmarx.com}CxWSResponseAssignUsers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProjectAssignUsersListResult"
})
@XmlRootElement(name = "GetProjectAssignUsersListResponse")
public class GetProjectAssignUsersListResponse {

    @XmlElement(name = "GetProjectAssignUsersListResult")
    protected CxWSResponseAssignUsers getProjectAssignUsersListResult;

    /**
     * Gets the value of the getProjectAssignUsersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseAssignUsers }
     *     
     */
    public CxWSResponseAssignUsers getGetProjectAssignUsersListResult() {
        return getProjectAssignUsersListResult;
    }

    /**
     * Sets the value of the getProjectAssignUsersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseAssignUsers }
     *     
     */
    public void setGetProjectAssignUsersListResult(CxWSResponseAssignUsers value) {
        this.getProjectAssignUsersListResult = value;
    }

}
