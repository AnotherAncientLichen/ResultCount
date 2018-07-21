
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSImportQueriesRepsonse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSImportQueriesRepsonse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="importQueryStatus" type="{http://Checkmarx.com}ImportQueryStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSImportQueriesRepsonse", propOrder = {
    "requestId",
    "importQueryStatus"
})
public class CxWSImportQueriesRepsonse
    extends CxWSBasicRepsonse
{

    protected long requestId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ImportQueryStatus importQueryStatus;

    /**
     * Gets the value of the requestId property.
     * 
     */
    public long getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     */
    public void setRequestId(long value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the importQueryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ImportQueryStatus }
     *     
     */
    public ImportQueryStatus getImportQueryStatus() {
        return importQueryStatus;
    }

    /**
     * Sets the value of the importQueryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportQueryStatus }
     *     
     */
    public void setImportQueryStatus(ImportQueryStatus value) {
        this.importQueryStatus = value;
    }

}
