//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.11 at 04:31:30 PM CST 
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
 * <p>Java class for project_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee_criteria" type="{}employee_criteria_type" minOccurs="0"/>
 *         &lt;element name="timesheet_criteria" type="{}timesheet_criteria_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project_criteria_group", propOrder = {
    "employeeCriteria",
    "timesheetCriteria"
})
public class ProjectCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "employee_criteria")
    protected EmployeeCriteriaType employeeCriteria;
    @XmlElement(name = "timesheet_criteria")
    protected List<TimesheetCriteriaType> timesheetCriteria;

    /**
     * Gets the value of the employeeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCriteriaType }
     *     
     */
    public EmployeeCriteriaType getEmployeeCriteria() {
        return employeeCriteria;
    }

    /**
     * Sets the value of the employeeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCriteriaType }
     *     
     */
    public void setEmployeeCriteria(EmployeeCriteriaType value) {
        this.employeeCriteria = value;
    }

    /**
     * Gets the value of the timesheetCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timesheetCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimesheetCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetCriteriaType }
     * 
     * 
     */
    public List<TimesheetCriteriaType> getTimesheetCriteria() {
        if (timesheetCriteria == null) {
            timesheetCriteria = new ArrayList<TimesheetCriteriaType>();
        }
        return this.timesheetCriteria;
    }

}
