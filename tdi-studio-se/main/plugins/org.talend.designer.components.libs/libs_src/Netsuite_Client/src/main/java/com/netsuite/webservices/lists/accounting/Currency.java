
package com.netsuite.webservices.lists.accounting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting.types.CurrencyCurrencyPrecision;
import com.netsuite.webservices.lists.accounting.types.CurrencyFxRateUpdateTimezone;
import com.netsuite.webservices.lists.accounting.types.CurrencyLocale;
import com.netsuite.webservices.platform.common.types.CurrencySymbolPlacement;
import com.netsuite.webservices.platform.core.Record;


/**
 * <p>Java class for Currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Currency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="overrideCurrencyFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="displaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symbolPlacement" type="{urn:types.common_2014_2.platform.webservices.netsuite.com}CurrencySymbolPlacement" minOccurs="0"/&gt;
 *         &lt;element name="locale" type="{urn:types.accounting_2014_2.lists.webservices.netsuite.com}CurrencyLocale" minOccurs="0"/&gt;
 *         &lt;element name="formatSample" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fxRateUpdateTimezone" type="{urn:types.accounting_2014_2.lists.webservices.netsuite.com}CurrencyFxRateUpdateTimezone" minOccurs="0"/&gt;
 *         &lt;element name="inclInFxRateUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="currencyPrecision" type="{urn:types.accounting_2014_2.lists.webservices.netsuite.com}CurrencyCurrencyPrecision" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
    "name",
    "symbol",
    "isBaseCurrency",
    "isInactive",
    "overrideCurrencyFormat",
    "displaySymbol",
    "symbolPlacement",
    "locale",
    "formatSample",
    "exchangeRate",
    "fxRateUpdateTimezone",
    "inclInFxRateUpdates",
    "currencyPrecision"
})
public class Currency
    extends Record
{

    protected String name;
    protected String symbol;
    protected Boolean isBaseCurrency;
    protected Boolean isInactive;
    protected Boolean overrideCurrencyFormat;
    protected String displaySymbol;
    @XmlSchemaType(name = "string")
    protected CurrencySymbolPlacement symbolPlacement;
    @XmlSchemaType(name = "string")
    protected CurrencyLocale locale;
    protected String formatSample;
    protected Double exchangeRate;
    @XmlSchemaType(name = "string")
    protected CurrencyFxRateUpdateTimezone fxRateUpdateTimezone;
    protected Boolean inclInFxRateUpdates;
    @XmlSchemaType(name = "string")
    protected CurrencyCurrencyPrecision currencyPrecision;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the isBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBaseCurrency() {
        return isBaseCurrency;
    }

    /**
     * Sets the value of the isBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBaseCurrency(Boolean value) {
        this.isBaseCurrency = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the overrideCurrencyFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideCurrencyFormat() {
        return overrideCurrencyFormat;
    }

    /**
     * Sets the value of the overrideCurrencyFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideCurrencyFormat(Boolean value) {
        this.overrideCurrencyFormat = value;
    }

    /**
     * Gets the value of the displaySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * Sets the value of the displaySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySymbol(String value) {
        this.displaySymbol = value;
    }

    /**
     * Gets the value of the symbolPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public CurrencySymbolPlacement getSymbolPlacement() {
        return symbolPlacement;
    }

    /**
     * Sets the value of the symbolPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public void setSymbolPlacement(CurrencySymbolPlacement value) {
        this.symbolPlacement = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyLocale }
     *     
     */
    public CurrencyLocale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyLocale }
     *     
     */
    public void setLocale(CurrencyLocale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the formatSample property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatSample() {
        return formatSample;
    }

    /**
     * Sets the value of the formatSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatSample(String value) {
        this.formatSample = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the fxRateUpdateTimezone property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyFxRateUpdateTimezone }
     *     
     */
    public CurrencyFxRateUpdateTimezone getFxRateUpdateTimezone() {
        return fxRateUpdateTimezone;
    }

    /**
     * Sets the value of the fxRateUpdateTimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyFxRateUpdateTimezone }
     *     
     */
    public void setFxRateUpdateTimezone(CurrencyFxRateUpdateTimezone value) {
        this.fxRateUpdateTimezone = value;
    }

    /**
     * Gets the value of the inclInFxRateUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclInFxRateUpdates() {
        return inclInFxRateUpdates;
    }

    /**
     * Sets the value of the inclInFxRateUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclInFxRateUpdates(Boolean value) {
        this.inclInFxRateUpdates = value;
    }

    /**
     * Gets the value of the currencyPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCurrencyPrecision }
     *     
     */
    public CurrencyCurrencyPrecision getCurrencyPrecision() {
        return currencyPrecision;
    }

    /**
     * Sets the value of the currencyPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCurrencyPrecision }
     *     
     */
    public void setCurrencyPrecision(CurrencyCurrencyPrecision value) {
        this.currencyPrecision = value;
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

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
