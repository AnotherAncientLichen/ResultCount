
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSSingleResultCompareData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSSingleResultCompareData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSSingleResultData">
 *       &lt;sequence>
 *         &lt;element name="ScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ComparedToScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ComparedToScanPathId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QueryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSSingleResultCompareData", propOrder = {
    "scanId",
    "comparedToScanId",
    "comparedToScanPathId",
    "queryName"
})
public class CxWSSingleResultCompareData
    extends CxWSSingleResultData
{

    @XmlElement(name = "ScanId")
    protected long scanId;
    @XmlElement(name = "ComparedToScanId")
    protected long comparedToScanId;
    @XmlElement(name = "ComparedToScanPathId")
    protected long comparedToScanPathId;
    @XmlElement(name = "QueryName")
    protected String queryName;

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
     * Gets the value of the comparedToScanId property.
     * 
     */
    public long getComparedToScanId() {
        return comparedToScanId;
    }

    /**
     * Sets the value of the comparedToScanId property.
     * 
     */
    public void setComparedToScanId(long value) {
        this.comparedToScanId = value;
    }

    /**
     * Gets the value of the comparedToScanPathId property.
     * 
     */
    public long getComparedToScanPathId() {
        return comparedToScanPathId;
    }

    /**
     * Sets the value of the comparedToScanPathId property.
     * 
     */
    public void setComparedToScanPathId(long value) {
        this.comparedToScanPathId = value;
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

}
