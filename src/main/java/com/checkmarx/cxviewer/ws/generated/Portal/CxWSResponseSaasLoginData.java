
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSaasLoginData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSaasLoginData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseLoginData">
 *       &lt;sequence>
 *         &lt;element name="IsAllowedToUseSourceControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isAllowedToCreatePDF" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToUseOnlineViewer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToUsePlugins" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewResultState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToEditResultState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewResultSeverity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToEditResultSeverity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewAssignTo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToEditAssignTo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewComments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToEditComments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSaasLoginData", propOrder = {
    "isAllowedToUseSourceControl",
    "isAllowedToCreatePDF",
    "isAllowedToUseOnlineViewer",
    "isAllowedToUsePlugins",
    "isAllowedToViewResultState",
    "isAllowedToEditResultState",
    "isAllowedToViewResultSeverity",
    "isAllowedToEditResultSeverity",
    "isAllowedToViewAssignTo",
    "isAllowedToEditAssignTo",
    "isAllowedToViewComments",
    "isAllowedToEditComments"
})
public class CxWSResponseSaasLoginData
    extends CxWSResponseLoginData
{

    @XmlElement(name = "IsAllowedToUseSourceControl")
    protected boolean isAllowedToUseSourceControl;
    protected boolean isAllowedToCreatePDF;
    @XmlElement(name = "IsAllowedToUseOnlineViewer")
    protected boolean isAllowedToUseOnlineViewer;
    @XmlElement(name = "IsAllowedToUsePlugins")
    protected boolean isAllowedToUsePlugins;
    @XmlElement(name = "IsAllowedToViewResultState")
    protected boolean isAllowedToViewResultState;
    @XmlElement(name = "IsAllowedToEditResultState")
    protected boolean isAllowedToEditResultState;
    @XmlElement(name = "IsAllowedToViewResultSeverity")
    protected boolean isAllowedToViewResultSeverity;
    @XmlElement(name = "IsAllowedToEditResultSeverity")
    protected boolean isAllowedToEditResultSeverity;
    @XmlElement(name = "IsAllowedToViewAssignTo")
    protected boolean isAllowedToViewAssignTo;
    @XmlElement(name = "IsAllowedToEditAssignTo")
    protected boolean isAllowedToEditAssignTo;
    @XmlElement(name = "IsAllowedToViewComments")
    protected boolean isAllowedToViewComments;
    @XmlElement(name = "IsAllowedToEditComments")
    protected boolean isAllowedToEditComments;

    /**
     * Gets the value of the isAllowedToUseSourceControl property.
     * 
     */
    public boolean isIsAllowedToUseSourceControl() {
        return isAllowedToUseSourceControl;
    }

    /**
     * Sets the value of the isAllowedToUseSourceControl property.
     * 
     */
    public void setIsAllowedToUseSourceControl(boolean value) {
        this.isAllowedToUseSourceControl = value;
    }

    /**
     * Gets the value of the isAllowedToCreatePDF property.
     * 
     */
    public boolean isIsAllowedToCreatePDF() {
        return isAllowedToCreatePDF;
    }

    /**
     * Sets the value of the isAllowedToCreatePDF property.
     * 
     */
    public void setIsAllowedToCreatePDF(boolean value) {
        this.isAllowedToCreatePDF = value;
    }

    /**
     * Gets the value of the isAllowedToUseOnlineViewer property.
     * 
     */
    public boolean isIsAllowedToUseOnlineViewer() {
        return isAllowedToUseOnlineViewer;
    }

    /**
     * Sets the value of the isAllowedToUseOnlineViewer property.
     * 
     */
    public void setIsAllowedToUseOnlineViewer(boolean value) {
        this.isAllowedToUseOnlineViewer = value;
    }

    /**
     * Gets the value of the isAllowedToUsePlugins property.
     * 
     */
    public boolean isIsAllowedToUsePlugins() {
        return isAllowedToUsePlugins;
    }

    /**
     * Sets the value of the isAllowedToUsePlugins property.
     * 
     */
    public void setIsAllowedToUsePlugins(boolean value) {
        this.isAllowedToUsePlugins = value;
    }

    /**
     * Gets the value of the isAllowedToViewResultState property.
     * 
     */
    public boolean isIsAllowedToViewResultState() {
        return isAllowedToViewResultState;
    }

    /**
     * Sets the value of the isAllowedToViewResultState property.
     * 
     */
    public void setIsAllowedToViewResultState(boolean value) {
        this.isAllowedToViewResultState = value;
    }

    /**
     * Gets the value of the isAllowedToEditResultState property.
     * 
     */
    public boolean isIsAllowedToEditResultState() {
        return isAllowedToEditResultState;
    }

    /**
     * Sets the value of the isAllowedToEditResultState property.
     * 
     */
    public void setIsAllowedToEditResultState(boolean value) {
        this.isAllowedToEditResultState = value;
    }

    /**
     * Gets the value of the isAllowedToViewResultSeverity property.
     * 
     */
    public boolean isIsAllowedToViewResultSeverity() {
        return isAllowedToViewResultSeverity;
    }

    /**
     * Sets the value of the isAllowedToViewResultSeverity property.
     * 
     */
    public void setIsAllowedToViewResultSeverity(boolean value) {
        this.isAllowedToViewResultSeverity = value;
    }

    /**
     * Gets the value of the isAllowedToEditResultSeverity property.
     * 
     */
    public boolean isIsAllowedToEditResultSeverity() {
        return isAllowedToEditResultSeverity;
    }

    /**
     * Sets the value of the isAllowedToEditResultSeverity property.
     * 
     */
    public void setIsAllowedToEditResultSeverity(boolean value) {
        this.isAllowedToEditResultSeverity = value;
    }

    /**
     * Gets the value of the isAllowedToViewAssignTo property.
     * 
     */
    public boolean isIsAllowedToViewAssignTo() {
        return isAllowedToViewAssignTo;
    }

    /**
     * Sets the value of the isAllowedToViewAssignTo property.
     * 
     */
    public void setIsAllowedToViewAssignTo(boolean value) {
        this.isAllowedToViewAssignTo = value;
    }

    /**
     * Gets the value of the isAllowedToEditAssignTo property.
     * 
     */
    public boolean isIsAllowedToEditAssignTo() {
        return isAllowedToEditAssignTo;
    }

    /**
     * Sets the value of the isAllowedToEditAssignTo property.
     * 
     */
    public void setIsAllowedToEditAssignTo(boolean value) {
        this.isAllowedToEditAssignTo = value;
    }

    /**
     * Gets the value of the isAllowedToViewComments property.
     * 
     */
    public boolean isIsAllowedToViewComments() {
        return isAllowedToViewComments;
    }

    /**
     * Sets the value of the isAllowedToViewComments property.
     * 
     */
    public void setIsAllowedToViewComments(boolean value) {
        this.isAllowedToViewComments = value;
    }

    /**
     * Gets the value of the isAllowedToEditComments property.
     * 
     */
    public boolean isIsAllowedToEditComments() {
        return isAllowedToEditComments;
    }

    /**
     * Sets the value of the isAllowedToEditComments property.
     * 
     */
    public void setIsAllowedToEditComments(boolean value) {
        this.isAllowedToEditComments = value;
    }

}
