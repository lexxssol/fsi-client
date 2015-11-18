
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

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
 * generated in the com.sheerimagination.businessobject.fulfillment.fsi.orders.api package. 
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _TechnicalNotificationType_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "TechnicalNotificationType");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _OrderMessage_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderMessage");
    private final static QName _LineItemCollection_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineItemCollection");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _OrderHoldCollection_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderHoldCollection");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _COD_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "COD");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AdditionalOrderField_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "AdditionalOrderField");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Payment_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Payment");
    private final static QName _OrderHold_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderHold");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Request_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Request");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _OrderHoldReason_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderHoldReason");
    private final static QName _NotificationCollection_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "NotificationCollection");
    private final static QName _NotificationSeverityType_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "NotificationSeverityType");
    private final static QName _LineItem_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineItem");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Reply_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Reply");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Address_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Address");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _UserDefinedField_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefinedField");
    private final static QName _ServiceStatusRequest_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ServiceStatusRequest");
    private final static QName _Notification_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Notification");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _TechnicalContactCollection_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "TechnicalContactCollection");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _MessageCollection_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "MessageCollection");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _PaymentMethod_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "PaymentMethod");
    private final static QName _TechnicalContact_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "TechnicalContact");
    private final static QName _ShippingMethod_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ShippingMethod");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ShippingOption_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ShippingOption");
    private final static QName _OrderMessageType_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderMessageType");
    private final static QName _ReplyNotifications_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Notifications");
    private final static QName _ReplyConfirmationNumber_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ConfirmationNumber");
    private final static QName _StatusResponseServiceStatus_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ServiceStatus");
    private final static QName _StatusRequestStatus_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Status");
    private final static QName _AdditionalOrderFieldOrderSourceName_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderSourceName");
    private final static QName _AdditionalOrderFieldFuture5_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future5");
    private final static QName _AdditionalOrderFieldFuture10_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future10");
    private final static QName _AdditionalOrderFieldFuture6_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future6");
    private final static QName _AdditionalOrderFieldFuture3_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future3");
    private final static QName _AdditionalOrderFieldFuture4_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future4");
    private final static QName _AdditionalOrderFieldFuture9_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future9");
    private final static QName _AdditionalOrderFieldFuture7_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future7");
    private final static QName _AdditionalOrderFieldFuture8_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future8");
    private final static QName _AdditionalOrderFieldOrderSourceCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderSourceCode");
    private final static QName _AdditionalOrderFieldCurrentTerritoryCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "CurrentTerritoryCode");
    private final static QName _AdditionalOrderFieldFixedTerritoryName_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "FixedTerritoryName");
    private final static QName _AdditionalOrderFieldFixedTerritoryCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "FixedTerritoryCode");
    private final static QName _AdditionalOrderFieldCurrentTerritoryName_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "CurrentTerritoryName");
    private final static QName _AdditionalOrderFieldFuture2_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future2");
    private final static QName _AdditionalOrderFieldFuture1_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Future1");
    private final static QName _LineItemColor_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Color");
    private final static QName _LineItemSize_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Size");
    private final static QName _LineItemLineID_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineID");
    private final static QName _LineItemLineUDF1_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineUDF1");
    private final static QName _LineItemItemNumber_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ItemNumber");
    private final static QName _LineItemLineUDF2_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineUDF2");
    private final static QName _LineItemLineUDF4_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineUDF4");
    private final static QName _LineItemLineUDF3_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineUDF3");
    private final static QName _LineItemLineUDF5_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineUDF5");
    private final static QName _UserDefinedFieldUserDefined9_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined9");
    private final static QName _UserDefinedFieldUserDefined8_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined8");
    private final static QName _UserDefinedFieldUserDefined7_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined7");
    private final static QName _UserDefinedFieldUserDefined10_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined10");
    private final static QName _UserDefinedFieldUserDefined6_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined6");
    private final static QName _UserDefinedFieldUserDefined5_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined5");
    private final static QName _UserDefinedFieldUserDefined4_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined4");
    private final static QName _UserDefinedFieldUserDefined3_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined3");
    private final static QName _UserDefinedFieldUserDefined2_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined2");
    private final static QName _UserDefinedFieldUserDefined1_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined1");
    private final static QName _UserDefinedFieldUserDefined0_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefined0");
    private final static QName _TechnicalContactCC_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "CC");
    private final static QName _TechnicalContactEmailSubject_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "EmailSubject");
    private final static QName _TechnicalContactName_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Name");
    private final static QName _TechnicalContactBCC_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "BCC");
    private final static QName _TechnicalContactPhone_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Phone");
    private final static QName _RequestPromotionCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "PromotionCode");
    private final static QName _RequestShipmentOption_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ShipmentOption");
    private final static QName _RequestAuthenticationKey_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "AuthenticationKey");
    private final static QName _RequestOrderHolds_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderHolds");
    private final static QName _RequestLineItems_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "LineItems");
    private final static QName _RequestEmail_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Email");
    private final static QName _RequestShippingAddress_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ShippingAddress");
    private final static QName _RequestOrderNumber_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderNumber");
    private final static QName _RequestOrderType_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderType");
    private final static QName _RequestAdditionalOrderInfo_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "AdditionalOrderInfo");
    private final static QName _RequestTechnicalContacts_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "TechnicalContacts");
    private final static QName _RequestOrderMessages_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderMessages");
    private final static QName _RequestOrderClass_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderClass");
    private final static QName _RequestOrderPayment_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderPayment");
    private final static QName _RequestBillingAddress_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "BillingAddress");
    private final static QName _RequestShipAfterDate_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ShipAfterDate");
    private final static QName _RequestMisc_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Misc");
    private final static QName _RequestUserDefinedInfo_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "UserDefinedInfo");
    private final static QName _RequestOwnerCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OwnerCode");
    private final static QName _RequestOrderDate_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "OrderDate");
    private final static QName _OrderRequestOrder_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Order");
    private final static QName _AddressDepartment_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Department");
    private final static QName _AddressAttention_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Attention");
    private final static QName _AddressCity_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "City");
    private final static QName _AddressCountryCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "CountryCode");
    private final static QName _AddressState_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "State");
    private final static QName _AddressAddress2_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Address2");
    private final static QName _AddressAddress1_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Address1");
    private final static QName _AddressPostalCode_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "PostalCode");
    private final static QName _NotificationMessage_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Message");
    private final static QName _PaymentExpirationDate_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ExpirationDate");
    private final static QName _PaymentReferenceNumber_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "ReferenceNumber");
    private final static QName _PaymentCreditCardNumber_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "CreditCardNumber");
    private final static QName _OrderMessageText_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Text");
    private final static QName _OrderResponseResponse_QNAME = new QName("https://www.fsicatalog.com/services/orderprocessing/v4", "Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sheerimagination.businessobject.fulfillment.fsi.orders.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link OrderHold }
     * 
     */
    public OrderHold createOrderHold() {
        return new OrderHold();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link AdditionalOrderField }
     * 
     */
    public AdditionalOrderField createAdditionalOrderField() {
        return new AdditionalOrderField();
    }

    /**
     * Create an instance of {@link OrderHoldCollection }
     * 
     */
    public OrderHoldCollection createOrderHoldCollection() {
        return new OrderHoldCollection();
    }

    /**
     * Create an instance of {@link OrderMessage }
     * 
     */
    public OrderMessage createOrderMessage() {
        return new OrderMessage();
    }

    /**
     * Create an instance of {@link LineItemCollection }
     * 
     */
    public LineItemCollection createLineItemCollection() {
        return new LineItemCollection();
    }

    /**
     * Create an instance of {@link ShippingOption }
     * 
     */
    public ShippingOption createShippingOption() {
        return new ShippingOption();
    }

    /**
     * Create an instance of {@link TechnicalContact }
     * 
     */
    public TechnicalContact createTechnicalContact() {
        return new TechnicalContact();
    }

    /**
     * Create an instance of {@link MessageCollection }
     * 
     */
    public MessageCollection createMessageCollection() {
        return new MessageCollection();
    }

    /**
     * Create an instance of {@link ServiceStatusRequest }
     * 
     */
    public ServiceStatusRequest createServiceStatusRequest() {
        return new ServiceStatusRequest();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link TechnicalContactCollection }
     * 
     */
    public TechnicalContactCollection createTechnicalContactCollection() {
        return new TechnicalContactCollection();
    }

    /**
     * Create an instance of {@link UserDefinedField }
     * 
     */
    public UserDefinedField createUserDefinedField() {
        return new UserDefinedField();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link Reply }
     * 
     */
    public Reply createReply() {
        return new Reply();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link NotificationCollection }
     * 
     */
    public NotificationCollection createNotificationCollection() {
        return new NotificationCollection();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link StatusRequest }
     * 
     */
    public StatusRequest createStatusRequest() {
        return new StatusRequest();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "TechnicalNotificationType")
    public JAXBElement<TechnicalNotificationType> createTechnicalNotificationType(TechnicalNotificationType value) {
        return new JAXBElement<TechnicalNotificationType>(_TechnicalNotificationType_QNAME, TechnicalNotificationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderMessage")
    public JAXBElement<OrderMessage> createOrderMessage(OrderMessage value) {
        return new JAXBElement<OrderMessage>(_OrderMessage_QNAME, OrderMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineItemCollection")
    public JAXBElement<LineItemCollection> createLineItemCollection(LineItemCollection value) {
        return new JAXBElement<LineItemCollection>(_LineItemCollection_QNAME, LineItemCollection.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderHoldCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderHoldCollection")
    public JAXBElement<OrderHoldCollection> createOrderHoldCollection(OrderHoldCollection value) {
        return new JAXBElement<OrderHoldCollection>(_OrderHoldCollection_QNAME, OrderHoldCollection.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link COD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "COD")
    public JAXBElement<COD> createCOD(COD value) {
        return new JAXBElement<COD>(_COD_QNAME, COD.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalOrderField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "AdditionalOrderField")
    public JAXBElement<AdditionalOrderField> createAdditionalOrderField(AdditionalOrderField value) {
        return new JAXBElement<AdditionalOrderField>(_AdditionalOrderField_QNAME, AdditionalOrderField.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Payment")
    public JAXBElement<Payment> createPayment(Payment value) {
        return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderHold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderHold")
    public JAXBElement<OrderHold> createOrderHold(OrderHold value) {
        return new JAXBElement<OrderHold>(_OrderHold_QNAME, OrderHold.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderHoldReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderHoldReason")
    public JAXBElement<OrderHoldReason> createOrderHoldReason(OrderHoldReason value) {
        return new JAXBElement<OrderHoldReason>(_OrderHoldReason_QNAME, OrderHoldReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "NotificationCollection")
    public JAXBElement<NotificationCollection> createNotificationCollection(NotificationCollection value) {
        return new JAXBElement<NotificationCollection>(_NotificationCollection_QNAME, NotificationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationSeverityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "NotificationSeverityType")
    public JAXBElement<NotificationSeverityType> createNotificationSeverityType(NotificationSeverityType value) {
        return new JAXBElement<NotificationSeverityType>(_NotificationSeverityType_QNAME, NotificationSeverityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineItem")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Reply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Reply")
    public JAXBElement<Reply> createReply(Reply value) {
        return new JAXBElement<Reply>(_Reply_QNAME, Reply.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefinedField")
    public JAXBElement<UserDefinedField> createUserDefinedField(UserDefinedField value) {
        return new JAXBElement<UserDefinedField>(_UserDefinedField_QNAME, UserDefinedField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ServiceStatusRequest")
    public JAXBElement<ServiceStatusRequest> createServiceStatusRequest(ServiceStatusRequest value) {
        return new JAXBElement<ServiceStatusRequest>(_ServiceStatusRequest_QNAME, ServiceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Notification")
    public JAXBElement<Notification> createNotification(Notification value) {
        return new JAXBElement<Notification>(_Notification_QNAME, Notification.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalContactCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "TechnicalContactCollection")
    public JAXBElement<TechnicalContactCollection> createTechnicalContactCollection(TechnicalContactCollection value) {
        return new JAXBElement<TechnicalContactCollection>(_TechnicalContactCollection_QNAME, TechnicalContactCollection.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "MessageCollection")
    public JAXBElement<MessageCollection> createMessageCollection(MessageCollection value) {
        return new JAXBElement<MessageCollection>(_MessageCollection_QNAME, MessageCollection.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "PaymentMethod")
    public JAXBElement<PaymentMethod> createPaymentMethod(PaymentMethod value) {
        return new JAXBElement<PaymentMethod>(_PaymentMethod_QNAME, PaymentMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "TechnicalContact")
    public JAXBElement<TechnicalContact> createTechnicalContact(TechnicalContact value) {
        return new JAXBElement<TechnicalContact>(_TechnicalContact_QNAME, TechnicalContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ShippingMethod")
    public JAXBElement<ShippingMethod> createShippingMethod(ShippingMethod value) {
        return new JAXBElement<ShippingMethod>(_ShippingMethod_QNAME, ShippingMethod.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ShippingOption")
    public JAXBElement<ShippingOption> createShippingOption(ShippingOption value) {
        return new JAXBElement<ShippingOption>(_ShippingOption_QNAME, ShippingOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderMessageType")
    public JAXBElement<OrderMessageType> createOrderMessageType(OrderMessageType value) {
        return new JAXBElement<OrderMessageType>(_OrderMessageType_QNAME, OrderMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Notifications", scope = Reply.class)
    public JAXBElement<NotificationCollection> createReplyNotifications(NotificationCollection value) {
        return new JAXBElement<NotificationCollection>(_ReplyNotifications_QNAME, NotificationCollection.class, Reply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ConfirmationNumber", scope = Reply.class)
    public JAXBElement<String> createReplyConfirmationNumber(String value) {
        return new JAXBElement<String>(_ReplyConfirmationNumber_QNAME, String.class, Reply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ServiceStatus", scope = StatusResponse.class)
    public JAXBElement<String> createStatusResponseServiceStatus(String value) {
        return new JAXBElement<String>(_StatusResponseServiceStatus_QNAME, String.class, StatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Status", scope = StatusRequest.class)
    public JAXBElement<ServiceStatusRequest> createStatusRequestStatus(ServiceStatusRequest value) {
        return new JAXBElement<ServiceStatusRequest>(_StatusRequestStatus_QNAME, ServiceStatusRequest.class, StatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderSourceName", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldOrderSourceName(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldOrderSourceName_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future5", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture5(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture5_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future10", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture10(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture10_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future6", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture6(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture6_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future3", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture3(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture3_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future4", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture4(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture4_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future9", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture9(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture9_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future7", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture7(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture7_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future8", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture8(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture8_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderSourceCode", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldOrderSourceCode(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldOrderSourceCode_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "CurrentTerritoryCode", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldCurrentTerritoryCode(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldCurrentTerritoryCode_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "FixedTerritoryName", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFixedTerritoryName(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFixedTerritoryName_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "FixedTerritoryCode", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFixedTerritoryCode(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFixedTerritoryCode_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "CurrentTerritoryName", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldCurrentTerritoryName(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldCurrentTerritoryName_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future2", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture2(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture2_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Future1", scope = AdditionalOrderField.class)
    public JAXBElement<String> createAdditionalOrderFieldFuture1(String value) {
        return new JAXBElement<String>(_AdditionalOrderFieldFuture1_QNAME, String.class, AdditionalOrderField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Color", scope = LineItem.class)
    public JAXBElement<String> createLineItemColor(String value) {
        return new JAXBElement<String>(_LineItemColor_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Size", scope = LineItem.class)
    public JAXBElement<String> createLineItemSize(String value) {
        return new JAXBElement<String>(_LineItemSize_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineID", scope = LineItem.class)
    public JAXBElement<String> createLineItemLineID(String value) {
        return new JAXBElement<String>(_LineItemLineID_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineUDF1", scope = LineItem.class)
    public JAXBElement<String> createLineItemLineUDF1(String value) {
        return new JAXBElement<String>(_LineItemLineUDF1_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ItemNumber", scope = LineItem.class)
    public JAXBElement<String> createLineItemItemNumber(String value) {
        return new JAXBElement<String>(_LineItemItemNumber_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineUDF2", scope = LineItem.class)
    public JAXBElement<String> createLineItemLineUDF2(String value) {
        return new JAXBElement<String>(_LineItemLineUDF2_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineUDF4", scope = LineItem.class)
    public JAXBElement<String> createLineItemLineUDF4(String value) {
        return new JAXBElement<String>(_LineItemLineUDF4_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineUDF3", scope = LineItem.class)
    public JAXBElement<String> createLineItemLineUDF3(String value) {
        return new JAXBElement<String>(_LineItemLineUDF3_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineUDF5", scope = LineItem.class)
    public JAXBElement<String> createLineItemLineUDF5(String value) {
        return new JAXBElement<String>(_LineItemLineUDF5_QNAME, String.class, LineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined9", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined9(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined9_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined8", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined8(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined8_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined7", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined7(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined7_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined10", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined10(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined10_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined6", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined6(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined6_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined5", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined5(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined5_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined4", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined4(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined4_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined3", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined3(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined3_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined2", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined2(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined2_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined1", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined1(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined1_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefined0", scope = UserDefinedField.class)
    public JAXBElement<String> createUserDefinedFieldUserDefined0(String value) {
        return new JAXBElement<String>(_UserDefinedFieldUserDefined0_QNAME, String.class, UserDefinedField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "CC", scope = TechnicalContact.class)
    public JAXBElement<String> createTechnicalContactCC(String value) {
        return new JAXBElement<String>(_TechnicalContactCC_QNAME, String.class, TechnicalContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "EmailSubject", scope = TechnicalContact.class)
    public JAXBElement<String> createTechnicalContactEmailSubject(String value) {
        return new JAXBElement<String>(_TechnicalContactEmailSubject_QNAME, String.class, TechnicalContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Name", scope = TechnicalContact.class)
    public JAXBElement<String> createTechnicalContactName(String value) {
        return new JAXBElement<String>(_TechnicalContactName_QNAME, String.class, TechnicalContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "BCC", scope = TechnicalContact.class)
    public JAXBElement<String> createTechnicalContactBCC(String value) {
        return new JAXBElement<String>(_TechnicalContactBCC_QNAME, String.class, TechnicalContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Phone", scope = TechnicalContact.class)
    public JAXBElement<String> createTechnicalContactPhone(String value) {
        return new JAXBElement<String>(_TechnicalContactPhone_QNAME, String.class, TechnicalContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "PromotionCode", scope = Request.class)
    public JAXBElement<String> createRequestPromotionCode(String value) {
        return new JAXBElement<String>(_RequestPromotionCode_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ShipmentOption", scope = Request.class)
    public JAXBElement<ShippingOption> createRequestShipmentOption(ShippingOption value) {
        return new JAXBElement<ShippingOption>(_RequestShipmentOption_QNAME, ShippingOption.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "AuthenticationKey", scope = Request.class)
    public JAXBElement<String> createRequestAuthenticationKey(String value) {
        return new JAXBElement<String>(_RequestAuthenticationKey_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderHoldCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderHolds", scope = Request.class)
    public JAXBElement<OrderHoldCollection> createRequestOrderHolds(OrderHoldCollection value) {
        return new JAXBElement<OrderHoldCollection>(_RequestOrderHolds_QNAME, OrderHoldCollection.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "LineItems", scope = Request.class)
    public JAXBElement<LineItemCollection> createRequestLineItems(LineItemCollection value) {
        return new JAXBElement<LineItemCollection>(_RequestLineItems_QNAME, LineItemCollection.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Email", scope = Request.class)
    public JAXBElement<String> createRequestEmail(String value) {
        return new JAXBElement<String>(_RequestEmail_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ShippingAddress", scope = Request.class)
    public JAXBElement<Address> createRequestShippingAddress(Address value) {
        return new JAXBElement<Address>(_RequestShippingAddress_QNAME, Address.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderNumber", scope = Request.class)
    public JAXBElement<String> createRequestOrderNumber(String value) {
        return new JAXBElement<String>(_RequestOrderNumber_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderType", scope = Request.class)
    public JAXBElement<String> createRequestOrderType(String value) {
        return new JAXBElement<String>(_RequestOrderType_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalOrderField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "AdditionalOrderInfo", scope = Request.class)
    public JAXBElement<AdditionalOrderField> createRequestAdditionalOrderInfo(AdditionalOrderField value) {
        return new JAXBElement<AdditionalOrderField>(_RequestAdditionalOrderInfo_QNAME, AdditionalOrderField.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalContactCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "TechnicalContacts", scope = Request.class)
    public JAXBElement<TechnicalContactCollection> createRequestTechnicalContacts(TechnicalContactCollection value) {
        return new JAXBElement<TechnicalContactCollection>(_RequestTechnicalContacts_QNAME, TechnicalContactCollection.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderMessages", scope = Request.class)
    public JAXBElement<MessageCollection> createRequestOrderMessages(MessageCollection value) {
        return new JAXBElement<MessageCollection>(_RequestOrderMessages_QNAME, MessageCollection.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderClass", scope = Request.class)
    public JAXBElement<String> createRequestOrderClass(String value) {
        return new JAXBElement<String>(_RequestOrderClass_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderPayment", scope = Request.class)
    public JAXBElement<Payment> createRequestOrderPayment(Payment value) {
        return new JAXBElement<Payment>(_RequestOrderPayment_QNAME, Payment.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "BillingAddress", scope = Request.class)
    public JAXBElement<Address> createRequestBillingAddress(Address value) {
        return new JAXBElement<Address>(_RequestBillingAddress_QNAME, Address.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ShipAfterDate", scope = Request.class)
    public JAXBElement<String> createRequestShipAfterDate(String value) {
        return new JAXBElement<String>(_RequestShipAfterDate_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Misc", scope = Request.class)
    public JAXBElement<String> createRequestMisc(String value) {
        return new JAXBElement<String>(_RequestMisc_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "UserDefinedInfo", scope = Request.class)
    public JAXBElement<UserDefinedField> createRequestUserDefinedInfo(UserDefinedField value) {
        return new JAXBElement<UserDefinedField>(_RequestUserDefinedInfo_QNAME, UserDefinedField.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OwnerCode", scope = Request.class)
    public JAXBElement<String> createRequestOwnerCode(String value) {
        return new JAXBElement<String>(_RequestOwnerCode_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OrderDate", scope = Request.class)
    public JAXBElement<String> createRequestOrderDate(String value) {
        return new JAXBElement<String>(_RequestOrderDate_QNAME, String.class, Request.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Order", scope = OrderRequest.class)
    public JAXBElement<Request> createOrderRequestOrder(Request value) {
        return new JAXBElement<Request>(_OrderRequestOrder_QNAME, Request.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Department", scope = Address.class)
    public JAXBElement<String> createAddressDepartment(String value) {
        return new JAXBElement<String>(_AddressDepartment_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Attention", scope = Address.class)
    public JAXBElement<String> createAddressAttention(String value) {
        return new JAXBElement<String>(_AddressAttention_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_AddressCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "CountryCode", scope = Address.class)
    public JAXBElement<String> createAddressCountryCode(String value) {
        return new JAXBElement<String>(_AddressCountryCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "State", scope = Address.class)
    public JAXBElement<String> createAddressState(String value) {
        return new JAXBElement<String>(_AddressState_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Address2", scope = Address.class)
    public JAXBElement<String> createAddressAddress2(String value) {
        return new JAXBElement<String>(_AddressAddress2_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Address1", scope = Address.class)
    public JAXBElement<String> createAddressAddress1(String value) {
        return new JAXBElement<String>(_AddressAddress1_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Name", scope = Address.class)
    public JAXBElement<String> createAddressName(String value) {
        return new JAXBElement<String>(_TechnicalContactName_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Phone", scope = Address.class)
    public JAXBElement<String> createAddressPhone(String value) {
        return new JAXBElement<String>(_TechnicalContactPhone_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "PostalCode", scope = Address.class)
    public JAXBElement<String> createAddressPostalCode(String value) {
        return new JAXBElement<String>(_AddressPostalCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Message", scope = Notification.class)
    public JAXBElement<String> createNotificationMessage(String value) {
        return new JAXBElement<String>(_NotificationMessage_QNAME, String.class, Notification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "AuthenticationKey", scope = ServiceStatusRequest.class)
    public JAXBElement<String> createServiceStatusRequestAuthenticationKey(String value) {
        return new JAXBElement<String>(_RequestAuthenticationKey_QNAME, String.class, ServiceStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "OwnerCode", scope = ServiceStatusRequest.class)
    public JAXBElement<String> createServiceStatusRequestOwnerCode(String value) {
        return new JAXBElement<String>(_RequestOwnerCode_QNAME, String.class, ServiceStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ExpirationDate", scope = Payment.class)
    public JAXBElement<String> createPaymentExpirationDate(String value) {
        return new JAXBElement<String>(_PaymentExpirationDate_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "ReferenceNumber", scope = Payment.class)
    public JAXBElement<String> createPaymentReferenceNumber(String value) {
        return new JAXBElement<String>(_PaymentReferenceNumber_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "CreditCardNumber", scope = Payment.class)
    public JAXBElement<String> createPaymentCreditCardNumber(String value) {
        return new JAXBElement<String>(_PaymentCreditCardNumber_QNAME, String.class, Payment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Text", scope = OrderMessage.class)
    public JAXBElement<String> createOrderMessageText(String value) {
        return new JAXBElement<String>(_OrderMessageText_QNAME, String.class, OrderMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", name = "Response", scope = OrderResponse.class)
    public JAXBElement<Reply> createOrderResponseResponse(Reply value) {
        return new JAXBElement<Reply>(_OrderResponseResponse_QNAME, Reply.class, OrderResponse.class, value);
    }

}
