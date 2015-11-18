
package com.sheerimagination.businessobject.fulfillment.fsi.inventory.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sheerimagination.businessobject.fulfillment.fsi.inventory.api package. 
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

    private final static QName _InventoryRequest_QNAME = new QName("https://www.fsicatalog.com/WebServices", "InventoryRequest");
    private final static QName _InventoryReply_QNAME = new QName("https://www.fsicatalog.com/WebServices", "InventoryReply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sheerimagination.businessobject.fulfillment.fsi.inventory.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InventoryRequest }
     * 
     */
    public InventoryRequest createInventoryRequest() {
        return new InventoryRequest();
    }

    /**
     * Create an instance of {@link InventoryReply }
     * 
     */
    public InventoryReply createInventoryReply() {
        return new InventoryReply();
    }

    /**
     * Create an instance of {@link InventoryItem }
     * 
     */
    public InventoryItem createInventoryItem() {
        return new InventoryItem();
    }

    /**
     * Create an instance of {@link ArrayOfNotification }
     * 
     */
    public ArrayOfNotification createArrayOfNotification() {
        return new ArrayOfNotification();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryItem }
     * 
     */
    public ArrayOfInventoryItem createArrayOfInventoryItem() {
        return new ArrayOfInventoryItem();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link InventoryInquiryResponse }
     * 
     */
    public InventoryInquiryResponse createInventoryInquiryResponse() {
        return new InventoryInquiryResponse();
    }

    /**
     * Create an instance of {@link InventoryInquiry }
     * 
     */
    public InventoryInquiry createInventoryInquiry() {
        return new InventoryInquiry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/WebServices", name = "InventoryRequest")
    public JAXBElement<InventoryRequest> createInventoryRequest(InventoryRequest value) {
        return new JAXBElement<InventoryRequest>(_InventoryRequest_QNAME, InventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.fsicatalog.com/WebServices", name = "InventoryReply")
    public JAXBElement<InventoryReply> createInventoryReply(InventoryReply value) {
        return new JAXBElement<InventoryReply>(_InventoryReply_QNAME, InventoryReply.class, null, value);
    }

}
