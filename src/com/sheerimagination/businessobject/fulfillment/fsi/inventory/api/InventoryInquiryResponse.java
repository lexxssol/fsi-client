
package com.sheerimagination.businessobject.fulfillment.fsi.inventory.api;

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
 *         &lt;element ref="{https://www.fsicatalog.com/WebServices}InventoryReply"/>
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
    "inventoryReply"
})
@XmlRootElement(name = "InventoryInquiryResponse", namespace = "http://www.fsicatalog.com/Webservices/")
public class InventoryInquiryResponse {

    @XmlElement(name = "InventoryReply", required = true, nillable = true)
    protected InventoryReply inventoryReply;

    /**
     * Gets the value of the inventoryReply property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryReply }
     *     
     */
    public InventoryReply getInventoryReply() {
        return inventoryReply;
    }

    /**
     * Sets the value of the inventoryReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryReply }
     *     
     */
    public void setInventoryReply(InventoryReply value) {
        this.inventoryReply = value;
    }

}
