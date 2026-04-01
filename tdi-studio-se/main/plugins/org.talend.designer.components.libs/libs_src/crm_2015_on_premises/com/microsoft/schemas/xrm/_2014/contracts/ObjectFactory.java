
package com.microsoft.schemas.xrm._2014.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.xrm._2014.contracts package. 
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

    private final static QName _OrganizationState_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts", "OrganizationState");
    private final static QName _AttributeMapping_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts", "AttributeMapping");
    private final static QName _EndpointCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts", "EndpointCollection");
    private final static QName _OrganizationDetail_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts", "OrganizationDetail");
    private final static QName _EndpointType_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts", "EndpointType");
    private final static QName _EndpointAccessType_QNAME = new QName("http://schemas.microsoft.com/xrm/2014/Contracts", "EndpointAccessType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.xrm._2014.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttributeMapping }
     * 
     */
    public AttributeMapping createAttributeMapping() {
        return new AttributeMapping();
    }

    /**
     * Create an instance of {@link EndpointCollection }
     * 
     */
    public EndpointCollection createEndpointCollection() {
        return new EndpointCollection();
    }

    /**
     * Create an instance of {@link OrganizationDetail }
     * 
     */
    public OrganizationDetail createOrganizationDetail() {
        return new OrganizationDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "OrganizationState")
    public JAXBElement<OrganizationState> createOrganizationState(OrganizationState value) {
        return new JAXBElement<OrganizationState>(_OrganizationState_QNAME, OrganizationState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "AttributeMapping")
    public JAXBElement<AttributeMapping> createAttributeMapping(AttributeMapping value) {
        return new JAXBElement<AttributeMapping>(_AttributeMapping_QNAME, AttributeMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "EndpointCollection")
    public JAXBElement<EndpointCollection> createEndpointCollection(EndpointCollection value) {
        return new JAXBElement<EndpointCollection>(_EndpointCollection_QNAME, EndpointCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "OrganizationDetail")
    public JAXBElement<OrganizationDetail> createOrganizationDetail(OrganizationDetail value) {
        return new JAXBElement<OrganizationDetail>(_OrganizationDetail_QNAME, OrganizationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "EndpointType")
    public JAXBElement<EndpointType> createEndpointType(EndpointType value) {
        return new JAXBElement<EndpointType>(_EndpointType_QNAME, EndpointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointAccessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2014/Contracts", name = "EndpointAccessType")
    public JAXBElement<EndpointAccessType> createEndpointAccessType(EndpointAccessType value) {
        return new JAXBElement<EndpointAccessType>(_EndpointAccessType_QNAME, EndpointAccessType.class, null, value);
    }

}
