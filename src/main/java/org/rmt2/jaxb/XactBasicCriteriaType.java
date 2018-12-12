//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.12 at 04:01:46 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for xact_basic_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_basic_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xactId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="xact_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xact_reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xact_subtype_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="xact_catg_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="xact_type_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="tender_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="confirm_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoice_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xact_basic_criteria_type", propOrder = {
    "xactId",
    "businessName",
    "accountNo",
    "xactAmount",
    "xactDate",
    "xactReason",
    "xactSubtypeId",
    "xactCatgId",
    "xactTypeId",
    "tenderId",
    "confirmNo",
    "invoiceNo"
})
public class XactBasicCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger xactId;
    @XmlElement(name = "business_name")
    protected String businessName;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "xact_amount")
    protected BigDecimal xactAmount;
    @XmlElement(name = "xact_date")
    protected String xactDate;
    @XmlElement(name = "xact_reason")
    protected String xactReason;
    @XmlElement(name = "xact_subtype_id")
    protected BigInteger xactSubtypeId;
    @XmlElement(name = "xact_catg_id")
    protected BigInteger xactCatgId;
    @XmlElement(name = "xact_type_id")
    protected BigInteger xactTypeId;
    @XmlElement(name = "tender_id")
    protected BigInteger tenderId;
    @XmlElement(name = "confirm_no")
    protected String confirmNo;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;

    /**
     * Gets the value of the xactId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactId() {
        return xactId;
    }

    /**
     * Sets the value of the xactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactId(BigInteger value) {
        this.xactId = value;
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
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the xactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXactAmount() {
        return xactAmount;
    }

    /**
     * Sets the value of the xactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXactAmount(BigDecimal value) {
        this.xactAmount = value;
    }

    /**
     * Gets the value of the xactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactDate() {
        return xactDate;
    }

    /**
     * Sets the value of the xactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactDate(String value) {
        this.xactDate = value;
    }

    /**
     * Gets the value of the xactReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXactReason() {
        return xactReason;
    }

    /**
     * Sets the value of the xactReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXactReason(String value) {
        this.xactReason = value;
    }

    /**
     * Gets the value of the xactSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactSubtypeId() {
        return xactSubtypeId;
    }

    /**
     * Sets the value of the xactSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactSubtypeId(BigInteger value) {
        this.xactSubtypeId = value;
    }

    /**
     * Gets the value of the xactCatgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactCatgId() {
        return xactCatgId;
    }

    /**
     * Sets the value of the xactCatgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactCatgId(BigInteger value) {
        this.xactCatgId = value;
    }

    /**
     * Gets the value of the xactTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXactTypeId() {
        return xactTypeId;
    }

    /**
     * Sets the value of the xactTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXactTypeId(BigInteger value) {
        this.xactTypeId = value;
    }

    /**
     * Gets the value of the tenderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTenderId() {
        return tenderId;
    }

    /**
     * Sets the value of the tenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTenderId(BigInteger value) {
        this.tenderId = value;
    }

    /**
     * Gets the value of the confirmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNo() {
        return confirmNo;
    }

    /**
     * Sets the value of the confirmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNo(String value) {
        this.confirmNo = value;
    }

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

}
