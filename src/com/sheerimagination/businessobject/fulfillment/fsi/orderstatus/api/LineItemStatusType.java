
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Shipped"/>
 *     &lt;enumeration value="BackOrdered"/>
 *     &lt;enumeration value="PartiallyShipped"/>
 *     &lt;enumeration value="PartiallyBackOrdered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemStatusType")
@XmlEnum
public enum LineItemStatusType {

    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),
    @XmlEnumValue("BackOrdered")
    BACK_ORDERED("BackOrdered"),
    @XmlEnumValue("PartiallyShipped")
    PARTIALLY_SHIPPED("PartiallyShipped"),
    @XmlEnumValue("PartiallyBackOrdered")
    PARTIALLY_BACK_ORDERED("PartiallyBackOrdered");
    private final String value;

    LineItemStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineItemStatusType fromValue(String v) {
        for (LineItemStatusType c: LineItemStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
