
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemLanguage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemLanguage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageLCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemLanguage", propOrder = {
    "languageLCID",
    "isDefault"
})
public class SystemLanguage {

    protected int languageLCID;
    protected boolean isDefault;

    /**
     * Gets the value of the languageLCID property.
     * 
     */
    public int getLanguageLCID() {
        return languageLCID;
    }

    /**
     * Sets the value of the languageLCID property.
     * 
     */
    public void setLanguageLCID(int value) {
        this.languageLCID = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

}
