
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponceScanCompareResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponceScanCompareResults">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://Checkmarx.com}ArrayOfCxWSSingleResultCompareData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponceScanCompareResults", propOrder = {
    "results"
})
public class CxWSResponceScanCompareResults
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Results")
    protected ArrayOfCxWSSingleResultCompareData results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSSingleResultCompareData }
     *     
     */
    public ArrayOfCxWSSingleResultCompareData getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSSingleResultCompareData }
     *     
     */
    public void setResults(ArrayOfCxWSSingleResultCompareData value) {
        this.results = value;
    }

}
