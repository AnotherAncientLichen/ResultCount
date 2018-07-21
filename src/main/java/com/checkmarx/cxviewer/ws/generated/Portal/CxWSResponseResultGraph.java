
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseResultGraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseResultGraph">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Nodes" type="{http://Checkmarx.com}ArrayOfCxWSNode" minOccurs="0"/>
 *         &lt;element name="Edges" type="{http://Checkmarx.com}ArrayOfCxWSEdge" minOccurs="0"/>
 *         &lt;element name="Partial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseResultGraph", propOrder = {
    "nodes",
    "edges",
    "partial"
})
public class CxWSResponseResultGraph
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Nodes")
    protected ArrayOfCxWSNode nodes;
    @XmlElement(name = "Edges")
    protected ArrayOfCxWSEdge edges;
    @XmlElement(name = "Partial")
    protected boolean partial;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSNode }
     *     
     */
    public ArrayOfCxWSNode getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSNode }
     *     
     */
    public void setNodes(ArrayOfCxWSNode value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the edges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSEdge }
     *     
     */
    public ArrayOfCxWSEdge getEdges() {
        return edges;
    }

    /**
     * Sets the value of the edges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSEdge }
     *     
     */
    public void setEdges(ArrayOfCxWSEdge value) {
        this.edges = value;
    }

    /**
     * Gets the value of the partial property.
     * 
     */
    public boolean isPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     */
    public void setPartial(boolean value) {
        this.partial = value;
    }

}
