
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseTransportedQueries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseTransportedQueries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Queries" type="{http://Checkmarx.com}ArrayOfCxWSTransportedQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseTransportedQueries", propOrder = {
    "queries"
})
@XmlSeeAlso({
    CxWSResponseExistsingTransportedPresetQueries.class
})
public class CxWSResponseTransportedQueries
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Queries")
    protected ArrayOfCxWSTransportedQuery queries;

    /**
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSTransportedQuery }
     *     
     */
    public ArrayOfCxWSTransportedQuery getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSTransportedQuery }
     *     
     */
    public void setQueries(ArrayOfCxWSTransportedQuery value) {
        this.queries = value;
    }

}
