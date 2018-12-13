//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.13 at 10:37:19 AM CST 
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
 * This is the document that manages resource sub types.
 * 
 * <p>Java class for resource_subtype_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource_subtype_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsrc_subtype_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_type_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="rsrc_subtype_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rsrc_subtype_descr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_subtype_type", propOrder = {
    "rsrcSubtypeId",
    "rsrcTypeId",
    "rsrcSubtypeName",
    "rsrcSubtypeDescr"
})
public class ResourceSubtypeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "rsrc_subtype_id", required = true, defaultValue = "0")
    protected BigInteger rsrcSubtypeId;
    @XmlElement(name = "rsrc_type_id", required = true)
    protected BigInteger rsrcTypeId;
    @XmlElement(name = "rsrc_subtype_name", required = true)
    protected String rsrcSubtypeName;
    @XmlElement(name = "rsrc_subtype_descr", required = true)
    protected String rsrcSubtypeDescr;

    /**
     * Gets the value of the rsrcSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcSubtypeId() {
        return rsrcSubtypeId;
    }

    /**
     * Sets the value of the rsrcSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcSubtypeId(BigInteger value) {
        this.rsrcSubtypeId = value;
    }

    /**
     * Gets the value of the rsrcTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsrcTypeId() {
        return rsrcTypeId;
    }

    /**
     * Sets the value of the rsrcTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsrcTypeId(BigInteger value) {
        this.rsrcTypeId = value;
    }

    /**
     * Gets the value of the rsrcSubtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcSubtypeName() {
        return rsrcSubtypeName;
    }

    /**
     * Sets the value of the rsrcSubtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcSubtypeName(String value) {
        this.rsrcSubtypeName = value;
    }

    /**
     * Gets the value of the rsrcSubtypeDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcSubtypeDescr() {
        return rsrcSubtypeDescr;
    }

    /**
     * Sets the value of the rsrcSubtypeDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcSubtypeDescr(String value) {
        this.rsrcSubtypeDescr = value;
    }

}
