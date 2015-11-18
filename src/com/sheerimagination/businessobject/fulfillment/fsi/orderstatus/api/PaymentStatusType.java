
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Future"/>
 *     &lt;enumeration value="PendingApproval"/>
 *     &lt;enumeration value="AttemptInProgress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusType")
@XmlEnum
public enum PaymentStatusType {

    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Future")
    FUTURE("Future"),
    @XmlEnumValue("PendingApproval")
    PENDING_APPROVAL("PendingApproval"),
    @XmlEnumValue("AttemptInProgress")
    ATTEMPT_IN_PROGRESS("AttemptInProgress");
    private final String value;

    PaymentStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusType fromValue(String v) {
        for (PaymentStatusType c: PaymentStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
