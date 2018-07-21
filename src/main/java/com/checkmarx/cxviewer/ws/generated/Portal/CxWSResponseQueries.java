
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseQueries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseQueries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Queries" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseQueries", propOrder = {
    "queries"
})
public class CxWSResponseQueries
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Queries")
    protected byte[] queries;

    /**
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQueries(byte[] value) {
        this.queries = value;
    }

}
