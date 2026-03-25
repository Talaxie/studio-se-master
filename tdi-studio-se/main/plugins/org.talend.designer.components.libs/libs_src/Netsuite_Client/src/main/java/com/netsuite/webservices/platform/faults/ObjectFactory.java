
package com.netsuite.webservices.platform.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.platform.faults package. 
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

    private final static QName _InsufficientPermissionFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "insufficientPermissionFault");
    private final static QName _InvalidAccountFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "invalidAccountFault");
    private final static QName _InvalidCredentialsFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "invalidCredentialsFault");
    private final static QName _InvalidSessionFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "invalidSessionFault");
    private final static QName _ExceededRequestLimitFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "exceededRequestLimitFault");
    private final static QName _ExceededUsageLimitFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "exceededUsageLimitFault");
    private final static QName _ExceededRecordCountFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "exceededRecordCountFault");
    private final static QName _ExceededRequestSizeFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "exceededRequestSizeFault");
    private final static QName _InvalidVersionFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "invalidVersionFault");
    private final static QName _AsyncFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "asyncFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:faults_2014_2.platform.webservices.netsuite.com", "unexpectedErrorFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.platform.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsufficientPermissionFault }
     * 
     */
    public InsufficientPermissionFault createInsufficientPermissionFault() {
        return new InsufficientPermissionFault();
    }

    /**
     * Create an instance of {@link InvalidAccountFault }
     * 
     */
    public InvalidAccountFault createInvalidAccountFault() {
        return new InvalidAccountFault();
    }

    /**
     * Create an instance of {@link InvalidCredentialsFault }
     * 
     */
    public InvalidCredentialsFault createInvalidCredentialsFault() {
        return new InvalidCredentialsFault();
    }

    /**
     * Create an instance of {@link InvalidSessionFault }
     * 
     */
    public InvalidSessionFault createInvalidSessionFault() {
        return new InvalidSessionFault();
    }

    /**
     * Create an instance of {@link ExceededRequestLimitFault }
     * 
     */
    public ExceededRequestLimitFault createExceededRequestLimitFault() {
        return new ExceededRequestLimitFault();
    }

    /**
     * Create an instance of {@link ExceededUsageLimitFault }
     * 
     */
    public ExceededUsageLimitFault createExceededUsageLimitFault() {
        return new ExceededUsageLimitFault();
    }

    /**
     * Create an instance of {@link ExceededRecordCountFault }
     * 
     */
    public ExceededRecordCountFault createExceededRecordCountFault() {
        return new ExceededRecordCountFault();
    }

    /**
     * Create an instance of {@link ExceededRequestSizeFault }
     * 
     */
    public ExceededRequestSizeFault createExceededRequestSizeFault() {
        return new ExceededRequestSizeFault();
    }

    /**
     * Create an instance of {@link InvalidVersionFault }
     * 
     */
    public InvalidVersionFault createInvalidVersionFault() {
        return new InvalidVersionFault();
    }

    /**
     * Create an instance of {@link AsyncFault }
     * 
     */
    public AsyncFault createAsyncFault() {
        return new AsyncFault();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link SoapFault }
     * 
     */
    public SoapFault createSoapFault() {
        return new SoapFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsufficientPermissionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "insufficientPermissionFault")
    public JAXBElement<InsufficientPermissionFault> createInsufficientPermissionFault(InsufficientPermissionFault value) {
        return new JAXBElement<InsufficientPermissionFault>(_InsufficientPermissionFault_QNAME, InsufficientPermissionFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidAccountFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "invalidAccountFault")
    public JAXBElement<InvalidAccountFault> createInvalidAccountFault(InvalidAccountFault value) {
        return new JAXBElement<InvalidAccountFault>(_InvalidAccountFault_QNAME, InvalidAccountFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCredentialsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "invalidCredentialsFault")
    public JAXBElement<InvalidCredentialsFault> createInvalidCredentialsFault(InvalidCredentialsFault value) {
        return new JAXBElement<InvalidCredentialsFault>(_InvalidCredentialsFault_QNAME, InvalidCredentialsFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidSessionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "invalidSessionFault")
    public JAXBElement<InvalidSessionFault> createInvalidSessionFault(InvalidSessionFault value) {
        return new JAXBElement<InvalidSessionFault>(_InvalidSessionFault_QNAME, InvalidSessionFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceededRequestLimitFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "exceededRequestLimitFault")
    public JAXBElement<ExceededRequestLimitFault> createExceededRequestLimitFault(ExceededRequestLimitFault value) {
        return new JAXBElement<ExceededRequestLimitFault>(_ExceededRequestLimitFault_QNAME, ExceededRequestLimitFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceededUsageLimitFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "exceededUsageLimitFault")
    public JAXBElement<ExceededUsageLimitFault> createExceededUsageLimitFault(ExceededUsageLimitFault value) {
        return new JAXBElement<ExceededUsageLimitFault>(_ExceededUsageLimitFault_QNAME, ExceededUsageLimitFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceededRecordCountFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "exceededRecordCountFault")
    public JAXBElement<ExceededRecordCountFault> createExceededRecordCountFault(ExceededRecordCountFault value) {
        return new JAXBElement<ExceededRecordCountFault>(_ExceededRecordCountFault_QNAME, ExceededRecordCountFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceededRequestSizeFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "exceededRequestSizeFault")
    public JAXBElement<ExceededRequestSizeFault> createExceededRequestSizeFault(ExceededRequestSizeFault value) {
        return new JAXBElement<ExceededRequestSizeFault>(_ExceededRequestSizeFault_QNAME, ExceededRequestSizeFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidVersionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "invalidVersionFault")
    public JAXBElement<InvalidVersionFault> createInvalidVersionFault(InvalidVersionFault value) {
        return new JAXBElement<InvalidVersionFault>(_InvalidVersionFault_QNAME, InvalidVersionFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "asyncFault")
    public JAXBElement<AsyncFault> createAsyncFault(AsyncFault value) {
        return new JAXBElement<AsyncFault>(_AsyncFault_QNAME, AsyncFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults_2014_2.platform.webservices.netsuite.com", name = "unexpectedErrorFault")
    public JAXBElement<UnexpectedErrorFault> createUnexpectedErrorFault(UnexpectedErrorFault value) {
        return new JAXBElement<UnexpectedErrorFault>(_UnexpectedErrorFault_QNAME, UnexpectedErrorFault.class, null, value);
    }

}
