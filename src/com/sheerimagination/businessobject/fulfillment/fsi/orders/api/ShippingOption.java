
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsSignatureRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSaturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsInsured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CodType" type="{https://www.fsicatalog.com/services/orderprocessing/v4}COD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingOption", propOrder = {
    "isSignatureRequired",
    "isSaturdayDelivery",
    "insuranceAmount",
    "isInsured",
    "isCod",
    "codType"
})
public class ShippingOption {

    @XmlElement(name = "IsSignatureRequired")
    protected Boolean isSignatureRequired;
    @XmlElement(name = "IsSaturdayDelivery")
    protected Boolean isSaturdayDelivery;
    @XmlElement(name = "InsuranceAmount")
    protected BigDecimal insuranceAmount;
    @XmlElement(name = "IsInsured")
    protected Boolean isInsured;
    @XmlElement(name = "IsCod")
    protected Boolean isCod;
    @XmlElement(name = "CodType")
    protected COD codType;

    /**
     * Gets the value of the isSignatureRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignatureRequired() {
        return isSignatureRequired;
    }

    /**
     * Sets the value of the isSignatureRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSignatureRequired(Boolean value) {
        this.isSignatureRequired = value;
    }

    /**
     * Gets the value of the isSaturdayDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSaturdayDelivery() {
        return isSaturdayDelivery;
    }

    /**
     * Sets the value of the isSaturdayDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSaturdayDelivery(Boolean value) {
        this.isSaturdayDelivery = value;
    }

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceAmount(BigDecimal value) {
        this.insuranceAmount = value;
    }

    /**
     * Gets the value of the isInsured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInsured() {
        return isInsured;
    }

    /**
     * Sets the value of the isInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInsured(Boolean value) {
        this.isInsured = value;
    }

    /**
     * Gets the value of the isCod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCod() {
        return isCod;
    }

    /**
     * Sets the value of the isCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCod(Boolean value) {
        this.isCod = value;
    }

    /**
     * Gets the value of the codType property.
     * 
     * @return
     *     possible object is
     *     {@link COD }
     *     
     */
    public COD getCodType() {
        return codType;
    }

    /**
     * Sets the value of the codType property.
     * 
     * @param value
     *     allowed object is
     *     {@link COD }
     *     
     */
    public void setCodType(COD value) {
        this.codType = value;
    }

}
