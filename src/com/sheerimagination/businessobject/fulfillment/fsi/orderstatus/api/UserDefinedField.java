
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDefinedField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderUDF0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderUDF9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedField", propOrder = {
    "orderUDF0",
    "orderUDF1",
    "orderUDF10",
    "orderUDF2",
    "orderUDF3",
    "orderUDF4",
    "orderUDF5",
    "orderUDF6",
    "orderUDF7",
    "orderUDF8",
    "orderUDF9"
})
public class UserDefinedField {

    @XmlElementRef(name = "OrderUDF0", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF0;
    @XmlElementRef(name = "OrderUDF1", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF1;
    @XmlElementRef(name = "OrderUDF10", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF10;
    @XmlElementRef(name = "OrderUDF2", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF2;
    @XmlElementRef(name = "OrderUDF3", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF3;
    @XmlElementRef(name = "OrderUDF4", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF4;
    @XmlElementRef(name = "OrderUDF5", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF5;
    @XmlElementRef(name = "OrderUDF6", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF6;
    @XmlElementRef(name = "OrderUDF7", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF7;
    @XmlElementRef(name = "OrderUDF8", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF8;
    @XmlElementRef(name = "OrderUDF9", namespace = "https://www.fsicatalog.com/services/OrderStatus/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderUDF9;

    /**
     * Gets the value of the orderUDF0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF0() {
        return orderUDF0;
    }

    /**
     * Sets the value of the orderUDF0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF0(JAXBElement<String> value) {
        this.orderUDF0 = value;
    }

    /**
     * Gets the value of the orderUDF1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF1() {
        return orderUDF1;
    }

    /**
     * Sets the value of the orderUDF1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF1(JAXBElement<String> value) {
        this.orderUDF1 = value;
    }

    /**
     * Gets the value of the orderUDF10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF10() {
        return orderUDF10;
    }

    /**
     * Sets the value of the orderUDF10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF10(JAXBElement<String> value) {
        this.orderUDF10 = value;
    }

    /**
     * Gets the value of the orderUDF2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF2() {
        return orderUDF2;
    }

    /**
     * Sets the value of the orderUDF2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF2(JAXBElement<String> value) {
        this.orderUDF2 = value;
    }

    /**
     * Gets the value of the orderUDF3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF3() {
        return orderUDF3;
    }

    /**
     * Sets the value of the orderUDF3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF3(JAXBElement<String> value) {
        this.orderUDF3 = value;
    }

    /**
     * Gets the value of the orderUDF4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF4() {
        return orderUDF4;
    }

    /**
     * Sets the value of the orderUDF4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF4(JAXBElement<String> value) {
        this.orderUDF4 = value;
    }

    /**
     * Gets the value of the orderUDF5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF5() {
        return orderUDF5;
    }

    /**
     * Sets the value of the orderUDF5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF5(JAXBElement<String> value) {
        this.orderUDF5 = value;
    }

    /**
     * Gets the value of the orderUDF6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF6() {
        return orderUDF6;
    }

    /**
     * Sets the value of the orderUDF6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF6(JAXBElement<String> value) {
        this.orderUDF6 = value;
    }

    /**
     * Gets the value of the orderUDF7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF7() {
        return orderUDF7;
    }

    /**
     * Sets the value of the orderUDF7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF7(JAXBElement<String> value) {
        this.orderUDF7 = value;
    }

    /**
     * Gets the value of the orderUDF8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF8() {
        return orderUDF8;
    }

    /**
     * Sets the value of the orderUDF8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF8(JAXBElement<String> value) {
        this.orderUDF8 = value;
    }

    /**
     * Gets the value of the orderUDF9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderUDF9() {
        return orderUDF9;
    }

    /**
     * Sets the value of the orderUDF9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderUDF9(JAXBElement<String> value) {
        this.orderUDF9 = value;
    }

}
