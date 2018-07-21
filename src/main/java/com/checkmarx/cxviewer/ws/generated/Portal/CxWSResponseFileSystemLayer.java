
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseFileSystemLayer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseFileSystemLayer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="FolderList" type="{http://Checkmarx.com}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseFileSystemLayer", propOrder = {
    "folderList"
})
public class CxWSResponseFileSystemLayer
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "FolderList")
    protected ArrayOfString folderList;

    /**
     * Gets the value of the folderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFolderList() {
        return folderList;
    }

    /**
     * Sets the value of the folderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFolderList(ArrayOfString value) {
        this.folderList = value;
    }

}
