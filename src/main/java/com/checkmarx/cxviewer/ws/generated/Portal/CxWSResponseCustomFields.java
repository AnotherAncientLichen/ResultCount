
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseCustomFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseCustomFields">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="fieldsArray" type="{http://Checkmarx.com}ArrayOfCxWSCustomField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseCustomFields", propOrder = {
    "fieldsArray"
})
public class CxWSResponseCustomFields
    extends CxWSBasicRepsonse
{

    protected ArrayOfCxWSCustomField fieldsArray;

    /**
     * Gets the value of the fieldsArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSCustomField }
     *     
     */
    public ArrayOfCxWSCustomField getFieldsArray() {
        return fieldsArray;
    }

    /**
     * Sets the value of the fieldsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSCustomField }
     *     
     */
    public void setFieldsArray(ArrayOfCxWSCustomField value) {
        this.fieldsArray = value;
    }

}
