
package org.datacontract.schemas._2004._07.microsoft_crm_sdk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.microsoft_crm_sdk package. 
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

    private final static QName _BusinessNotificationSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationSeverity");
    private final static QName _ArrayOfBusinessNotificationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "ArrayOfBusinessNotificationParameter");
    private final static QName _BusinessNotificationParameterType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameterType");
    private final static QName _BusinessNotificationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", "BusinessNotificationParameter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.microsoft_crm_sdk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessNotificationParameter }
     * 
     */
    public BusinessNotificationParameter createBusinessNotificationParameter() {
        return new BusinessNotificationParameter();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessNotificationParameter }
     * 
     */
    public ArrayOfBusinessNotificationParameter createArrayOfBusinessNotificationParameter() {
        return new ArrayOfBusinessNotificationParameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotificationSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "BusinessNotificationSeverity")
    public JAXBElement<BusinessNotificationSeverity> createBusinessNotificationSeverity(BusinessNotificationSeverity value) {
        return new JAXBElement<BusinessNotificationSeverity>(_BusinessNotificationSeverity_QNAME, BusinessNotificationSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessNotificationParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "ArrayOfBusinessNotificationParameter")
    public JAXBElement<ArrayOfBusinessNotificationParameter> createArrayOfBusinessNotificationParameter(ArrayOfBusinessNotificationParameter value) {
        return new JAXBElement<ArrayOfBusinessNotificationParameter>(_ArrayOfBusinessNotificationParameter_QNAME, ArrayOfBusinessNotificationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotificationParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "BusinessNotificationParameterType")
    public JAXBElement<BusinessNotificationParameterType> createBusinessNotificationParameterType(BusinessNotificationParameterType value) {
        return new JAXBElement<BusinessNotificationParameterType>(_BusinessNotificationParameterType_QNAME, BusinessNotificationParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNotificationParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages", name = "BusinessNotificationParameter")
    public JAXBElement<BusinessNotificationParameter> createBusinessNotificationParameter(BusinessNotificationParameter value) {
        return new JAXBElement<BusinessNotificationParameter>(_BusinessNotificationParameter_QNAME, BusinessNotificationParameter.class, null, value);
    }

}
