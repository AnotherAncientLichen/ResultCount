
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponsProjectProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponsProjectProperties">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="ProjectConfig" type="{http://Checkmarx.com}CxWSResponseProjectConfig" minOccurs="0"/>
 *         &lt;element name="ProjectChartData" type="{http://Checkmarx.com}CxWSResponsProjectChartData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponsProjectProperties", propOrder = {
    "projectConfig",
    "projectChartData"
})
public class CxWSResponsProjectProperties
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "ProjectConfig")
    protected CxWSResponseProjectConfig projectConfig;
    @XmlElement(name = "ProjectChartData")
    protected CxWSResponsProjectChartData projectChartData;

    /**
     * Gets the value of the projectConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseProjectConfig }
     *     
     */
    public CxWSResponseProjectConfig getProjectConfig() {
        return projectConfig;
    }

    /**
     * Sets the value of the projectConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseProjectConfig }
     *     
     */
    public void setProjectConfig(CxWSResponseProjectConfig value) {
        this.projectConfig = value;
    }

    /**
     * Gets the value of the projectChartData property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponsProjectChartData }
     *     
     */
    public CxWSResponsProjectChartData getProjectChartData() {
        return projectChartData;
    }

    /**
     * Sets the value of the projectChartData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponsProjectChartData }
     *     
     */
    public void setProjectChartData(CxWSResponsProjectChartData value) {
        this.projectChartData = value;
    }

}
