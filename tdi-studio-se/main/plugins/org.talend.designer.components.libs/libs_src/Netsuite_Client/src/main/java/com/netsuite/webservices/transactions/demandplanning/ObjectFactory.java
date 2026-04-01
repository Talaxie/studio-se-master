
package com.netsuite.webservices.transactions.demandplanning;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.demandplanning package. 
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

    private final static QName _ItemDemandPlan_QNAME = new QName("urn:demandplanning_2014_2.transactions.webservices.netsuite.com", "itemDemandPlan");
    private final static QName _ItemDemandPlanSearch_QNAME = new QName("urn:demandplanning_2014_2.transactions.webservices.netsuite.com", "itemDemandPlanSearch");
    private final static QName _ItemSupplyPlan_QNAME = new QName("urn:demandplanning_2014_2.transactions.webservices.netsuite.com", "itemSupplyPlan");
    private final static QName _ItemSupplyPlanSearch_QNAME = new QName("urn:demandplanning_2014_2.transactions.webservices.netsuite.com", "itemSupplyPlanSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.demandplanning
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemDemandPlan }
     * 
     */
    public ItemDemandPlan createItemDemandPlan() {
        return new ItemDemandPlan();
    }

    /**
     * Create an instance of {@link ItemDemandPlanSearch }
     * 
     */
    public ItemDemandPlanSearch createItemDemandPlanSearch() {
        return new ItemDemandPlanSearch();
    }

    /**
     * Create an instance of {@link ItemSupplyPlan }
     * 
     */
    public ItemSupplyPlan createItemSupplyPlan() {
        return new ItemSupplyPlan();
    }

    /**
     * Create an instance of {@link ItemSupplyPlanSearch }
     * 
     */
    public ItemSupplyPlanSearch createItemSupplyPlanSearch() {
        return new ItemSupplyPlanSearch();
    }

    /**
     * Create an instance of {@link DemandPlan }
     * 
     */
    public DemandPlan createDemandPlan() {
        return new DemandPlan();
    }

    /**
     * Create an instance of {@link DemandPlanMatrix }
     * 
     */
    public DemandPlanMatrix createDemandPlanMatrix() {
        return new DemandPlanMatrix();
    }

    /**
     * Create an instance of {@link PeriodDemandPlanList }
     * 
     */
    public PeriodDemandPlanList createPeriodDemandPlanList() {
        return new PeriodDemandPlanList();
    }

    /**
     * Create an instance of {@link PeriodDemandPlan }
     * 
     */
    public PeriodDemandPlan createPeriodDemandPlan() {
        return new PeriodDemandPlan();
    }

    /**
     * Create an instance of {@link ItemDemandPlanSearchAdvanced }
     * 
     */
    public ItemDemandPlanSearchAdvanced createItemDemandPlanSearchAdvanced() {
        return new ItemDemandPlanSearchAdvanced();
    }

    /**
     * Create an instance of {@link ItemDemandPlanSearchRow }
     * 
     */
    public ItemDemandPlanSearchRow createItemDemandPlanSearchRow() {
        return new ItemDemandPlanSearchRow();
    }

    /**
     * Create an instance of {@link ItemSupplyPlanOrder }
     * 
     */
    public ItemSupplyPlanOrder createItemSupplyPlanOrder() {
        return new ItemSupplyPlanOrder();
    }

    /**
     * Create an instance of {@link ItemSupplyPlanOrderList }
     * 
     */
    public ItemSupplyPlanOrderList createItemSupplyPlanOrderList() {
        return new ItemSupplyPlanOrderList();
    }

    /**
     * Create an instance of {@link ItemSupplyPlanSearchAdvanced }
     * 
     */
    public ItemSupplyPlanSearchAdvanced createItemSupplyPlanSearchAdvanced() {
        return new ItemSupplyPlanSearchAdvanced();
    }

    /**
     * Create an instance of {@link ItemSupplyPlanSearchRow }
     * 
     */
    public ItemSupplyPlanSearchRow createItemSupplyPlanSearchRow() {
        return new ItemSupplyPlanSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemDemandPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:demandplanning_2014_2.transactions.webservices.netsuite.com", name = "itemDemandPlan")
    public JAXBElement<ItemDemandPlan> createItemDemandPlan(ItemDemandPlan value) {
        return new JAXBElement<ItemDemandPlan>(_ItemDemandPlan_QNAME, ItemDemandPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemDemandPlanSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:demandplanning_2014_2.transactions.webservices.netsuite.com", name = "itemDemandPlanSearch")
    public JAXBElement<ItemDemandPlanSearch> createItemDemandPlanSearch(ItemDemandPlanSearch value) {
        return new JAXBElement<ItemDemandPlanSearch>(_ItemDemandPlanSearch_QNAME, ItemDemandPlanSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemSupplyPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:demandplanning_2014_2.transactions.webservices.netsuite.com", name = "itemSupplyPlan")
    public JAXBElement<ItemSupplyPlan> createItemSupplyPlan(ItemSupplyPlan value) {
        return new JAXBElement<ItemSupplyPlan>(_ItemSupplyPlan_QNAME, ItemSupplyPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemSupplyPlanSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:demandplanning_2014_2.transactions.webservices.netsuite.com", name = "itemSupplyPlanSearch")
    public JAXBElement<ItemSupplyPlanSearch> createItemSupplyPlanSearch(ItemSupplyPlanSearch value) {
        return new JAXBElement<ItemSupplyPlanSearch>(_ItemSupplyPlanSearch_QNAME, ItemSupplyPlanSearch.class, null, value);
    }

}
