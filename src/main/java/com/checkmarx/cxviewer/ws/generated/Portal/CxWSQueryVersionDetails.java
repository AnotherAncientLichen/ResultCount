
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSQueryVersionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSQueryVersionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuerySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSQueryVersionDetails", propOrder = {
    "queryPath",
    "querySource"
})
public class CxWSQueryVersionDetails {

    @XmlElement(name = "QueryPath")
    protected String queryPath;
    @XmlElement(name = "QuerySource")
    protected String querySource;

    /**
     * Gets the value of the queryPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryPath() {
        return queryPath;
    }

    /**
     * Sets the value of the queryPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryPath(String value) {
        this.queryPath = value;
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

}
