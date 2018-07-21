
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponceQuerisForScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponceQuerisForScan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Queries" type="{http://Checkmarx.com}ArrayOfCxWSQueryVulnerabilityData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponceQuerisForScan", propOrder = {
    "queries"
})
public class CxWSResponceQuerisForScan
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Queries")
    protected ArrayOfCxWSQueryVulnerabilityData queries;

    /**
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSQueryVulnerabilityData }
     *     
     */
    public ArrayOfCxWSQueryVulnerabilityData getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSQueryVulnerabilityData }
     *     
     */
    public void setQueries(ArrayOfCxWSQueryVulnerabilityData value) {
        this.queries = value;
    }

}
