
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSHeaderDisplayOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSHeaderDisplayOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Link2OnlineResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CheckmarxVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScanComments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScanType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SourceOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScanDensity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSHeaderDisplayOptions", propOrder = {
    "link2OnlineResults",
    "team",
    "checkmarxVersion",
    "scanComments",
    "scanType",
    "sourceOrigin",
    "scanDensity"
})
public class CxWSHeaderDisplayOptions {

    @XmlElement(name = "Link2OnlineResults")
    protected boolean link2OnlineResults;
    @XmlElement(name = "Team")
    protected boolean team;
    @XmlElement(name = "CheckmarxVersion")
    protected boolean checkmarxVersion;
    @XmlElement(name = "ScanComments")
    protected boolean scanComments;
    @XmlElement(name = "ScanType")
    protected boolean scanType;
    @XmlElement(name = "SourceOrigin")
    protected boolean sourceOrigin;
    @XmlElement(name = "ScanDensity")
    protected boolean scanDensity;

    /**
     * Gets the value of the link2OnlineResults property.
     * 
     */
    public boolean isLink2OnlineResults() {
        return link2OnlineResults;
    }

    /**
     * Sets the value of the link2OnlineResults property.
     * 
     */
    public void setLink2OnlineResults(boolean value) {
        this.link2OnlineResults = value;
    }

    /**
     * Gets the value of the team property.
     * 
     */
    public boolean isTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     */
    public void setTeam(boolean value) {
        this.team = value;
    }

    /**
     * Gets the value of the checkmarxVersion property.
     * 
     */
    public boolean isCheckmarxVersion() {
        return checkmarxVersion;
    }

    /**
     * Sets the value of the checkmarxVersion property.
     * 
     */
    public void setCheckmarxVersion(boolean value) {
        this.checkmarxVersion = value;
    }

    /**
     * Gets the value of the scanComments property.
     * 
     */
    public boolean isScanComments() {
        return scanComments;
    }

    /**
     * Sets the value of the scanComments property.
     * 
     */
    public void setScanComments(boolean value) {
        this.scanComments = value;
    }

    /**
     * Gets the value of the scanType property.
     * 
     */
    public boolean isScanType() {
        return scanType;
    }

    /**
     * Sets the value of the scanType property.
     * 
     */
    public void setScanType(boolean value) {
        this.scanType = value;
    }

    /**
     * Gets the value of the sourceOrigin property.
     * 
     */
    public boolean isSourceOrigin() {
        return sourceOrigin;
    }

    /**
     * Sets the value of the sourceOrigin property.
     * 
     */
    public void setSourceOrigin(boolean value) {
        this.sourceOrigin = value;
    }

    /**
     * Gets the value of the scanDensity property.
     * 
     */
    public boolean isScanDensity() {
        return scanDensity;
    }

    /**
     * Sets the value of the scanDensity property.
     * 
     */
    public void setScanDensity(boolean value) {
        this.scanDensity = value;
    }

}
