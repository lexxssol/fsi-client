
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

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
 *         &lt;element name="GetOrderStatusJsonResult" type="{https://www.fsicatalog.com/services/OrderStatus/v2}OrderStatusReply" minOccurs="0"/>
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
    "getOrderStatusJsonResult"
})
@XmlRootElement(name = "GetOrderStatusJsonResponse")
public class GetOrderStatusJsonResponse {

    @XmlElementRef(name = "GetOrderStatusJsonResult", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<OrderStatusReply> getOrderStatusJsonResult;

    /**
     * Gets the value of the getOrderStatusJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrderStatusReply }{@code >}
     *     
     */
    public JAXBElement<OrderStatusReply> getGetOrderStatusJsonResult() {
        return getOrderStatusJsonResult;
    }

    /**
     * Sets the value of the getOrderStatusJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrderStatusReply }{@code >}
     *     
     */
    public void setGetOrderStatusJsonResult(JAXBElement<OrderStatusReply> value) {
        this.getOrderStatusJsonResult = value;
    }

}
