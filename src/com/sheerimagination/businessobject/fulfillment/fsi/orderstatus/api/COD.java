
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="COD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOCOD"/>
 *     &lt;enumeration value="FDX01"/>
 *     &lt;enumeration value="FDX02"/>
 *     &lt;enumeration value="FDX03"/>
 *     &lt;enumeration value="UPS01"/>
 *     &lt;enumeration value="UPS02"/>
 *     &lt;enumeration value="UPS03"/>
 *     &lt;enumeration value="UPS04"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COD")
@XmlEnum
public enum COD {

    NOCOD("NOCOD"),
    @XmlEnumValue("FDX01")
    FDX_01("FDX01"),
    @XmlEnumValue("FDX02")
    FDX_02("FDX02"),
    @XmlEnumValue("FDX03")
    FDX_03("FDX03"),
    @XmlEnumValue("UPS01")
    UPS_01("UPS01"),
    @XmlEnumValue("UPS02")
    UPS_02("UPS02"),
    @XmlEnumValue("UPS03")
    UPS_03("UPS03"),
    @XmlEnumValue("UPS04")
    UPS_04("UPS04");
    private final String value;

    COD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COD fromValue(String v) {
        for (COD c: COD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
