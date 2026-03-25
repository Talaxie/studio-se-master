
package com.netsuite.webservices.transactions.employees;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.employees package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeBill_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "TimeBill");
    private final static QName _TimeBillSearch_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "timeBillSearch");
    private final static QName _ExpenseReport_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "expenseReport");
    private final static QName _PaycheckJournal_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "paycheckJournal");
    private final static QName _TimeEntry_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "timeEntry");
    private final static QName _TimeSheet_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "timeSheet");
    private final static QName _TimeEntrySearch_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "timeEntrySearch");
    private final static QName _TimeSheetSearch_QNAME = new QName("urn:employees_2014_2.transactions.webservices.netsuite.com", "timeSheetSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.employees
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeBill }
     * 
     */
    public TimeBill createTimeBill() {
        return new TimeBill();
    }

    /**
     * Create an instance of {@link TimeBillSearch }
     * 
     */
    public TimeBillSearch createTimeBillSearch() {
        return new TimeBillSearch();
    }

    /**
     * Create an instance of {@link ExpenseReport }
     * 
     */
    public ExpenseReport createExpenseReport() {
        return new ExpenseReport();
    }

    /**
     * Create an instance of {@link PaycheckJournal }
     * 
     */
    public PaycheckJournal createPaycheckJournal() {
        return new PaycheckJournal();
    }

    /**
     * Create an instance of {@link TimeEntry }
     * 
     */
    public TimeEntry createTimeEntry() {
        return new TimeEntry();
    }

    /**
     * Create an instance of {@link TimeSheet }
     * 
     */
    public TimeSheet createTimeSheet() {
        return new TimeSheet();
    }

    /**
     * Create an instance of {@link TimeEntrySearch }
     * 
     */
    public TimeEntrySearch createTimeEntrySearch() {
        return new TimeEntrySearch();
    }

    /**
     * Create an instance of {@link TimeSheetSearch }
     * 
     */
    public TimeSheetSearch createTimeSheetSearch() {
        return new TimeSheetSearch();
    }

    /**
     * Create an instance of {@link TimeBillSearchAdvanced }
     * 
     */
    public TimeBillSearchAdvanced createTimeBillSearchAdvanced() {
        return new TimeBillSearchAdvanced();
    }

    /**
     * Create an instance of {@link TimeBillSearchRow }
     * 
     */
    public TimeBillSearchRow createTimeBillSearchRow() {
        return new TimeBillSearchRow();
    }

    /**
     * Create an instance of {@link ExpenseReportExpense }
     * 
     */
    public ExpenseReportExpense createExpenseReportExpense() {
        return new ExpenseReportExpense();
    }

    /**
     * Create an instance of {@link ExpenseReportExpenseList }
     * 
     */
    public ExpenseReportExpenseList createExpenseReportExpenseList() {
        return new ExpenseReportExpenseList();
    }

    /**
     * Create an instance of {@link PaycheckJournalCompanyTax }
     * 
     */
    public PaycheckJournalCompanyTax createPaycheckJournalCompanyTax() {
        return new PaycheckJournalCompanyTax();
    }

    /**
     * Create an instance of {@link PaycheckJournalCompanyTaxList }
     * 
     */
    public PaycheckJournalCompanyTaxList createPaycheckJournalCompanyTaxList() {
        return new PaycheckJournalCompanyTaxList();
    }

    /**
     * Create an instance of {@link PaycheckJournalDeduction }
     * 
     */
    public PaycheckJournalDeduction createPaycheckJournalDeduction() {
        return new PaycheckJournalDeduction();
    }

    /**
     * Create an instance of {@link PaycheckJournalDeductionList }
     * 
     */
    public PaycheckJournalDeductionList createPaycheckJournalDeductionList() {
        return new PaycheckJournalDeductionList();
    }

    /**
     * Create an instance of {@link PaycheckJournalCompanyContribution }
     * 
     */
    public PaycheckJournalCompanyContribution createPaycheckJournalCompanyContribution() {
        return new PaycheckJournalCompanyContribution();
    }

    /**
     * Create an instance of {@link PaycheckJournalCompanyContributionList }
     * 
     */
    public PaycheckJournalCompanyContributionList createPaycheckJournalCompanyContributionList() {
        return new PaycheckJournalCompanyContributionList();
    }

    /**
     * Create an instance of {@link PaycheckJournalEarning }
     * 
     */
    public PaycheckJournalEarning createPaycheckJournalEarning() {
        return new PaycheckJournalEarning();
    }

    /**
     * Create an instance of {@link PaycheckJournalEarningList }
     * 
     */
    public PaycheckJournalEarningList createPaycheckJournalEarningList() {
        return new PaycheckJournalEarningList();
    }

    /**
     * Create an instance of {@link PaycheckJournalEmployeeTax }
     * 
     */
    public PaycheckJournalEmployeeTax createPaycheckJournalEmployeeTax() {
        return new PaycheckJournalEmployeeTax();
    }

    /**
     * Create an instance of {@link PaycheckJournalEmployeeTaxList }
     * 
     */
    public PaycheckJournalEmployeeTaxList createPaycheckJournalEmployeeTaxList() {
        return new PaycheckJournalEmployeeTaxList();
    }

    /**
     * Create an instance of {@link TimeSheetTimeGrid }
     * 
     */
    public TimeSheetTimeGrid createTimeSheetTimeGrid() {
        return new TimeSheetTimeGrid();
    }

    /**
     * Create an instance of {@link TimeSheetTimeGridList }
     * 
     */
    public TimeSheetTimeGridList createTimeSheetTimeGridList() {
        return new TimeSheetTimeGridList();
    }

    /**
     * Create an instance of {@link TimeEntrySearchAdvanced }
     * 
     */
    public TimeEntrySearchAdvanced createTimeEntrySearchAdvanced() {
        return new TimeEntrySearchAdvanced();
    }

    /**
     * Create an instance of {@link TimeEntrySearchRow }
     * 
     */
    public TimeEntrySearchRow createTimeEntrySearchRow() {
        return new TimeEntrySearchRow();
    }

    /**
     * Create an instance of {@link TimeSheetSearchAdvanced }
     * 
     */
    public TimeSheetSearchAdvanced createTimeSheetSearchAdvanced() {
        return new TimeSheetSearchAdvanced();
    }

    /**
     * Create an instance of {@link TimeSheetSearchRow }
     * 
     */
    public TimeSheetSearchRow createTimeSheetSearchRow() {
        return new TimeSheetSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "TimeBill")
    public JAXBElement<TimeBill> createTimeBill(TimeBill value) {
        return new JAXBElement<TimeBill>(_TimeBill_QNAME, TimeBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBillSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "timeBillSearch")
    public JAXBElement<TimeBillSearch> createTimeBillSearch(TimeBillSearch value) {
        return new JAXBElement<TimeBillSearch>(_TimeBillSearch_QNAME, TimeBillSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpenseReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "expenseReport")
    public JAXBElement<ExpenseReport> createExpenseReport(ExpenseReport value) {
        return new JAXBElement<ExpenseReport>(_ExpenseReport_QNAME, ExpenseReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaycheckJournal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "paycheckJournal")
    public JAXBElement<PaycheckJournal> createPaycheckJournal(PaycheckJournal value) {
        return new JAXBElement<PaycheckJournal>(_PaycheckJournal_QNAME, PaycheckJournal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "timeEntry")
    public JAXBElement<TimeEntry> createTimeEntry(TimeEntry value) {
        return new JAXBElement<TimeEntry>(_TimeEntry_QNAME, TimeEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSheet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "timeSheet")
    public JAXBElement<TimeSheet> createTimeSheet(TimeSheet value) {
        return new JAXBElement<TimeSheet>(_TimeSheet_QNAME, TimeSheet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeEntrySearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "timeEntrySearch")
    public JAXBElement<TimeEntrySearch> createTimeEntrySearch(TimeEntrySearch value) {
        return new JAXBElement<TimeEntrySearch>(_TimeEntrySearch_QNAME, TimeEntrySearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSheetSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2014_2.transactions.webservices.netsuite.com", name = "timeSheetSearch")
    public JAXBElement<TimeSheetSearch> createTimeSheetSearch(TimeSheetSearch value) {
        return new JAXBElement<TimeSheetSearch>(_TimeSheetSearch_QNAME, TimeSheetSearch.class, null, value);
    }

}
