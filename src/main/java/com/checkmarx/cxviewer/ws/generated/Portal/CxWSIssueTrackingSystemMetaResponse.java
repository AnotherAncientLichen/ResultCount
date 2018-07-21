
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSIssueTrackingSystemMetaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSIssueTrackingSystemMetaResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSIssueTrackingSystemResponse">
 *       &lt;sequence>
 *         &lt;element name="MetaData" type="{http://Checkmarx.com}CxWSIssueTrackingSystemMeta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSIssueTrackingSystemMetaResponse", propOrder = {
    "metaData"
})
public class CxWSIssueTrackingSystemMetaResponse
    extends CxWSIssueTrackingSystemResponse
{

    @XmlElement(name = "MetaData")
    protected CxWSIssueTrackingSystemMeta metaData;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSIssueTrackingSystemMeta }
     *     
     */
    public CxWSIssueTrackingSystemMeta getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSIssueTrackingSystemMeta }
     *     
     */
    public void setMetaData(CxWSIssueTrackingSystemMeta value) {
        this.metaData = value;
    }

}
