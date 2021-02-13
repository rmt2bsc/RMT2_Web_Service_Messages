//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 06:30:03 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for purchase_order_criteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchase_order_criteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target_level" type="{}xact_custom_criteria_target_type"/>
 *         &lt;element name="purchase_order_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="status_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="business_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reference_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchase_order_criteria", propOrder = {
    "targetLevel",
    "purchaseOrderId",
    "statusId",
    "vendor",
    "businessId",
    "businessName",
    "referenceNo"
})
public class PurchaseOrderCriteria
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "target_level", required = true)
    @XmlSchemaType(name = "string")
    protected XactCustomCriteriaTargetType targetLevel;
    @XmlElement(name = "purchase_order_id", required = true)
    protected BigInteger purchaseOrderId;
    @XmlElement(name = "status_id", required = true)
    protected BigInteger statusId;
    @XmlElement(name = "Vendor", required = true)
    protected BigInteger vendor;
    @XmlElement(name = "business_id", required = true)
    protected BigInteger businessId;
    @XmlElement(name = "business_name", required = true)
    protected String businessName;
    @XmlElement(name = "reference_no", required = true)
    protected String referenceNo;

    /**
     * Gets the value of the targetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link XactCustomCriteriaTargetType }
     *     
     */
    public XactCustomCriteriaTargetType getTargetLevel() {
        return targetLevel;
    }

    /**
     * Sets the value of the targetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCustomCriteriaTargetType }
     *     
     */
    public void setTargetLevel(XactCustomCriteriaTargetType value) {
        this.targetLevel = value;
    }

    /**
     * Gets the value of the purchaseOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * Sets the value of the purchaseOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderId(BigInteger value) {
        this.purchaseOrderId = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusId(BigInteger value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVendor(BigInteger value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the businessId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessId() {
        return businessId;
    }

    /**
     * Sets the value of the businessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessId(BigInteger value) {
        this.businessId = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

}
