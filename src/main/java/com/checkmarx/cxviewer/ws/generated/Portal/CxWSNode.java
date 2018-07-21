
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DOM_Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PathIds" type="{http://Checkmarx.com}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBFL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSNode", propOrder = {
    "nodeId",
    "domId",
    "state",
    "pathIds",
    "name",
    "fullName",
    "fileName",
    "isBFL",
    "column",
    "line",
    "length"
})
public class CxWSNode {

    @XmlElement(name = "NodeId")
    protected long nodeId;
    @XmlElement(name = "DOM_Id")
    protected long domId;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "PathIds")
    protected ArrayOfLong pathIds;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "FileName")
    protected String fileName;
    protected boolean isBFL;
    @XmlElement(name = "Column")
    protected int column;
    @XmlElement(name = "Line")
    protected int line;
    @XmlElement(name = "Length")
    protected int length;

    /**
     * Gets the value of the nodeId property.
     * 
     */
    public long getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     */
    public void setNodeId(long value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the domId property.
     * 
     */
    public long getDOMId() {
        return domId;
    }

    /**
     * Sets the value of the domId property.
     * 
     */
    public void setDOMId(long value) {
        this.domId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the pathIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getPathIds() {
        return pathIds;
    }

    /**
     * Sets the value of the pathIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setPathIds(ArrayOfLong value) {
        this.pathIds = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the isBFL property.
     * 
     */
    public boolean isIsBFL() {
        return isBFL;
    }

    /**
     * Sets the value of the isBFL property.
     * 
     */
    public void setIsBFL(boolean value) {
        this.isBFL = value;
    }

    /**
     * Gets the value of the column property.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * Gets the value of the line property.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

}