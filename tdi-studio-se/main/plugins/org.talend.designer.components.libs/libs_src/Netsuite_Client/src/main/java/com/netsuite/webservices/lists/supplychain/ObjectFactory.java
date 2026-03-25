
package com.netsuite.webservices.lists.supplychain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.lists.supplychain package. 
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

    private final static QName _ManufacturingCostTemplate_QNAME = new QName("urn:supplychain_2014_2.lists.webservices.netsuite.com", "manufacturingCostTemplate");
    private final static QName _ManufacturingCostTemplateSearch_QNAME = new QName("urn:supplychain_2014_2.lists.webservices.netsuite.com", "manufacturingCostTemplateSearch");
    private final static QName _ManufacturingRouting_QNAME = new QName("urn:supplychain_2014_2.lists.webservices.netsuite.com", "manufacturingRouting");
    private final static QName _ManufacturingRoutingSearch_QNAME = new QName("urn:supplychain_2014_2.lists.webservices.netsuite.com", "manufacturingRoutingSearch");
    private final static QName _ManufacturingOperationTask_QNAME = new QName("urn:supplychain_2014_2.lists.webservices.netsuite.com", "manufacturingOperationTask");
    private final static QName _ManufacturingOperationTaskSearch_QNAME = new QName("urn:supplychain_2014_2.lists.webservices.netsuite.com", "manufacturingOperationTaskSearch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.lists.supplychain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManufacturingCostTemplate }
     * 
     */
    public ManufacturingCostTemplate createManufacturingCostTemplate() {
        return new ManufacturingCostTemplate();
    }

    /**
     * Create an instance of {@link ManufacturingCostTemplateSearch }
     * 
     */
    public ManufacturingCostTemplateSearch createManufacturingCostTemplateSearch() {
        return new ManufacturingCostTemplateSearch();
    }

    /**
     * Create an instance of {@link ManufacturingRouting }
     * 
     */
    public ManufacturingRouting createManufacturingRouting() {
        return new ManufacturingRouting();
    }

    /**
     * Create an instance of {@link ManufacturingRoutingSearch }
     * 
     */
    public ManufacturingRoutingSearch createManufacturingRoutingSearch() {
        return new ManufacturingRoutingSearch();
    }

    /**
     * Create an instance of {@link ManufacturingOperationTask }
     * 
     */
    public ManufacturingOperationTask createManufacturingOperationTask() {
        return new ManufacturingOperationTask();
    }

    /**
     * Create an instance of {@link ManufacturingOperationTaskSearch }
     * 
     */
    public ManufacturingOperationTaskSearch createManufacturingOperationTaskSearch() {
        return new ManufacturingOperationTaskSearch();
    }

    /**
     * Create an instance of {@link ManufacturingCostDetail }
     * 
     */
    public ManufacturingCostDetail createManufacturingCostDetail() {
        return new ManufacturingCostDetail();
    }

    /**
     * Create an instance of {@link ManufacturingCostDetailList }
     * 
     */
    public ManufacturingCostDetailList createManufacturingCostDetailList() {
        return new ManufacturingCostDetailList();
    }

    /**
     * Create an instance of {@link ManufacturingCostTemplateSearchAdvanced }
     * 
     */
    public ManufacturingCostTemplateSearchAdvanced createManufacturingCostTemplateSearchAdvanced() {
        return new ManufacturingCostTemplateSearchAdvanced();
    }

    /**
     * Create an instance of {@link ManufacturingCostTemplateSearchRow }
     * 
     */
    public ManufacturingCostTemplateSearchRow createManufacturingCostTemplateSearchRow() {
        return new ManufacturingCostTemplateSearchRow();
    }

    /**
     * Create an instance of {@link ManufacturingRoutingRoutingStep }
     * 
     */
    public ManufacturingRoutingRoutingStep createManufacturingRoutingRoutingStep() {
        return new ManufacturingRoutingRoutingStep();
    }

    /**
     * Create an instance of {@link ManufacturingRoutingRoutingStepList }
     * 
     */
    public ManufacturingRoutingRoutingStepList createManufacturingRoutingRoutingStepList() {
        return new ManufacturingRoutingRoutingStepList();
    }

    /**
     * Create an instance of {@link ManufacturingRoutingSearchAdvanced }
     * 
     */
    public ManufacturingRoutingSearchAdvanced createManufacturingRoutingSearchAdvanced() {
        return new ManufacturingRoutingSearchAdvanced();
    }

    /**
     * Create an instance of {@link ManufacturingRoutingSearchRow }
     * 
     */
    public ManufacturingRoutingSearchRow createManufacturingRoutingSearchRow() {
        return new ManufacturingRoutingSearchRow();
    }

    /**
     * Create an instance of {@link ManufacturingOperationTaskSearchAdvanced }
     * 
     */
    public ManufacturingOperationTaskSearchAdvanced createManufacturingOperationTaskSearchAdvanced() {
        return new ManufacturingOperationTaskSearchAdvanced();
    }

    /**
     * Create an instance of {@link ManufacturingOperationTaskSearchRow }
     * 
     */
    public ManufacturingOperationTaskSearchRow createManufacturingOperationTaskSearchRow() {
        return new ManufacturingOperationTaskSearchRow();
    }

    /**
     * Create an instance of {@link ManufacturingOperationTaskPredecessor }
     * 
     */
    public ManufacturingOperationTaskPredecessor createManufacturingOperationTaskPredecessor() {
        return new ManufacturingOperationTaskPredecessor();
    }

    /**
     * Create an instance of {@link ManufacturingOperationTaskPredecessorList }
     * 
     */
    public ManufacturingOperationTaskPredecessorList createManufacturingOperationTaskPredecessorList() {
        return new ManufacturingOperationTaskPredecessorList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingCostTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:supplychain_2014_2.lists.webservices.netsuite.com", name = "manufacturingCostTemplate")
    public JAXBElement<ManufacturingCostTemplate> createManufacturingCostTemplate(ManufacturingCostTemplate value) {
        return new JAXBElement<ManufacturingCostTemplate>(_ManufacturingCostTemplate_QNAME, ManufacturingCostTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingCostTemplateSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:supplychain_2014_2.lists.webservices.netsuite.com", name = "manufacturingCostTemplateSearch")
    public JAXBElement<ManufacturingCostTemplateSearch> createManufacturingCostTemplateSearch(ManufacturingCostTemplateSearch value) {
        return new JAXBElement<ManufacturingCostTemplateSearch>(_ManufacturingCostTemplateSearch_QNAME, ManufacturingCostTemplateSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingRouting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:supplychain_2014_2.lists.webservices.netsuite.com", name = "manufacturingRouting")
    public JAXBElement<ManufacturingRouting> createManufacturingRouting(ManufacturingRouting value) {
        return new JAXBElement<ManufacturingRouting>(_ManufacturingRouting_QNAME, ManufacturingRouting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingRoutingSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:supplychain_2014_2.lists.webservices.netsuite.com", name = "manufacturingRoutingSearch")
    public JAXBElement<ManufacturingRoutingSearch> createManufacturingRoutingSearch(ManufacturingRoutingSearch value) {
        return new JAXBElement<ManufacturingRoutingSearch>(_ManufacturingRoutingSearch_QNAME, ManufacturingRoutingSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingOperationTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:supplychain_2014_2.lists.webservices.netsuite.com", name = "manufacturingOperationTask")
    public JAXBElement<ManufacturingOperationTask> createManufacturingOperationTask(ManufacturingOperationTask value) {
        return new JAXBElement<ManufacturingOperationTask>(_ManufacturingOperationTask_QNAME, ManufacturingOperationTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingOperationTaskSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:supplychain_2014_2.lists.webservices.netsuite.com", name = "manufacturingOperationTaskSearch")
    public JAXBElement<ManufacturingOperationTaskSearch> createManufacturingOperationTaskSearch(ManufacturingOperationTaskSearch value) {
        return new JAXBElement<ManufacturingOperationTaskSearch>(_ManufacturingOperationTaskSearch_QNAME, ManufacturingOperationTaskSearch.class, null, value);
    }

}
