
package com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLineItemLot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLineItemLot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemLot" type="{https://www.fsicatalog.com/services/OrderStatus/v2}LineItemLot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLineItemLot", propOrder = {
    "lineItemLot"
})
public class ArrayOfLineItemLot {

    @XmlElement(name = "LineItemLot", nillable = true)
    protected List<LineItemLot> lineItemLot;

    /**
     * Gets the value of the lineItemLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemLot }
     * 
     * 
     */
    public List<LineItemLot> getLineItemLot() {
        if (lineItemLot == null) {
            lineItemLot = new ArrayList<LineItemLot>();
        }
        return this.lineItemLot;
    }

}
