
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSBasicRepsonse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSBasicRepsonse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsSuccesfull" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSBasicRepsonse", propOrder = {
    "isSuccesfull",
    "errorMessage"
})
@XmlSeeAlso({
    CxWSResponseLicenseExpirationDateDetails.class,
    CxWSResponsProjectChartData.class,
    CxWSResponseGroupList.class,
    CXWSResponseResultSummary.class,
    CxWSResponseScanStatusArray.class,
    CxWSResponseProjectScannedDisplayData.class,
    CxWSResponceScanCompareResults.class,
    CxWSResponsePresetDetails.class,
    CxWSResponseScanStatus.class,
    CxTeamPathsResponseResponse.class,
    CxWSReportStatusResponse.class,
    CxWSResponseRunID.class,
    CxWSResponseFailedScansDisplayData.class,
    CxWSResponseBool.class,
    CxWSResponseDeleteScans.class,
    CxWSResponsePreset.class,
    CxWSResponseCustomFields.class,
    CxWSResponseHierarchyGroupNodes.class,
    CxWSResponseSaasPackage.class,
    CxWSResponseScansDisplayData.class,
    CxWSResponsePresetList.class,
    CxWSResponseTeamData.class,
    CxWSResponseProfileData.class,
    CxWSResponseProjectConfig.class,
    CxWSResponseCache.class,
    CxWSResponseScanCompareSummary.class,
    CxWSResponceScanResults.class,
    CxWSResponceResultPath.class,
    CxWSResponseQueriesCategories.class,
    CxWSResponseResultGraph.class,
    CxWSResponseUserData.class,
    CxWSImportQueriesRepsonse.class,
    CxWSResponseConfigSetList.class,
    CxWSResponceFileNames.class,
    CxWSCxVersionResponse.class,
    CxWSResponsePivotLayouts.class,
    CxWSResponseAssignUsers.class,
    CxWSResponseSingleUserData.class,
    CxWSResponsePendingUsersList.class,
    CxWSResponseQueryDescription.class,
    CxWSResponseProjectsScansList.class,
    CxWSResponseEngineServerId.class,
    CxWSResponseProjectsDisplayData.class,
    CxWSResponseScanLog.class,
    CxWSResponseResultStateList.class,
    CxWSResponseScanResults.class,
    CxWSResponseJSONData.class,
    CxWSResponseFileSystemLayer.class,
    CxWSCxMoveTeamResponse.class,
    CxQueryCollectionResponse.class,
    CxWSResponseInstallationSettings.class,
    CxWSResponseEngineServers.class,
    CxWSResponceQuerisForScan.class,
    CxWSResponseSystemLanguages.class,
    CxWSQueryVersionDetailsResponse.class,
    CxWSResponseNameList.class,
    CxWSResponseBasicScanData.class,
    CxWsResponseSystemSettings.class,
    CxWSUserPreferencesResponse.class,
    CxWSDataRetentionStatusResponse.class,
    CxWSResponseQueries.class,
    CxWSResponseScanSummary.class,
    CxWSResponseCustomFieldValues.class,
    CxWSResponseSourcesContent.class,
    CxWSResponseProjectsData.class,
    CxWSDataRetentionRequestResponse.class,
    CxWSResponseLDAPServersConfiguration.class,
    CxWSCreateReportResponse.class,
    CxWSResponseScanProperties.class,
    CxWSResponsePivotTable.class,
    CxWSResponseUserDirectories.class,
    CxWSResponseDomainUserList.class,
    CxWSResponsePredefinedCommands.class,
    CxWSResponseResultDescription.class,
    CxWSResponseQueueRunID.class,
    CxWSResponseShortQueryDescription.class,
    CxWSResponseCountLines.class,
    CxWSResponseResultCollection.class,
    CxWSResponseSourceActionList.class,
    CxWSResponseSourceID.class,
    CxWSResponseResultPaths.class,
    CxWSResponseResultStateUpdate.class,
    CxWSResponseLDAPServerGroups.class,
    CxWSResponseTransportedQueries.class,
    CxWSResponseDeleteProjects.class,
    CxWSResponseSourceContent.class,
    CxWSResponsProjectProperties.class,
    CxWSResponseIdNamePairList.class,
    CxWSResponseTeamLdapGroupMappingData.class,
    CxWSResponseSourceContainer.class,
    CxWSResponseSessionID.class,
    CxWSResponseUsersLicenseData.class,
    CxWSIssueTrackingSystemResponse.class
})
public class CxWSBasicRepsonse {

    @XmlElement(name = "IsSuccesfull")
    protected boolean isSuccesfull;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the isSuccesfull property.
     * 
     */
    public boolean isIsSuccesfull() {
        return isSuccesfull;
    }

    /**
     * Sets the value of the isSuccesfull property.
     * 
     */
    public void setIsSuccesfull(boolean value) {
        this.isSuccesfull = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
