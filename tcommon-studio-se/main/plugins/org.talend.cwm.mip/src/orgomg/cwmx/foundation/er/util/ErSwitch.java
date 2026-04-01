/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmx.foundation.er.ErPackage
 * @generated
 */
public class ErSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static ErPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ErSwitch() {
        if (modelPackage == null) {
            modelPackage = ErPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case ErPackage.ENTITY: {
            Entity entity = (Entity) theEObject;
            T result = caseEntity(entity);
            if (result == null)
                result = caseClass(entity);
            if (result == null)
                result = caseClassifier(entity);
            if (result == null)
                result = caseNamespace(entity);
            if (result == null)
                result = caseModelElement(entity);
            if (result == null)
                result = caseElement(entity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.NONUNIQUE_KEY: {
            NonuniqueKey nonuniqueKey = (NonuniqueKey) theEObject;
            T result = caseNonuniqueKey(nonuniqueKey);
            if (result == null)
                result = caseIndex(nonuniqueKey);
            if (result == null)
                result = caseModelElement(nonuniqueKey);
            if (result == null)
                result = caseElement(nonuniqueKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.CANDIDATE_KEY: {
            CandidateKey candidateKey = (CandidateKey) theEObject;
            T result = caseCandidateKey(candidateKey);
            if (result == null)
                result = caseUniqueKey(candidateKey);
            if (result == null)
                result = caseModelElement(candidateKey);
            if (result == null)
                result = caseElement(candidateKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.FOREIGN_KEY: {
            ForeignKey foreignKey = (ForeignKey) theEObject;
            T result = caseForeignKey(foreignKey);
            if (result == null)
                result = caseKeyRelationship(foreignKey);
            if (result == null)
                result = caseModelElement(foreignKey);
            if (result == null)
                result = caseElement(foreignKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.DOMAIN: {
            Domain domain = (Domain) theEObject;
            T result = caseDomain(domain);
            if (result == null)
                result = caseClassifier(domain);
            if (result == null)
                result = caseNamespace(domain);
            if (result == null)
                result = caseModelElement(domain);
            if (result == null)
                result = caseElement(domain);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.ATTRIBUTE: {
            Attribute attribute = (Attribute) theEObject;
            T result = caseAttribute(attribute);
            if (result == null)
                result = caseCore_Attribute(attribute);
            if (result == null)
                result = caseStructuralFeature(attribute);
            if (result == null)
                result = caseFeature(attribute);
            if (result == null)
                result = caseModelElement(attribute);
            if (result == null)
                result = caseElement(attribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.RELATIONSHIP: {
            Relationship relationship = (Relationship) theEObject;
            T result = caseRelationship(relationship);
            if (result == null)
                result = caseAssociation(relationship);
            if (result == null)
                result = caseClass(relationship);
            if (result == null)
                result = caseClassifier(relationship);
            if (result == null)
                result = caseNamespace(relationship);
            if (result == null)
                result = caseModelElement(relationship);
            if (result == null)
                result = caseElement(relationship);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.RELATIONSHIP_END: {
            RelationshipEnd relationshipEnd = (RelationshipEnd) theEObject;
            T result = caseRelationshipEnd(relationshipEnd);
            if (result == null)
                result = caseAssociationEnd(relationshipEnd);
            if (result == null)
                result = caseStructuralFeature(relationshipEnd);
            if (result == null)
                result = caseFeature(relationshipEnd);
            if (result == null)
                result = caseModelElement(relationshipEnd);
            if (result == null)
                result = caseElement(relationshipEnd);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.MODEL_LIBRARY: {
            ModelLibrary modelLibrary = (ModelLibrary) theEObject;
            T result = caseModelLibrary(modelLibrary);
            if (result == null)
                result = caseSubsystem(modelLibrary);
            if (result == null)
                result = caseClassifier(modelLibrary);
            if (result == null)
                result = casePackage(modelLibrary);
            if (result == null)
                result = caseNamespace(modelLibrary);
            if (result == null)
                result = caseModelElement(modelLibrary);
            if (result == null)
                result = caseElement(modelLibrary);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.MODEL: {
            Model model = (Model) theEObject;
            T result = caseModel(model);
            if (result == null)
                result = caseCore_Model(model);
            if (result == null)
                result = casePackage(model);
            if (result == null)
                result = caseNamespace(model);
            if (result == null)
                result = caseModelElement(model);
            if (result == null)
                result = caseElement(model);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.SUBJECT_AREA: {
            SubjectArea subjectArea = (SubjectArea) theEObject;
            T result = caseSubjectArea(subjectArea);
            if (result == null)
                result = casePackage(subjectArea);
            if (result == null)
                result = caseNamespace(subjectArea);
            if (result == null)
                result = caseModelElement(subjectArea);
            if (result == null)
                result = caseElement(subjectArea);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ErPackage.PRIMARY_KEY: {
            PrimaryKey primaryKey = (PrimaryKey) theEObject;
            T result = casePrimaryKey(primaryKey);
            if (result == null)
                result = caseCandidateKey(primaryKey);
            if (result == null)
                result = caseUniqueKey(primaryKey);
            if (result == null)
                result = caseModelElement(primaryKey);
            if (result == null)
                result = caseElement(primaryKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonunique Key</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonunique Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonuniqueKey(NonuniqueKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Candidate Key</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Candidate Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCandidateKey(CandidateKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForeignKey(ForeignKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDomain(Domain object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship End</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationshipEnd(RelationshipEnd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Library</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Library</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelLibrary(ModelLibrary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel(Model object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subject Area</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subject Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubjectArea(SubjectArea object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimaryKey(PrimaryKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamespace(Namespace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassifier(Classifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClass(orgomg.cwm.objectmodel.core.Class object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Index</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndex(Index object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unique Key</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unique Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUniqueKey(UniqueKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Key Relationship</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Key Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKeyRelationship(KeyRelationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeature(Feature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructuralFeature(StructuralFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCore_Attribute(orgomg.cwm.objectmodel.core.Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociation(Association object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociationEnd(AssociationEnd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackage(orgomg.cwm.objectmodel.core.Package object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubsystem(Subsystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCore_Model(orgomg.cwm.objectmodel.core.Model object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch, but this is
     * the last case anyway. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} // ErSwitch
