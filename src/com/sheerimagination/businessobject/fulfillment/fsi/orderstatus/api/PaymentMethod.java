
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="DiscoverAuthorizeNet"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="AmexAuthorizeNet"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="MastercardAuthorizeNet"/>
 *     &lt;enumeration value="NoCharge"/>
 *     &lt;enumeration value="PreChargedCard"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="VisaAuthorizeNet"/>
 *     &lt;enumeration value="TermsNet10"/>
 *     &lt;enumeration value="TermsNet15"/>
 *     &lt;enumeration value="TermsNet20"/>
 *     &lt;enumeration value="TermsNet30"/>
 *     &lt;enumeration value="TermsNet45"/>
 *     &lt;enumeration value="TermsNet60"/>
 *     &lt;enumeration value="TermsNet90"/>
 *     &lt;enumeration value="TermsNet120"/>
 *     &lt;enumeration value="TermsNet180"/>
 *     &lt;enumeration value="GLCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethod")
@XmlEnum
public enum PaymentMethod {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("DiscoverAuthorizeNet")
    DISCOVER_AUTHORIZE_NET("DiscoverAuthorizeNet"),
    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("AmexAuthorizeNet")
    AMEX_AUTHORIZE_NET("AmexAuthorizeNet"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("MastercardAuthorizeNet")
    MASTERCARD_AUTHORIZE_NET("MastercardAuthorizeNet"),
    @XmlEnumValue("NoCharge")
    NO_CHARGE("NoCharge"),
    @XmlEnumValue("PreChargedCard")
    PRE_CHARGED_CARD("PreChargedCard"),
    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("VisaAuthorizeNet")
    VISA_AUTHORIZE_NET("VisaAuthorizeNet"),
    @XmlEnumValue("TermsNet10")
    TERMS_NET_10("TermsNet10"),
    @XmlEnumValue("TermsNet15")
    TERMS_NET_15("TermsNet15"),
    @XmlEnumValue("TermsNet20")
    TERMS_NET_20("TermsNet20"),
    @XmlEnumValue("TermsNet30")
    TERMS_NET_30("TermsNet30"),
    @XmlEnumValue("TermsNet45")
    TERMS_NET_45("TermsNet45"),
    @XmlEnumValue("TermsNet60")
    TERMS_NET_60("TermsNet60"),
    @XmlEnumValue("TermsNet90")
    TERMS_NET_90("TermsNet90"),
    @XmlEnumValue("TermsNet120")
    TERMS_NET_120("TermsNet120"),
    @XmlEnumValue("TermsNet180")
    TERMS_NET_180("TermsNet180"),
    @XmlEnumValue("GLCode")
    GL_CODE("GLCode");
    private final String value;

    PaymentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethod fromValue(String v) {
        for (PaymentMethod c: PaymentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
