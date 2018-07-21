
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSEdge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartNode" type="{http://Checkmarx.com}CxWSNode" minOccurs="0"/>
 *         &lt;element name="EndNode" type="{http://Checkmarx.com}CxWSNode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSEdge", propOrder = {
    "startNode",
    "endNode"
})
public class CxWSEdge {

    @XmlElement(name = "StartNode")
    protected CxWSNode startNode;
    @XmlElement(name = "EndNode")
    protected CxWSNode endNode;

    /**
     * Gets the value of the startNode property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSNode }
     *     
     */
    public CxWSNode getStartNode() {
        return startNode;
    }

    /**
     * Sets the value of the startNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSNode }
     *     
     */
    public void setStartNode(CxWSNode value) {
        this.startNode = value;
    }

    /**
     * Gets the value of the endNode property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSNode }
     *     
     */
    public CxWSNode getEndNode() {
        return endNode;
    }

    /**
     * Sets the value of the endNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSNode }
     *     
     */
    public void setEndNode(CxWSNode value) {
        this.endNode = value;
    }

}
