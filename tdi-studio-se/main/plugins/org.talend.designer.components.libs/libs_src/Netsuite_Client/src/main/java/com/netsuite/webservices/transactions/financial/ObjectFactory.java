
package com.netsuite.webservices.transactions.financial;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.financial package. 
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

    private final static QName _Budget_QNAME = new QName("urn:financial_2014_2.transactions.webservices.netsuite.com", "budget");
    private final static QName _BudgetSearch_QNAME = new QName("urn:financial_2014_2.transactions.webservices.netsuite.com", "budgetSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.financial
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Budget }
     * 
     */
    public Budget createBudget() {
        return new Budget();
    }

    /**
     * Create an instance of {@link BudgetSearch }
     * 
     */
    public BudgetSearch createBudgetSearch() {
        return new BudgetSearch();
    }

    /**
     * Create an instance of {@link BudgetSearchAdvanced }
     * 
     */
    public BudgetSearchAdvanced createBudgetSearchAdvanced() {
        return new BudgetSearchAdvanced();
    }

    /**
     * Create an instance of {@link BudgetSearchRow }
     * 
     */
    public BudgetSearchRow createBudgetSearchRow() {
        return new BudgetSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Budget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:financial_2014_2.transactions.webservices.netsuite.com", name = "budget")
    public JAXBElement<Budget> createBudget(Budget value) {
        return new JAXBElement<Budget>(_Budget_QNAME, Budget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BudgetSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:financial_2014_2.transactions.webservices.netsuite.com", name = "budgetSearch")
    public JAXBElement<BudgetSearch> createBudgetSearch(BudgetSearch value) {
        return new JAXBElement<BudgetSearch>(_BudgetSearch_QNAME, BudgetSearch.class, null, value);
    }

}
