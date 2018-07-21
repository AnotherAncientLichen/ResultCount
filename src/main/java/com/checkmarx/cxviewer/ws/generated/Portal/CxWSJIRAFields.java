
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSJIRAFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSJIRAFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JiraFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultValues" type="{http://Checkmarx.com}ArrayOfAnyType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Schema" type="{http://Checkmarx.com}CxWSJIRASchema" minOccurs="0"/>
 *         &lt;element name="AllowedValues" type="{http://Checkmarx.com}ArrayOfCxWSJIRAAllowedValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSJIRAFields", propOrder = {
    "jiraFieldName",
    "defaultValues",
    "name",
    "required",
    "schema",
    "allowedValues"
})
public class CxWSJIRAFields {

    @XmlElement(name = "JiraFieldName")
    protected String jiraFieldName;
    @XmlElement(name = "DefaultValues")
    protected ArrayOfAnyType defaultValues;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Required")
    protected boolean required;
    @XmlElement(name = "Schema")
    protected CxWSJIRASchema schema;
    @XmlElement(name = "AllowedValues")
    protected ArrayOfCxWSJIRAAllowedValues allowedValues;

    /**
     * Gets the value of the jiraFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJiraFieldName() {
        return jiraFieldName;
    }

    /**
     * Sets the value of the jiraFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJiraFieldName(String value) {
        this.jiraFieldName = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setDefaultValues(ArrayOfAnyType value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSJIRASchema }
     *     
     */
    public CxWSJIRASchema getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSJIRASchema }
     *     
     */
    public void setSchema(CxWSJIRASchema value) {
        this.schema = value;
    }

    /**
     * Gets the value of the allowedValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSJIRAAllowedValues }
     *     
     */
    public ArrayOfCxWSJIRAAllowedValues getAllowedValues() {
        return allowedValues;
    }

    /**
     * Sets the value of the allowedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSJIRAAllowedValues }
     *     
     */
    public void setAllowedValues(ArrayOfCxWSJIRAAllowedValues value) {
        this.allowedValues = value;
    }

}
