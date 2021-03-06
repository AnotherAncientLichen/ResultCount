
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSReportStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSReportStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="IsReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsFailed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSReportStatusResponse", propOrder = {
    "isReady",
    "isFailed"
})
@XmlSeeAlso({
    CxWSProjectBranchingStatusResponse.class
})
public class CxWSReportStatusResponse
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "IsReady")
    protected boolean isReady;
    @XmlElement(name = "IsFailed")
    protected boolean isFailed;

    /**
     * Gets the value of the isReady property.
     * 
     */
    public boolean isIsReady() {
        return isReady;
    }

    /**
     * Sets the value of the isReady property.
     * 
     */
    public void setIsReady(boolean value) {
        this.isReady = value;
    }

    /**
     * Gets the value of the isFailed property.
     * 
     */
    public boolean isIsFailed() {
        return isFailed;
    }

    /**
     * Sets the value of the isFailed property.
     * 
     */
    public void setIsFailed(boolean value) {
        this.isFailed = value;
    }

}
