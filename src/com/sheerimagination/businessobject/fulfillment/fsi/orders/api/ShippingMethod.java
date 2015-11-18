
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="FC"/>
 *     &lt;enumeration value="FCN"/>
 *     &lt;enumeration value="FE2"/>
 *     &lt;enumeration value="FE3"/>
 *     &lt;enumeration value="FEG"/>
 *     &lt;enumeration value="FEI"/>
 *     &lt;enumeration value="FEP"/>
 *     &lt;enumeration value="FES"/>
 *     &lt;enumeration value="FFO"/>
 *     &lt;enumeration value="FHD"/>
 *     &lt;enumeration value="FIE"/>
 *     &lt;enumeration value="GP"/>
 *     &lt;enumeration value="UP2"/>
 *     &lt;enumeration value="UP3"/>
 *     &lt;enumeration value="UPN"/>
 *     &lt;enumeration value="UPS"/>
 *     &lt;enumeration value="UWC"/>
 *     &lt;enumeration value="UWE"/>
 *     &lt;enumeration value="UWP"/>
 *     &lt;enumeration value="UWS"/>
 *     &lt;enumeration value="UWX"/>
 *     &lt;enumeration value="UWA"/>
 *     &lt;enumeration value="U2A"/>
 *     &lt;enumeration value="UNS"/>
 *     &lt;enumeration value="DHI"/>
 *     &lt;enumeration value="PPM"/>
 *     &lt;enumeration value="PGP"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="TRUCK"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="PICKUP"/>
 *     &lt;enumeration value="PFR"/>
 *     &lt;enumeration value="PEM"/>
 *     &lt;enumeration value="PMM"/>
 *     &lt;enumeration value="UPSSR"/>
 *     &lt;enumeration value="UP2SR"/>
 *     &lt;enumeration value="UP3SR"/>
 *     &lt;enumeration value="UPNSR"/>
 *     &lt;enumeration value="UPC"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="PFC"/>
 *     &lt;enumeration value="APC"/>
 *     &lt;enumeration value="F2A"/>
 *     &lt;enumeration value="FGC"/>
 *     &lt;enumeration value="FGP"/>
 *     &lt;enumeration value="PFI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingMethod")
@XmlEnum
public enum ShippingMethod {

    @XmlEnumValue("None")
    NONE("None"),
    PM("PM"),
    FC("FC"),
    FCN("FCN"),
    @XmlEnumValue("FE2")
    FE_2("FE2"),
    @XmlEnumValue("FE3")
    FE_3("FE3"),
    FEG("FEG"),
    FEI("FEI"),
    FEP("FEP"),
    FES("FES"),
    FFO("FFO"),
    FHD("FHD"),
    FIE("FIE"),
    GP("GP"),
    @XmlEnumValue("UP2")
    UP_2("UP2"),
    @XmlEnumValue("UP3")
    UP_3("UP3"),
    UPN("UPN"),
    UPS("UPS"),
    UWC("UWC"),
    UWE("UWE"),
    UWP("UWP"),
    UWS("UWS"),
    UWX("UWX"),
    UWA("UWA"),
    @XmlEnumValue("U2A")
    U_2_A("U2A"),
    UNS("UNS"),
    DHI("DHI"),
    PPM("PPM"),
    PGP("PGP"),
    LTL("LTL"),
    TRUCK("TRUCK"),
    COU("COU"),
    PICKUP("PICKUP"),
    PFR("PFR"),
    PEM("PEM"),
    PMM("PMM"),
    UPSSR("UPSSR"),
    @XmlEnumValue("UP2SR")
    UP_2_SR("UP2SR"),
    @XmlEnumValue("UP3SR")
    UP_3_SR("UP3SR"),
    UPNSR("UPNSR"),
    UPC("UPC"),
    SL("SL"),
    PFC("PFC"),
    APC("APC"),
    @XmlEnumValue("F2A")
    F_2_A("F2A"),
    FGC("FGC"),
    FGP("FGP"),
    PFI("PFI");
    private final String value;

    ShippingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingMethod fromValue(String v) {
        for (ShippingMethod c: ShippingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
