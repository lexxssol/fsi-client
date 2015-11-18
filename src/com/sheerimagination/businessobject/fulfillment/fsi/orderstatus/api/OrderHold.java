
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderHold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHold", propOrder = {
    "holdCode",
    "holdReason"
})
public class OrderHold {

    @XmlElementRef(name = "HoldCode", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdCode;
    @XmlElementRef(name = "HoldReason", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdReason;

    /**
     * Gets the value of the holdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldCode() {
        return holdCode;
    }

    /**
     * Sets the value of the holdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldCode(JAXBElement<String> value) {
        this.holdCode = value;
    }

    /**
     * Gets the value of the holdReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldReason() {
        return holdReason;
    }

    /**
     * Sets the value of the holdReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldReason(JAXBElement<String> value) {
        this.holdReason = value;
    }

}
