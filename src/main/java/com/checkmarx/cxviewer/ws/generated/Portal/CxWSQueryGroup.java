
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CxWSQueryGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSQueryGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Impacts" type="{http://Checkmarx.com}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Queries" type="{http://Checkmarx.com}ArrayOfCxWSQuery" minOccurs="0"/>
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LanguageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PackageType" type="{http://Checkmarx.com}CxWSPackageTypeEnum"/>
 *         &lt;element name="PackageFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwningTeam" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Status" type="{http://Checkmarx.com}QueryStatus"/>
 *         &lt;element name="LanguageStateHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageStateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSQueryGroup", propOrder = {
    "name",
    "impacts",
    "packageId",
    "queries",
    "isReadOnly",
    "isEncrypted",
    "description",
    "language",
    "languageName",
    "packageTypeName",
    "projectId",
    "packageType",
    "packageFullName",
    "owningTeam",
    "status",
    "languageStateHash",
    "languageStateDate"
})
public class CxWSQueryGroup {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Impacts")
    protected ArrayOfInt impacts;
    @XmlElement(name = "PackageId")
    protected long packageId;
    @XmlElement(name = "Queries")
    protected ArrayOfCxWSQuery queries;
    @XmlElement(name = "IsReadOnly")
    protected boolean isReadOnly;
    @XmlElement(name = "IsEncrypted")
    protected boolean isEncrypted;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Language")
    protected int language;
    @XmlElement(name = "LanguageName")
    protected String languageName;
    @XmlElement(name = "PackageTypeName")
    protected String packageTypeName;
    @XmlElement(name = "ProjectId")
    protected long projectId;
    @XmlElement(name = "PackageType", required = true)
    @XmlSchemaType(name = "string")
    protected CxWSPackageTypeEnum packageType;
    @XmlElement(name = "PackageFullName")
    protected String packageFullName;
    @XmlElement(name = "OwningTeam", required = true)
    protected String owningTeam;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected QueryStatus status;
    @XmlElement(name = "LanguageStateHash")
    protected String languageStateHash;
    @XmlElement(name = "LanguageStateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar languageStateDate;

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
     * Gets the value of the impacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getImpacts() {
        return impacts;
    }

    /**
     * Sets the value of the impacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setImpacts(ArrayOfInt value) {
        this.impacts = value;
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
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSQuery }
     *     
     */
    public ArrayOfCxWSQuery getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSQuery }
     *     
     */
    public void setQueries(ArrayOfCxWSQuery value) {
        this.queries = value;
    }

    /**
     * Gets the value of the isReadOnly property.
     * 
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     */
    public void setIsReadOnly(boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the isEncrypted property.
     * 
     */
    public boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Sets the value of the isEncrypted property.
     * 
     */
    public void setIsEncrypted(boolean value) {
        this.isEncrypted = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the language property.
     * 
     */
    public int getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     */
    public void setLanguage(int value) {
        this.language = value;
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
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSPackageTypeEnum }
     *     
     */
    public CxWSPackageTypeEnum getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSPackageTypeEnum }
     *     
     */
    public void setPackageType(CxWSPackageTypeEnum value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the packageFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageFullName() {
        return packageFullName;
    }

    /**
     * Sets the value of the packageFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageFullName(String value) {
        this.packageFullName = value;
    }

    /**
     * Gets the value of the owningTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwningTeam() {
        return owningTeam;
    }

    /**
     * Sets the value of the owningTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwningTeam(String value) {
        this.owningTeam = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueryStatus }
     *     
     */
    public QueryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStatus }
     *     
     */
    public void setStatus(QueryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the languageStateHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageStateHash() {
        return languageStateHash;
    }

    /**
     * Sets the value of the languageStateHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageStateHash(String value) {
        this.languageStateHash = value;
    }

    /**
     * Gets the value of the languageStateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLanguageStateDate() {
        return languageStateDate;
    }

    /**
     * Sets the value of the languageStateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLanguageStateDate(XMLGregorianCalendar value) {
        this.languageStateDate = value;
    }

}
