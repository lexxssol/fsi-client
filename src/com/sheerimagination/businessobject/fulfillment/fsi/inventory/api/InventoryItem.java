
package com.sheerimagination.businessobject.fulfillment.fsi.inventory.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LongItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://www.fsicatalog.com/WebServices}InventoryStatus"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityOnHand" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuantityAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuantityCommitted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuantityOnReorder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReorderPoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReorderQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastReceiptQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CartonQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MasterUPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DimensionUPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryItem", propOrder = {
    "longItemNumber",
    "shortItemNumber",
    "size",
    "color",
    "status",
    "description",
    "quantityOnHand",
    "quantityAvailable",
    "quantityCommitted",
    "quantityBackOrdered",
    "quantityOnReorder",
    "inventoryType",
    "reorderPoint",
    "reorderQuantity",
    "lastReceiptDate",
    "lastReceiptQuantity",
    "category",
    "sellingUnit",
    "cartonQuantity",
    "price",
    "weight",
    "masterUPC",
    "dimensionUPC"
})
public class InventoryItem {

    @XmlElement(name = "LongItemNumber")
    protected String longItemNumber;
    @XmlElement(name = "ShortItemNumber")
    protected String shortItemNumber;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Status", required = true)
    protected InventoryStatus status;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "QuantityOnHand")
    protected int quantityOnHand;
    @XmlElement(name = "QuantityAvailable")
    protected int quantityAvailable;
    @XmlElement(name = "QuantityCommitted")
    protected int quantityCommitted;
    @XmlElement(name = "QuantityBackOrdered")
    protected int quantityBackOrdered;
    @XmlElement(name = "QuantityOnReorder")
    protected int quantityOnReorder;
    @XmlElement(name = "InventoryType")
    protected String inventoryType;
    @XmlElement(name = "ReorderPoint")
    protected int reorderPoint;
    @XmlElement(name = "ReorderQuantity")
    protected int reorderQuantity;
    @XmlElement(name = "LastReceiptDate")
    protected String lastReceiptDate;
    @XmlElement(name = "LastReceiptQuantity")
    protected int lastReceiptQuantity;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "SellingUnit")
    protected String sellingUnit;
    @XmlElement(name = "CartonQuantity")
    protected int cartonQuantity;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "MasterUPC")
    protected String masterUPC;
    @XmlElement(name = "DimensionUPC")
    protected String dimensionUPC;

    /**
     * Gets the value of the longItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongItemNumber() {
        return longItemNumber;
    }

    /**
     * Sets the value of the longItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongItemNumber(String value) {
        this.longItemNumber = value;
    }

    /**
     * Gets the value of the shortItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortItemNumber() {
        return shortItemNumber;
    }

    /**
     * Sets the value of the shortItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortItemNumber(String value) {
        this.shortItemNumber = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatus }
     *     
     */
    public InventoryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatus }
     *     
     */
    public void setStatus(InventoryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     */
    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     */
    public void setQuantityOnHand(int value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     */
    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     */
    public void setQuantityAvailable(int value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     */
    public int getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * Sets the value of the quantityCommitted property.
     * 
     */
    public void setQuantityCommitted(int value) {
        this.quantityCommitted = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     */
    public int getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     * 
     */
    public void setQuantityBackOrdered(int value) {
        this.quantityBackOrdered = value;
    }

    /**
     * Gets the value of the quantityOnReorder property.
     * 
     */
    public int getQuantityOnReorder() {
        return quantityOnReorder;
    }

    /**
     * Sets the value of the quantityOnReorder property.
     * 
     */
    public void setQuantityOnReorder(int value) {
        this.quantityOnReorder = value;
    }

    /**
     * Gets the value of the inventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * Sets the value of the inventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryType(String value) {
        this.inventoryType = value;
    }

    /**
     * Gets the value of the reorderPoint property.
     * 
     */
    public int getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     */
    public void setReorderPoint(int value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the reorderQuantity property.
     * 
     */
    public int getReorderQuantity() {
        return reorderQuantity;
    }

    /**
     * Sets the value of the reorderQuantity property.
     * 
     */
    public void setReorderQuantity(int value) {
        this.reorderQuantity = value;
    }

    /**
     * Gets the value of the lastReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReceiptDate() {
        return lastReceiptDate;
    }

    /**
     * Sets the value of the lastReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReceiptDate(String value) {
        this.lastReceiptDate = value;
    }

    /**
     * Gets the value of the lastReceiptQuantity property.
     * 
     */
    public int getLastReceiptQuantity() {
        return lastReceiptQuantity;
    }

    /**
     * Sets the value of the lastReceiptQuantity property.
     * 
     */
    public void setLastReceiptQuantity(int value) {
        this.lastReceiptQuantity = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the sellingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingUnit() {
        return sellingUnit;
    }

    /**
     * Sets the value of the sellingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingUnit(String value) {
        this.sellingUnit = value;
    }

    /**
     * Gets the value of the cartonQuantity property.
     * 
     */
    public int getCartonQuantity() {
        return cartonQuantity;
    }

    /**
     * Sets the value of the cartonQuantity property.
     * 
     */
    public void setCartonQuantity(int value) {
        this.cartonQuantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the masterUPC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterUPC() {
        return masterUPC;
    }

    /**
     * Sets the value of the masterUPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterUPC(String value) {
        this.masterUPC = value;
    }

    /**
     * Gets the value of the dimensionUPC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionUPC() {
        return dimensionUPC;
    }

    /**
     * Sets the value of the dimensionUPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionUPC(String value) {
        this.dimensionUPC = value;
    }

}
