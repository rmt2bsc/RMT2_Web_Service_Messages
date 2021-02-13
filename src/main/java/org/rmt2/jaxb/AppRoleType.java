//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 06:30:03 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that manages application roles.
 * 
 * <p>Java class for app_role_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="app_role_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app_role_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="app_info" type="{}application_type" minOccurs="0"/>
 *         &lt;element name="role_info" type="{}role_type" minOccurs="0"/>
 *         &lt;element name="app_role_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_role_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="app_role_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "app_role_type", propOrder = {
    "appRoleId",
    "appInfo",
    "roleInfo",
    "appRoleCode",
    "appRoleName",
    "appRoleDesc"
})
public class AppRoleType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "app_role_id")
    protected int appRoleId;
    @XmlElement(name = "app_info")
    protected ApplicationType appInfo;
    @XmlElement(name = "role_info")
    protected RoleType roleInfo;
    @XmlElement(name = "app_role_code")
    protected String appRoleCode;
    @XmlElement(name = "app_role_name")
    protected String appRoleName;
    @XmlElement(name = "app_role_desc")
    protected String appRoleDesc;

    /**
     * Gets the value of the appRoleId property.
     * 
     */
    public int getAppRoleId() {
        return appRoleId;
    }

    /**
     * Sets the value of the appRoleId property.
     * 
     */
    public void setAppRoleId(int value) {
        this.appRoleId = value;
    }

    /**
     * Gets the value of the appInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getAppInfo() {
        return appInfo;
    }

    /**
     * Sets the value of the appInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setAppInfo(ApplicationType value) {
        this.appInfo = value;
    }

    /**
     * Gets the value of the roleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoleType }
     *     
     */
    public RoleType getRoleInfo() {
        return roleInfo;
    }

    /**
     * Sets the value of the roleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleType }
     *     
     */
    public void setRoleInfo(RoleType value) {
        this.roleInfo = value;
    }

    /**
     * Gets the value of the appRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleCode() {
        return appRoleCode;
    }

    /**
     * Sets the value of the appRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleCode(String value) {
        this.appRoleCode = value;
    }

    /**
     * Gets the value of the appRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleName() {
        return appRoleName;
    }

    /**
     * Sets the value of the appRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleName(String value) {
        this.appRoleName = value;
    }

    /**
     * Gets the value of the appRoleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleDesc() {
        return appRoleDesc;
    }

    /**
     * Sets the value of the appRoleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleDesc(String value) {
        this.appRoleDesc = value;
    }

}
