
package org.datacontract.schemas._2004._07.microsoft_xrm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.microsoft_xrm package. 
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

    private final static QName _ArrayOfQuickFindConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "ArrayOfQuickFindConfiguration");
    private final static QName _QuickFindConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", "QuickFindConfiguration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.microsoft_xrm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuickFindConfiguration }
     * 
     */
    public QuickFindConfiguration createQuickFindConfiguration() {
        return new QuickFindConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfQuickFindConfiguration }
     * 
     */
    public ArrayOfQuickFindConfiguration createArrayOfQuickFindConfiguration() {
        return new ArrayOfQuickFindConfiguration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuickFindConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", name = "ArrayOfQuickFindConfiguration")
    public JAXBElement<ArrayOfQuickFindConfiguration> createArrayOfQuickFindConfiguration(ArrayOfQuickFindConfiguration value) {
        return new JAXBElement<ArrayOfQuickFindConfiguration>(_ArrayOfQuickFindConfiguration_QNAME, ArrayOfQuickFindConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuickFindConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk", name = "QuickFindConfiguration")
    public JAXBElement<QuickFindConfiguration> createQuickFindConfiguration(QuickFindConfiguration value) {
        return new JAXBElement<QuickFindConfiguration>(_QuickFindConfiguration_QNAME, QuickFindConfiguration.class, null, value);
    }

}
