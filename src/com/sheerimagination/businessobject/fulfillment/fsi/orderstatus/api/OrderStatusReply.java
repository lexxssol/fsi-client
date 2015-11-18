
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderStatusReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FsiOrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{https://www.fsicatalog.com/services/OrderStatus/v2}OrderStatusType" minOccurs="0"/>
 *         &lt;element name="PostingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipAfterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{https://www.fsicatalog.com/services/OrderStatus/v2}Address" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{https://www.fsicatalog.com/services/OrderStatus/v2}Address" minOccurs="0"/>
 *         &lt;element name="ShipViaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HandlingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payments" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfPayment" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Messages" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfMessage" minOccurs="0"/>
 *         &lt;element name="UserDefinedField" type="{https://www.fsicatalog.com/services/OrderStatus/v2}UserDefinedField" minOccurs="0"/>
 *         &lt;element name="OrderSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipments" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfShipment" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfLineItem" minOccurs="0"/>
 *         &lt;element name="OrderHolds" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfOrderHold" minOccurs="0"/>
 *         &lt;element name="HasReturns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Returns" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfReturn" minOccurs="0"/>
 *         &lt;element name="HighestSeverity" type="{https://www.fsicatalog.com/services/OrderStatus/v2}NotificationSeverityType" minOccurs="0"/>
 *         &lt;element name="Notifications" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfNotification" minOccurs="0"/>
 *         &lt;element name="OriginalInvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LineItemLots" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfLineItemLot" minOccurs="0"/>
 *         &lt;element name="LineItemSerials" type="{https://www.fsicatalog.com/services/OrderStatus/v2}ArrayOfLineItemSerial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusReply", propOrder = {
    "orderNumber",
    "fsiOrderNumber",
    "orderStatus",
    "postingDate",
    "ownerCode",
    "orderDate",
    "shipAfterDate",
    "billingAddress",
    "shippingAddress",
    "shipViaCode",
    "shippingCharge",
    "handlingCharge",
    "totalTax",
    "orderTotal",
    "payments",
    "email",
    "promotionCode",
    "messages",
    "userDefinedField",
    "orderSourceCode",
    "orderSourceName",
    "shipments",
    "lineItems",
    "orderHolds",
    "hasReturns",
    "returns",
    "highestSeverity",
    "notifications",
    "originalInvoiceNumber",
    "lineItemLots",
    "lineItemSerials"
})
public class OrderStatusReply {

    @XmlElementRef(name = "OrderNumber", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElement(name = "FsiOrderNumber")
    protected Integer fsiOrderNumber;
    @XmlElement(name = "OrderStatus")
    protected OrderStatusType orderStatus;
    @XmlElement(name = "PostingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingDate;
    @XmlElementRef(name = "OwnerCode", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerCode;
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "ShipAfterDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipAfterDate;
    @XmlElementRef(name = "BillingAddress", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> billingAddress;
    @XmlElementRef(name = "ShippingAddress", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> shippingAddress;
    @XmlElementRef(name = "ShipViaCode", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipViaCode;
    @XmlElement(name = "ShippingCharge")
    protected BigDecimal shippingCharge;
    @XmlElement(name = "HandlingCharge")
    protected BigDecimal handlingCharge;
    @XmlElement(name = "TotalTax")
    protected BigDecimal totalTax;
    @XmlElement(name = "OrderTotal")
    protected BigDecimal orderTotal;
    @XmlElementRef(name = "Payments", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPayment> payments;
    @XmlElementRef(name = "Email", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "PromotionCode", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCode;
    @XmlElementRef(name = "Messages", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMessage> messages;
    @XmlElementRef(name = "UserDefinedField", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefinedField> userDefinedField;
    @XmlElementRef(name = "OrderSourceCode", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderSourceCode;
    @XmlElementRef(name = "OrderSourceName", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderSourceName;
    @XmlElementRef(name = "Shipments", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShipment> shipments;
    @XmlElementRef(name = "LineItems", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItem> lineItems;
    @XmlElementRef(name = "OrderHolds", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOrderHold> orderHolds;
    @XmlElement(name = "HasReturns")
    protected Boolean hasReturns;
    @XmlElementRef(name = "Returns", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReturn> returns;
    @XmlElement(name = "HighestSeverity")
    protected NotificationSeverityType highestSeverity;
    @XmlElementRef(name = "Notifications", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotification> notifications;
    @XmlElement(name = "OriginalInvoiceNumber")
    protected Integer originalInvoiceNumber;
    @XmlElementRef(name = "LineItemLots", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItemLot> lineItemLots;
    @XmlElementRef(name = "LineItemSerials", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineItemSerial> lineItemSerials;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the fsiOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFsiOrderNumber() {
        return fsiOrderNumber;
    }

    /**
     * Sets the value of the fsiOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFsiOrderNumber(Integer value) {
        this.fsiOrderNumber = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusType }
     *     
     */
    public OrderStatusType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusType }
     *     
     */
    public void setOrderStatus(OrderStatusType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerCode(JAXBElement<String> value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the shipAfterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipAfterDate() {
        return shipAfterDate;
    }

    /**
     * Sets the value of the shipAfterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipAfterDate(XMLGregorianCalendar value) {
        this.shipAfterDate = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setBillingAddress(JAXBElement<Address> value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setShippingAddress(JAXBElement<Address> value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shipViaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipViaCode() {
        return shipViaCode;
    }

    /**
     * Sets the value of the shipViaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipViaCode(JAXBElement<String> value) {
        this.shipViaCode = value;
    }

    /**
     * Gets the value of the shippingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCharge() {
        return shippingCharge;
    }

    /**
     * Sets the value of the shippingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCharge(BigDecimal value) {
        this.shippingCharge = value;
    }

    /**
     * Gets the value of the handlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHandlingCharge() {
        return handlingCharge;
    }

    /**
     * Sets the value of the handlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHandlingCharge(BigDecimal value) {
        this.handlingCharge = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderTotal(BigDecimal value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPayment> getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}
     *     
     */
    public void setPayments(JAXBElement<ArrayOfPayment> value) {
        this.payments = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionCode(JAXBElement<String> value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMessage> getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}
     *     
     */
    public void setMessages(JAXBElement<ArrayOfMessage> value) {
        this.messages = value;
    }

    /**
     * Gets the value of the userDefinedField property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}
     *     
     */
    public JAXBElement<UserDefinedField> getUserDefinedField() {
        return userDefinedField;
    }

    /**
     * Sets the value of the userDefinedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}
     *     
     */
    public void setUserDefinedField(JAXBElement<UserDefinedField> value) {
        this.userDefinedField = value;
    }

    /**
     * Gets the value of the orderSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderSourceCode() {
        return orderSourceCode;
    }

    /**
     * Sets the value of the orderSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderSourceCode(JAXBElement<String> value) {
        this.orderSourceCode = value;
    }

    /**
     * Gets the value of the orderSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderSourceName() {
        return orderSourceName;
    }

    /**
     * Sets the value of the orderSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderSourceName(JAXBElement<String> value) {
        this.orderSourceName = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShipment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfShipment> getShipments() {
        return shipments;
    }

    /**
     * Sets the value of the shipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShipment }{@code >}
     *     
     */
    public void setShipments(JAXBElement<ArrayOfShipment> value) {
        this.shipments = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<ArrayOfLineItem> value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the orderHolds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderHold }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOrderHold> getOrderHolds() {
        return orderHolds;
    }

    /**
     * Sets the value of the orderHolds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOrderHold }{@code >}
     *     
     */
    public void setOrderHolds(JAXBElement<ArrayOfOrderHold> value) {
        this.orderHolds = value;
    }

    /**
     * Gets the value of the hasReturns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReturns() {
        return hasReturns;
    }

    /**
     * Sets the value of the hasReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReturns(Boolean value) {
        this.hasReturns = value;
    }

    /**
     * Gets the value of the returns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReturn> getReturns() {
        return returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReturn }{@code >}
     *     
     */
    public void setReturns(JAXBElement<ArrayOfReturn> value) {
        this.returns = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotification> getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}
     *     
     */
    public void setNotifications(JAXBElement<ArrayOfNotification> value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalInvoiceNumber(Integer value) {
        this.originalInvoiceNumber = value;
    }

    /**
     * Gets the value of the lineItemLots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemLot }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItemLot> getLineItemLots() {
        return lineItemLots;
    }

    /**
     * Sets the value of the lineItemLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemLot }{@code >}
     *     
     */
    public void setLineItemLots(JAXBElement<ArrayOfLineItemLot> value) {
        this.lineItemLots = value;
    }

    /**
     * Gets the value of the lineItemSerials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemSerial }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineItemSerial> getLineItemSerials() {
        return lineItemSerials;
    }

    /**
     * Sets the value of the lineItemSerials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineItemSerial }{@code >}
     *     
     */
    public void setLineItemSerials(JAXBElement<ArrayOfLineItemSerial> value) {
        this.lineItemSerials = value;
    }

}
