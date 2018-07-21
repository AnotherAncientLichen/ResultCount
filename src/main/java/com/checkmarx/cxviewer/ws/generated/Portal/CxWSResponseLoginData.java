
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseLoginData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseLoginData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseSessionID">
 *       &lt;sequence>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserPreferedLanguageLCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAllowedToCreateProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToChangeProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewCompanies" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManageCompanies" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManageServer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewInstallationData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToViewSp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManageSp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsScanner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAuditor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManagePresets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isAllowedToManagePredefinedCommand" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManagePostScanAction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToModifyResultDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EnableIncrementalScan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowSaaSPackageNotificationAndErrors" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowSaaSPackageDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAdviseChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToManageITSServers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowedToChangeNotExploitable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAllowedToDeleteScans" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseLoginData", propOrder = {
    "familyName",
    "firstName",
    "userName",
    "email",
    "userID",
    "userPreferedLanguageLCID",
    "isAllowedToCreateProject",
    "isAllowedToChangeProject",
    "isAllowedToManageUsers",
    "isAllowedToViewCompanies",
    "isAllowedToManageCompanies",
    "isAllowedToManageServer",
    "isAllowedToViewInstallationData",
    "isAllowedToViewSp",
    "isAllowedToManageSp",
    "isScanner",
    "isAuditor",
    "isAllowedToManagePresets",
    "isAllowedToManagePredefinedCommand",
    "isAllowedToManagePostScanAction",
    "isAllowedToModifyResultDetails",
    "enableIncrementalScan",
    "showSaaSPackageNotificationAndErrors",
    "showSaaSPackageDetails",
    "isAdviseChangePassword",
    "isAllowedToManageITSServers",
    "allowedToChangeNotExploitable",
    "isAllowedToDeleteScans"
})
@XmlSeeAlso({
    CxWSResponseSaasLoginData.class
})
public class CxWSResponseLoginData
    extends CxWSResponseSessionID
{

    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "UserID")
    protected long userID;
    @XmlElement(name = "UserPreferedLanguageLCID")
    protected int userPreferedLanguageLCID;
    @XmlElement(name = "IsAllowedToCreateProject")
    protected boolean isAllowedToCreateProject;
    @XmlElement(name = "IsAllowedToChangeProject")
    protected boolean isAllowedToChangeProject;
    @XmlElement(name = "IsAllowedToManageUsers")
    protected boolean isAllowedToManageUsers;
    @XmlElement(name = "IsAllowedToViewCompanies")
    protected boolean isAllowedToViewCompanies;
    @XmlElement(name = "IsAllowedToManageCompanies")
    protected boolean isAllowedToManageCompanies;
    @XmlElement(name = "IsAllowedToManageServer")
    protected boolean isAllowedToManageServer;
    @XmlElement(name = "IsAllowedToViewInstallationData")
    protected boolean isAllowedToViewInstallationData;
    @XmlElement(name = "IsAllowedToViewSp")
    protected boolean isAllowedToViewSp;
    @XmlElement(name = "IsAllowedToManageSp")
    protected boolean isAllowedToManageSp;
    @XmlElement(name = "IsScanner")
    protected boolean isScanner;
    @XmlElement(name = "IsAuditor")
    protected boolean isAuditor;
    @XmlElement(name = "IsAllowedToManagePresets")
    protected boolean isAllowedToManagePresets;
    protected boolean isAllowedToManagePredefinedCommand;
    @XmlElement(name = "IsAllowedToManagePostScanAction")
    protected boolean isAllowedToManagePostScanAction;
    @XmlElement(name = "IsAllowedToModifyResultDetails")
    protected boolean isAllowedToModifyResultDetails;
    @XmlElement(name = "EnableIncrementalScan")
    protected boolean enableIncrementalScan;
    @XmlElement(name = "ShowSaaSPackageNotificationAndErrors")
    protected boolean showSaaSPackageNotificationAndErrors;
    @XmlElement(name = "ShowSaaSPackageDetails")
    protected boolean showSaaSPackageDetails;
    @XmlElement(name = "IsAdviseChangePassword")
    protected boolean isAdviseChangePassword;
    @XmlElement(name = "IsAllowedToManageITSServers")
    protected boolean isAllowedToManageITSServers;
    @XmlElement(name = "AllowedToChangeNotExploitable")
    protected boolean allowedToChangeNotExploitable;
    @XmlElement(name = "IsAllowedToDeleteScans")
    protected boolean isAllowedToDeleteScans;

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(long value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userPreferedLanguageLCID property.
     * 
     */
    public int getUserPreferedLanguageLCID() {
        return userPreferedLanguageLCID;
    }

    /**
     * Sets the value of the userPreferedLanguageLCID property.
     * 
     */
    public void setUserPreferedLanguageLCID(int value) {
        this.userPreferedLanguageLCID = value;
    }

    /**
     * Gets the value of the isAllowedToCreateProject property.
     * 
     */
    public boolean isIsAllowedToCreateProject() {
        return isAllowedToCreateProject;
    }

    /**
     * Sets the value of the isAllowedToCreateProject property.
     * 
     */
    public void setIsAllowedToCreateProject(boolean value) {
        this.isAllowedToCreateProject = value;
    }

    /**
     * Gets the value of the isAllowedToChangeProject property.
     * 
     */
    public boolean isIsAllowedToChangeProject() {
        return isAllowedToChangeProject;
    }

    /**
     * Sets the value of the isAllowedToChangeProject property.
     * 
     */
    public void setIsAllowedToChangeProject(boolean value) {
        this.isAllowedToChangeProject = value;
    }

    /**
     * Gets the value of the isAllowedToManageUsers property.
     * 
     */
    public boolean isIsAllowedToManageUsers() {
        return isAllowedToManageUsers;
    }

    /**
     * Sets the value of the isAllowedToManageUsers property.
     * 
     */
    public void setIsAllowedToManageUsers(boolean value) {
        this.isAllowedToManageUsers = value;
    }

    /**
     * Gets the value of the isAllowedToViewCompanies property.
     * 
     */
    public boolean isIsAllowedToViewCompanies() {
        return isAllowedToViewCompanies;
    }

    /**
     * Sets the value of the isAllowedToViewCompanies property.
     * 
     */
    public void setIsAllowedToViewCompanies(boolean value) {
        this.isAllowedToViewCompanies = value;
    }

    /**
     * Gets the value of the isAllowedToManageCompanies property.
     * 
     */
    public boolean isIsAllowedToManageCompanies() {
        return isAllowedToManageCompanies;
    }

    /**
     * Sets the value of the isAllowedToManageCompanies property.
     * 
     */
    public void setIsAllowedToManageCompanies(boolean value) {
        this.isAllowedToManageCompanies = value;
    }

    /**
     * Gets the value of the isAllowedToManageServer property.
     * 
     */
    public boolean isIsAllowedToManageServer() {
        return isAllowedToManageServer;
    }

    /**
     * Sets the value of the isAllowedToManageServer property.
     * 
     */
    public void setIsAllowedToManageServer(boolean value) {
        this.isAllowedToManageServer = value;
    }

    /**
     * Gets the value of the isAllowedToViewInstallationData property.
     * 
     */
    public boolean isIsAllowedToViewInstallationData() {
        return isAllowedToViewInstallationData;
    }

    /**
     * Sets the value of the isAllowedToViewInstallationData property.
     * 
     */
    public void setIsAllowedToViewInstallationData(boolean value) {
        this.isAllowedToViewInstallationData = value;
    }

    /**
     * Gets the value of the isAllowedToViewSp property.
     * 
     */
    public boolean isIsAllowedToViewSp() {
        return isAllowedToViewSp;
    }

    /**
     * Sets the value of the isAllowedToViewSp property.
     * 
     */
    public void setIsAllowedToViewSp(boolean value) {
        this.isAllowedToViewSp = value;
    }

    /**
     * Gets the value of the isAllowedToManageSp property.
     * 
     */
    public boolean isIsAllowedToManageSp() {
        return isAllowedToManageSp;
    }

    /**
     * Sets the value of the isAllowedToManageSp property.
     * 
     */
    public void setIsAllowedToManageSp(boolean value) {
        this.isAllowedToManageSp = value;
    }

    /**
     * Gets the value of the isScanner property.
     * 
     */
    public boolean isIsScanner() {
        return isScanner;
    }

    /**
     * Sets the value of the isScanner property.
     * 
     */
    public void setIsScanner(boolean value) {
        this.isScanner = value;
    }

    /**
     * Gets the value of the isAuditor property.
     * 
     */
    public boolean isIsAuditor() {
        return isAuditor;
    }

    /**
     * Sets the value of the isAuditor property.
     * 
     */
    public void setIsAuditor(boolean value) {
        this.isAuditor = value;
    }

    /**
     * Gets the value of the isAllowedToManagePresets property.
     * 
     */
    public boolean isIsAllowedToManagePresets() {
        return isAllowedToManagePresets;
    }

    /**
     * Sets the value of the isAllowedToManagePresets property.
     * 
     */
    public void setIsAllowedToManagePresets(boolean value) {
        this.isAllowedToManagePresets = value;
    }

    /**
     * Gets the value of the isAllowedToManagePredefinedCommand property.
     * 
     */
    public boolean isIsAllowedToManagePredefinedCommand() {
        return isAllowedToManagePredefinedCommand;
    }

    /**
     * Sets the value of the isAllowedToManagePredefinedCommand property.
     * 
     */
    public void setIsAllowedToManagePredefinedCommand(boolean value) {
        this.isAllowedToManagePredefinedCommand = value;
    }

    /**
     * Gets the value of the isAllowedToManagePostScanAction property.
     * 
     */
    public boolean isIsAllowedToManagePostScanAction() {
        return isAllowedToManagePostScanAction;
    }

    /**
     * Sets the value of the isAllowedToManagePostScanAction property.
     * 
     */
    public void setIsAllowedToManagePostScanAction(boolean value) {
        this.isAllowedToManagePostScanAction = value;
    }

    /**
     * Gets the value of the isAllowedToModifyResultDetails property.
     * 
     */
    public boolean isIsAllowedToModifyResultDetails() {
        return isAllowedToModifyResultDetails;
    }

    /**
     * Sets the value of the isAllowedToModifyResultDetails property.
     * 
     */
    public void setIsAllowedToModifyResultDetails(boolean value) {
        this.isAllowedToModifyResultDetails = value;
    }

    /**
     * Gets the value of the enableIncrementalScan property.
     * 
     */
    public boolean isEnableIncrementalScan() {
        return enableIncrementalScan;
    }

    /**
     * Sets the value of the enableIncrementalScan property.
     * 
     */
    public void setEnableIncrementalScan(boolean value) {
        this.enableIncrementalScan = value;
    }

    /**
     * Gets the value of the showSaaSPackageNotificationAndErrors property.
     * 
     */
    public boolean isShowSaaSPackageNotificationAndErrors() {
        return showSaaSPackageNotificationAndErrors;
    }

    /**
     * Sets the value of the showSaaSPackageNotificationAndErrors property.
     * 
     */
    public void setShowSaaSPackageNotificationAndErrors(boolean value) {
        this.showSaaSPackageNotificationAndErrors = value;
    }

    /**
     * Gets the value of the showSaaSPackageDetails property.
     * 
     */
    public boolean isShowSaaSPackageDetails() {
        return showSaaSPackageDetails;
    }

    /**
     * Sets the value of the showSaaSPackageDetails property.
     * 
     */
    public void setShowSaaSPackageDetails(boolean value) {
        this.showSaaSPackageDetails = value;
    }

    /**
     * Gets the value of the isAdviseChangePassword property.
     * 
     */
    public boolean isIsAdviseChangePassword() {
        return isAdviseChangePassword;
    }

    /**
     * Sets the value of the isAdviseChangePassword property.
     * 
     */
    public void setIsAdviseChangePassword(boolean value) {
        this.isAdviseChangePassword = value;
    }

    /**
     * Gets the value of the isAllowedToManageITSServers property.
     * 
     */
    public boolean isIsAllowedToManageITSServers() {
        return isAllowedToManageITSServers;
    }

    /**
     * Sets the value of the isAllowedToManageITSServers property.
     * 
     */
    public void setIsAllowedToManageITSServers(boolean value) {
        this.isAllowedToManageITSServers = value;
    }

    /**
     * Gets the value of the allowedToChangeNotExploitable property.
     * 
     */
    public boolean isAllowedToChangeNotExploitable() {
        return allowedToChangeNotExploitable;
    }

    /**
     * Sets the value of the allowedToChangeNotExploitable property.
     * 
     */
    public void setAllowedToChangeNotExploitable(boolean value) {
        this.allowedToChangeNotExploitable = value;
    }

    /**
     * Gets the value of the isAllowedToDeleteScans property.
     * 
     */
    public boolean isIsAllowedToDeleteScans() {
        return isAllowedToDeleteScans;
    }

    /**
     * Sets the value of the isAllowedToDeleteScans property.
     * 
     */
    public void setIsAllowedToDeleteScans(boolean value) {
        this.isAllowedToDeleteScans = value;
    }

}