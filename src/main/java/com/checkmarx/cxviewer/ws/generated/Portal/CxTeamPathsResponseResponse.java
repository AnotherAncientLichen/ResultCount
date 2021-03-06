
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxTeamPathsResponseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxTeamPathsResponseResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="sourceTeamFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationTeamFullPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxTeamPathsResponseResponse", propOrder = {
    "sourceTeamFullPath",
    "destinationTeamFullPath"
})
public class CxTeamPathsResponseResponse
    extends CxWSBasicRepsonse
{

    protected String sourceTeamFullPath;
    protected String destinationTeamFullPath;

    /**
     * Gets the value of the sourceTeamFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTeamFullPath() {
        return sourceTeamFullPath;
    }

    /**
     * Sets the value of the sourceTeamFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTeamFullPath(String value) {
        this.sourceTeamFullPath = value;
    }

    /**
     * Gets the value of the destinationTeamFullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTeamFullPath() {
        return destinationTeamFullPath;
    }

    /**
     * Sets the value of the destinationTeamFullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTeamFullPath(String value) {
        this.destinationTeamFullPath = value;
    }

}
