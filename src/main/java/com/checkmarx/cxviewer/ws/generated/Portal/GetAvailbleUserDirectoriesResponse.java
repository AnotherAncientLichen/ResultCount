
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAvailbleUserDirectoriesResult" type="{http://Checkmarx.com}CxWSResponseUserDirectories" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAvailbleUserDirectoriesResult"
})
@XmlRootElement(name = "GetAvailbleUserDirectoriesResponse")
public class GetAvailbleUserDirectoriesResponse {

    @XmlElement(name = "GetAvailbleUserDirectoriesResult")
    protected CxWSResponseUserDirectories getAvailbleUserDirectoriesResult;

    /**
     * Gets the value of the getAvailbleUserDirectoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseUserDirectories }
     *     
     */
    public CxWSResponseUserDirectories getGetAvailbleUserDirectoriesResult() {
        return getAvailbleUserDirectoriesResult;
    }

    /**
     * Sets the value of the getAvailbleUserDirectoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseUserDirectories }
     *     
     */
    public void setGetAvailbleUserDirectoriesResult(CxWSResponseUserDirectories value) {
        this.getAvailbleUserDirectoriesResult = value;
    }

}
