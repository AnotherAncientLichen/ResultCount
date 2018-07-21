
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseResultCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseResultCollection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ResultCollection" type="{http://Checkmarx.com}AuditResultsCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseResultCollection", propOrder = {
    "resultCollection"
})
public class CxWSResponseResultCollection
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ResultCollection")
    protected AuditResultsCollection resultCollection;

    /**
     * Gets the value of the resultCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AuditResultsCollection }
     *     
     */
    public AuditResultsCollection getResultCollection() {
        return resultCollection;
    }

    /**
     * Sets the value of the resultCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditResultsCollection }
     *     
     */
    public void setResultCollection(AuditResultsCollection value) {
        this.resultCollection = value;
    }

}
