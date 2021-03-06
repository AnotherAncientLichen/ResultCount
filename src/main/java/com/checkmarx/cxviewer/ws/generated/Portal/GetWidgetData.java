
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="widgetId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parametersAsJSON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionId",
    "widgetId",
    "parametersAsJSON"
})
@XmlRootElement(name = "GetWidgetData")
public class GetWidgetData {

    protected String sessionId;
    protected int widgetId;
    protected String parametersAsJSON;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the widgetId property.
     * 
     */
    public int getWidgetId() {
        return widgetId;
    }

    /**
     * Sets the value of the widgetId property.
     * 
     */
    public void setWidgetId(int value) {
        this.widgetId = value;
    }

    /**
     * Gets the value of the parametersAsJSON property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersAsJSON() {
        return parametersAsJSON;
    }

    /**
     * Sets the value of the parametersAsJSON property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersAsJSON(String value) {
        this.parametersAsJSON = value;
    }

}
