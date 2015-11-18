
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipAfterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HandlingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGiftOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderMessages" type="{https://www.fsicatalog.com/services/orderprocessing/v4}MessageCollection" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{https://www.fsicatalog.com/services/orderprocessing/v4}Address" minOccurs="0"/>
 *         &lt;element name="OrderPayment" type="{https://www.fsicatalog.com/services/orderprocessing/v4}Payment" minOccurs="0"/>
 *         &lt;element name="OrderHolds" type="{https://www.fsicatalog.com/services/orderprocessing/v4}OrderHoldCollection" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{https://www.fsicatalog.com/services/orderprocessing/v4}LineItemCollection" minOccurs="0"/>
 *         &lt;element name="UserDefinedInfo" type="{https://www.fsicatalog.com/services/orderprocessing/v4}UserDefinedField" minOccurs="0"/>
 *         &lt;element name="AdditionalOrderInfo" type="{https://www.fsicatalog.com/services/orderprocessing/v4}AdditionalOrderField" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{https://www.fsicatalog.com/services/orderprocessing/v4}Address" minOccurs="0"/>
 *         &lt;element name="ShippingCode" type="{https://www.fsicatalog.com/services/orderprocessing/v4}ShippingMethod" minOccurs="0"/>
 *         &lt;element name="ShipmentOption" type="{https://www.fsicatalog.com/services/orderprocessing/v4}ShippingOption" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalContacts" type="{https://www.fsicatalog.com/services/orderprocessing/v4}TechnicalContactCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "ownerCode",
    "orderNumber",
    "shipAfterDate",
    "misc",
    "shippingCharge",
    "handlingCharge",
    "taxCharge",
    "email",
    "promotionCode",
    "authenticationKey",
    "isGiftOrder",
    "orderMessages",
    "billingAddress",
    "orderPayment",
    "orderHolds",
    "lineItems",
    "userDefinedInfo",
    "additionalOrderInfo",
    "shippingAddress",
    "shippingCode",
    "shipmentOption",
    "orderDate",
    "orderType",
    "orderClass",
    "technicalContacts"
})
public class Request {

    @XmlElementRef(name = "OwnerCode", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerCode;
    @XmlElementRef(name = "OrderNumber", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "ShipAfterDate", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipAfterDate;
    @XmlElementRef(name = "Misc", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> misc;
    @XmlElement(name = "ShippingCharge")
    protected BigDecimal shippingCharge;
    @XmlElement(name = "HandlingCharge")
    protected BigDecimal handlingCharge;
    @XmlElement(name = "TaxCharge")
    protected BigDecimal taxCharge;
    @XmlElementRef(name = "Email", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "PromotionCode", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCode;
    @XmlElementRef(name = "AuthenticationKey", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationKey;
    @XmlElement(name = "IsGiftOrder")
    protected Boolean isGiftOrder;
    @XmlElementRef(name = "OrderMessages", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<MessageCollection> orderMessages;
    @XmlElementRef(name = "BillingAddress", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> billingAddress;
    @XmlElementRef(name = "OrderPayment", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<Payment> orderPayment;
    @XmlElementRef(name = "OrderHolds", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderHoldCollection> orderHolds;
    @XmlElementRef(name = "LineItems", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<LineItemCollection> lineItems;
    @XmlElementRef(name = "UserDefinedInfo", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefinedField> userDefinedInfo;
    @XmlElementRef(name = "AdditionalOrderInfo", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<AdditionalOrderField> additionalOrderInfo;
    @XmlElementRef(name = "ShippingAddress", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> shippingAddress;
    @XmlElement(name = "ShippingCode")
    protected ShippingMethod shippingCode;
    @XmlElementRef(name = "ShipmentOption", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<ShippingOption> shipmentOption;
    @XmlElementRef(name = "OrderDate", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderDate;
    @XmlElementRef(name = "OrderType", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType;
    @XmlElementRef(name = "OrderClass", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderClass;
    @XmlElementRef(name = "TechnicalContacts", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<TechnicalContactCollection> technicalContacts;

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
     * Gets the value of the shipAfterDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipAfterDate() {
        return shipAfterDate;
    }

    /**
     * Sets the value of the shipAfterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipAfterDate(JAXBElement<String> value) {
        this.shipAfterDate = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMisc(JAXBElement<String> value) {
        this.misc = value;
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
     * Gets the value of the taxCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxCharge() {
        return taxCharge;
    }

    /**
     * Sets the value of the taxCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxCharge(BigDecimal value) {
        this.taxCharge = value;
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
     * Gets the value of the authenticationKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationKey() {
        return authenticationKey;
    }

    /**
     * Sets the value of the authenticationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationKey(JAXBElement<String> value) {
        this.authenticationKey = value;
    }

    /**
     * Gets the value of the isGiftOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGiftOrder() {
        return isGiftOrder;
    }

    /**
     * Sets the value of the isGiftOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGiftOrder(Boolean value) {
        this.isGiftOrder = value;
    }

    /**
     * Gets the value of the orderMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageCollection }{@code >}
     *     
     */
    public JAXBElement<MessageCollection> getOrderMessages() {
        return orderMessages;
    }

    /**
     * Sets the value of the orderMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageCollection }{@code >}
     *     
     */
    public void setOrderMessages(JAXBElement<MessageCollection> value) {
        this.orderMessages = value;
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
     * Gets the value of the orderPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     
     */
    public JAXBElement<Payment> getOrderPayment() {
        return orderPayment;
    }

    /**
     * Sets the value of the orderPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     
     */
    public void setOrderPayment(JAXBElement<Payment> value) {
        this.orderPayment = value;
    }

    /**
     * Gets the value of the orderHolds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderHoldCollection }{@code >}
     *     
     */
    public JAXBElement<OrderHoldCollection> getOrderHolds() {
        return orderHolds;
    }

    /**
     * Sets the value of the orderHolds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderHoldCollection }{@code >}
     *     
     */
    public void setOrderHolds(JAXBElement<OrderHoldCollection> value) {
        this.orderHolds = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LineItemCollection }{@code >}
     *     
     */
    public JAXBElement<LineItemCollection> getLineItems() {
        return lineItems;
    }

    /**
     * Sets the value of the lineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LineItemCollection }{@code >}
     *     
     */
    public void setLineItems(JAXBElement<LineItemCollection> value) {
        this.lineItems = value;
    }

    /**
     * Gets the value of the userDefinedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}
     *     
     */
    public JAXBElement<UserDefinedField> getUserDefinedInfo() {
        return userDefinedInfo;
    }

    /**
     * Sets the value of the userDefinedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}
     *     
     */
    public void setUserDefinedInfo(JAXBElement<UserDefinedField> value) {
        this.userDefinedInfo = value;
    }

    /**
     * Gets the value of the additionalOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalOrderField }{@code >}
     *     
     */
    public JAXBElement<AdditionalOrderField> getAdditionalOrderInfo() {
        return additionalOrderInfo;
    }

    /**
     * Sets the value of the additionalOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalOrderField }{@code >}
     *     
     */
    public void setAdditionalOrderInfo(JAXBElement<AdditionalOrderField> value) {
        this.additionalOrderInfo = value;
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
     * Gets the value of the shippingCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingMethod }
     *     
     */
    public ShippingMethod getShippingCode() {
        return shippingCode;
    }

    /**
     * Sets the value of the shippingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingMethod }
     *     
     */
    public void setShippingCode(ShippingMethod value) {
        this.shippingCode = value;
    }

    /**
     * Gets the value of the shipmentOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShippingOption }{@code >}
     *     
     */
    public JAXBElement<ShippingOption> getShipmentOption() {
        return shipmentOption;
    }

    /**
     * Sets the value of the shipmentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShippingOption }{@code >}
     *     
     */
    public void setShipmentOption(JAXBElement<ShippingOption> value) {
        this.shipmentOption = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderDate(JAXBElement<String> value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderType(JAXBElement<String> value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderClass() {
        return orderClass;
    }

    /**
     * Sets the value of the orderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderClass(JAXBElement<String> value) {
        this.orderClass = value;
    }

    /**
     * Gets the value of the technicalContacts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TechnicalContactCollection }{@code >}
     *     
     */
    public JAXBElement<TechnicalContactCollection> getTechnicalContacts() {
        return technicalContacts;
    }

    /**
     * Sets the value of the technicalContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TechnicalContactCollection }{@code >}
     *     
     */
    public void setTechnicalContacts(JAXBElement<TechnicalContactCollection> value) {
        this.technicalContacts = value;
    }

}
