
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
 *         &lt;element name="CreateAndRunProjectResult" type="{http://Checkmarx.com}CxWSResponseRunID" minOccurs="0"/>
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
    "createAndRunProjectResult"
})
@XmlRootElement(name = "CreateAndRunProjectResponse")
public class CreateAndRunProjectResponse {

    @XmlElement(name = "CreateAndRunProjectResult")
    protected CxWSResponseRunID createAndRunProjectResult;

    /**
     * Gets the value of the createAndRunProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseRunID }
     *     
     */
    public CxWSResponseRunID getCreateAndRunProjectResult() {
        return createAndRunProjectResult;
    }

    /**
     * Sets the value of the createAndRunProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseRunID }
     *     
     */
    public void setCreateAndRunProjectResult(CxWSResponseRunID value) {
        this.createAndRunProjectResult = value;
    }

}
