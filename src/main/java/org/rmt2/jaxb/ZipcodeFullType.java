//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 04:28:57 PM CDT 
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
 * <p>Java class for zipcode_full_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zipcode_full_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zip_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityAliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityAliasAbbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityTypeId" type="{}citytype_type" minOccurs="0"/>
 *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countyFips" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneId" type="{}timezone_type"/>
 *         &lt;element name="dayLightSaving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="elevation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="msa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pmsa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cbsa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cbsaDiv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="persons_per_household" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="zipcode_population" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="counties_area" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="households_per_zipcode" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="white_population" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="black_population" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hispanic_population" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="income_per_household" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="average_house_value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zipcode_full_type", propOrder = {
    "zipId",
    "zipcode",
    "city",
    "state",
    "areaCode",
    "cityAliasName",
    "cityAliasAbbr",
    "cityTypeId",
    "countyName",
    "countyFips",
    "timeZoneId",
    "dayLightSaving",
    "latitude",
    "longitude",
    "elevation",
    "msa",
    "pmsa",
    "cbsa",
    "cbsaDiv",
    "personsPerHousehold",
    "zipcodePopulation",
    "countiesArea",
    "householdsPerZipcode",
    "whitePopulation",
    "blackPopulation",
    "hispanicPopulation",
    "incomePerHousehold",
    "averageHouseValue"
})
public class ZipcodeFullType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "zip_id", required = true, defaultValue = "0")
    protected BigInteger zipId;
    @XmlElement(required = true)
    protected BigInteger zipcode;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String areaCode;
    @XmlElement(required = true)
    protected String cityAliasName;
    @XmlElement(required = true)
    protected String cityAliasAbbr;
    protected CitytypeType cityTypeId;
    @XmlElement(required = true)
    protected String countyName;
    @XmlElement(required = true)
    protected String countyFips;
    @XmlElement(required = true)
    protected TimezoneType timeZoneId;
    @XmlElement(required = true)
    protected String dayLightSaving;
    protected Double latitude;
    protected Double longitude;
    protected Double elevation;
    protected Double msa;
    protected Double pmsa;
    protected Double cbsa;
    protected Double cbsaDiv;
    @XmlElement(name = "persons_per_household")
    protected Double personsPerHousehold;
    @XmlElement(name = "zipcode_population")
    protected Double zipcodePopulation;
    @XmlElement(name = "counties_area")
    protected Double countiesArea;
    @XmlElement(name = "households_per_zipcode")
    protected Double householdsPerZipcode;
    @XmlElement(name = "white_population")
    protected Double whitePopulation;
    @XmlElement(name = "black_population")
    protected Double blackPopulation;
    @XmlElement(name = "hispanic_population")
    protected Double hispanicPopulation;
    @XmlElement(name = "income_per_household")
    protected Double incomePerHousehold;
    @XmlElement(name = "average_house_value")
    protected Double averageHouseValue;

    /**
     * Gets the value of the zipId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZipId() {
        return zipId;
    }

    /**
     * Sets the value of the zipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZipId(BigInteger value) {
        this.zipId = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZipcode(BigInteger value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the cityAliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityAliasName() {
        return cityAliasName;
    }

    /**
     * Sets the value of the cityAliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityAliasName(String value) {
        this.cityAliasName = value;
    }

    /**
     * Gets the value of the cityAliasAbbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityAliasAbbr() {
        return cityAliasAbbr;
    }

    /**
     * Sets the value of the cityAliasAbbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityAliasAbbr(String value) {
        this.cityAliasAbbr = value;
    }

    /**
     * Gets the value of the cityTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link CitytypeType }
     *     
     */
    public CitytypeType getCityTypeId() {
        return cityTypeId;
    }

    /**
     * Sets the value of the cityTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitytypeType }
     *     
     */
    public void setCityTypeId(CitytypeType value) {
        this.cityTypeId = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the countyFips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFips() {
        return countyFips;
    }

    /**
     * Sets the value of the countyFips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFips(String value) {
        this.countyFips = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link TimezoneType }
     *     
     */
    public TimezoneType getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimezoneType }
     *     
     */
    public void setTimeZoneId(TimezoneType value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the dayLightSaving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayLightSaving() {
        return dayLightSaving;
    }

    /**
     * Sets the value of the dayLightSaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayLightSaving(String value) {
        this.dayLightSaving = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElevation(Double value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the msa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMsa() {
        return msa;
    }

    /**
     * Sets the value of the msa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMsa(Double value) {
        this.msa = value;
    }

    /**
     * Gets the value of the pmsa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPmsa() {
        return pmsa;
    }

    /**
     * Sets the value of the pmsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPmsa(Double value) {
        this.pmsa = value;
    }

    /**
     * Gets the value of the cbsa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCbsa() {
        return cbsa;
    }

    /**
     * Sets the value of the cbsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCbsa(Double value) {
        this.cbsa = value;
    }

    /**
     * Gets the value of the cbsaDiv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCbsaDiv() {
        return cbsaDiv;
    }

    /**
     * Sets the value of the cbsaDiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCbsaDiv(Double value) {
        this.cbsaDiv = value;
    }

    /**
     * Gets the value of the personsPerHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPersonsPerHousehold() {
        return personsPerHousehold;
    }

    /**
     * Sets the value of the personsPerHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPersonsPerHousehold(Double value) {
        this.personsPerHousehold = value;
    }

    /**
     * Gets the value of the zipcodePopulation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZipcodePopulation() {
        return zipcodePopulation;
    }

    /**
     * Sets the value of the zipcodePopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZipcodePopulation(Double value) {
        this.zipcodePopulation = value;
    }

    /**
     * Gets the value of the countiesArea property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCountiesArea() {
        return countiesArea;
    }

    /**
     * Sets the value of the countiesArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCountiesArea(Double value) {
        this.countiesArea = value;
    }

    /**
     * Gets the value of the householdsPerZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHouseholdsPerZipcode() {
        return householdsPerZipcode;
    }

    /**
     * Sets the value of the householdsPerZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHouseholdsPerZipcode(Double value) {
        this.householdsPerZipcode = value;
    }

    /**
     * Gets the value of the whitePopulation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWhitePopulation() {
        return whitePopulation;
    }

    /**
     * Sets the value of the whitePopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWhitePopulation(Double value) {
        this.whitePopulation = value;
    }

    /**
     * Gets the value of the blackPopulation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBlackPopulation() {
        return blackPopulation;
    }

    /**
     * Sets the value of the blackPopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBlackPopulation(Double value) {
        this.blackPopulation = value;
    }

    /**
     * Gets the value of the hispanicPopulation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHispanicPopulation() {
        return hispanicPopulation;
    }

    /**
     * Sets the value of the hispanicPopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHispanicPopulation(Double value) {
        this.hispanicPopulation = value;
    }

    /**
     * Gets the value of the incomePerHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIncomePerHousehold() {
        return incomePerHousehold;
    }

    /**
     * Sets the value of the incomePerHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIncomePerHousehold(Double value) {
        this.incomePerHousehold = value;
    }

    /**
     * Gets the value of the averageHouseValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageHouseValue() {
        return averageHouseValue;
    }

    /**
     * Sets the value of the averageHouseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageHouseValue(Double value) {
        this.averageHouseValue = value;
    }

}
