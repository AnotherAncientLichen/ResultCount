
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseScansDisplayData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseScansDisplayData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ScanList" type="{http://Checkmarx.com}ArrayOfScanDisplayData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseScansDisplayData", propOrder = {
    "scanList"
})
public class CxWSResponseScansDisplayData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ScanList")
    protected ArrayOfScanDisplayData scanList;

    /**
     * Gets the value of the scanList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScanDisplayData }
     *     
     */
    public ArrayOfScanDisplayData getScanList() {
        return scanList;
    }

    /**
     * Sets the value of the scanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScanDisplayData }
     *     
     */
    public void setScanList(ArrayOfScanDisplayData value) {
        this.scanList = value;
    }

}
