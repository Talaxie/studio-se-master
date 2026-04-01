/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.analysis.olap.CubeRegion;
import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.foundation.softwaredeployment.DeployedComponent;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.multidimensional.DimensionedObject;
import orgomg.cwm.resource.multidimensional.Schema;
import orgomg.cwmx.resource.essbase.*;
import orgomg.cwmx.resource.essbase.Alias;
import orgomg.cwmx.resource.essbase.Application;
import orgomg.cwmx.resource.essbase.Comment;
import orgomg.cwmx.resource.essbase.Consolidation;
import orgomg.cwmx.resource.essbase.CurrencyConversion;
import orgomg.cwmx.resource.essbase.DataStorage;
import orgomg.cwmx.resource.essbase.Database;
import orgomg.cwmx.resource.essbase.Dimension;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Formula;
import orgomg.cwmx.resource.essbase.Generation;
import orgomg.cwmx.resource.essbase.ImmediateParent;
import orgomg.cwmx.resource.essbase.Level;
import orgomg.cwmx.resource.essbase.LinkedPartition;
import orgomg.cwmx.resource.essbase.MemberName;
import orgomg.cwmx.resource.essbase.OLAPServer;
import orgomg.cwmx.resource.essbase.Outline;
import orgomg.cwmx.resource.essbase.Partition;
import orgomg.cwmx.resource.essbase.ReplicatedPartition;
import orgomg.cwmx.resource.essbase.TimeBalance;
import orgomg.cwmx.resource.essbase.TransparentPartition;
import orgomg.cwmx.resource.essbase.TwoPassCalculation;
import orgomg.cwmx.resource.essbase.UDA;
import orgomg.cwmx.resource.essbase.VarianceReporting;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.essbase.EssbasePackage
 * @generated
 */
public class EssbaseSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static EssbasePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public EssbaseSwitch() {
        if (modelPackage == null) {
            modelPackage = EssbasePackage.eINSTANCE;
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
        case EssbasePackage.ALIAS: {
            Alias alias = (Alias) theEObject;
            T result = caseAlias(alias);
            if (result == null)
                result = caseDimensionedObject(alias);
            if (result == null)
                result = caseAttribute(alias);
            if (result == null)
                result = caseStructuralFeature(alias);
            if (result == null)
                result = caseFeature(alias);
            if (result == null)
                result = caseModelElement(alias);
            if (result == null)
                result = caseElement(alias);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.APPLICATION: {
            Application application = (Application) theEObject;
            T result = caseApplication(application);
            if (result == null)
                result = casePackage(application);
            if (result == null)
                result = caseNamespace(application);
            if (result == null)
                result = caseModelElement(application);
            if (result == null)
                result = caseElement(application);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.COMMENT: {
            Comment comment = (Comment) theEObject;
            T result = caseComment(comment);
            if (result == null)
                result = caseDimensionedObject(comment);
            if (result == null)
                result = caseAttribute(comment);
            if (result == null)
                result = caseStructuralFeature(comment);
            if (result == null)
                result = caseFeature(comment);
            if (result == null)
                result = caseModelElement(comment);
            if (result == null)
                result = caseElement(comment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.CONSOLIDATION: {
            Consolidation consolidation = (Consolidation) theEObject;
            T result = caseConsolidation(consolidation);
            if (result == null)
                result = caseDimensionedObject(consolidation);
            if (result == null)
                result = caseAttribute(consolidation);
            if (result == null)
                result = caseStructuralFeature(consolidation);
            if (result == null)
                result = caseFeature(consolidation);
            if (result == null)
                result = caseModelElement(consolidation);
            if (result == null)
                result = caseElement(consolidation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.CURRENCY_CONVERSION: {
            CurrencyConversion currencyConversion = (CurrencyConversion) theEObject;
            T result = caseCurrencyConversion(currencyConversion);
            if (result == null)
                result = caseDimensionedObject(currencyConversion);
            if (result == null)
                result = caseAttribute(currencyConversion);
            if (result == null)
                result = caseStructuralFeature(currencyConversion);
            if (result == null)
                result = caseFeature(currencyConversion);
            if (result == null)
                result = caseModelElement(currencyConversion);
            if (result == null)
                result = caseElement(currencyConversion);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.DATA_STORAGE: {
            DataStorage dataStorage = (DataStorage) theEObject;
            T result = caseDataStorage(dataStorage);
            if (result == null)
                result = caseDimensionedObject(dataStorage);
            if (result == null)
                result = caseAttribute(dataStorage);
            if (result == null)
                result = caseStructuralFeature(dataStorage);
            if (result == null)
                result = caseFeature(dataStorage);
            if (result == null)
                result = caseModelElement(dataStorage);
            if (result == null)
                result = caseElement(dataStorage);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.DATABASE: {
            Database database = (Database) theEObject;
            T result = caseDatabase(database);
            if (result == null)
                result = caseSchema(database);
            if (result == null)
                result = casePackage(database);
            if (result == null)
                result = caseNamespace(database);
            if (result == null)
                result = caseModelElement(database);
            if (result == null)
                result = caseElement(database);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.DIMENSION: {
            Dimension dimension = (Dimension) theEObject;
            T result = caseDimension(dimension);
            if (result == null)
                result = caseMultidimensional_Dimension(dimension);
            if (result == null)
                result = caseClass(dimension);
            if (result == null)
                result = caseClassifier(dimension);
            if (result == null)
                result = caseNamespace(dimension);
            if (result == null)
                result = caseModelElement(dimension);
            if (result == null)
                result = caseElement(dimension);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.FORMULA: {
            Formula formula = (Formula) theEObject;
            T result = caseFormula(formula);
            if (result == null)
                result = caseDimensionedObject(formula);
            if (result == null)
                result = caseAttribute(formula);
            if (result == null)
                result = caseStructuralFeature(formula);
            if (result == null)
                result = caseFeature(formula);
            if (result == null)
                result = caseModelElement(formula);
            if (result == null)
                result = caseElement(formula);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.GENERATION: {
            Generation generation = (Generation) theEObject;
            T result = caseGeneration(generation);
            if (result == null)
                result = caseDimensionedObject(generation);
            if (result == null)
                result = caseAttribute(generation);
            if (result == null)
                result = caseStructuralFeature(generation);
            if (result == null)
                result = caseFeature(generation);
            if (result == null)
                result = caseModelElement(generation);
            if (result == null)
                result = caseElement(generation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.IMMEDIATE_PARENT: {
            ImmediateParent immediateParent = (ImmediateParent) theEObject;
            T result = caseImmediateParent(immediateParent);
            if (result == null)
                result = caseDimensionedObject(immediateParent);
            if (result == null)
                result = caseAttribute(immediateParent);
            if (result == null)
                result = caseStructuralFeature(immediateParent);
            if (result == null)
                result = caseFeature(immediateParent);
            if (result == null)
                result = caseModelElement(immediateParent);
            if (result == null)
                result = caseElement(immediateParent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.LEVEL: {
            Level level = (Level) theEObject;
            T result = caseLevel(level);
            if (result == null)
                result = caseDimensionedObject(level);
            if (result == null)
                result = caseAttribute(level);
            if (result == null)
                result = caseStructuralFeature(level);
            if (result == null)
                result = caseFeature(level);
            if (result == null)
                result = caseModelElement(level);
            if (result == null)
                result = caseElement(level);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.MEMBER_NAME: {
            MemberName memberName = (MemberName) theEObject;
            T result = caseMemberName(memberName);
            if (result == null)
                result = caseDimensionedObject(memberName);
            if (result == null)
                result = caseAttribute(memberName);
            if (result == null)
                result = caseStructuralFeature(memberName);
            if (result == null)
                result = caseFeature(memberName);
            if (result == null)
                result = caseModelElement(memberName);
            if (result == null)
                result = caseElement(memberName);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.OLAP_SERVER: {
            OLAPServer olapServer = (OLAPServer) theEObject;
            T result = caseOLAPServer(olapServer);
            if (result == null)
                result = caseDataManager(olapServer);
            if (result == null)
                result = caseDeployedComponent(olapServer);
            if (result == null)
                result = casePackage(olapServer);
            if (result == null)
                result = caseNamespace(olapServer);
            if (result == null)
                result = caseModelElement(olapServer);
            if (result == null)
                result = caseElement(olapServer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.OUTLINE: {
            Outline outline = (Outline) theEObject;
            T result = caseOutline(outline);
            if (result == null)
                result = caseNamespace(outline);
            if (result == null)
                result = caseModelElement(outline);
            if (result == null)
                result = caseElement(outline);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.PARTITION: {
            Partition partition = (Partition) theEObject;
            T result = casePartition(partition);
            if (result == null)
                result = caseCubeRegion(partition);
            if (result == null)
                result = caseClass(partition);
            if (result == null)
                result = caseClassifier(partition);
            if (result == null)
                result = caseNamespace(partition);
            if (result == null)
                result = caseModelElement(partition);
            if (result == null)
                result = caseElement(partition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.REPLICATED_PARTITION: {
            ReplicatedPartition replicatedPartition = (ReplicatedPartition) theEObject;
            T result = caseReplicatedPartition(replicatedPartition);
            if (result == null)
                result = casePartition(replicatedPartition);
            if (result == null)
                result = caseCubeRegion(replicatedPartition);
            if (result == null)
                result = caseClass(replicatedPartition);
            if (result == null)
                result = caseClassifier(replicatedPartition);
            if (result == null)
                result = caseNamespace(replicatedPartition);
            if (result == null)
                result = caseModelElement(replicatedPartition);
            if (result == null)
                result = caseElement(replicatedPartition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.TIME_BALANCE: {
            TimeBalance timeBalance = (TimeBalance) theEObject;
            T result = caseTimeBalance(timeBalance);
            if (result == null)
                result = caseDimensionedObject(timeBalance);
            if (result == null)
                result = caseAttribute(timeBalance);
            if (result == null)
                result = caseStructuralFeature(timeBalance);
            if (result == null)
                result = caseFeature(timeBalance);
            if (result == null)
                result = caseModelElement(timeBalance);
            if (result == null)
                result = caseElement(timeBalance);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.TRANSPARENT_PARTITION: {
            TransparentPartition transparentPartition = (TransparentPartition) theEObject;
            T result = caseTransparentPartition(transparentPartition);
            if (result == null)
                result = casePartition(transparentPartition);
            if (result == null)
                result = caseCubeRegion(transparentPartition);
            if (result == null)
                result = caseClass(transparentPartition);
            if (result == null)
                result = caseClassifier(transparentPartition);
            if (result == null)
                result = caseNamespace(transparentPartition);
            if (result == null)
                result = caseModelElement(transparentPartition);
            if (result == null)
                result = caseElement(transparentPartition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.TWO_PASS_CALCULATION: {
            TwoPassCalculation twoPassCalculation = (TwoPassCalculation) theEObject;
            T result = caseTwoPassCalculation(twoPassCalculation);
            if (result == null)
                result = caseDimensionedObject(twoPassCalculation);
            if (result == null)
                result = caseAttribute(twoPassCalculation);
            if (result == null)
                result = caseStructuralFeature(twoPassCalculation);
            if (result == null)
                result = caseFeature(twoPassCalculation);
            if (result == null)
                result = caseModelElement(twoPassCalculation);
            if (result == null)
                result = caseElement(twoPassCalculation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.UDA: {
            UDA uda = (UDA) theEObject;
            T result = caseUDA(uda);
            if (result == null)
                result = caseDimensionedObject(uda);
            if (result == null)
                result = caseAttribute(uda);
            if (result == null)
                result = caseStructuralFeature(uda);
            if (result == null)
                result = caseFeature(uda);
            if (result == null)
                result = caseModelElement(uda);
            if (result == null)
                result = caseElement(uda);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.VARIANCE_REPORTING: {
            VarianceReporting varianceReporting = (VarianceReporting) theEObject;
            T result = caseVarianceReporting(varianceReporting);
            if (result == null)
                result = caseDimensionedObject(varianceReporting);
            if (result == null)
                result = caseAttribute(varianceReporting);
            if (result == null)
                result = caseStructuralFeature(varianceReporting);
            if (result == null)
                result = caseFeature(varianceReporting);
            if (result == null)
                result = caseModelElement(varianceReporting);
            if (result == null)
                result = caseElement(varianceReporting);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case EssbasePackage.LINKED_PARTITION: {
            LinkedPartition linkedPartition = (LinkedPartition) theEObject;
            T result = caseLinkedPartition(linkedPartition);
            if (result == null)
                result = casePartition(linkedPartition);
            if (result == null)
                result = caseCubeRegion(linkedPartition);
            if (result == null)
                result = caseClass(linkedPartition);
            if (result == null)
                result = caseClassifier(linkedPartition);
            if (result == null)
                result = caseNamespace(linkedPartition);
            if (result == null)
                result = caseModelElement(linkedPartition);
            if (result == null)
                result = caseElement(linkedPartition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlias(Alias object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplication(Application object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComment(Comment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Consolidation</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Consolidation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConsolidation(Consolidation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Currency Conversion</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Currency Conversion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrencyConversion(CurrencyConversion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Storage</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Storage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataStorage(DataStorage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Database</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatabase(Database object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimension(Dimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormula(Formula object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generation</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneration(Generation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Immediate Parent</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Immediate Parent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImmediateParent(ImmediateParent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Level</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLevel(Level object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member Name</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemberName(MemberName object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>OLAP Server</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>OLAP Server</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOLAPServer(OLAPServer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Outline</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Outline</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutline(Outline object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePartition(Partition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Replicated Partition</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Replicated Partition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReplicatedPartition(ReplicatedPartition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Balance</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Balance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeBalance(TimeBalance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transparent Partition</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transparent Partition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransparentPartition(TransparentPartition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Two Pass Calculation</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Two Pass Calculation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTwoPassCalculation(TwoPassCalculation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>UDA</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>UDA</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUDA(UDA object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variance Reporting</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variance Reporting</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVarianceReporting(VarianceReporting object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linked Partition</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linked Partition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkedPartition(LinkedPartition object) {
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
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimensioned Object</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimensioned Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionedObject(DimensionedObject object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchema(Schema object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultidimensional_Dimension(orgomg.cwm.resource.multidimensional.Dimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deployed Component</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deployed Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeployedComponent(DeployedComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Manager</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Manager</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataManager(DataManager object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cube Region</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cube Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCubeRegion(CubeRegion object) {
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

} // EssbaseSwitch
