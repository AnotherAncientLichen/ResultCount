
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemResponse")
@XmlSeeAlso({
    CxWSIssueTrackingSystemRetrieveResponse.class,
    CxWSIssueTrackingSystemMetaResponse.class,
    CxWSIssueTrackingSystemSaveResponse.class
})
public class CxWSIssueTrackingSystemResponse
    extends CxWSBasicRepsonse
{


}
