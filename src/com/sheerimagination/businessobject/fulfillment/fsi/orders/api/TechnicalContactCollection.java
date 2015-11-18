
package com.sheerimagination.businessobject.fulfillment.fsi.orders.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalContactCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalContactCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TechnicalContact" type="{https://www.fsicatalog.com/services/orderprocessing/v4}TechnicalContact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalContactCollection", propOrder = {
    "technicalContact"
})
public class TechnicalContactCollection {

    @XmlElement(name = "TechnicalContact", nillable = true)
    protected List<TechnicalContact> technicalContact;

    /**
     * Gets the value of the technicalContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalContact }
     * 
     * 
     */
    public List<TechnicalContact> getTechnicalContact() {
        if (technicalContact == null) {
            technicalContact = new ArrayList<TechnicalContact>();
        }
        return this.technicalContact;
    }

}
