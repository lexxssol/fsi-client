
package com.sheerimagination.businessobject.fulfillment.fsi.inventory.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inventory" type="{https://www.fsicatalog.com/WebServices}ArrayOfInventoryItem" minOccurs="0"/>
 *         &lt;element name="HighestSeverity" type="{https://www.fsicatalog.com/WebServices}NotificationSeverityType"/>
 *         &lt;element name="Notifications" type="{https://www.fsicatalog.com/WebServices}ArrayOfNotification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryReply", propOrder = {
    "inventory",
    "highestSeverity",
    "notifications"
})
public class InventoryReply {

    @XmlElement(name = "Inventory")
    protected ArrayOfInventoryItem inventory;
    @XmlElement(name = "HighestSeverity", required = true)
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications")
    protected ArrayOfNotification notifications;

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInventoryItem }
     *     
     */
    public ArrayOfInventoryItem getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInventoryItem }
     *     
     */
    public void setInventory(ArrayOfInventoryItem value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the highestSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Sets the value of the highestSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setHighestSeverity(NotificationSeverityType value) {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotification }
     *     
     */
    public ArrayOfNotification getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotification }
     *     
     */
    public void setNotifications(ArrayOfNotification value) {
        this.notifications = value;
    }

}
