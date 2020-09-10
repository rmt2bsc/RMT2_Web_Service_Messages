//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 04:28:57 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for timesheet_hours_summary_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timesheet_hours_summary_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day1_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="day2_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="day3_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="day4_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="day5_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="day6_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="day7_hrs" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="hours_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timesheet_hours_summary_type", propOrder = {
    "day1Hrs",
    "day2Hrs",
    "day3Hrs",
    "day4Hrs",
    "day5Hrs",
    "day6Hrs",
    "day7Hrs",
    "hoursTotal"
})
public class TimesheetHoursSummaryType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "day1_hrs", required = true)
    protected BigDecimal day1Hrs;
    @XmlElement(name = "day2_hrs", required = true)
    protected BigDecimal day2Hrs;
    @XmlElement(name = "day3_hrs", required = true)
    protected BigDecimal day3Hrs;
    @XmlElement(name = "day4_hrs", required = true)
    protected BigDecimal day4Hrs;
    @XmlElement(name = "day5_hrs", required = true)
    protected BigDecimal day5Hrs;
    @XmlElement(name = "day6_hrs", required = true)
    protected BigDecimal day6Hrs;
    @XmlElement(name = "day7_hrs", required = true)
    protected BigDecimal day7Hrs;
    @XmlElement(name = "hours_total", required = true)
    protected BigDecimal hoursTotal;

    /**
     * Gets the value of the day1Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay1Hrs() {
        return day1Hrs;
    }

    /**
     * Sets the value of the day1Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay1Hrs(BigDecimal value) {
        this.day1Hrs = value;
    }

    /**
     * Gets the value of the day2Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay2Hrs() {
        return day2Hrs;
    }

    /**
     * Sets the value of the day2Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay2Hrs(BigDecimal value) {
        this.day2Hrs = value;
    }

    /**
     * Gets the value of the day3Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay3Hrs() {
        return day3Hrs;
    }

    /**
     * Sets the value of the day3Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay3Hrs(BigDecimal value) {
        this.day3Hrs = value;
    }

    /**
     * Gets the value of the day4Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay4Hrs() {
        return day4Hrs;
    }

    /**
     * Sets the value of the day4Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay4Hrs(BigDecimal value) {
        this.day4Hrs = value;
    }

    /**
     * Gets the value of the day5Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay5Hrs() {
        return day5Hrs;
    }

    /**
     * Sets the value of the day5Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay5Hrs(BigDecimal value) {
        this.day5Hrs = value;
    }

    /**
     * Gets the value of the day6Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay6Hrs() {
        return day6Hrs;
    }

    /**
     * Sets the value of the day6Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay6Hrs(BigDecimal value) {
        this.day6Hrs = value;
    }

    /**
     * Gets the value of the day7Hrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDay7Hrs() {
        return day7Hrs;
    }

    /**
     * Sets the value of the day7Hrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDay7Hrs(BigDecimal value) {
        this.day7Hrs = value;
    }

    /**
     * Gets the value of the hoursTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoursTotal() {
        return hoursTotal;
    }

    /**
     * Sets the value of the hoursTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoursTotal(BigDecimal value) {
        this.hoursTotal = value;
    }

}
