
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResultSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResultSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QueryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cwe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResultSummary", propOrder = {
    "queryId",
    "queryName",
    "queryGroupName",
    "count",
    "severity",
    "cwe"
})
public class CxWSResultSummary {

    @XmlElement(name = "QueryId")
    protected long queryId;
    @XmlElement(name = "QueryName")
    protected String queryName;
    @XmlElement(name = "QueryGroupName")
    protected String queryGroupName;
    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "Severity")
    protected int severity;
    @XmlElement(name = "Cwe")
    protected long cwe;

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
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
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

}
