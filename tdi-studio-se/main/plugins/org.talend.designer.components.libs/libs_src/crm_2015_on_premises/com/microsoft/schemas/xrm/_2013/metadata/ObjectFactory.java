
package com.microsoft.schemas.xrm._2013.metadata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.xrm._2013.metadata package. 
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

    private final static QName _AttributeTypeDisplayName_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata", "AttributeTypeDisplayName");
    private final static QName _ConstantsBase_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata", "ConstantsBase");
    private final static QName _ArrayOfAttributeTypeDisplayName_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata", "ArrayOfAttributeTypeDisplayName");
    private final static QName _StringFormatName_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata", "StringFormatName");
    private final static QName _ImageAttributeMetadata_QNAME = new QName("http://schemas.microsoft.com/xrm/2013/Metadata", "ImageAttributeMetadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.xrm._2013.metadata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAttributeTypeDisplayName }
     * 
     */
    public ArrayOfAttributeTypeDisplayName createArrayOfAttributeTypeDisplayName() {
        return new ArrayOfAttributeTypeDisplayName();
    }

    /**
     * Create an instance of {@link AttributeTypeDisplayName }
     * 
     */
    public AttributeTypeDisplayName createAttributeTypeDisplayName() {
        return new AttributeTypeDisplayName();
    }

    /**
     * Create an instance of {@link StringFormatName }
     * 
     */
    public StringFormatName createStringFormatName() {
        return new StringFormatName();
    }

    /**
     * Create an instance of {@link ImageAttributeMetadata }
     * 
     */
    public ImageAttributeMetadata createImageAttributeMetadata() {
        return new ImageAttributeMetadata();
    }

    /**
     * Create an instance of {@link ConstantsBase }
     * 
     */
    public ConstantsBase createConstantsBase() {
        return new ConstantsBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeTypeDisplayName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "AttributeTypeDisplayName")
    public JAXBElement<AttributeTypeDisplayName> createAttributeTypeDisplayName(AttributeTypeDisplayName value) {
        return new JAXBElement<AttributeTypeDisplayName>(_AttributeTypeDisplayName_QNAME, AttributeTypeDisplayName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "ConstantsBase")
    public JAXBElement<ConstantsBase> createConstantsBase(ConstantsBase value) {
        return new JAXBElement<ConstantsBase>(_ConstantsBase_QNAME, ConstantsBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttributeTypeDisplayName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "ArrayOfAttributeTypeDisplayName")
    public JAXBElement<ArrayOfAttributeTypeDisplayName> createArrayOfAttributeTypeDisplayName(ArrayOfAttributeTypeDisplayName value) {
        return new JAXBElement<ArrayOfAttributeTypeDisplayName>(_ArrayOfAttributeTypeDisplayName_QNAME, ArrayOfAttributeTypeDisplayName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringFormatName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "StringFormatName")
    public JAXBElement<StringFormatName> createStringFormatName(StringFormatName value) {
        return new JAXBElement<StringFormatName>(_StringFormatName_QNAME, StringFormatName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageAttributeMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2013/Metadata", name = "ImageAttributeMetadata")
    public JAXBElement<ImageAttributeMetadata> createImageAttributeMetadata(ImageAttributeMetadata value) {
        return new JAXBElement<ImageAttributeMetadata>(_ImageAttributeMetadata_QNAME, ImageAttributeMetadata.class, null, value);
    }

}
