
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataRetentionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRetentionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOfScansToKeep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRetentionSettings", propOrder = {
    "numOfScansToKeep"
})
public class DataRetentionSettings {

    @XmlElement(name = "NumOfScansToKeep")
    protected int numOfScansToKeep;

    /**
     * Gets the value of the numOfScansToKeep property.
     * 
     */
    public int getNumOfScansToKeep() {
        return numOfScansToKeep;
    }

    /**
     * Sets the value of the numOfScansToKeep property.
     * 
     */
    public void setNumOfScansToKeep(int value) {
        this.numOfScansToKeep = value;
    }

}
