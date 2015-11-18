
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="PRIVATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderMessageType")
@XmlEnum
public enum OrderMessageType {

    PUBLIC,
    PRIVATE;

    public String value() {
        return name();
    }

    public static OrderMessageType fromValue(String v) {
        return valueOf(v);
    }

}
