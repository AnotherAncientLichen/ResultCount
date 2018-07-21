
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseCountLines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseCountLines">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="NumOfLines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseCountLines", propOrder = {
    "numOfLines"
})
public class CxWSResponseCountLines
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "NumOfLines")
    protected int numOfLines;

    /**
     * Gets the value of the numOfLines property.
     * 
     */
    public int getNumOfLines() {
        return numOfLines;
    }

    /**
     * Sets the value of the numOfLines property.
     * 
     */
    public void setNumOfLines(int value) {
        this.numOfLines = value;
    }

}
