/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.foundation.er.*;
import orgomg.cwmx.foundation.er.Attribute;
import orgomg.cwmx.foundation.er.CandidateKey;
import orgomg.cwmx.foundation.er.Domain;
import orgomg.cwmx.foundation.er.Entity;
import orgomg.cwmx.foundation.er.ErFactory;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.foundation.er.ForeignKey;
import orgomg.cwmx.foundation.er.Model;
import orgomg.cwmx.foundation.er.ModelLibrary;
import orgomg.cwmx.foundation.er.NonuniqueKey;
import orgomg.cwmx.foundation.er.PrimaryKey;
import orgomg.cwmx.foundation.er.Relationship;
import orgomg.cwmx.foundation.er.RelationshipEnd;
import orgomg.cwmx.foundation.er.SubjectArea;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ErFactoryImpl extends EFactoryImpl implements ErFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static ErFactory init() {
        try {
            ErFactory theErFactory = (ErFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/foundation/er.ecore");
            if (theErFactory != null) {
                return theErFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ErFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ErFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ErPackage.ENTITY:
            return createEntity();
        case ErPackage.NONUNIQUE_KEY:
            return createNonuniqueKey();
        case ErPackage.CANDIDATE_KEY:
            return createCandidateKey();
        case ErPackage.FOREIGN_KEY:
            return createForeignKey();
        case ErPackage.DOMAIN:
            return createDomain();
        case ErPackage.ATTRIBUTE:
            return createAttribute();
        case ErPackage.RELATIONSHIP:
            return createRelationship();
        case ErPackage.RELATIONSHIP_END:
            return createRelationshipEnd();
        case ErPackage.MODEL_LIBRARY:
            return createModelLibrary();
        case ErPackage.MODEL:
            return createModel();
        case ErPackage.SUBJECT_AREA:
            return createSubjectArea();
        case ErPackage.PRIMARY_KEY:
            return createPrimaryKey();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Entity createEntity() {
        EntityImpl entity = new EntityImpl();
        return entity;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NonuniqueKey createNonuniqueKey() {
        NonuniqueKeyImpl nonuniqueKey = new NonuniqueKeyImpl();
        return nonuniqueKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CandidateKey createCandidateKey() {
        CandidateKeyImpl candidateKey = new CandidateKeyImpl();
        return candidateKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ForeignKey createForeignKey() {
        ForeignKeyImpl foreignKey = new ForeignKeyImpl();
        return foreignKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Domain createDomain() {
        DomainImpl domain = new DomainImpl();
        return domain;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Relationship createRelationship() {
        RelationshipImpl relationship = new RelationshipImpl();
        return relationship;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RelationshipEnd createRelationshipEnd() {
        RelationshipEndImpl relationshipEnd = new RelationshipEndImpl();
        return relationshipEnd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModelLibrary createModelLibrary() {
        ModelLibraryImpl modelLibrary = new ModelLibraryImpl();
        return modelLibrary;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SubjectArea createSubjectArea() {
        SubjectAreaImpl subjectArea = new SubjectAreaImpl();
        return subjectArea;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PrimaryKey createPrimaryKey() {
        PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
        return primaryKey;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ErPackage getErPackage() {
        return (ErPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ErPackage getPackage() {
        return ErPackage.eINSTANCE;
    }

} // ErFactoryImpl
