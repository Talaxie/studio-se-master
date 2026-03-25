
package com.microsoft.schemas.xrm._2011.metadata.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.xrm._2011.metadata.query package. 
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

    private final static QName _EntityQueryExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "EntityQueryExpression");
    private final static QName _RelationshipQueryExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "RelationshipQueryExpression");
    private final static QName _ArrayOfMetadataConditionExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ArrayOfMetadataConditionExpression");
    private final static QName _LabelQueryExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "LabelQueryExpression");
    private final static QName _MetadataQueryBase_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataQueryBase");
    private final static QName _MetadataPropertiesExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataPropertiesExpression");
    private final static QName _DeletedMetadataFilters_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "DeletedMetadataFilters");
    private final static QName _MetadataFilterExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataFilterExpression");
    private final static QName _AttributeQueryExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "AttributeQueryExpression");
    private final static QName _MetadataConditionExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionExpression");
    private final static QName _MetadataConditionOperator_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataConditionOperator");
    private final static QName _MetadataQueryExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "MetadataQueryExpression");
    private final static QName _DeletedMetadataCollection_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "DeletedMetadataCollection");
    private final static QName _ArrayOfMetadataFilterExpression_QNAME = new QName("http://schemas.microsoft.com/xrm/2011/Metadata/Query", "ArrayOfMetadataFilterExpression");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.xrm._2011.metadata.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadataPropertiesExpression }
     * 
     */
    public MetadataPropertiesExpression createMetadataPropertiesExpression() {
        return new MetadataPropertiesExpression();
    }

    /**
     * Create an instance of {@link EntityQueryExpression }
     * 
     */
    public EntityQueryExpression createEntityQueryExpression() {
        return new EntityQueryExpression();
    }

    /**
     * Create an instance of {@link ArrayOfMetadataFilterExpression }
     * 
     */
    public ArrayOfMetadataFilterExpression createArrayOfMetadataFilterExpression() {
        return new ArrayOfMetadataFilterExpression();
    }

    /**
     * Create an instance of {@link MetadataQueryBase }
     * 
     */
    public MetadataQueryBase createMetadataQueryBase() {
        return new MetadataQueryBase();
    }

    /**
     * Create an instance of {@link AttributeQueryExpression }
     * 
     */
    public AttributeQueryExpression createAttributeQueryExpression() {
        return new AttributeQueryExpression();
    }

    /**
     * Create an instance of {@link MetadataFilterExpression }
     * 
     */
    public MetadataFilterExpression createMetadataFilterExpression() {
        return new MetadataFilterExpression();
    }

    /**
     * Create an instance of {@link RelationshipQueryExpression }
     * 
     */
    public RelationshipQueryExpression createRelationshipQueryExpression() {
        return new RelationshipQueryExpression();
    }

    /**
     * Create an instance of {@link MetadataQueryExpression }
     * 
     */
    public MetadataQueryExpression createMetadataQueryExpression() {
        return new MetadataQueryExpression();
    }

    /**
     * Create an instance of {@link MetadataConditionExpression }
     * 
     */
    public MetadataConditionExpression createMetadataConditionExpression() {
        return new MetadataConditionExpression();
    }

    /**
     * Create an instance of {@link DeletedMetadataCollection }
     * 
     */
    public DeletedMetadataCollection createDeletedMetadataCollection() {
        return new DeletedMetadataCollection();
    }

    /**
     * Create an instance of {@link ArrayOfMetadataConditionExpression }
     * 
     */
    public ArrayOfMetadataConditionExpression createArrayOfMetadataConditionExpression() {
        return new ArrayOfMetadataConditionExpression();
    }

    /**
     * Create an instance of {@link DeletedMetadataFilters }
     * 
     */
    public DeletedMetadataFilters createDeletedMetadataFilters() {
        return new DeletedMetadataFilters();
    }

    /**
     * Create an instance of {@link LabelQueryExpression }
     * 
     */
    public LabelQueryExpression createLabelQueryExpression() {
        return new LabelQueryExpression();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityQueryExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "EntityQueryExpression")
    public JAXBElement<EntityQueryExpression> createEntityQueryExpression(EntityQueryExpression value) {
        return new JAXBElement<EntityQueryExpression>(_EntityQueryExpression_QNAME, EntityQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipQueryExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "RelationshipQueryExpression")
    public JAXBElement<RelationshipQueryExpression> createRelationshipQueryExpression(RelationshipQueryExpression value) {
        return new JAXBElement<RelationshipQueryExpression>(_RelationshipQueryExpression_QNAME, RelationshipQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetadataConditionExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "ArrayOfMetadataConditionExpression")
    public JAXBElement<ArrayOfMetadataConditionExpression> createArrayOfMetadataConditionExpression(ArrayOfMetadataConditionExpression value) {
        return new JAXBElement<ArrayOfMetadataConditionExpression>(_ArrayOfMetadataConditionExpression_QNAME, ArrayOfMetadataConditionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelQueryExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "LabelQueryExpression")
    public JAXBElement<LabelQueryExpression> createLabelQueryExpression(LabelQueryExpression value) {
        return new JAXBElement<LabelQueryExpression>(_LabelQueryExpression_QNAME, LabelQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataQueryBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataQueryBase")
    public JAXBElement<MetadataQueryBase> createMetadataQueryBase(MetadataQueryBase value) {
        return new JAXBElement<MetadataQueryBase>(_MetadataQueryBase_QNAME, MetadataQueryBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataPropertiesExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataPropertiesExpression")
    public JAXBElement<MetadataPropertiesExpression> createMetadataPropertiesExpression(MetadataPropertiesExpression value) {
        return new JAXBElement<MetadataPropertiesExpression>(_MetadataPropertiesExpression_QNAME, MetadataPropertiesExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletedMetadataFilters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "DeletedMetadataFilters")
    public JAXBElement<DeletedMetadataFilters> createDeletedMetadataFilters(DeletedMetadataFilters value) {
        return new JAXBElement<DeletedMetadataFilters>(_DeletedMetadataFilters_QNAME, DeletedMetadataFilters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataFilterExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataFilterExpression")
    public JAXBElement<MetadataFilterExpression> createMetadataFilterExpression(MetadataFilterExpression value) {
        return new JAXBElement<MetadataFilterExpression>(_MetadataFilterExpression_QNAME, MetadataFilterExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeQueryExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "AttributeQueryExpression")
    public JAXBElement<AttributeQueryExpression> createAttributeQueryExpression(AttributeQueryExpression value) {
        return new JAXBElement<AttributeQueryExpression>(_AttributeQueryExpression_QNAME, AttributeQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConditionExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataConditionExpression")
    public JAXBElement<MetadataConditionExpression> createMetadataConditionExpression(MetadataConditionExpression value) {
        return new JAXBElement<MetadataConditionExpression>(_MetadataConditionExpression_QNAME, MetadataConditionExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataConditionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataConditionOperator")
    public JAXBElement<MetadataConditionOperator> createMetadataConditionOperator(MetadataConditionOperator value) {
        return new JAXBElement<MetadataConditionOperator>(_MetadataConditionOperator_QNAME, MetadataConditionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataQueryExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "MetadataQueryExpression")
    public JAXBElement<MetadataQueryExpression> createMetadataQueryExpression(MetadataQueryExpression value) {
        return new JAXBElement<MetadataQueryExpression>(_MetadataQueryExpression_QNAME, MetadataQueryExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletedMetadataCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "DeletedMetadataCollection")
    public JAXBElement<DeletedMetadataCollection> createDeletedMetadataCollection(DeletedMetadataCollection value) {
        return new JAXBElement<DeletedMetadataCollection>(_DeletedMetadataCollection_QNAME, DeletedMetadataCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMetadataFilterExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/xrm/2011/Metadata/Query", name = "ArrayOfMetadataFilterExpression")
    public JAXBElement<ArrayOfMetadataFilterExpression> createArrayOfMetadataFilterExpression(ArrayOfMetadataFilterExpression value) {
        return new JAXBElement<ArrayOfMetadataFilterExpression>(_ArrayOfMetadataFilterExpression_QNAME, ArrayOfMetadataFilterExpression.class, null, value);
    }

}
