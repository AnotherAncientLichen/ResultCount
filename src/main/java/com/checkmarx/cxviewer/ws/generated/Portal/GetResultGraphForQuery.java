
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maxNodes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="graphType" type="{http://Checkmarx.com}CxWSGraphTypeEnum"/>
 *         &lt;element name="includeNotExploitable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "scanId",
    "queryId",
    "maxNodes",
    "graphType",
    "includeNotExploitable"
})
@XmlRootElement(name = "GetResultGraphForQuery")
public class GetResultGraphForQuery {

    protected String sessionId;
    protected long scanId;
    protected long queryId;
    protected int maxNodes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CxWSGraphTypeEnum graphType;
    protected boolean includeNotExploitable;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the scanId property.
     * 
     */
    public long getScanId() {
        return scanId;
    }

    /**
     * Sets the value of the scanId property.
     * 
     */
    public void setScanId(long value) {
        this.scanId = value;
    }

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
     * Gets the value of the maxNodes property.
     * 
     */
    public int getMaxNodes() {
        return maxNodes;
    }

    /**
     * Sets the value of the maxNodes property.
     * 
     */
    public void setMaxNodes(int value) {
        this.maxNodes = value;
    }

    /**
     * Gets the value of the graphType property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSGraphTypeEnum }
     *     
     */
    public CxWSGraphTypeEnum getGraphType() {
        return graphType;
    }

    /**
     * Sets the value of the graphType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSGraphTypeEnum }
     *     
     */
    public void setGraphType(CxWSGraphTypeEnum value) {
        this.graphType = value;
    }

    /**
     * Gets the value of the includeNotExploitable property.
     * 
     */
    public boolean isIncludeNotExploitable() {
        return includeNotExploitable;
    }

    /**
     * Sets the value of the includeNotExploitable property.
     * 
     */
    public void setIncludeNotExploitable(boolean value) {
        this.includeNotExploitable = value;
    }

}
