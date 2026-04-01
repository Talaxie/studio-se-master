
package com.netsuite.webservices.transactions.financial;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.Record;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.transactions.financial.types.BudgetBudgetType;


/**
 * <p>Java class for Budget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Budget"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="year" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="department" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="budgetType" type="{urn:types.financial_2014_2.transactions.webservices.netsuite.com}BudgetBudgetType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount5" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount7" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount8" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount9" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount10" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount11" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodAmount12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Budget", propOrder = {
    "year",
    "customer",
    "item",
    "clazz",
    "department",
    "location",
    "account",
    "subsidiary",
    "category",
    "budgetType",
    "currency",
    "periodAmount1",
    "periodAmount2",
    "periodAmount3",
    "periodAmount4",
    "periodAmount5",
    "periodAmount6",
    "periodAmount7",
    "periodAmount8",
    "periodAmount9",
    "periodAmount10",
    "periodAmount11",
    "periodAmount12",
    "amount"
})
public class Budget
    extends Record
{

    protected RecordRef year;
    protected RecordRef customer;
    protected RecordRef item;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef department;
    protected RecordRef location;
    protected RecordRef account;
    protected RecordRef subsidiary;
    protected RecordRef category;
    @XmlSchemaType(name = "string")
    protected BudgetBudgetType budgetType;
    protected RecordRef currency;
    protected Double periodAmount1;
    protected Double periodAmount2;
    protected Double periodAmount3;
    protected Double periodAmount4;
    protected Double periodAmount5;
    protected Double periodAmount6;
    protected Double periodAmount7;
    protected Double periodAmount8;
    protected Double periodAmount9;
    protected Double periodAmount10;
    protected Double periodAmount11;
    protected Double periodAmount12;
    protected Double amount;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setYear(RecordRef value) {
        this.year = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomer(RecordRef value) {
        this.customer = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccount(RecordRef value) {
        this.account = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategory(RecordRef value) {
        this.category = value;
    }

    /**
     * Gets the value of the budgetType property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetBudgetType }
     *     
     */
    public BudgetBudgetType getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the value of the budgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetBudgetType }
     *     
     */
    public void setBudgetType(BudgetBudgetType value) {
        this.budgetType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the periodAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount1() {
        return periodAmount1;
    }

    /**
     * Sets the value of the periodAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount1(Double value) {
        this.periodAmount1 = value;
    }

    /**
     * Gets the value of the periodAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount2() {
        return periodAmount2;
    }

    /**
     * Sets the value of the periodAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount2(Double value) {
        this.periodAmount2 = value;
    }

    /**
     * Gets the value of the periodAmount3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount3() {
        return periodAmount3;
    }

    /**
     * Sets the value of the periodAmount3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount3(Double value) {
        this.periodAmount3 = value;
    }

    /**
     * Gets the value of the periodAmount4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount4() {
        return periodAmount4;
    }

    /**
     * Sets the value of the periodAmount4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount4(Double value) {
        this.periodAmount4 = value;
    }

    /**
     * Gets the value of the periodAmount5 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount5() {
        return periodAmount5;
    }

    /**
     * Sets the value of the periodAmount5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount5(Double value) {
        this.periodAmount5 = value;
    }

    /**
     * Gets the value of the periodAmount6 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount6() {
        return periodAmount6;
    }

    /**
     * Sets the value of the periodAmount6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount6(Double value) {
        this.periodAmount6 = value;
    }

    /**
     * Gets the value of the periodAmount7 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount7() {
        return periodAmount7;
    }

    /**
     * Sets the value of the periodAmount7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount7(Double value) {
        this.periodAmount7 = value;
    }

    /**
     * Gets the value of the periodAmount8 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount8() {
        return periodAmount8;
    }

    /**
     * Sets the value of the periodAmount8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount8(Double value) {
        this.periodAmount8 = value;
    }

    /**
     * Gets the value of the periodAmount9 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount9() {
        return periodAmount9;
    }

    /**
     * Sets the value of the periodAmount9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount9(Double value) {
        this.periodAmount9 = value;
    }

    /**
     * Gets the value of the periodAmount10 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount10() {
        return periodAmount10;
    }

    /**
     * Sets the value of the periodAmount10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount10(Double value) {
        this.periodAmount10 = value;
    }

    /**
     * Gets the value of the periodAmount11 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount11() {
        return periodAmount11;
    }

    /**
     * Sets the value of the periodAmount11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount11(Double value) {
        this.periodAmount11 = value;
    }

    /**
     * Gets the value of the periodAmount12 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodAmount12() {
        return periodAmount12;
    }

    /**
     * Sets the value of the periodAmount12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodAmount12(Double value) {
        this.periodAmount12 = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

}
