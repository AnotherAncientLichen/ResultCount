
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseFailedScansDisplayData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseFailedScansDisplayData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="FailedScansList" type="{http://Checkmarx.com}ArrayOfFailedScansDisplayData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseFailedScansDisplayData", propOrder = {
    "failedScansList"
})
public class CxWSResponseFailedScansDisplayData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "FailedScansList")
    protected ArrayOfFailedScansDisplayData failedScansList;

    /**
     * Gets the value of the failedScansList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFailedScansDisplayData }
     *     
     */
    public ArrayOfFailedScansDisplayData getFailedScansList() {
        return failedScansList;
    }

    /**
     * Sets the value of the failedScansList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFailedScansDisplayData }
     *     
     */
    public void setFailedScansList(ArrayOfFailedScansDisplayData value) {
        this.failedScansList = value;
    }

}
