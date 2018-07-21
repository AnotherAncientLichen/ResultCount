
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditScanResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditScanResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QueryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuerySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueryGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CWE" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QueryVersionCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DebugMessages" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="CompilationMessages" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="PathPerResult" type="{http://Checkmarx.com}ArrayOfCxWSResultPath" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditScanResult", propOrder = {
    "queryId",
    "queryName",
    "querySource",
    "severity",
    "queryGroupName",
    "cwe",
    "queryVersionCode",
    "debugMessages",
    "compilationMessages",
    "pathPerResult"
})
public class AuditScanResult {

    @XmlElement(name = "QueryId")
    protected long queryId;
    @XmlElement(name = "QueryName")
    protected String queryName;
    @XmlElement(name = "QuerySource")
    protected String querySource;
    @XmlElement(name = "Severity")
    protected int severity;
    @XmlElement(name = "QueryGroupName")
    protected String queryGroupName;
    @XmlElement(name = "CWE")
    protected long cwe;
    @XmlElement(name = "QueryVersionCode")
    protected long queryVersionCode;
    @XmlElement(name = "DebugMessages")
    protected ArrayOfString debugMessages;
    @XmlElement(name = "CompilationMessages")
    protected ArrayOfString compilationMessages;
    @XmlElement(name = "PathPerResult")
    protected ArrayOfCxWSResultPath pathPerResult;

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
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the querySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuerySource() {
        return querySource;
    }

    /**
     * Sets the value of the querySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuerySource(String value) {
        this.querySource = value;
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
     * Gets the value of the queryGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryGroupName() {
        return queryGroupName;
    }

    /**
     * Sets the value of the queryGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryGroupName(String value) {
        this.queryGroupName = value;
    }

    /**
     * Gets the value of the cwe property.
     * 
     */
    public long getCWE() {
        return cwe;
    }

    /**
     * Sets the value of the cwe property.
     * 
     */
    public void setCWE(long value) {
        this.cwe = value;
    }

    /**
     * Gets the value of the queryVersionCode property.
     * 
     */
    public long getQueryVersionCode() {
        return queryVersionCode;
    }

    /**
     * Sets the value of the queryVersionCode property.
     * 
     */
    public void setQueryVersionCode(long value) {
        this.queryVersionCode = value;
    }

    /**
     * Gets the value of the debugMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDebugMessages() {
        return debugMessages;
    }

    /**
     * Sets the value of the debugMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDebugMessages(ArrayOfString value) {
        this.debugMessages = value;
    }

    /**
     * Gets the value of the compilationMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCompilationMessages() {
        return compilationMessages;
    }

    /**
     * Sets the value of the compilationMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCompilationMessages(ArrayOfString value) {
        this.compilationMessages = value;
    }

    /**
     * Gets the value of the pathPerResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResultPath }
     *     
     */
    public ArrayOfCxWSResultPath getPathPerResult() {
        return pathPerResult;
    }

    /**
     * Sets the value of the pathPerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResultPath }
     *     
     */
    public void setPathPerResult(ArrayOfCxWSResultPath value) {
        this.pathPerResult = value;
    }

}
