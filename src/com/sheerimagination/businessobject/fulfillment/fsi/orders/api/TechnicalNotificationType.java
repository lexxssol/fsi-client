
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalNotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TechnicalNotificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SuccessOnly"/>
 *     &lt;enumeration value="ErrorOnly"/>
 *     &lt;enumeration value="DataTruncation"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TechnicalNotificationType")
@XmlEnum
public enum TechnicalNotificationType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SuccessOnly")
    SUCCESS_ONLY("SuccessOnly"),
    @XmlEnumValue("ErrorOnly")
    ERROR_ONLY("ErrorOnly"),
    @XmlEnumValue("DataTruncation")
    DATA_TRUNCATION("DataTruncation"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    TechnicalNotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TechnicalNotificationType fromValue(String v) {
        for (TechnicalNotificationType c: TechnicalNotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
