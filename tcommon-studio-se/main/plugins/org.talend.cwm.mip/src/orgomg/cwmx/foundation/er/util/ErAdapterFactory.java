/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.foundation.keysindexes.Index;
import orgomg.cwm.foundation.keysindexes.KeyRelationship;
import orgomg.cwm.foundation.keysindexes.UniqueKey;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.objectmodel.core.Subsystem;
import orgomg.cwm.objectmodel.relationships.Association;
import orgomg.cwm.objectmodel.relationships.AssociationEnd;
import orgomg.cwmx.foundation.er.*;
import orgomg.cwmx.foundation.er.Attribute;
import orgomg.cwmx.foundation.er.CandidateKey;
import orgomg.cwmx.foundation.er.Domain;
import orgomg.cwmx.foundation.er.Entity;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see orgomg.cwmx.foundation.er.ErPackage
 * @generated
 */
public class ErAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static ErPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ErAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ErPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ErSwitch<Adapter> modelSwitch = new ErSwitch<Adapter>() {

        @Override
        public Adapter caseEntity(Entity object) {
            return createEntityAdapter();
        }

        @Override
        public Adapter caseNonuniqueKey(NonuniqueKey object) {
            return createNonuniqueKeyAdapter();
        }

        @Override
        public Adapter caseCandidateKey(CandidateKey object) {
            return createCandidateKeyAdapter();
        }

        @Override
        public Adapter caseForeignKey(ForeignKey object) {
            return createForeignKeyAdapter();
        }

        @Override
        public Adapter caseDomain(Domain object) {
            return createDomainAdapter();
        }

        @Override
        public Adapter caseAttribute(Attribute object) {
            return createAttributeAdapter();
        }

        @Override
        public Adapter caseRelationship(Relationship object) {
            return createRelationshipAdapter();
        }

        @Override
        public Adapter caseRelationshipEnd(RelationshipEnd object) {
            return createRelationshipEndAdapter();
        }

        @Override
        public Adapter caseModelLibrary(ModelLibrary object) {
            return createModelLibraryAdapter();
        }

        @Override
        public Adapter caseModel(Model object) {
            return createModelAdapter();
        }

        @Override
        public Adapter caseSubjectArea(SubjectArea object) {
            return createSubjectAreaAdapter();
        }

        @Override
        public Adapter casePrimaryKey(PrimaryKey object) {
            return createPrimaryKeyAdapter();
        }

        @Override
        public Adapter caseElement(Element object) {
            return createElementAdapter();
        }

        @Override
        public Adapter caseModelElement(ModelElement object) {
            return createModelElementAdapter();
        }

        @Override
        public Adapter caseNamespace(Namespace object) {
            return createNamespaceAdapter();
        }

        @Override
        public Adapter caseClassifier(Classifier object) {
            return createClassifierAdapter();
        }

        @Override
        public Adapter caseClass(orgomg.cwm.objectmodel.core.Class object) {
            return createClassAdapter();
        }

        @Override
        public Adapter caseIndex(Index object) {
            return createIndexAdapter();
        }

        @Override
        public Adapter caseUniqueKey(UniqueKey object) {
            return createUniqueKeyAdapter();
        }

        @Override
        public Adapter caseKeyRelationship(KeyRelationship object) {
            return createKeyRelationshipAdapter();
        }

        @Override
        public Adapter caseFeature(Feature object) {
            return createFeatureAdapter();
        }

        @Override
        public Adapter caseStructuralFeature(StructuralFeature object) {
            return createStructuralFeatureAdapter();
        }

        @Override
        public Adapter caseCore_Attribute(orgomg.cwm.objectmodel.core.Attribute object) {
            return createCore_AttributeAdapter();
        }

        @Override
        public Adapter caseAssociation(Association object) {
            return createAssociationAdapter();
        }

        @Override
        public Adapter caseAssociationEnd(AssociationEnd object) {
            return createAssociationEndAdapter();
        }

        @Override
        public Adapter casePackage(orgomg.cwm.objectmodel.core.Package object) {
            return createPackageAdapter();
        }

        @Override
        public Adapter caseSubsystem(Subsystem object) {
            return createSubsystemAdapter();
        }

        @Override
        public Adapter caseCore_Model(orgomg.cwm.objectmodel.core.Model object) {
            return createCore_ModelAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.foundation.er.Entity <em>Entity</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.foundation.er.NonuniqueKey <em>Nonunique Key</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.NonuniqueKey
     * @generated
     */
    public Adapter createNonuniqueKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.foundation.er.CandidateKey <em>Candidate Key</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.CandidateKey
     * @generated
     */
    public Adapter createCandidateKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.foundation.er.ForeignKey <em>Foreign Key</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.ForeignKey
     * @generated
     */
    public Adapter createForeignKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.foundation.er.Domain <em>Domain</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.Domain
     * @generated
     */
    public Adapter createDomainAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.foundation.er.Attribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.foundation.er.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.foundation.er.RelationshipEnd <em>Relationship End</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.RelationshipEnd
     * @generated
     */
    public Adapter createRelationshipEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.foundation.er.ModelLibrary <em>Model Library</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.ModelLibrary
     * @generated
     */
    public Adapter createModelLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.foundation.er.Model <em>Model</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.foundation.er.SubjectArea <em>Subject Area</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.SubjectArea
     * @generated
     */
    public Adapter createSubjectAreaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.foundation.er.PrimaryKey <em>Primary Key</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.foundation.er.PrimaryKey
     * @generated
     */
    public Adapter createPrimaryKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Element <em>Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Namespace <em>Namespace</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Namespace
     * @generated
     */
    public Adapter createNamespaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Classifier <em>Classifier</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Class <em>Class</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.foundation.keysindexes.Index <em>Index</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.foundation.keysindexes.Index
     * @generated
     */
    public Adapter createIndexAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.foundation.keysindexes.UniqueKey <em>Unique Key</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.foundation.keysindexes.UniqueKey
     * @generated
     */
    public Adapter createUniqueKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.foundation.keysindexes.KeyRelationship <em>Key Relationship</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.foundation.keysindexes.KeyRelationship
     * @generated
     */
    public Adapter createKeyRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Feature <em>Feature</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Feature
     * @generated
     */
    public Adapter createFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.StructuralFeature <em>Structural Feature</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.StructuralFeature
     * @generated
     */
    public Adapter createStructuralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Attribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Attribute
     * @generated
     */
    public Adapter createCore_AttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.relationships.Association <em>Association</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.relationships.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.relationships.AssociationEnd <em>Association End</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.relationships.AssociationEnd
     * @generated
     */
    public Adapter createAssociationEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Package <em>Package</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Subsystem <em>Subsystem</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Subsystem
     * @generated
     */
    public Adapter createSubsystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Model <em>Model</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Model
     * @generated
     */
    public Adapter createCore_ModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This
     * default implementation returns null. <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ErAdapterFactory
