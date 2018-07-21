
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseTeamData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseTeamData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="TeamDataList" type="{http://Checkmarx.com}ArrayOfTeamData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseTeamData", propOrder = {
    "teamDataList"
})
public class CxWSResponseTeamData
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "TeamDataList")
    protected ArrayOfTeamData teamDataList;

    /**
     * Gets the value of the teamDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTeamData }
     *     
     */
    public ArrayOfTeamData getTeamDataList() {
        return teamDataList;
    }

    /**
     * Sets the value of the teamDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTeamData }
     *     
     */
    public void setTeamDataList(ArrayOfTeamData value) {
        this.teamDataList = value;
    }

}
