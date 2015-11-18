
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotFound"/>
 *     &lt;enumeration value="Posted"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="BackOrdered"/>
 *     &lt;enumeration value="PartiallyShipped"/>
 *     &lt;enumeration value="PartiallyBackOrdered"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusType")
@XmlEnum
public enum OrderStatusType {

    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("Posted")
    POSTED("Posted"),
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),
    @XmlEnumValue("BackOrdered")
    BACK_ORDERED("BackOrdered"),
    @XmlEnumValue("PartiallyShipped")
    PARTIALLY_SHIPPED("PartiallyShipped"),
    @XmlEnumValue("PartiallyBackOrdered")
    PARTIALLY_BACK_ORDERED("PartiallyBackOrdered"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    OrderStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusType fromValue(String v) {
        for (OrderStatusType c: OrderStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
