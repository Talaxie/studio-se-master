
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.types.RecordType;


/**
 * <p>Java class for GetSelectValueFieldDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSelectValueFieldDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordType" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}RecordType" minOccurs="0"/&gt;
 *         &lt;element name="customRecordType" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="sublist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customForm" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{urn:core_2014_2.platform.webservices.netsuite.com}GetSelectValueFilter" minOccurs="0"/&gt;
 *         &lt;element name="filterByValueList" type="{urn:core_2014_2.platform.webservices.netsuite.com}GetSelectFilterByFieldValueList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSelectValueFieldDescription", propOrder = {
    "recordType",
    "customRecordType",
    "sublist",
    "field",
    "customForm",
    "filter",
    "filterByValueList"
})
public class GetSelectValueFieldDescription {

    @XmlSchemaType(name = "string")
    protected RecordType recordType;
    protected RecordRef customRecordType;
    protected String sublist;
    @XmlElement(required = true)
    protected String field;
    protected RecordRef customForm;
    protected GetSelectValueFilter filter;
    protected GetSelectFilterByFieldValueList filterByValueList;

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the customRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomRecordType() {
        return customRecordType;
    }

    /**
     * Sets the value of the customRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomRecordType(RecordRef value) {
        this.customRecordType = value;
    }

    /**
     * Gets the value of the sublist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSublist() {
        return sublist;
    }

    /**
     * Sets the value of the sublist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSublist(String value) {
        this.sublist = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFilter }
     *     
     */
    public GetSelectValueFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFilter }
     *     
     */
    public void setFilter(GetSelectValueFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the filterByValueList property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectFilterByFieldValueList }
     *     
     */
    public GetSelectFilterByFieldValueList getFilterByValueList() {
        return filterByValueList;
    }

    /**
     * Sets the value of the filterByValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectFilterByFieldValueList }
     *     
     */
    public void setFilterByValueList(GetSelectFilterByFieldValueList value) {
        this.filterByValueList = value;
    }

}
