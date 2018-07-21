
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSTransportedQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSTransportedQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cwe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsExecutable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LanguageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EngineMetadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSTransportedQuery", propOrder = {
    "queryId",
    "name",
    "packageId",
    "cwe",
    "isExecutable",
    "severity",
    "languageName",
    "packageTypeName",
    "groupName",
    "source",
    "engineMetadata"
})
public class CxWSTransportedQuery {

    @XmlElement(name = "QueryId")
    protected long queryId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PackageId")
    protected long packageId;
    @XmlElement(name = "Cwe")
    protected long cwe;
    @XmlElement(name = "IsExecutable")
    protected boolean isExecutable;
    @XmlElement(name = "Severity")
    protected int severity;
    @XmlElement(name = "LanguageName")
    protected String languageName;
    @XmlElement(name = "PackageTypeName")
    protected String packageTypeName;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "EngineMetadata")
    protected String engineMetadata;

    /**
     * Gets the value of the queryId property.
     * 
     */
    public long getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     */
    public void setQueryId(long value) {
        this.queryId = value;
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
     * Gets the value of the packageId property.
     * 
     */
    public long getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     */
    public void setPackageId(long value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the cwe property.
     * 
     */
    public long getCwe() {
        return cwe;
    }

    /**
     * Sets the value of the cwe property.
     * 
     */
    public void setCwe(long value) {
        this.cwe = value;
    }

    /**
     * Gets the value of the isExecutable property.
     * 
     */
    public boolean isIsExecutable() {
        return isExecutable;
    }

    /**
     * Sets the value of the isExecutable property.
     * 
     */
    public void setIsExecutable(boolean value) {
        this.isExecutable = value;
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
     * Gets the value of the languageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

    /**
     * Gets the value of the packageTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeName() {
        return packageTypeName;
    }

    /**
     * Sets the value of the packageTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeName(String value) {
        this.packageTypeName = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the engineMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineMetadata() {
        return engineMetadata;
    }

    /**
     * Sets the value of the engineMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineMetadata(String value) {
        this.engineMetadata = value;
    }

}
