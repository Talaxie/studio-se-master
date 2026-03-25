
package com.netsuite.webservices.platform.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core.SearchColumnDateField;
import com.netsuite.webservices.platform.core.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core.SearchColumnLongField;
import com.netsuite.webservices.platform.core.SearchColumnSelectField;
import com.netsuite.webservices.platform.core.SearchColumnStringField;
import com.netsuite.webservices.platform.core.SearchRowBasic;


/**
 * <p>Java class for RevRecScheduleSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevRecScheduleSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountingBook" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amorStatus" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amorTemplate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amortizedAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amorType" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deferredAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="destAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="initialAmt" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isRecognized" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="jeDoc" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lineSequenceNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nameUrl" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pctComplete" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pctRecognition" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodOffset" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurFxAmount" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="schedDate" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scheduleNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sourceAcct" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="srcDocLine" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="srcTran" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="srcTranPostPeriod" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startOffset" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useForeignAmounts" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevRecScheduleSearchRowBasic", propOrder = {
    "accountingBook",
    "amorStatus",
    "amorTemplate",
    "amortizedAmount",
    "amorType",
    "amount",
    "currency",
    "deferredAmount",
    "destAcct",
    "initialAmt",
    "internalId",
    "isRecognized",
    "jeDoc",
    "lineSequenceNumber",
    "name",
    "nameUrl",
    "pctComplete",
    "pctRecognition",
    "periodOffset",
    "recurAmount",
    "recurFxAmount",
    "schedDate",
    "scheduleNumber",
    "sourceAcct",
    "srcDocLine",
    "srcTran",
    "srcTranPostPeriod",
    "startOffset",
    "useForeignAmounts"
})
public class RevRecScheduleSearchRowBasic
    extends SearchRowBasic
{

    protected List<SearchColumnSelectField> accountingBook;
    protected List<SearchColumnEnumSelectField> amorStatus;
    protected List<SearchColumnStringField> amorTemplate;
    protected List<SearchColumnDoubleField> amortizedAmount;
    protected List<SearchColumnEnumSelectField> amorType;
    protected List<SearchColumnDoubleField> amount;
    protected List<SearchColumnStringField> currency;
    protected List<SearchColumnDoubleField> deferredAmount;
    protected List<SearchColumnStringField> destAcct;
    protected List<SearchColumnDoubleField> initialAmt;
    protected List<SearchColumnLongField> internalId;
    protected List<SearchColumnBooleanField> isRecognized;
    protected List<SearchColumnStringField> jeDoc;
    protected List<SearchColumnLongField> lineSequenceNumber;
    protected List<SearchColumnStringField> name;
    protected List<SearchColumnStringField> nameUrl;
    protected List<SearchColumnDoubleField> pctComplete;
    protected List<SearchColumnDoubleField> pctRecognition;
    protected List<SearchColumnLongField> periodOffset;
    protected List<SearchColumnDoubleField> recurAmount;
    protected List<SearchColumnDoubleField> recurFxAmount;
    protected List<SearchColumnDateField> schedDate;
    protected List<SearchColumnStringField> scheduleNumber;
    protected List<SearchColumnStringField> sourceAcct;
    protected List<SearchColumnStringField> srcDocLine;
    protected List<SearchColumnStringField> srcTran;
    protected List<SearchColumnStringField> srcTranPostPeriod;
    protected List<SearchColumnLongField> startOffset;
    protected List<SearchColumnBooleanField> useForeignAmounts;

    /**
     * Gets the value of the accountingBook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingBook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingBook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAccountingBook() {
        if (accountingBook == null) {
            accountingBook = new ArrayList<SearchColumnSelectField>();
        }
        return this.accountingBook;
    }

    /**
     * Gets the value of the amorStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amorStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmorStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getAmorStatus() {
        if (amorStatus == null) {
            amorStatus = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.amorStatus;
    }

    /**
     * Gets the value of the amorTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amorTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmorTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAmorTemplate() {
        if (amorTemplate == null) {
            amorTemplate = new ArrayList<SearchColumnStringField>();
        }
        return this.amorTemplate;
    }

    /**
     * Gets the value of the amortizedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amortizedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmortizedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmortizedAmount() {
        if (amortizedAmount == null) {
            amortizedAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amortizedAmount;
    }

    /**
     * Gets the value of the amorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getAmorType() {
        if (amorType == null) {
            amorType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.amorType;
    }

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAmount() {
        if (amount == null) {
            amount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.amount;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<SearchColumnStringField>();
        }
        return this.currency;
    }

    /**
     * Gets the value of the deferredAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDeferredAmount() {
        if (deferredAmount == null) {
            deferredAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.deferredAmount;
    }

    /**
     * Gets the value of the destAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDestAcct() {
        if (destAcct == null) {
            destAcct = new ArrayList<SearchColumnStringField>();
        }
        return this.destAcct;
    }

    /**
     * Gets the value of the initialAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getInitialAmt() {
        if (initialAmt == null) {
            initialAmt = new ArrayList<SearchColumnDoubleField>();
        }
        return this.initialAmt;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnLongField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the isRecognized property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isRecognized property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsRecognized().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsRecognized() {
        if (isRecognized == null) {
            isRecognized = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isRecognized;
    }

    /**
     * Gets the value of the jeDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jeDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJeDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getJeDoc() {
        if (jeDoc == null) {
            jeDoc = new ArrayList<SearchColumnStringField>();
        }
        return this.jeDoc;
    }

    /**
     * Gets the value of the lineSequenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineSequenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineSequenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLineSequenceNumber() {
        if (lineSequenceNumber == null) {
            lineSequenceNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.lineSequenceNumber;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getName() {
        if (name == null) {
            name = new ArrayList<SearchColumnStringField>();
        }
        return this.name;
    }

    /**
     * Gets the value of the nameUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNameUrl() {
        if (nameUrl == null) {
            nameUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.nameUrl;
    }

    /**
     * Gets the value of the pctComplete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pctComplete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPctComplete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPctComplete() {
        if (pctComplete == null) {
            pctComplete = new ArrayList<SearchColumnDoubleField>();
        }
        return this.pctComplete;
    }

    /**
     * Gets the value of the pctRecognition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pctRecognition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPctRecognition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPctRecognition() {
        if (pctRecognition == null) {
            pctRecognition = new ArrayList<SearchColumnDoubleField>();
        }
        return this.pctRecognition;
    }

    /**
     * Gets the value of the periodOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getPeriodOffset() {
        if (periodOffset == null) {
            periodOffset = new ArrayList<SearchColumnLongField>();
        }
        return this.periodOffset;
    }

    /**
     * Gets the value of the recurAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRecurAmount() {
        if (recurAmount == null) {
            recurAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.recurAmount;
    }

    /**
     * Gets the value of the recurFxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurFxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurFxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRecurFxAmount() {
        if (recurFxAmount == null) {
            recurFxAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.recurFxAmount;
    }

    /**
     * Gets the value of the schedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getSchedDate() {
        if (schedDate == null) {
            schedDate = new ArrayList<SearchColumnDateField>();
        }
        return this.schedDate;
    }

    /**
     * Gets the value of the scheduleNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getScheduleNumber() {
        if (scheduleNumber == null) {
            scheduleNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.scheduleNumber;
    }

    /**
     * Gets the value of the sourceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSourceAcct() {
        if (sourceAcct == null) {
            sourceAcct = new ArrayList<SearchColumnStringField>();
        }
        return this.sourceAcct;
    }

    /**
     * Gets the value of the srcDocLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcDocLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcDocLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSrcDocLine() {
        if (srcDocLine == null) {
            srcDocLine = new ArrayList<SearchColumnStringField>();
        }
        return this.srcDocLine;
    }

    /**
     * Gets the value of the srcTran property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcTran property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcTran().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSrcTran() {
        if (srcTran == null) {
            srcTran = new ArrayList<SearchColumnStringField>();
        }
        return this.srcTran;
    }

    /**
     * Gets the value of the srcTranPostPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcTranPostPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcTranPostPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSrcTranPostPeriod() {
        if (srcTranPostPeriod == null) {
            srcTranPostPeriod = new ArrayList<SearchColumnStringField>();
        }
        return this.srcTranPostPeriod;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getStartOffset() {
        if (startOffset == null) {
            startOffset = new ArrayList<SearchColumnLongField>();
        }
        return this.startOffset;
    }

    /**
     * Gets the value of the useForeignAmounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useForeignAmounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseForeignAmounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseForeignAmounts() {
        if (useForeignAmounts == null) {
            useForeignAmounts = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useForeignAmounts;
    }

}
