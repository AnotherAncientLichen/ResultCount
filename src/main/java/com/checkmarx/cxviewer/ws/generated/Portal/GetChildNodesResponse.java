
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
 *         &lt;element name="GetChildNodesResult" type="{http://Checkmarx.com}CxWSResponseHierarchyGroupNodes" minOccurs="0"/>
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
    "getChildNodesResult"
})
@XmlRootElement(name = "GetChildNodesResponse")
public class GetChildNodesResponse {

    @XmlElement(name = "GetChildNodesResult")
    protected CxWSResponseHierarchyGroupNodes getChildNodesResult;

    /**
     * Gets the value of the getChildNodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseHierarchyGroupNodes }
     *     
     */
    public CxWSResponseHierarchyGroupNodes getGetChildNodesResult() {
        return getChildNodesResult;
    }

    /**
     * Sets the value of the getChildNodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseHierarchyGroupNodes }
     *     
     */
    public void setGetChildNodesResult(CxWSResponseHierarchyGroupNodes value) {
        this.getChildNodesResult = value;
    }

}
