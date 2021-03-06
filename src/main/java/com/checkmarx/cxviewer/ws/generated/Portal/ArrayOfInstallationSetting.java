
package com.checkmarx.cxviewer.ws.generated.Portal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInstallationSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInstallationSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstallationSetting" type="{http://Checkmarx.com}InstallationSetting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInstallationSetting", propOrder = {
    "installationSetting"
})
public class ArrayOfInstallationSetting {

    @XmlElement(name = "InstallationSetting", nillable = true)
    protected List<InstallationSetting> installationSetting;

    /**
     * Gets the value of the installationSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installationSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallationSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallationSetting }
     * 
     * 
     */
    public List<InstallationSetting> getInstallationSetting() {
        if (installationSetting == null) {
            installationSetting = new ArrayList<InstallationSetting>();
        }
        return this.installationSetting;
    }

}
