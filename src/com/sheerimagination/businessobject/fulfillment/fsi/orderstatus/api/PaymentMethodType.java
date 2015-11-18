
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="NoCharge"/>
 *     &lt;enumeration value="PreChargedCard"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="TermsNet30"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType")
@XmlEnum
public enum PaymentMethodType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("NoCharge")
    NO_CHARGE("NoCharge"),
    @XmlEnumValue("PreChargedCard")
    PRE_CHARGED_CARD("PreChargedCard"),
    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("TermsNet30")
    TERMS_NET_30("TermsNet30");
    private final String value;

    PaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodType fromValue(String v) {
        for (PaymentMethodType c: PaymentMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
