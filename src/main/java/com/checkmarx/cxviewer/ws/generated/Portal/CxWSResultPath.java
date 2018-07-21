
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResultPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResultPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SimilarityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PathId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AssignedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nodes" type="{http://Checkmarx.com}ArrayOfCxWSPathNode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResultPath", propOrder = {
    "similarityId",
    "pathId",
    "comment",
    "state",
    "severity",
    "assignedUser",
    "nodes"
})
public class CxWSResultPath {

    @XmlElement(name = "SimilarityId")
    protected long similarityId;
    @XmlElement(name = "PathId")
    protected long pathId;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "Severity")
    protected int severity;
    @XmlElement(name = "AssignedUser")
    protected String assignedUser;
    @XmlElement(name = "Nodes")
    protected ArrayOfCxWSPathNode nodes;

    /**
     * Gets the value of the similarityId property.
     * 
     */
    public long getSimilarityId() {
        return similarityId;
    }

    /**
     * Sets the value of the similarityId property.
     * 
     */
    public void setSimilarityId(long value) {
        this.similarityId = value;
    }

    /**
     * Gets the value of the pathId property.
     * 
     */
    public long getPathId() {
        return pathId;
    }

    /**
     * Sets the value of the pathId property.
     * 
     */
    public void setPathId(long value) {
        this.pathId = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
     * Gets the value of the severity property.
     * 
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     */
    public void setSeverity(int value) {
        this.severity = value;
    }

    /**
     * Gets the value of the assignedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUser() {
        return assignedUser;
    }

    /**
     * Sets the value of the assignedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUser(String value) {
        this.assignedUser = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSPathNode }
     *     
     */
    public ArrayOfCxWSPathNode getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSPathNode }
     *     
     */
    public void setNodes(ArrayOfCxWSPathNode value) {
        this.nodes = value;
    }

}
