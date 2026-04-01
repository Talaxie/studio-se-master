
package com.microsoft.schemas.xrm._2012.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.xrm._2012.contracts package. 
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

    private final static QName _OrganizationRequestCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2012/Contracts", "OrganizationRequestCollection");
    private final static QName _OrganizationResponseCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2012/Contracts", "OrganizationResponseCollection");
    private final static QName _ExecuteMultipleSettings_QNAME = new QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleSettings");
    private final static QName _ExecuteMultipleResponseItem_QNAME = new QName("http://schemas.microsoft.com/xrm/2012/Contracts", "ExecuteMultipleResponseItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.xrm._2012.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrganizationRequestCollection }
     * 
     */
    public OrganizationRequestCollection createOrganizationRequestCollection() {
        return new OrganizationRequestCollection();
    }

    /**
     * Create an instance of {@link ExecuteMultipleSettings }
     * 
     */
    public ExecuteMultipleSettings createExecuteMultipleSettings() {
        return new ExecuteMultipleSettings();
    }

    /**
     * Create an instance of {@link ExecuteMultipleResponseItem }
     * 
     */
    public ExecuteMultipleResponseItem createExecuteMultipleResponseItem() {
        return new ExecuteMultipleResponseItem();
    }

    /**
     * Create an instance of {@link OrganizationResponseCollection }
     * 
     */
    public OrganizationResponseCollection createOrganizationResponseCollection() {
        return new OrganizationResponseCollection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationRequestCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "OrganizationRequestCollection")
    public JAXBElement<OrganizationRequestCollection> createOrganizationRequestCollection(OrganizationRequestCollection value) {
        return new JAXBElement<OrganizationRequestCollection>(_OrganizationRequestCollection_QNAME, OrganizationRequestCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "OrganizationResponseCollection")
    public JAXBElement<OrganizationResponseCollection> createOrganizationResponseCollection(OrganizationResponseCollection value) {
        return new JAXBElement<OrganizationResponseCollection>(_OrganizationResponseCollection_QNAME, OrganizationResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteMultipleSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "ExecuteMultipleSettings")
    public JAXBElement<ExecuteMultipleSettings> createExecuteMultipleSettings(ExecuteMultipleSettings value) {
        return new JAXBElement<ExecuteMultipleSettings>(_ExecuteMultipleSettings_QNAME, ExecuteMultipleSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteMultipleResponseItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2012/Contracts", name = "ExecuteMultipleResponseItem")
    public JAXBElement<ExecuteMultipleResponseItem> createExecuteMultipleResponseItem(ExecuteMultipleResponseItem value) {
        return new JAXBElement<ExecuteMultipleResponseItem>(_ExecuteMultipleResponseItem_QNAME, ExecuteMultipleResponseItem.class, null, value);
    }

}
