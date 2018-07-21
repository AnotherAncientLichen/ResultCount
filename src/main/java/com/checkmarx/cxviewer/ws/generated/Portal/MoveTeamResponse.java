
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
 *         &lt;element name="MoveTeamResult" type="{http://Checkmarx.com}CxWSCxMoveTeamResponse" minOccurs="0"/>
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
    "moveTeamResult"
})
@XmlRootElement(name = "MoveTeamResponse")
public class MoveTeamResponse {

    @XmlElement(name = "MoveTeamResult")
    protected CxWSCxMoveTeamResponse moveTeamResult;

    /**
     * Gets the value of the moveTeamResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSCxMoveTeamResponse }
     *     
     */
    public CxWSCxMoveTeamResponse getMoveTeamResult() {
        return moveTeamResult;
    }

    /**
     * Sets the value of the moveTeamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSCxMoveTeamResponse }
     *     
     */
    public void setMoveTeamResult(CxWSCxMoveTeamResponse value) {
        this.moveTeamResult = value;
    }

}
