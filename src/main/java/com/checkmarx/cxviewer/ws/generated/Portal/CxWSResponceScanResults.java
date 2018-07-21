
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponceScanResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponceScanResults">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://Checkmarx.com}ArrayOfCxWSSingleResultData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponceScanResults", propOrder = {
    "results"
})
public class CxWSResponceScanResults
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Results")
    protected ArrayOfCxWSSingleResultData results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSSingleResultData }
     *     
     */
    public ArrayOfCxWSSingleResultData getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSSingleResultData }
     *     
     */
    public void setResults(ArrayOfCxWSSingleResultData value) {
        this.results = value;
    }

}
