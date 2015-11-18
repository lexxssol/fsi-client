
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalOrderField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalOrderField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentTerritoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentTerritoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FixedTerritoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FixedTerritoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderSourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Future10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalOrderField", propOrder = {
    "currentTerritoryCode",
    "currentTerritoryName",
    "fixedTerritoryCode",
    "fixedTerritoryName",
    "orderSourceCode",
    "orderSourceName",
    "future1",
    "future2",
    "future3",
    "future4",
    "future5",
    "future6",
    "future7",
    "future8",
    "future9",
    "future10"
})
public class AdditionalOrderField {

    @XmlElementRef(name = "CurrentTerritoryCode", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentTerritoryCode;
    @XmlElementRef(name = "CurrentTerritoryName", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentTerritoryName;
    @XmlElementRef(name = "FixedTerritoryCode", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fixedTerritoryCode;
    @XmlElementRef(name = "FixedTerritoryName", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fixedTerritoryName;
    @XmlElementRef(name = "OrderSourceCode", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderSourceCode;
    @XmlElementRef(name = "OrderSourceName", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderSourceName;
    @XmlElementRef(name = "Future1", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future1;
    @XmlElementRef(name = "Future2", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future2;
    @XmlElementRef(name = "Future3", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future3;
    @XmlElementRef(name = "Future4", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future4;
    @XmlElementRef(name = "Future5", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future5;
    @XmlElementRef(name = "Future6", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future6;
    @XmlElementRef(name = "Future7", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future7;
    @XmlElementRef(name = "Future8", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future8;
    @XmlElementRef(name = "Future9", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future9;
    @XmlElementRef(name = "Future10", namespace = "https://www.fsicatalog.com/services/orderprocessing/v4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> future10;

    /**
     * Gets the value of the currentTerritoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentTerritoryCode() {
        return currentTerritoryCode;
    }

    /**
     * Sets the value of the currentTerritoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentTerritoryCode(JAXBElement<String> value) {
        this.currentTerritoryCode = value;
    }

    /**
     * Gets the value of the currentTerritoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentTerritoryName() {
        return currentTerritoryName;
    }

    /**
     * Sets the value of the currentTerritoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentTerritoryName(JAXBElement<String> value) {
        this.currentTerritoryName = value;
    }

    /**
     * Gets the value of the fixedTerritoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFixedTerritoryCode() {
        return fixedTerritoryCode;
    }

    /**
     * Sets the value of the fixedTerritoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFixedTerritoryCode(JAXBElement<String> value) {
        this.fixedTerritoryCode = value;
    }

    /**
     * Gets the value of the fixedTerritoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFixedTerritoryName() {
        return fixedTerritoryName;
    }

    /**
     * Sets the value of the fixedTerritoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFixedTerritoryName(JAXBElement<String> value) {
        this.fixedTerritoryName = value;
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
     * Gets the value of the future1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture1() {
        return future1;
    }

    /**
     * Sets the value of the future1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture1(JAXBElement<String> value) {
        this.future1 = value;
    }

    /**
     * Gets the value of the future2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture2() {
        return future2;
    }

    /**
     * Sets the value of the future2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture2(JAXBElement<String> value) {
        this.future2 = value;
    }

    /**
     * Gets the value of the future3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture3() {
        return future3;
    }

    /**
     * Sets the value of the future3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture3(JAXBElement<String> value) {
        this.future3 = value;
    }

    /**
     * Gets the value of the future4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture4() {
        return future4;
    }

    /**
     * Sets the value of the future4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture4(JAXBElement<String> value) {
        this.future4 = value;
    }

    /**
     * Gets the value of the future5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture5() {
        return future5;
    }

    /**
     * Sets the value of the future5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture5(JAXBElement<String> value) {
        this.future5 = value;
    }

    /**
     * Gets the value of the future6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture6() {
        return future6;
    }

    /**
     * Sets the value of the future6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture6(JAXBElement<String> value) {
        this.future6 = value;
    }

    /**
     * Gets the value of the future7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture7() {
        return future7;
    }

    /**
     * Sets the value of the future7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture7(JAXBElement<String> value) {
        this.future7 = value;
    }

    /**
     * Gets the value of the future8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture8() {
        return future8;
    }

    /**
     * Sets the value of the future8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture8(JAXBElement<String> value) {
        this.future8 = value;
    }

    /**
     * Gets the value of the future9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture9() {
        return future9;
    }

    /**
     * Sets the value of the future9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture9(JAXBElement<String> value) {
        this.future9 = value;
    }

    /**
     * Gets the value of the future10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuture10() {
        return future10;
    }

    /**
     * Sets the value of the future10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuture10(JAXBElement<String> value) {
        this.future10 = value;
    }

}
