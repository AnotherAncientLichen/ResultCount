
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResultDisplayOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResultDisplayOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignedTo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Link2Online" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SnippetsMode" type="{http://Checkmarx.com}CxWSSnippetsModeDisplayOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResultDisplayOptions", propOrder = {
    "assignedTo",
    "comments",
    "link2Online",
    "resultDescription",
    "snippetsMode"
})
public class CxWSResultDisplayOptions {

    @XmlElement(name = "AssignedTo")
    protected boolean assignedTo;
    @XmlElement(name = "Comments")
    protected boolean comments;
    @XmlElement(name = "Link2Online")
    protected boolean link2Online;
    @XmlElement(name = "ResultDescription")
    protected boolean resultDescription;
    @XmlElement(name = "SnippetsMode", required = true)
    @XmlSchemaType(name = "string")
    protected CxWSSnippetsModeDisplayOptions snippetsMode;

    /**
     * Gets the value of the assignedTo property.
     * 
     */
    public boolean isAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     */
    public void setAssignedTo(boolean value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     */
    public boolean isComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     */
    public void setComments(boolean value) {
        this.comments = value;
    }

    /**
     * Gets the value of the link2Online property.
     * 
     */
    public boolean isLink2Online() {
        return link2Online;
    }

    /**
     * Sets the value of the link2Online property.
     * 
     */
    public void setLink2Online(boolean value) {
        this.link2Online = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     */
    public boolean isResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     */
    public void setResultDescription(boolean value) {
        this.resultDescription = value;
    }

    /**
     * Gets the value of the snippetsMode property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSSnippetsModeDisplayOptions }
     *     
     */
    public CxWSSnippetsModeDisplayOptions getSnippetsMode() {
        return snippetsMode;
    }

    /**
     * Sets the value of the snippetsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSSnippetsModeDisplayOptions }
     *     
     */
    public void setSnippetsMode(CxWSSnippetsModeDisplayOptions value) {
        this.snippetsMode = value;
    }

}