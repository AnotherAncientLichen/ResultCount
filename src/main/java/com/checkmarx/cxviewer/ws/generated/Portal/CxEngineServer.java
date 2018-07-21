
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxEngineServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxEngineServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxScans" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxScanLoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minScanLoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxEngineServer", propOrder = {
    "id",
    "uri",
    "maxScans",
    "serverName",
    "maxScanLoc",
    "minScanLoc"
})
public class CxEngineServer {

    protected long id;
    protected String uri;
    protected int maxScans;
    protected String serverName;
    protected int maxScanLoc;
    protected int minScanLoc;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the maxScans property.
     * 
     */
    public int getMaxScans() {
        return maxScans;
    }

    /**
     * Sets the value of the maxScans property.
     * 
     */
    public void setMaxScans(int value) {
        this.maxScans = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the maxScanLoc property.
     * 
     */
    public int getMaxScanLoc() {
        return maxScanLoc;
    }

    /**
     * Sets the value of the maxScanLoc property.
     * 
     */
    public void setMaxScanLoc(int value) {
        this.maxScanLoc = value;
    }

    /**
     * Gets the value of the minScanLoc property.
     * 
     */
    public int getMinScanLoc() {
        return minScanLoc;
    }

    /**
     * Sets the value of the minScanLoc property.
     * 
     */
    public void setMinScanLoc(int value) {
        this.minScanLoc = value;
    }

}
