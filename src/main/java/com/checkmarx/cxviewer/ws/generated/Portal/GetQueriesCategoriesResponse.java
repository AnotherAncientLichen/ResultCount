
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
 *         &lt;element name="GetQueriesCategoriesResult" type="{http://Checkmarx.com}CxWSResponseQueriesCategories" minOccurs="0"/>
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
    "getQueriesCategoriesResult"
})
@XmlRootElement(name = "GetQueriesCategoriesResponse")
public class GetQueriesCategoriesResponse {

    @XmlElement(name = "GetQueriesCategoriesResult")
    protected CxWSResponseQueriesCategories getQueriesCategoriesResult;

    /**
     * Gets the value of the getQueriesCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseQueriesCategories }
     *     
     */
    public CxWSResponseQueriesCategories getGetQueriesCategoriesResult() {
        return getQueriesCategoriesResult;
    }

    /**
     * Sets the value of the getQueriesCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseQueriesCategories }
     *     
     */
    public void setGetQueriesCategoriesResult(CxWSResponseQueriesCategories value) {
        this.getQueriesCategoriesResult = value;
    }

}
