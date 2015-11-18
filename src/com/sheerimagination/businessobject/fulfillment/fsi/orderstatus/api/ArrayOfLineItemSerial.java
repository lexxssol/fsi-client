
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLineItemSerial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLineItemSerial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemSerial" type="{https://www.fsicatalog.com/services/OrderStatus/v2}LineItemSerial" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLineItemSerial", propOrder = {
    "lineItemSerial"
})
public class ArrayOfLineItemSerial {

    @XmlElement(name = "LineItemSerial", nillable = true)
    protected List<LineItemSerial> lineItemSerial;

    /**
     * Gets the value of the lineItemSerial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemSerial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemSerial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemSerial }
     * 
     * 
     */
    public List<LineItemSerial> getLineItemSerial() {
        if (lineItemSerial == null) {
            lineItemSerial = new ArrayList<LineItemSerial>();
        }
        return this.lineItemSerial;
    }

}
