/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.analysis.datamining.*;
import orgomg.cwm.analysis.datamining.ApplicationAttribute;
import orgomg.cwm.analysis.datamining.ApplicationInputSpecification;
import orgomg.cwm.analysis.datamining.AssociationRulesSettings;
import orgomg.cwm.analysis.datamining.AttributeUsageRelation;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.Category;
import orgomg.cwm.analysis.datamining.CategoryHierarchy;
import orgomg.cwm.analysis.datamining.ClassificationSettings;
import orgomg.cwm.analysis.datamining.ClusteringSettings;
import orgomg.cwm.analysis.datamining.CostMatrix;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.datamining.MiningAttribute;
import orgomg.cwm.analysis.datamining.MiningDataSpecification;
import orgomg.cwm.analysis.datamining.MiningModel;
import orgomg.cwm.analysis.datamining.MiningModelResult;
import orgomg.cwm.analysis.datamining.MiningSettings;
import orgomg.cwm.analysis.datamining.NumericAttribute;
import orgomg.cwm.analysis.datamining.OrdinalAttribute;
import orgomg.cwm.analysis.datamining.RegressionSettings;
import orgomg.cwm.analysis.datamining.StatisticsSettings;
import orgomg.cwm.analysis.datamining.SupervisedMiningModel;
import orgomg.cwm.analysis.datamining.SupervisedMiningSettings;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwm.analysis.datamining.DataminingPackage
 * @generated
 */
public class DataminingSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static DataminingPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public DataminingSwitch() {
        if (modelPackage == null) {
            modelPackage = DataminingPackage.eINSTANCE;
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
        case DataminingPackage.APPLICATION_INPUT_SPECIFICATION: {
            ApplicationInputSpecification applicationInputSpecification = (ApplicationInputSpecification) theEObject;
            T result = caseApplicationInputSpecification(applicationInputSpecification);
            if (result == null)
                result = caseClass(applicationInputSpecification);
            if (result == null)
                result = caseClassifier(applicationInputSpecification);
            if (result == null)
                result = caseNamespace(applicationInputSpecification);
            if (result == null)
                result = caseModelElement(applicationInputSpecification);
            if (result == null)
                result = caseElement(applicationInputSpecification);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.ATTRIBUTE_USAGE_RELATION: {
            AttributeUsageRelation attributeUsageRelation = (AttributeUsageRelation) theEObject;
            T result = caseAttributeUsageRelation(attributeUsageRelation);
            if (result == null)
                result = caseModelElement(attributeUsageRelation);
            if (result == null)
                result = caseElement(attributeUsageRelation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.CATEGORY: {
            Category category = (Category) theEObject;
            T result = caseCategory(category);
            if (result == null)
                result = caseModelElement(category);
            if (result == null)
                result = caseElement(category);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.CATEGORY_HIERARCHY: {
            CategoryHierarchy categoryHierarchy = (CategoryHierarchy) theEObject;
            T result = caseCategoryHierarchy(categoryHierarchy);
            if (result == null)
                result = caseClass(categoryHierarchy);
            if (result == null)
                result = caseClassifier(categoryHierarchy);
            if (result == null)
                result = caseNamespace(categoryHierarchy);
            if (result == null)
                result = caseModelElement(categoryHierarchy);
            if (result == null)
                result = caseElement(categoryHierarchy);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.COST_MATRIX: {
            CostMatrix costMatrix = (CostMatrix) theEObject;
            T result = caseCostMatrix(costMatrix);
            if (result == null)
                result = caseClass(costMatrix);
            if (result == null)
                result = caseClassifier(costMatrix);
            if (result == null)
                result = caseNamespace(costMatrix);
            if (result == null)
                result = caseModelElement(costMatrix);
            if (result == null)
                result = caseElement(costMatrix);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.MINING_ATTRIBUTE: {
            MiningAttribute miningAttribute = (MiningAttribute) theEObject;
            T result = caseMiningAttribute(miningAttribute);
            if (result == null)
                result = caseAttribute(miningAttribute);
            if (result == null)
                result = caseStructuralFeature(miningAttribute);
            if (result == null)
                result = caseFeature(miningAttribute);
            if (result == null)
                result = caseModelElement(miningAttribute);
            if (result == null)
                result = caseElement(miningAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.MINING_DATA_SPECIFICATION: {
            MiningDataSpecification miningDataSpecification = (MiningDataSpecification) theEObject;
            T result = caseMiningDataSpecification(miningDataSpecification);
            if (result == null)
                result = caseClass(miningDataSpecification);
            if (result == null)
                result = caseClassifier(miningDataSpecification);
            if (result == null)
                result = caseNamespace(miningDataSpecification);
            if (result == null)
                result = caseModelElement(miningDataSpecification);
            if (result == null)
                result = caseElement(miningDataSpecification);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.MINING_MODEL: {
            MiningModel miningModel = (MiningModel) theEObject;
            T result = caseMiningModel(miningModel);
            if (result == null)
                result = caseClass(miningModel);
            if (result == null)
                result = caseClassifier(miningModel);
            if (result == null)
                result = caseNamespace(miningModel);
            if (result == null)
                result = caseModelElement(miningModel);
            if (result == null)
                result = caseElement(miningModel);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.MINING_MODEL_RESULT: {
            MiningModelResult miningModelResult = (MiningModelResult) theEObject;
            T result = caseMiningModelResult(miningModelResult);
            if (result == null)
                result = caseClass(miningModelResult);
            if (result == null)
                result = caseClassifier(miningModelResult);
            if (result == null)
                result = caseNamespace(miningModelResult);
            if (result == null)
                result = caseModelElement(miningModelResult);
            if (result == null)
                result = caseElement(miningModelResult);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.NUMERIC_ATTRIBUTE: {
            NumericAttribute numericAttribute = (NumericAttribute) theEObject;
            T result = caseNumericAttribute(numericAttribute);
            if (result == null)
                result = caseMiningAttribute(numericAttribute);
            if (result == null)
                result = caseAttribute(numericAttribute);
            if (result == null)
                result = caseStructuralFeature(numericAttribute);
            if (result == null)
                result = caseFeature(numericAttribute);
            if (result == null)
                result = caseModelElement(numericAttribute);
            if (result == null)
                result = caseElement(numericAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.SUPERVISED_MINING_MODEL: {
            SupervisedMiningModel supervisedMiningModel = (SupervisedMiningModel) theEObject;
            T result = caseSupervisedMiningModel(supervisedMiningModel);
            if (result == null)
                result = caseMiningModel(supervisedMiningModel);
            if (result == null)
                result = caseClass(supervisedMiningModel);
            if (result == null)
                result = caseClassifier(supervisedMiningModel);
            if (result == null)
                result = caseNamespace(supervisedMiningModel);
            if (result == null)
                result = caseModelElement(supervisedMiningModel);
            if (result == null)
                result = caseElement(supervisedMiningModel);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.CATEGORICAL_ATTRIBUTE: {
            CategoricalAttribute categoricalAttribute = (CategoricalAttribute) theEObject;
            T result = caseCategoricalAttribute(categoricalAttribute);
            if (result == null)
                result = caseMiningAttribute(categoricalAttribute);
            if (result == null)
                result = caseAttribute(categoricalAttribute);
            if (result == null)
                result = caseStructuralFeature(categoricalAttribute);
            if (result == null)
                result = caseFeature(categoricalAttribute);
            if (result == null)
                result = caseModelElement(categoricalAttribute);
            if (result == null)
                result = caseElement(categoricalAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.ORDINAL_ATTRIBUTE: {
            OrdinalAttribute ordinalAttribute = (OrdinalAttribute) theEObject;
            T result = caseOrdinalAttribute(ordinalAttribute);
            if (result == null)
                result = caseCategoricalAttribute(ordinalAttribute);
            if (result == null)
                result = caseMiningAttribute(ordinalAttribute);
            if (result == null)
                result = caseAttribute(ordinalAttribute);
            if (result == null)
                result = caseStructuralFeature(ordinalAttribute);
            if (result == null)
                result = caseFeature(ordinalAttribute);
            if (result == null)
                result = caseModelElement(ordinalAttribute);
            if (result == null)
                result = caseElement(ordinalAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.MINING_SETTINGS: {
            MiningSettings miningSettings = (MiningSettings) theEObject;
            T result = caseMiningSettings(miningSettings);
            if (result == null)
                result = caseClass(miningSettings);
            if (result == null)
                result = caseClassifier(miningSettings);
            if (result == null)
                result = caseNamespace(miningSettings);
            if (result == null)
                result = caseModelElement(miningSettings);
            if (result == null)
                result = caseElement(miningSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.CLUSTERING_SETTINGS: {
            ClusteringSettings clusteringSettings = (ClusteringSettings) theEObject;
            T result = caseClusteringSettings(clusteringSettings);
            if (result == null)
                result = caseMiningSettings(clusteringSettings);
            if (result == null)
                result = caseClass(clusteringSettings);
            if (result == null)
                result = caseClassifier(clusteringSettings);
            if (result == null)
                result = caseNamespace(clusteringSettings);
            if (result == null)
                result = caseModelElement(clusteringSettings);
            if (result == null)
                result = caseElement(clusteringSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.STATISTICS_SETTINGS: {
            StatisticsSettings statisticsSettings = (StatisticsSettings) theEObject;
            T result = caseStatisticsSettings(statisticsSettings);
            if (result == null)
                result = caseMiningSettings(statisticsSettings);
            if (result == null)
                result = caseClass(statisticsSettings);
            if (result == null)
                result = caseClassifier(statisticsSettings);
            if (result == null)
                result = caseNamespace(statisticsSettings);
            if (result == null)
                result = caseModelElement(statisticsSettings);
            if (result == null)
                result = caseElement(statisticsSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.SUPERVISED_MINING_SETTINGS: {
            SupervisedMiningSettings supervisedMiningSettings = (SupervisedMiningSettings) theEObject;
            T result = caseSupervisedMiningSettings(supervisedMiningSettings);
            if (result == null)
                result = caseMiningSettings(supervisedMiningSettings);
            if (result == null)
                result = caseClass(supervisedMiningSettings);
            if (result == null)
                result = caseClassifier(supervisedMiningSettings);
            if (result == null)
                result = caseNamespace(supervisedMiningSettings);
            if (result == null)
                result = caseModelElement(supervisedMiningSettings);
            if (result == null)
                result = caseElement(supervisedMiningSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.CLASSIFICATION_SETTINGS: {
            ClassificationSettings classificationSettings = (ClassificationSettings) theEObject;
            T result = caseClassificationSettings(classificationSettings);
            if (result == null)
                result = caseSupervisedMiningSettings(classificationSettings);
            if (result == null)
                result = caseMiningSettings(classificationSettings);
            if (result == null)
                result = caseClass(classificationSettings);
            if (result == null)
                result = caseClassifier(classificationSettings);
            if (result == null)
                result = caseNamespace(classificationSettings);
            if (result == null)
                result = caseModelElement(classificationSettings);
            if (result == null)
                result = caseElement(classificationSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.REGRESSION_SETTINGS: {
            RegressionSettings regressionSettings = (RegressionSettings) theEObject;
            T result = caseRegressionSettings(regressionSettings);
            if (result == null)
                result = caseSupervisedMiningSettings(regressionSettings);
            if (result == null)
                result = caseMiningSettings(regressionSettings);
            if (result == null)
                result = caseClass(regressionSettings);
            if (result == null)
                result = caseClassifier(regressionSettings);
            if (result == null)
                result = caseNamespace(regressionSettings);
            if (result == null)
                result = caseModelElement(regressionSettings);
            if (result == null)
                result = caseElement(regressionSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.ASSOCIATION_RULES_SETTINGS: {
            AssociationRulesSettings associationRulesSettings = (AssociationRulesSettings) theEObject;
            T result = caseAssociationRulesSettings(associationRulesSettings);
            if (result == null)
                result = caseMiningSettings(associationRulesSettings);
            if (result == null)
                result = caseClass(associationRulesSettings);
            if (result == null)
                result = caseClassifier(associationRulesSettings);
            if (result == null)
                result = caseNamespace(associationRulesSettings);
            if (result == null)
                result = caseModelElement(associationRulesSettings);
            if (result == null)
                result = caseElement(associationRulesSettings);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DataminingPackage.APPLICATION_ATTRIBUTE: {
            ApplicationAttribute applicationAttribute = (ApplicationAttribute) theEObject;
            T result = caseApplicationAttribute(applicationAttribute);
            if (result == null)
                result = caseAttribute(applicationAttribute);
            if (result == null)
                result = caseStructuralFeature(applicationAttribute);
            if (result == null)
                result = caseFeature(applicationAttribute);
            if (result == null)
                result = caseModelElement(applicationAttribute);
            if (result == null)
                result = caseElement(applicationAttribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application Input Specification</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application Input Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplicationInputSpecification(ApplicationInputSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Usage Relation</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Usage Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeUsageRelation(AttributeUsageRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategory(Category object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Category Hierarchy</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategoryHierarchy(CategoryHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cost Matrix</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cost Matrix</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCostMatrix(CostMatrix object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mining Attribute</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mining Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiningAttribute(MiningAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mining Data Specification</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mining Data Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiningDataSpecification(MiningDataSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mining Model</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mining Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiningModel(MiningModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mining Model Result</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mining Model Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiningModelResult(MiningModelResult object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Attribute</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericAttribute(NumericAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Supervised Mining Model</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Supervised Mining Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSupervisedMiningModel(SupervisedMiningModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Categorical Attribute</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Categorical Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategoricalAttribute(CategoricalAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ordinal Attribute</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ordinal Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrdinalAttribute(OrdinalAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mining Settings</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mining Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiningSettings(MiningSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clustering Settings</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clustering Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClusteringSettings(ClusteringSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statistics Settings</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statistics Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatisticsSettings(StatisticsSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Supervised Mining Settings</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Supervised Mining Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSupervisedMiningSettings(SupervisedMiningSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classification Settings</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classification Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassificationSettings(ClassificationSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regression Settings</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regression Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegressionSettings(RegressionSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association Rules Settings</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association Rules Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociationRulesSettings(AssociationRulesSettings object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApplicationAttribute(ApplicationAttribute object) {
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

} // DataminingSwitch
