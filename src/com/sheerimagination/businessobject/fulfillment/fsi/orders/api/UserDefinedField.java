
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

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
 *         &lt;element name="UserDefined0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDefined10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userDefined0",
    "userDefined1",
    "userDefined2",
    "userDefined3",
    "userDefined4",
    "userDefined5",
    "userDefined6",
    "userDefined7",
    "userDefined8",
    "userDefined9",
    "userDefined10"
})
public class UserDefinedField {

    @XmlElementRef(name = "UserDefined0", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined0;
    @XmlElementRef(name = "UserDefined1", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined1;
    @XmlElementRef(name = "UserDefined2", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined2;
    @XmlElementRef(name = "UserDefined3", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined3;
    @XmlElementRef(name = "UserDefined4", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined4;
    @XmlElementRef(name = "UserDefined5", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined5;
    @XmlElementRef(name = "UserDefined6", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined6;
    @XmlElementRef(name = "UserDefined7", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined7;
    @XmlElementRef(name = "UserDefined8", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined8;
    @XmlElementRef(name = "UserDefined9", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined9;
    @XmlElementRef(name = "UserDefined10", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefined10;

    /**
     * Gets the value of the userDefined0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined0() {
        return userDefined0;
    }

    /**
     * Sets the value of the userDefined0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined0(JAXBElement<String> value) {
        this.userDefined0 = value;
    }

    /**
     * Gets the value of the userDefined1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined1() {
        return userDefined1;
    }

    /**
     * Sets the value of the userDefined1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined1(JAXBElement<String> value) {
        this.userDefined1 = value;
    }

    /**
     * Gets the value of the userDefined2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined2() {
        return userDefined2;
    }

    /**
     * Sets the value of the userDefined2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined2(JAXBElement<String> value) {
        this.userDefined2 = value;
    }

    /**
     * Gets the value of the userDefined3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined3() {
        return userDefined3;
    }

    /**
     * Sets the value of the userDefined3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined3(JAXBElement<String> value) {
        this.userDefined3 = value;
    }

    /**
     * Gets the value of the userDefined4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined4() {
        return userDefined4;
    }

    /**
     * Sets the value of the userDefined4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined4(JAXBElement<String> value) {
        this.userDefined4 = value;
    }

    /**
     * Gets the value of the userDefined5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined5() {
        return userDefined5;
    }

    /**
     * Sets the value of the userDefined5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined5(JAXBElement<String> value) {
        this.userDefined5 = value;
    }

    /**
     * Gets the value of the userDefined6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined6() {
        return userDefined6;
    }

    /**
     * Sets the value of the userDefined6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined6(JAXBElement<String> value) {
        this.userDefined6 = value;
    }

    /**
     * Gets the value of the userDefined7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined7() {
        return userDefined7;
    }

    /**
     * Sets the value of the userDefined7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined7(JAXBElement<String> value) {
        this.userDefined7 = value;
    }

    /**
     * Gets the value of the userDefined8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined8() {
        return userDefined8;
    }

    /**
     * Sets the value of the userDefined8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined8(JAXBElement<String> value) {
        this.userDefined8 = value;
    }

    /**
     * Gets the value of the userDefined9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined9() {
        return userDefined9;
    }

    /**
     * Sets the value of the userDefined9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined9(JAXBElement<String> value) {
        this.userDefined9 = value;
    }

    /**
     * Gets the value of the userDefined10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefined10() {
        return userDefined10;
    }

    /**
     * Sets the value of the userDefined10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefined10(JAXBElement<String> value) {
        this.userDefined10 = value;
    }

}
