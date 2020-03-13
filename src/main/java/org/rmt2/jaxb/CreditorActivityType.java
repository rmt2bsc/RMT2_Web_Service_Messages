//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.06 at 04:26:24 PM CST 
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
 * <p>Java class for creditor_activity_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditor_activity_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditor_activity_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="creditor_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="xact_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="xact_details" type="{}xact_type" minOccurs="0"/>
 *         &lt;element name="tracking" type="{}record_tracking_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditor_activity_type", propOrder = {
    "creditorActivityId",
    "creditorId",
    "amount",
    "xactId",
    "xactDetails",
    "tracking"
})
public class CreditorActivityType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "creditor_activity_id", required = true)
    protected BigInteger creditorActivityId;
    @XmlElement(name = "creditor_id", required = true)
    protected BigInteger creditorId;
    protected BigDecimal amount;
    @XmlElement(name = "xact_id")
    protected BigInteger xactId;
    @XmlElement(name = "xact_details")
    protected XactType xactDetails;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the creditorActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditorActivityId() {
        return creditorActivityId;
    }

    /**
     * Sets the value of the creditorActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditorActivityId(BigInteger value) {
        this.creditorActivityId = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

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
     * Gets the value of the xactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link XactType }
     *     
     */
    public XactType getXactDetails() {
        return xactDetails;
    }

    /**
     * Sets the value of the xactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactType }
     *     
     */
    public void setXactDetails(XactType value) {
        this.xactDetails = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTrackingType }
     *     
     */
    public RecordTrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTrackingType }
     *     
     */
    public void setTracking(RecordTrackingType value) {
        this.tracking = value;
    }

}
