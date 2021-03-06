
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
 *         &lt;element name="GetAssociatedGroupsListResult" type="{http://Checkmarx.com}CxWSResponseGroupList" minOccurs="0"/>
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
    "getAssociatedGroupsListResult"
})
@XmlRootElement(name = "GetAssociatedGroupsListResponse")
public class GetAssociatedGroupsListResponse {

    @XmlElement(name = "GetAssociatedGroupsListResult")
    protected CxWSResponseGroupList getAssociatedGroupsListResult;

    /**
     * Gets the value of the getAssociatedGroupsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseGroupList }
     *     
     */
    public CxWSResponseGroupList getGetAssociatedGroupsListResult() {
        return getAssociatedGroupsListResult;
    }

    /**
     * Sets the value of the getAssociatedGroupsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseGroupList }
     *     
     */
    public void setGetAssociatedGroupsListResult(CxWSResponseGroupList value) {
        this.getAssociatedGroupsListResult = value;
    }

}
