//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.08 at 01:30:40 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for vendor_item_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vendor_item_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="items" type="{}simple_item_list_type" minOccurs="0"/>
 *         &lt;element name="creditor_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="item_serial_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendor_item_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vendor_item_criteria_type", propOrder = {
    "itemId",
    "items",
    "creditorId",
    "itemSerialNo",
    "vendorItemNo"
})
public class VendorItemCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "item_id", required = true)
    protected BigInteger itemId;
    protected SimpleItemListType items;
    @XmlElement(name = "creditor_id", required = true)
    protected BigInteger creditorId;
    @XmlElement(name = "item_serial_no", required = true)
    protected String itemSerialNo;
    @XmlElement(name = "vendor_item_no", required = true)
    protected String vendorItemNo;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemId(BigInteger value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemListType }
     *     
     */
    public SimpleItemListType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemListType }
     *     
     */
    public void setItems(SimpleItemListType value) {
        this.items = value;
    }

    /**
     * Gets the value of the creditorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditorId() {
        return creditorId;
    }

    /**
     * Sets the value of the creditorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditorId(BigInteger value) {
        this.creditorId = value;
    }

    /**
     * Gets the value of the itemSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSerialNo() {
        return itemSerialNo;
    }

    /**
     * Sets the value of the itemSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSerialNo(String value) {
        this.itemSerialNo = value;
    }

    /**
     * Gets the value of the vendorItemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorItemNo() {
        return vendorItemNo;
    }

    /**
     * Sets the value of the vendorItemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorItemNo(String value) {
        this.vendorItemNo = value;
    }

}
