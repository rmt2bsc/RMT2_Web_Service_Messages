//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.23 at 10:47:07 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for auth_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auth_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_profile" type="{}user_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user_app_roles" type="{}user_app_roles_type"/>
 *         &lt;element name="resource_items" type="{}resource_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resource_subtype_items" type="{}resource_subtype_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth_detail_group", propOrder = {
    "userProfile",
    "userAppRoles",
    "resourceItems",
    "resourceSubtypeItems"
})
public class AuthDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "user_profile")
    protected List<UserType> userProfile;
    @XmlElement(name = "user_app_roles", required = true)
    protected UserAppRolesType userAppRoles;
    @XmlElement(name = "resource_items")
    protected List<ResourceType> resourceItems;
    @XmlElement(name = "resource_subtype_items")
    protected List<ResourceSubtypeType> resourceSubtypeItems;

    /**
     * Gets the value of the userProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserType }
     * 
     * 
     */
    public List<UserType> getUserProfile() {
        if (userProfile == null) {
            userProfile = new ArrayList<UserType>();
        }
        return this.userProfile;
    }

    /**
     * Gets the value of the userAppRoles property.
     * 
     * @return
     *     possible object is
     *     {@link UserAppRolesType }
     *     
     */
    public UserAppRolesType getUserAppRoles() {
        return userAppRoles;
    }

    /**
     * Sets the value of the userAppRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAppRolesType }
     *     
     */
    public void setUserAppRoles(UserAppRolesType value) {
        this.userAppRoles = value;
    }

    /**
     * Gets the value of the resourceItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * 
     * 
     */
    public List<ResourceType> getResourceItems() {
        if (resourceItems == null) {
            resourceItems = new ArrayList<ResourceType>();
        }
        return this.resourceItems;
    }

    /**
     * Gets the value of the resourceSubtypeItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSubtypeItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSubtypeItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSubtypeType }
     * 
     * 
     */
    public List<ResourceSubtypeType> getResourceSubtypeItems() {
        if (resourceSubtypeItems == null) {
            resourceSubtypeItems = new ArrayList<ResourceSubtypeType>();
        }
        return this.resourceSubtypeItems;
    }

}
