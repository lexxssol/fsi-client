
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderHoldReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderHoldReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="TEST_ORDER"/>
 *     &lt;enumeration value="HOLD_FOR_PAYMENT"/>
 *     &lt;enumeration value="MISSING_EMAIL"/>
 *     &lt;enumeration value="WEB_ORDER_HOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderHoldReason")
@XmlEnum
public enum OrderHoldReason {

    NONE,
    TEST_ORDER,
    HOLD_FOR_PAYMENT,
    MISSING_EMAIL,
    WEB_ORDER_HOLD;

    public String value() {
        return name();
    }

    public static OrderHoldReason fromValue(String v) {
        return valueOf(v);
    }

}
