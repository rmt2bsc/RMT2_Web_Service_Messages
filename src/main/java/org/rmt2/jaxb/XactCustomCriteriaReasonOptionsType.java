//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.12 at 04:01:46 PM CST 
//


package org.rmt2.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xact_custom_criteria_reason_options_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xact_custom_criteria_reason_options_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEGIN"/>
 *     &lt;enumeration value="END"/>
 *     &lt;enumeration value="CONTAIN"/>
 *     &lt;enumeration value="EXACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xact_custom_criteria_reason_options_type")
@XmlEnum
public enum XactCustomCriteriaReasonOptionsType {

    BEGIN,
    END,
    CONTAIN,
    EXACT;

    public String value() {
        return name();
    }

    public static XactCustomCriteriaReasonOptionsType fromValue(String v) {
        return valueOf(v);
    }

}
