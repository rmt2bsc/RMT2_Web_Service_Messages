//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.17 at 12:45:42 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
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
 *         &lt;element name="client_criteria" type="{}client_criteria_type" minOccurs="0"/>
 *         &lt;element name="employee_criteria" type="{}employee_criteria_type" minOccurs="0"/>
 *         &lt;element name="task_criteria" type="{}task_criteria_type" minOccurs="0"/>
 *         &lt;element name="timesheet_criteria" type="{}timesheet_criteria_type" minOccurs="0"/>
 *         &lt;element name="employee_project_criteria" type="{}employee_project_criteria_type" minOccurs="0"/>
 *         &lt;element name="project_criteria" type="{}project_criteria_type" minOccurs="0"/>
 *         &lt;element name="employee_title_criteria" type="{}employee_title_criteria_type" minOccurs="0"/>
 *         &lt;element name="employee_type_criteria" type="{}employee_type_criteria_type" minOccurs="0"/>
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
    "clientCriteria",
    "employeeCriteria",
    "taskCriteria",
    "timesheetCriteria",
    "employeeProjectCriteria",
    "projectCriteria",
    "employeeTitleCriteria",
    "employeeTypeCriteria"
})
public class ProjectCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "client_criteria")
    protected ClientCriteriaType clientCriteria;
    @XmlElement(name = "employee_criteria")
    protected EmployeeCriteriaType employeeCriteria;
    @XmlElement(name = "task_criteria")
    protected TaskCriteriaType taskCriteria;
    @XmlElement(name = "timesheet_criteria")
    protected TimesheetCriteriaType timesheetCriteria;
    @XmlElement(name = "employee_project_criteria")
    protected EmployeeProjectCriteriaType employeeProjectCriteria;
    @XmlElement(name = "project_criteria")
    protected ProjectCriteriaType projectCriteria;
    @XmlElement(name = "employee_title_criteria")
    protected EmployeeTitleCriteriaType employeeTitleCriteria;
    @XmlElement(name = "employee_type_criteria")
    protected EmployeeTypeCriteriaType employeeTypeCriteria;

    /**
     * Gets the value of the clientCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCriteriaType }
     *     
     */
    public ClientCriteriaType getClientCriteria() {
        return clientCriteria;
    }

    /**
     * Sets the value of the clientCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCriteriaType }
     *     
     */
    public void setClientCriteria(ClientCriteriaType value) {
        this.clientCriteria = value;
    }

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
     * Gets the value of the taskCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TaskCriteriaType }
     *     
     */
    public TaskCriteriaType getTaskCriteria() {
        return taskCriteria;
    }

    /**
     * Sets the value of the taskCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskCriteriaType }
     *     
     */
    public void setTaskCriteria(TaskCriteriaType value) {
        this.taskCriteria = value;
    }

    /**
     * Gets the value of the timesheetCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetCriteriaType }
     *     
     */
    public TimesheetCriteriaType getTimesheetCriteria() {
        return timesheetCriteria;
    }

    /**
     * Sets the value of the timesheetCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetCriteriaType }
     *     
     */
    public void setTimesheetCriteria(TimesheetCriteriaType value) {
        this.timesheetCriteria = value;
    }

    /**
     * Gets the value of the employeeProjectCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProjectCriteriaType }
     *     
     */
    public EmployeeProjectCriteriaType getEmployeeProjectCriteria() {
        return employeeProjectCriteria;
    }

    /**
     * Sets the value of the employeeProjectCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProjectCriteriaType }
     *     
     */
    public void setEmployeeProjectCriteria(EmployeeProjectCriteriaType value) {
        this.employeeProjectCriteria = value;
    }

    /**
     * Gets the value of the projectCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectCriteriaType }
     *     
     */
    public ProjectCriteriaType getProjectCriteria() {
        return projectCriteria;
    }

    /**
     * Sets the value of the projectCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectCriteriaType }
     *     
     */
    public void setProjectCriteria(ProjectCriteriaType value) {
        this.projectCriteria = value;
    }

    /**
     * Gets the value of the employeeTitleCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTitleCriteriaType }
     *     
     */
    public EmployeeTitleCriteriaType getEmployeeTitleCriteria() {
        return employeeTitleCriteria;
    }

    /**
     * Sets the value of the employeeTitleCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTitleCriteriaType }
     *     
     */
    public void setEmployeeTitleCriteria(EmployeeTitleCriteriaType value) {
        this.employeeTitleCriteria = value;
    }

    /**
     * Gets the value of the employeeTypeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTypeCriteriaType }
     *     
     */
    public EmployeeTypeCriteriaType getEmployeeTypeCriteria() {
        return employeeTypeCriteria;
    }

    /**
     * Sets the value of the employeeTypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTypeCriteriaType }
     *     
     */
    public void setEmployeeTypeCriteria(EmployeeTypeCriteriaType value) {
        this.employeeTypeCriteria = value;
    }

}
