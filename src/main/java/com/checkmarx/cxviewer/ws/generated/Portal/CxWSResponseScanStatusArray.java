
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseScanStatusArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseScanStatusArray">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="statusArr" type="{http://Checkmarx.com}ArrayOfCxWSResponseScanStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseScanStatusArray", propOrder = {
    "statusArr"
})
public class CxWSResponseScanStatusArray
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxWSResponseScanStatus statusArr;

    /**
     * Gets the value of the statusArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSResponseScanStatus }
     *     
     */
    public ArrayOfCxWSResponseScanStatus getStatusArr() {
        return statusArr;
    }

    /**
     * Sets the value of the statusArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSResponseScanStatus }
     *     
     */
    public void setStatusArr(ArrayOfCxWSResponseScanStatus value) {
        this.statusArr = value;
    }

}
