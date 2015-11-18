
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
 *         &lt;element ref="{https://www.fsicatalog.com/WebServices}InventoryRequest"/>
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
    "inventoryRequest"
})
@XmlRootElement(name = "InventoryInquiry", namespace = "http://www.fsicatalog.com/Webservices/")
public class InventoryInquiry {

    @XmlElement(name = "InventoryRequest", required = true, nillable = true)
    protected InventoryRequest inventoryRequest;

    /**
     * Gets the value of the inventoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryRequest }
     *     
     */
    public InventoryRequest getInventoryRequest() {
        return inventoryRequest;
    }

    /**
     * Sets the value of the inventoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryRequest }
     *     
     */
    public void setInventoryRequest(InventoryRequest value) {
        this.inventoryRequest = value;
    }

}
