
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="Order" type="{https://www.fsicatalog.com/services/orderprocessing/v4}Request" minOccurs="0"/>
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
    "order"
})
@XmlRootElement(name = "OrderRequest")
public class OrderRequest {

    @XmlElementRef(name = "Order", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<Request> order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Request }{@code >}
     *     
     */
    public JAXBElement<Request> getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Request }{@code >}
     *     
     */
    public void setOrder(JAXBElement<Request> value) {
        this.order = value;
    }

}
