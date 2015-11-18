
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderHoldHoldReason_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "HoldReason");
    private final static QName _OrderHoldHoldCode_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "HoldCode");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _LineItemSerial_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItemSerial");
    private final static QName _Message_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Message");
    private final static QName _OrderStatusReply_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderStatusReply");
    private final static QName _ArrayOfPayment_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfPayment");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _LineItemLot_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItemLot");
    private final static QName _Notification_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Notification");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Shipment_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Shipment");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Address_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Address");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _UserDefinedField_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "UserDefinedField");
    private final static QName _ArrayOfReturn_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfReturn");
    private final static QName _NotificationSeverityType_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "NotificationSeverityType");
    private final static QName _LineItem_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItem");
    private final static QName _MessageType_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "MessageType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Return_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Return");
    private final static QName _ArrayOfLineItemSerial_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfLineItemSerial");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfMessage_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfMessage");
    private final static QName _OrderHold_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderHold");
    private final static QName _Payment_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Payment");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfOrderHold_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfOrderHold");
    private final static QName _PaymentMethodType_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "PaymentMethodType");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfShipment_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfShipment");
    private final static QName _PaymentStatusType_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "PaymentStatusType");
    private final static QName _ArrayOfLineItemLot_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfLineItemLot");
    private final static QName _ArrayOfLineItem_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfLineItem");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _OrderStatusRequest_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderStatusRequest");
    private final static QName _OrderStatusType_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderStatusType");
    private final static QName _LineItemStatusType_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItemStatusType");
    private final static QName _ArrayOfNotification_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ArrayOfNotification");
    private final static QName _UserDefinedFieldOrderUDF9_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF9");
    private final static QName _UserDefinedFieldOrderUDF0_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF0");
    private final static QName _UserDefinedFieldOrderUDF4_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF4");
    private final static QName _UserDefinedFieldOrderUDF3_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF3");
    private final static QName _UserDefinedFieldOrderUDF2_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF2");
    private final static QName _UserDefinedFieldOrderUDF1_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF1");
    private final static QName _UserDefinedFieldOrderUDF8_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF8");
    private final static QName _UserDefinedFieldOrderUDF7_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF7");
    private final static QName _UserDefinedFieldOrderUDF6_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF6");
    private final static QName _UserDefinedFieldOrderUDF10_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF10");
    private final static QName _UserDefinedFieldOrderUDF5_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderUDF5");
    private final static QName _LineItemShortItemNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ShortItemNumber");
    private final static QName _LineItemDescription_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Description");
    private final static QName _LineItemSize_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Size");
    private final static QName _LineItemColor_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Color");
    private final static QName _LineItemLongItemNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LongItemNumber");
    private final static QName _AddressAddress2_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Address2");
    private final static QName _AddressState_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "State");
    private final static QName _AddressEmail_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Email");
    private final static QName _AddressAddress1_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Address1");
    private final static QName _AddressName_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Name");
    private final static QName _AddressPostalCode_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "PostalCode");
    private final static QName _AddressPhone_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Phone");
    private final static QName _AddressAttention_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Attention");
    private final static QName _AddressDepartment_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Department");
    private final static QName _AddressCountry_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Country");
    private final static QName _AddressCity_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "City");
    private final static QName _GetOrderStatusResponseGetOrderStatusResult_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "GetOrderStatusResult");
    private final static QName _ReturnReturnReason_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ReturnReason");
    private final static QName _ReturnPurchaseOrderNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "PurchaseOrderNumber");
    private final static QName _ReturnReference_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Reference");
    private final static QName _ReturnItemNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ItemNumber");
    private final static QName _GetOrderStatusRequest_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "request");
    private final static QName _LineItemSerialSerialNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "SerialNumber");
    private final static QName _GetOrderStatusJsonResponseGetOrderStatusJsonResult_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "GetOrderStatusJsonResult");
    private final static QName _OrderStatusReplyOwnerCode_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OwnerCode");
    private final static QName _OrderStatusReplyShipViaCode_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ShipViaCode");
    private final static QName _OrderStatusReplyReturns_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Returns");
    private final static QName _OrderStatusReplyPayments_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Payments");
    private final static QName _OrderStatusReplyLineItemLots_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItemLots");
    private final static QName _OrderStatusReplyNotifications_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Notifications");
    private final static QName _OrderStatusReplyBillingAddress_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "BillingAddress");
    private final static QName _OrderStatusReplyOrderNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderNumber");
    private final static QName _OrderStatusReplyShippingAddress_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ShippingAddress");
    private final static QName _OrderStatusReplyMessages_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Messages");
    private final static QName _OrderStatusReplyOrderSourceCode_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderSourceCode");
    private final static QName _OrderStatusReplyLineItemSerials_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItemSerials");
    private final static QName _OrderStatusReplyShipments_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "Shipments");
    private final static QName _OrderStatusReplyPromotionCode_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "PromotionCode");
    private final static QName _OrderStatusReplyOrderSourceName_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderSourceName");
    private final static QName _OrderStatusReplyOrderHolds_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "OrderHolds");
    private final static QName _OrderStatusReplyLineItems_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LineItems");
    private final static QName _MessageMessageText_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "MessageText");
    private final static QName _PaymentReferenceNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "ReferenceNumber");
    private final static QName _PaymentCreditCardNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "CreditCardNumber");
    private final static QName _ShipmentTrackingNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "TrackingNumber");
    private final static QName _LineItemLotLotNumber_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LotNumber");
    private final static QName _LineItemLotLotExpirationDate_QNAME = new QName("https://www.fsicatalog.com/services/OrderStatus/v2", "LotExpirationDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderStatusJson }
     * 
     */
    public GetOrderStatusJson createGetOrderStatusJson() {
        return new GetOrderStatusJson();
    }

    /**
     * Create an instance of {@link OrderStatusRequest }
     * 
     */
    public OrderStatusRequest createOrderStatusRequest() {
        return new OrderStatusRequest();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link OrderHold }
     * 
     */
    public OrderHold createOrderHold() {
        return new OrderHold();
    }

    /**
     * Create an instance of {@link ArrayOfMessage }
     * 
     */
    public ArrayOfMessage createArrayOfMessage() {
        return new ArrayOfMessage();
    }

    /**
     * Create an instance of {@link GetOrderStatusJsonResponse }
     * 
     */
    public GetOrderStatusJsonResponse createGetOrderStatusJsonResponse() {
        return new GetOrderStatusJsonResponse();
    }

    /**
     * Create an instance of {@link OrderStatusReply }
     * 
     */
    public OrderStatusReply createOrderStatusReply() {
        return new OrderStatusReply();
    }

    /**
     * Create an instance of {@link ArrayOfLineItemLot }
     * 
     */
    public ArrayOfLineItemLot createArrayOfLineItemLot() {
        return new ArrayOfLineItemLot();
    }

    /**
     * Create an instance of {@link ArrayOfShipment }
     * 
     */
    public ArrayOfShipment createArrayOfShipment() {
        return new ArrayOfShipment();
    }

    /**
     * Create an instance of {@link ArrayOfOrderHold }
     * 
     */
    public ArrayOfOrderHold createArrayOfOrderHold() {
        return new ArrayOfOrderHold();
    }

    /**
     * Create an instance of {@link ArrayOfNotification }
     * 
     */
    public ArrayOfNotification createArrayOfNotification() {
        return new ArrayOfNotification();
    }

    /**
     * Create an instance of {@link ArrayOfLineItem }
     * 
     */
    public ArrayOfLineItem createArrayOfLineItem() {
        return new ArrayOfLineItem();
    }

    /**
     * Create an instance of {@link LineItemSerial }
     * 
     */
    public LineItemSerial createLineItemSerial() {
        return new LineItemSerial();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ArrayOfPayment }
     * 
     */
    public ArrayOfPayment createArrayOfPayment() {
        return new ArrayOfPayment();
    }

    /**
     * Create an instance of {@link GetOrderStatus }
     * 
     */
    public GetOrderStatus createGetOrderStatus() {
        return new GetOrderStatus();
    }

    /**
     * Create an instance of {@link LineItemLot }
     * 
     */
    public LineItemLot createLineItemLot() {
        return new LineItemLot();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link Shipment }
     * 
     */
    public Shipment createShipment() {
        return new Shipment();
    }

    /**
     * Create an instance of {@link UserDefinedField }
     * 
     */
    public UserDefinedField createUserDefinedField() {
        return new UserDefinedField();
    }

    /**
     * Create an instance of {@link ArrayOfReturn }
     * 
     */
    public ArrayOfReturn createArrayOfReturn() {
        return new ArrayOfReturn();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Return }
     * 
     */
    public Return createReturn() {
        return new Return();
    }

    /**
     * Create an instance of {@link ArrayOfLineItemSerial }
     * 
     */
    public ArrayOfLineItemSerial createArrayOfLineItemSerial() {
        return new ArrayOfLineItemSerial();
    }

    /**
     * Create an instance of {@link GetOrderStatusResponse }
     * 
     */
    public GetOrderStatusResponse createGetOrderStatusResponse() {
        return new GetOrderStatusResponse();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "HoldReason", scope = OrderHold.class)
    public JAXBElement<String> createOrderHoldHoldReason(String value) {
        return new JAXBElement<String>(_OrderHoldHoldReason_QNAME, String.class, OrderHold.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "HoldCode", scope = OrderHold.class)
    public JAXBElement<String> createOrderHoldHoldCode(String value) {
        return new JAXBElement<String>(_OrderHoldHoldCode_QNAME, String.class, OrderHold.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItemSerial")
    public JAXBElement<LineItemSerial> createLineItemSerial(LineItemSerial value) {
        return new JAXBElement<LineItemSerial>(_LineItemSerial_QNAME, LineItemSerial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderStatusReply")
    public JAXBElement<OrderStatusReply> createOrderStatusReply(OrderStatusReply value) {
        return new JAXBElement<OrderStatusReply>(_OrderStatusReply_QNAME, OrderStatusReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfPayment")
    public JAXBElement<ArrayOfPayment> createArrayOfPayment(ArrayOfPayment value) {
        return new JAXBElement<ArrayOfPayment>(_ArrayOfPayment_QNAME, ArrayOfPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemLot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItemLot")
    public JAXBElement<LineItemLot> createLineItemLot(LineItemLot value) {
        return new JAXBElement<LineItemLot>(_LineItemLot_QNAME, LineItemLot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Notification")
    public JAXBElement<Notification> createNotification(Notification value) {
        return new JAXBElement<Notification>(_Notification_QNAME, Notification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Shipment")
    public JAXBElement<Shipment> createShipment(Shipment value) {
        return new JAXBElement<Shipment>(_Shipment_QNAME, Shipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "UserDefinedField")
    public JAXBElement<UserDefinedField> createUserDefinedField(UserDefinedField value) {
        return new JAXBElement<UserDefinedField>(_UserDefinedField_QNAME, UserDefinedField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfReturn")
    public JAXBElement<ArrayOfReturn> createArrayOfReturn(ArrayOfReturn value) {
        return new JAXBElement<ArrayOfReturn>(_ArrayOfReturn_QNAME, ArrayOfReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationSeverityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "NotificationSeverityType")
    public JAXBElement<NotificationSeverityType> createNotificationSeverityType(NotificationSeverityType value) {
        return new JAXBElement<NotificationSeverityType>(_NotificationSeverityType_QNAME, NotificationSeverityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItem")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "MessageType")
    public JAXBElement<MessageType> createMessageType(MessageType value) {
        return new JAXBElement<MessageType>(_MessageType_QNAME, MessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Return }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Return")
    public JAXBElement<Return> createReturn(Return value) {
        return new JAXBElement<Return>(_Return_QNAME, Return.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItemSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfLineItemSerial")
    public JAXBElement<ArrayOfLineItemSerial> createArrayOfLineItemSerial(ArrayOfLineItemSerial value) {
        return new JAXBElement<ArrayOfLineItemSerial>(_ArrayOfLineItemSerial_QNAME, ArrayOfLineItemSerial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfMessage")
    public JAXBElement<ArrayOfMessage> createArrayOfMessage(ArrayOfMessage value) {
        return new JAXBElement<ArrayOfMessage>(_ArrayOfMessage_QNAME, ArrayOfMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderHold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderHold")
    public JAXBElement<OrderHold> createOrderHold(OrderHold value) {
        return new JAXBElement<OrderHold>(_OrderHold_QNAME, OrderHold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Payment")
    public JAXBElement<Payment> createPayment(Payment value) {
        return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderHold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfOrderHold")
    public JAXBElement<ArrayOfOrderHold> createArrayOfOrderHold(ArrayOfOrderHold value) {
        return new JAXBElement<ArrayOfOrderHold>(_ArrayOfOrderHold_QNAME, ArrayOfOrderHold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "PaymentMethodType")
    public JAXBElement<PaymentMethodType> createPaymentMethodType(PaymentMethodType value) {
        return new JAXBElement<PaymentMethodType>(_PaymentMethodType_QNAME, PaymentMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfShipment")
    public JAXBElement<ArrayOfShipment> createArrayOfShipment(ArrayOfShipment value) {
        return new JAXBElement<ArrayOfShipment>(_ArrayOfShipment_QNAME, ArrayOfShipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "PaymentStatusType")
    public JAXBElement<PaymentStatusType> createPaymentStatusType(PaymentStatusType value) {
        return new JAXBElement<PaymentStatusType>(_PaymentStatusType_QNAME, PaymentStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItemLot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfLineItemLot")
    public JAXBElement<ArrayOfLineItemLot> createArrayOfLineItemLot(ArrayOfLineItemLot value) {
        return new JAXBElement<ArrayOfLineItemLot>(_ArrayOfLineItemLot_QNAME, ArrayOfLineItemLot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfLineItem")
    public JAXBElement<ArrayOfLineItem> createArrayOfLineItem(ArrayOfLineItem value) {
        return new JAXBElement<ArrayOfLineItem>(_ArrayOfLineItem_QNAME, ArrayOfLineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderStatusRequest")
    public JAXBElement<OrderStatusRequest> createOrderStatusRequest(OrderStatusRequest value) {
        return new JAXBElement<OrderStatusRequest>(_OrderStatusRequest_QNAME, OrderStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderStatusType")
    public JAXBElement<OrderStatusType> createOrderStatusType(OrderStatusType value) {
        return new JAXBElement<OrderStatusType>(_OrderStatusType_QNAME, OrderStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItemStatusType")
    public JAXBElement<LineItemStatusType> createLineItemStatusType(LineItemStatusType value) {
        return new JAXBElement<LineItemStatusType>(_LineItemStatusType_QNAME, LineItemStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ArrayOfNotification")
    public JAXBElement<ArrayOfNotification> createArrayOfNotification(ArrayOfNotification value) {
        return new JAXBElement<ArrayOfNotification>(_ArrayOfNotification_QNAME, ArrayOfNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF9", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF9(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF9_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF0", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF0(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF0_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF4", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF4(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF4_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF3", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF3(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF3_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF2", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF2(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF2_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF1", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF1(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF1_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF8", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF8(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF8_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF7", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF7(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF7_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF6", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF6(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF6_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF10", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF10(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF10_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderUDF5", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldOrderUDF5(String value) {
        return new JAXBElement<String>(_UserDefinedFieldOrderUDF5_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ShortItemNumber", scope = LineItem.class)
    public JAXBElement<String> createLineItemShortItemNumber(String value) {
        return new JAXBElement<String>(_LineItemShortItemNumber_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Description", scope = LineItem.class)
    public JAXBElement<String> createLineItemDescription(String value) {
        return new JAXBElement<String>(_LineItemDescription_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Size", scope = LineItem.class)
    public JAXBElement<String> createLineItemSize(String value) {
        return new JAXBElement<String>(_LineItemSize_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Color", scope = LineItem.class)
    public JAXBElement<String> createLineItemColor(String value) {
        return new JAXBElement<String>(_LineItemColor_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LongItemNumber", scope = LineItem.class)
    public JAXBElement<String> createLineItemLongItemNumber(String value) {
        return new JAXBElement<String>(_LineItemLongItemNumber_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Address2", scope = Address.class)
    public JAXBElement<String> createAddressAddress2(String value) {
        return new JAXBElement<String>(_AddressAddress2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "State", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_AddressState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Email", scope = Address.class)
    public JAXBElement<String> createAddressEmail(String value) {
        return new JAXBElement<String>(_AddressEmail_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Address1", scope = Address.class)
    public JAXBElement<String> createAddressAddress1(String value) {
        return new JAXBElement<String>(_AddressAddress1_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Name", scope = Address.class)
    public JAXBElement<String> createAddressName(String value) {
        return new JAXBElement<String>(_AddressName_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "PostalCode", scope = Address.class)
    public JAXBElement<String> createAddressPostalCode(String value) {
        return new JAXBElement<String>(_AddressPostalCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Phone", scope = Address.class)
    public JAXBElement<String> createAddressPhone(String value) {
        return new JAXBElement<String>(_AddressPhone_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Attention", scope = Address.class)
    public JAXBElement<String> createAddressAttention(String value) {
        return new JAXBElement<String>(_AddressAttention_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Department", scope = Address.class)
    public JAXBElement<String> createAddressDepartment(String value) {
        return new JAXBElement<String>(_AddressDepartment_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Country", scope = Address.class)
    public JAXBElement<String> createAddressCountry(String value) {
        return new JAXBElement<String>(_AddressCountry_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_AddressCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "GetOrderStatusResult", scope = GetOrderStatusResponse.class)
    public JAXBElement<OrderStatusReply> createGetOrderStatusResponseGetOrderStatusResult(OrderStatusReply value) {
        return new JAXBElement<OrderStatusReply>(_GetOrderStatusResponseGetOrderStatusResult_QNAME, OrderStatusReply.class, GetOrderStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ReturnReason", scope = Return.class)
    public JAXBElement<String> createReturnReturnReason(String value) {
        return new JAXBElement<String>(_ReturnReturnReason_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "PurchaseOrderNumber", scope = Return.class)
    public JAXBElement<String> createReturnPurchaseOrderNumber(String value) {
        return new JAXBElement<String>(_ReturnPurchaseOrderNumber_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Description", scope = Return.class)
    public JAXBElement<String> createReturnDescription(String value) {
        return new JAXBElement<String>(_LineItemDescription_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Size", scope = Return.class)
    public JAXBElement<String> createReturnSize(String value) {
        return new JAXBElement<String>(_LineItemSize_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Color", scope = Return.class)
    public JAXBElement<String> createReturnColor(String value) {
        return new JAXBElement<String>(_LineItemColor_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Reference", scope = Return.class)
    public JAXBElement<String> createReturnReference(String value) {
        return new JAXBElement<String>(_ReturnReference_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ItemNumber", scope = Return.class)
    public JAXBElement<String> createReturnItemNumber(String value) {
        return new JAXBElement<String>(_ReturnItemNumber_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "request", scope = GetOrderStatus.class)
    public JAXBElement<OrderStatusRequest> createGetOrderStatusRequest(OrderStatusRequest value) {
        return new JAXBElement<OrderStatusRequest>(_GetOrderStatusRequest_QNAME, OrderStatusRequest.class, GetOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "SerialNumber", scope = LineItemSerial.class)
    public JAXBElement<String> createLineItemSerialSerialNumber(String value) {
        return new JAXBElement<String>(_LineItemSerialSerialNumber_QNAME, String.class, LineItemSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ItemNumber", scope = LineItemSerial.class)
    public JAXBElement<String> createLineItemSerialItemNumber(String value) {
        return new JAXBElement<String>(_ReturnItemNumber_QNAME, String.class, LineItemSerial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Message", scope = Notification.class)
    public JAXBElement<String> createNotificationMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "GetOrderStatusJsonResult", scope = GetOrderStatusJsonResponse.class)
    public JAXBElement<OrderStatusReply> createGetOrderStatusJsonResponseGetOrderStatusJsonResult(OrderStatusReply value) {
        return new JAXBElement<OrderStatusReply>(_GetOrderStatusJsonResponseGetOrderStatusJsonResult_QNAME, OrderStatusReply.class, GetOrderStatusJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "request", scope = GetOrderStatusJson.class)
    public JAXBElement<OrderStatusRequest> createGetOrderStatusJsonRequest(OrderStatusRequest value) {
        return new JAXBElement<OrderStatusRequest>(_GetOrderStatusRequest_QNAME, OrderStatusRequest.class, GetOrderStatusJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OwnerCode", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyOwnerCode(String value) {
        return new JAXBElement<String>(_OrderStatusReplyOwnerCode_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ShipViaCode", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyShipViaCode(String value) {
        return new JAXBElement<String>(_OrderStatusReplyShipViaCode_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Returns", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfReturn> createOrderStatusReplyReturns(ArrayOfReturn value) {
        return new JAXBElement<ArrayOfReturn>(_OrderStatusReplyReturns_QNAME, ArrayOfReturn.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Payments", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfPayment> createOrderStatusReplyPayments(ArrayOfPayment value) {
        return new JAXBElement<ArrayOfPayment>(_OrderStatusReplyPayments_QNAME, ArrayOfPayment.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItemLot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItemLots", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfLineItemLot> createOrderStatusReplyLineItemLots(ArrayOfLineItemLot value) {
        return new JAXBElement<ArrayOfLineItemLot>(_OrderStatusReplyLineItemLots_QNAME, ArrayOfLineItemLot.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Notifications", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfNotification> createOrderStatusReplyNotifications(ArrayOfNotification value) {
        return new JAXBElement<ArrayOfNotification>(_OrderStatusReplyNotifications_QNAME, ArrayOfNotification.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "BillingAddress", scope = OrderStatusReply.class)
    public JAXBElement<Address> createOrderStatusReplyBillingAddress(Address value) {
        return new JAXBElement<Address>(_OrderStatusReplyBillingAddress_QNAME, Address.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Email", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyEmail(String value) {
        return new JAXBElement<String>(_AddressEmail_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderNumber", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyOrderNumber(String value) {
        return new JAXBElement<String>(_OrderStatusReplyOrderNumber_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ShippingAddress", scope = OrderStatusReply.class)
    public JAXBElement<Address> createOrderStatusReplyShippingAddress(Address value) {
        return new JAXBElement<Address>(_OrderStatusReplyShippingAddress_QNAME, Address.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Messages", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfMessage> createOrderStatusReplyMessages(ArrayOfMessage value) {
        return new JAXBElement<ArrayOfMessage>(_OrderStatusReplyMessages_QNAME, ArrayOfMessage.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderSourceCode", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyOrderSourceCode(String value) {
        return new JAXBElement<String>(_OrderStatusReplyOrderSourceCode_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItemSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItemSerials", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfLineItemSerial> createOrderStatusReplyLineItemSerials(ArrayOfLineItemSerial value) {
        return new JAXBElement<ArrayOfLineItemSerial>(_OrderStatusReplyLineItemSerials_QNAME, ArrayOfLineItemSerial.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "UserDefinedField", scope = OrderStatusReply.class)
    public JAXBElement<UserDefinedField> createOrderStatusReplyUserDefinedField(UserDefinedField value) {
        return new JAXBElement<UserDefinedField>(_UserDefinedField_QNAME, UserDefinedField.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "Shipments", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfShipment> createOrderStatusReplyShipments(ArrayOfShipment value) {
        return new JAXBElement<ArrayOfShipment>(_OrderStatusReplyShipments_QNAME, ArrayOfShipment.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "PromotionCode", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyPromotionCode(String value) {
        return new JAXBElement<String>(_OrderStatusReplyPromotionCode_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderSourceName", scope = OrderStatusReply.class)
    public JAXBElement<String> createOrderStatusReplyOrderSourceName(String value) {
        return new JAXBElement<String>(_OrderStatusReplyOrderSourceName_QNAME, String.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderHold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "OrderHolds", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfOrderHold> createOrderStatusReplyOrderHolds(ArrayOfOrderHold value) {
        return new JAXBElement<ArrayOfOrderHold>(_OrderStatusReplyOrderHolds_QNAME, ArrayOfOrderHold.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LineItems", scope = OrderStatusReply.class)
    public JAXBElement<ArrayOfLineItem> createOrderStatusReplyLineItems(ArrayOfLineItem value) {
        return new JAXBElement<ArrayOfLineItem>(_OrderStatusReplyLineItems_QNAME, ArrayOfLineItem.class, OrderStatusReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "MessageText", scope = Message.class)
    public JAXBElement<String> createMessageMessageText(String value) {
        return new JAXBElement<String>(_MessageMessageText_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ReferenceNumber", scope = Payment.class)
    public JAXBElement<String> createPaymentReferenceNumber(String value) {
        return new JAXBElement<String>(_PaymentReferenceNumber_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "CreditCardNumber", scope = Payment.class)
    public JAXBElement<String> createPaymentCreditCardNumber(String value) {
        return new JAXBElement<String>(_PaymentCreditCardNumber_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "TrackingNumber", scope = Shipment.class)
    public JAXBElement<String> createShipmentTrackingNumber(String value) {
        return new JAXBElement<String>(_ShipmentTrackingNumber_QNAME, String.class, Shipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ShipViaCode", scope = Shipment.class)
    public JAXBElement<String> createShipmentShipViaCode(String value) {
        return new JAXBElement<String>(_OrderStatusReplyShipViaCode_QNAME, String.class, Shipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LotNumber", scope = LineItemLot.class)
    public JAXBElement<String> createLineItemLotLotNumber(String value) {
        return new JAXBElement<String>(_LineItemLotLotNumber_QNAME, String.class, LineItemLot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "LotExpirationDate", scope = LineItemLot.class)
    public JAXBElement<XMLGregorianCalendar> createLineItemLotLotExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LineItemLotLotExpirationDate_QNAME, XMLGregorianCalendar.class, LineItemLot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", name = "ItemNumber", scope = LineItemLot.class)
    public JAXBElement<String> createLineItemLotItemNumber(String value) {
        return new JAXBElement<String>(_ReturnItemNumber_QNAME, String.class, LineItemLot.class, value);
    }

}
