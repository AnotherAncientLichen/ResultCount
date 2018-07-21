
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseShortQueryDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseShortQueryDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="QueryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CweId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QueryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseShortQueryDescription", propOrder = {
    "queryId",
    "cweId",
    "queryDescription"
})
public class CxWSResponseShortQueryDescription
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "QueryId")
    protected long queryId;
    @XmlElement(name = "CweId")
    protected long cweId;
    @XmlElement(name = "QueryDescription")
    protected String queryDescription;

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
     * Gets the value of the cweId property.
     * 
     */
    public long getCweId() {
        return cweId;
    }

    /**
     * Sets the value of the cweId property.
     * 
     */
    public void setCweId(long value) {
        this.cweId = value;
    }

    /**
     * Gets the value of the queryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryDescription() {
        return queryDescription;
    }

    /**
     * Sets the value of the queryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryDescription(String value) {
        this.queryDescription = value;
    }

}
